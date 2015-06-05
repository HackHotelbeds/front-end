package trip;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HelloController {




    protected String applicationOnlyBearerToken;


    @RequestMapping(value="/")
     public String isAlive(){
        return "IsAlive";
    }


}