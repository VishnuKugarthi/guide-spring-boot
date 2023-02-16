package hello;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {

    // @RequestMapping("/")
    // public String hello() {
    //     return "Greetings from Spring Boot!";
    // }

    @RequestMapping("/bye")
    public String bye() {
        return "Tata byeeeeeee!!!!!!";
    }

    @RequestMapping("/welcome")
    public String welcome() {
        return "welcome!!!!!!";
    }
}
