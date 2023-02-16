package hello;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {
    
    @RequestMapping("/hello")
    public String hello() {
        return "Greetings from Spring Boot!";
    }

    @RequestMapping("/")
    public String welcome() {
        return "welcome";
    }
    
    @RequestMapping("/bye")
    public String bye() {
        return "bye";
    }
}
