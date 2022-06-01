package sistema.integrador.oo2.services;

import java.util.List;
import java.util.Optional;

import sistema.integrador.oo2.entities.User;

public interface IUserService{
	public List<User>listar();
	public Optional<User>listarId(Long id);
	public int save(User u);
	public void delete(Long id);
}
