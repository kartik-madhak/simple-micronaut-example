package simplemicronaut.user;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import simplemicronaut.User;

import java.util.List;

@Controller("/user")
public class UserController {

    @Get
    public List<User> index() {
        return List.of(new User("John", "Doe"), new User("Jane", "Doe"));
    }

}
