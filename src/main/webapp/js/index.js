
var myApp = new Framework7();
var mainView = myApp.addView('.view-main', {
    domCache: true //enable inline pages
});

$(function() {
	var vue = new Vue({
		el: '#app',
		data: {point: "-"},
		methods: {
			add: function() {
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
