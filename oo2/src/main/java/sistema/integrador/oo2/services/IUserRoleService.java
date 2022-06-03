package sistema.integrador.oo2.services;

import java.util.List;

import sistema.integrador.oo2.entities.UserRole;

public interface IUserRoleService {
	public List<UserRole>listar();
	public UserRole guardarUserRole(UserRole userRole);
	public UserRole obtenerUserRolePorId(Long id);
	public UserRole actualizarUserRole(UserRole userRole);
	public void eliminarUserRole(Long id);
}
