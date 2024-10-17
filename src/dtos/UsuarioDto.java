package dtos;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * Esta clase representa un Data Transfer Object (DTO) para el Usuario.
 * Contiene atributos que describen la información básica de un usuario,
 * incluyendo su nombre, apellidos, fecha de nacimiento, DNI, información
 * de contacto, biografía, correo electrónico y contraseña. 
 * Se utiliza para transferir datos entre la capa de presentación y la capa de servicio.
 * 
 * @author ebp
 * @date 17/10/2024
 * 
 */


public class UsuarioDto {
	 	Long usuarioId;
	    String nombre = "";
	    String apellidos = "";
	    String imagen = null;
	    LocalDate fechaNacimiento = null;
	    String dni = "";
	    String numeroTarjeta = null;
	    LocalDate fechaExpiracion = null;
	    String codigoSeguridad = null;
	    String direccionFacturacion = null;
	    String instagram = null;
	    String facebook = null;
	    String telefono = "";
	    String direccion = null;
	    String biografia = null;
	    String email = "";
	    String contrasena = "";
	    LocalDateTime fechaRegistro = LocalDateTime.now();
	    Long clubId = null;

    // Getters y Setters
    public Long getUsuarioId() { return usuarioId; }
    public void setUsuarioId(Long usuarioId) { this.usuarioId = usuarioId; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getApellidos() { return apellidos; }
    public void setApellidos(String apellidos) { this.apellidos = apellidos; }

    public String getImagen() { return imagen; }
    public void setImagen(String imagen) { this.imagen = imagen; }

    public LocalDate getFechaNacimiento() { return fechaNacimiento; }
    public void setFechaNacimiento(LocalDate fechaNacimiento) { this.fechaNacimiento = fechaNacimiento; }

    public String getDni() { return dni; }
    public void setDni(String dni) { this.dni = dni; }

    public String getNumeroTarjeta() { return numeroTarjeta; }
    public void setNumeroTarjeta(String numeroTarjeta) { this.numeroTarjeta = numeroTarjeta; }

    public LocalDate getFechaExpiracion() { return fechaExpiracion; }
    public void setFechaExpiracion(LocalDate fechaExpiracion) { this.fechaExpiracion = fechaExpiracion; }

    public String getCodigoSeguridad() { return codigoSeguridad; }
    public void setCodigoSeguridad(String codigoSeguridad) { this.codigoSeguridad = codigoSeguridad; }

    public String getDireccionFacturacion() { return direccionFacturacion; }
    public void setDireccionFacturacion(String direccionFacturacion) { this.direccionFacturacion = direccionFacturacion; }

    public String getInstagram() { return instagram; }
    public void setInstagram(String instagram) { this.instagram = instagram; }

    public String getFacebook() { return facebook; }
    public void setFacebook(String facebook) { this.facebook = facebook; }

    public String getTelefono() { return telefono; }
    public void setTelefono(String telefono) { this.telefono = telefono; }

    public String getDireccion() { return direccion; }
    public void setDireccion(String direccion) { this.direccion = direccion; }

    public String getBiografia() { return biografia; }
    public void setBiografia(String biografia) { this.biografia = biografia; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getContrasena() { return contrasena; }
    public void setContrasena(String contrasena) { this.contrasena = contrasena; }

    public LocalDateTime getFechaRegistro() { return fechaRegistro; }
    public void setFechaRegistro(LocalDateTime fechaRegistro) { this.fechaRegistro = fechaRegistro; }

    public Long getClubId() { return clubId; }
    public void setClubId(Long clubId) { this.clubId = clubId; }
    
    
    // Constructor
    public UsuarioDto(Long usuarioId, String nombre, String apellidos, LocalDate fechaNacimiento, String dni,
                   String email, String contrasena, String telefono) {
        this.usuarioId = usuarioId;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fechaNacimiento = fechaNacimiento;
        this.dni = dni;
        this.email = email;
        this.contrasena = contrasena;
        this.telefono = telefono;
    }
}

