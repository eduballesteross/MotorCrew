package servicios;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import controladores.Inicio;
import dtos.UsuarioDto;

public class ConsultaPostgreImplementacion implements ConsultaBDInterfaz {
	
	ConexionBDInterfaz conexionI= new ConexionPostgreImplementacion();
	
	@Override
	public void cargaBDUsuario() {
	    Connection conexion = null;
	    Statement sentencia = null;
	    try {
	    	
	    	sentencia = conexion.createStatement();
	        ResultSet resultado = sentencia.executeQuery("SELECT * FROM sus.usuario");

	        while (resultado.next()) {
	            UsuarioDto usuario = new UsuarioDto(
	                resultado.getLong("usuarioId"),
	                resultado.getString("nombre"),
	                resultado.getString("apellidos"),
	                resultado.getDate("fechaNacimiento").toLocalDate(),
	                resultado.getString("dni"),
	                resultado.getString("email"),
	                resultado.getString("contrasena"),
	                resultado.getString("telefono")
	            );
	            usuario.setImagen(resultado.getString("imagen"));
	            usuario.setNumeroTarjeta(resultado.getString("numeroTarjeta"));
	            usuario.setFechaExpiracion(resultado.getDate("fechaExpiracion").toLocalDate());
	            usuario.setCodigoSeguridad(resultado.getString("codigoSeguridad"));
	            usuario.setDireccionFacturacion(resultado.getString("direccionFacturacion"));
	            usuario.setInstagram(resultado.getString("instagram"));
	            usuario.setFacebook(resultado.getString("facebook"));
	            usuario.setDireccion(resultado.getString("direccion"));
	            usuario.setBiografia(resultado.getString("biografia"));
	            usuario.setFechaRegistro(resultado.getTimestamp("fechaRegistro").toLocalDateTime());
	            usuario.setClubId(resultado.getLong("clubId"));

	            Inicio.listaUsuario.add(usuario);
	        }
	    } catch (SQLException eU) {
	        System.out.println("Error al hacer la carga inicial de usuarios: " + eU.getMessage());
	    } finally {
	        conexionI.cerrarConexion(conexion);  
	    }
	}

}
