package sistema.integrador.oo2.converters;

import org.springframework.stereotype.Component; 

import sistema.integrador.oo2.entities.Usuario;
import sistema.integrador.oo2.models.UsuarioModel;

@Component("usuarioConverter")
public class UsuarioConverters {
	
	public Usuario modeloAEntidad(UsuarioModel usuarioModel) {
		return new Usuario(usuarioModel.getIdUsuario(),usuarioModel.getNombre(),usuarioModel.getApellido(),usuarioModel.getTipoDoc(),
				usuarioModel.getDocumento(),usuarioModel.getEmail(),usuarioModel.getNombreDeUsuario(),
				usuarioModel.getContraseña(),usuarioModel.getPerfil());
	}
	
	public UsuarioModel entidadAModelo(Usuario usuario) {
		return new UsuarioModel(usuario.getIdUsuario(), usuario.getNombre(),usuario.getApellido(), usuario.getTipoDoc(),usuario.getDocumento(),
				 usuario.getEmail(), usuario.getNombreDeUsuario(), usuario.getContraseña(),usuario.getPerfil());
	}
}
