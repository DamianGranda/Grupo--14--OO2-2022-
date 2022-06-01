package sistema.integrador.oo2.services.implementation;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sistema.integrador.oo2.entities.User;
import sistema.integrador.oo2.repositories.IUserRepositoryCRUD;
import sistema.integrador.oo2.services.IUserService;
@Service
public class UserServiceCrud implements IUserService {
	
	@Autowired
	private IUserRepositoryCRUD data;
	@Override
	public List<User> listar() {
		return (List<User>) data.findAll();
	}

	@Override
	public Optional<User> listarId(Long id) {
		return data.findById(id);
	}

	@Override
	public int save(User u) {
		int res=0;
		User user=data.save(u);
		if(!user.equals(null)) {
			res=1;
		}
		return res;
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		
	}

}
