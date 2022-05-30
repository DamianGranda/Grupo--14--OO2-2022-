package sistema.integrador.oo2.converters;

import sistema.integrador.oo2.entities.Perfil;
import sistema.integrador.oo2.models.PerfilModel;

public class PerfilConverterts {

	public Perfil modeloAEntidad(PerfilModel perfilModel) {
		return new Perfil(perfilModel.getIdPefil(),perfilModel.getTipoPerfil(),perfilModel.getDescripcion());
	}
	
	public PerfilModel entidadAModelo(Perfil perfil) {
		return new PerfilModel(perfil.getIdPefil(), perfil.getTipoPerfil(), perfil.getDescripcion());
	}
}
