
var myApp = new Framework7();
var mainView = myApp.addView('.view-main', {
    domCache: true //enable inline pages
});

$(function() {
	var vue = new Vue({
		el: '#app',
		data: {
		    point: "-",
		},
		computed: {
    		level: function() {
    		    var point = this.point;
    		    if (point == "-" || point < 100) {
    		        return 1;
    		    }
    		    if (point < 300) {
    		        return Math.floor(point / 100 + 1);
    		    }
    		    return 3;
    		}
		},
		methods: {
			scan: function() {
				$.post("point",
				 	{point:10}
				).done(function(data) {
					vue.point = data
				})
			}
		}
	})
	$.get(
	"/point"
	).done(function(data) {
		vue.point = data
	})
});
