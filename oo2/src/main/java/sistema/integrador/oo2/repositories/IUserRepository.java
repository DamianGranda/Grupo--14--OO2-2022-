package sistema.integrador.oo2.repositories;

import java.io.Serializable; 

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import sistema.integrador.oo2.entities.User;



@Repository("userRepository")
public interface IUserRepository extends JpaRepository<User, Serializable> {

	@Query("SELECT u FROM User u JOIN FETCH u.role WHERE u.username = (:username)")
	public abstract User findByUsernameAndFetchUserRoleEagerly(@Param("username") String username);
}
