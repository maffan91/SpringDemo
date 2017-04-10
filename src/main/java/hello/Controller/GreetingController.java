package hello.Controller;

import java.util.concurrent.atomic.AtomicLong;

import hello.Dao.Greetings;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
@RequestMapping(value = "/greeting",method = GET)
public class GreetingController {
    private static final String template = "Hellow, %s!";
    private final AtomicLong counter = new AtomicLong();


    @RequestMapping(value = "/show",method = GET)
    public Greetings greetings(@RequestParam(value="name", defaultValue="World") String name) {
        return new Greetings(counter.incrementAndGet(),
                String.format(template, name));
    }
}
