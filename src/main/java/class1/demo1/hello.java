package class1.demo1;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class hello {

    @GetMapping("/")
    public String hello() {
        return "Hello World!!!";
    }
}