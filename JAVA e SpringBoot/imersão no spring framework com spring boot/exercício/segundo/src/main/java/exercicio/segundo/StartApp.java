package exercicio.segundo;

import exercicio.segundo.model.User;
import exercicio.segundo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class StartApp implements CommandLineRunner {
    @Autowired
    private UserRepository repository;
    @Override
    public void run(String... args) throws Exception {
        User user = new User();
        user.setName("teste");
        user.setUsername("teste2");
        user.setPassword("teste3");

        repository.save(user);

        for(User u: repository.findAll()){
            System.out.println(u);
        }
    }
}
