package sistema.integrador.oo2.services;

import java.util.List; 

import sistema.integrador.oo2.entities.Perfil;
import sistema.integrador.oo2.models.PerfilModel;



public interface IPerfilService {
	public List<Perfil> getAll();
	public PerfilModel insertOrUpdate(PerfilModel PerfilModel);
	public boolean remove(int id);
	PerfilModel findById(int id);
	PerfilModel findByNombrePerfil(String nombrePerfil);
}
