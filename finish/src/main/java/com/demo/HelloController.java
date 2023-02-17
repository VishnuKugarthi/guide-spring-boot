// package hello;

// import org.springframework.web.bind.annotation.RestController;
// import org.springframework.web.bind.annotation.RequestMapping;

// @RestController
// public class HelloController {

//     // @RequestMapping("/")
//     // public String hello() {
//     //     return "Greetings from Spring Boot!";
//     // }

//     @RequestMapping("/bye")
//     public String bye() {
//         return "Tata byeeeeeee!!!!!!";
//     }

//     @RequestMapping("/welcome")
//     public String welcome() {
//         return "welcome!!!!!!";
//     }
// }

package com.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by JavaDeveloperZone on 19-07-2017.
 */
@Controller
public class HelloController {
    @GetMapping("/welcome") // it will handle all request for /welcome
    public String hello() {
        return "welcome"; // welcome is view name. It will call welcome.jsp
    }

    @GetMapping("/bye") // it will handle all request for /welcome
    public String bye() {
        return "bye"; // welcome is view name. It will call welcome.jsp
    }
}
