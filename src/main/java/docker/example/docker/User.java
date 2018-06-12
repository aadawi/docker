package docker.example.docker;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "users")
@Data
public class User {
    @Id
    private String id;
    private String firstname;
}
