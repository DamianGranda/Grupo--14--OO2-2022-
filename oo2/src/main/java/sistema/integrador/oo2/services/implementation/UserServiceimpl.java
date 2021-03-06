package sistema.integrador.oo2.services.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sistema.integrador.oo2.entities.User;
import sistema.integrador.oo2.repositories.IUserRepository;
import sistema.integrador.oo2.repositories.IUserRepositoryCRUD;
import sistema.integrador.oo2.services.IUserService;

@Service
public class UserServiceimpl implements IUserService {

	@Autowired
	private IUserRepository repositorio;

	@Override
	public List<User> listar() {
		return repositorio.findAll();
	}

	@Override
	public User guardarUser(User user) {
		return repositorio.save(user);
	}

	@Override
	public User obtenerUserPorId(Long id) {
		return repositorio.findById(id).get();
	}

	@Override
	public User actualizarUser(User user) {
		return repositorio.save(user);
	}

	@Override
	public void eliminarUser(Long id) {
		repositorio.deleteById(id);
	}
	

}
