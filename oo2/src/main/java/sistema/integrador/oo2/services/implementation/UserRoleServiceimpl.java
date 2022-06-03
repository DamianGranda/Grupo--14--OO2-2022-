package sistema.integrador.oo2.services.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sistema.integrador.oo2.entities.UserRole;
import sistema.integrador.oo2.repositories.IUserRoleRepositoryCRUD;
import sistema.integrador.oo2.services.IUserRoleService;

@Service
public class UserRoleServiceimpl implements IUserRoleService {
	
	@Autowired
	private IUserRoleRepositoryCRUD repositorio;
	
	@Override
	public List<UserRole> listar() {
		return repositorio.findAll();
	}

	@Override
	public UserRole guardarUserRole(UserRole userRole) {
		return repositorio.save(userRole);
	}

	@Override
	public UserRole obtenerUserRolePorId(Long id) {
		return repositorio.findById(id).get();
	}

	@Override
	public UserRole actualizarUserRole(UserRole userRole) {
		return repositorio.save(userRole);
	}

	@Override
	public void eliminarUserRole(Long id) {
		repositorio.deleteById(id);
	}

}
