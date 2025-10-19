package human_1.hello_api;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloworld {

  
    public String hello(){

        return "hello world from shiv";

    }

}
