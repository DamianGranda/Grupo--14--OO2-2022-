package sistema.integrador.oo2.repositories;
import java.util.Optional;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import sistema.integrador.oo2.entities.User;

@Repository
public interface UserRepository extends CrudRepository<User, Integer>  {
    public Optional<User> findByUsername(String username);
}