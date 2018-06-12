package docker.example.docker;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/str")
    public String getStr() {
        String name = "";

        for (User user : userRepository.findAll()) {
            name += user.getFirstname()+" ";
        }

        return "this is working: "+name;
    }
}
