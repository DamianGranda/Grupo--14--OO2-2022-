package sistema.integrador.oo2.converters;

import org.springframework.stereotype.Component;

import sistema.integrador.oo2.entities.Usuario;
import sistema.integrador.oo2.models.*;

@Component("usuarioConverter")
public class UsuarioConverter {
	
	public Usuario modeloAEntidad(UsuarioModel usuarioModel) {
		return new Usuario(usuarioModel.getIdUsuario(),usuarioModel.getTipoDoc(),usuarioModel.getDocumento(),
				usuarioModel.getNombre(),usuarioModel.getApellido(),usuarioModel.getEmail(),usuarioModel.getNombreDeUsuario(),
				usuarioModel.getContraseña(),usuarioModel.getPerfil());
	}
	
	public UsuarioModel entidadAModelo(Usuario usuario) {
		return new UsuarioModel(usuario.getIdUsuario(), usuario.getTipoDoc(),usuario.getDocumento(), usuario.getNombre(),
				usuario.getApellido(), usuario.getEmail(), usuario.getNombreUsuario(), usuario.getClave(),usuario.getPerfil());
	}
}
