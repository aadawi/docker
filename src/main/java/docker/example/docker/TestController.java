package docker.example.docker;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/str")
    public String getStr() {
        String name = "Ahmad adawi";


        return "this is working: "+name;
    }
}
