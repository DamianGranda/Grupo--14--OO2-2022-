package sistema.integrador.oo2.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import sistema.integrador.oo2.entities.UserRole;

public interface IUserRoleRepositoryCRUD extends JpaRepository<UserRole,Long>{

}
