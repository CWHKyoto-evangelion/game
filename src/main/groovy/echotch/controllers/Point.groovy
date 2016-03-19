package echotch.controllers

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

    @RequestMapping(method = RequestMethod.POST)
    public int addPoint(@RequestParam("point") int point) {
        return total += point;
    }

    @RequestMapping(method = RequestMethod.GET)
    public int getPoint() {
        return total;
    }
}
