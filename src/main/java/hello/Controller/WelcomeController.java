package hello.Controller;


import hello.Dao.WelcomeMessage;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
public class WelcomeController {

    @RequestMapping(value = "/welcome",method = GET)
    public WelcomeMessage welcomeMessage(){

        return new WelcomeMessage();
    }
}
