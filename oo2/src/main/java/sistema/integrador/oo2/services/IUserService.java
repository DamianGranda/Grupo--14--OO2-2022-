package sistema.integrador.oo2.services;

import java.util.List;
import java.util.Optional;

import sistema.integrador.oo2.entities.User;

public interface IUserService{
	public List<User>listar();
	public User guardarUser(User user);
	public User obtenerUserPorId(Long id);
	public User actualizarUser(User user);
	public void eliminarUser(Long id);
}
