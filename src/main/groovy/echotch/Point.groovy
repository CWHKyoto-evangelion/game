package echotch

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/point")
public class Point {
    private int total = 0;

    @RequestMapping(method = RequestMethod.GET)
    public int getPoint() {
        return total;
    }

    @RequestMapping(method = RequestMethod.POST)
    public int postPoint(@RequestParam("point") int point) {
        return addPoint(point);
    }

    @RequestMapping("/add")
    public int addPoint(@RequestParam("point") int point) {
        return total += point;
    }
}
