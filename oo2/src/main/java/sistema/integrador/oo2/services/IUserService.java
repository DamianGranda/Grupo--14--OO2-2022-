package sistema.integrador.oo2.services;

import java.util.List;
import java.util.Optional;

import sistema.integrador.oo2.entities.User;

public interface IUserService{
	public List<User>listar();
	public Optional<User>listarId(int Long);
	public Long save(User u);
	public void delete(Long id);
}
