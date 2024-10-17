package dtos;

import java.time.LocalDate;

/**
 * Esta clase representa un Data Transfer Object (DTO) para el Club.
 * Contiene atributos que describen la información básica de un club,
 * incluyendo su nombre, sede, redes sociales, descripción, fecha de fundación,
 * número de miembros, correo electrónico y contraseña.
 * Se utiliza para transferir datos entre la capa de presentación y la capa de servicio.
 * 
 * @author ebp
 * @fecha 17/10/2024
 */


public class ClubDto {
	  	Long clubId;
	    String nombre = "";
	    String sede = "";
	    String instagram = null;
	    String facebook = null;
	    String descripcion = null;
	    LocalDate fechaFundacion = null;
	    String website = null;
	    Integer numeroMiembros = 0;
	    String email = "";
	    String contrasena = "";

    // Getters y Setters
    public Long getClubId() { return clubId; }
    public void setClubId(Long clubId) { this.clubId = clubId; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getSede() { return sede; }
    public void setSede(String sede) { this.sede = sede; }

    public String getInstagram() { return instagram; }
    public void setInstagram(String instagram) { this.instagram = instagram; }

    public String getFacebook() { return facebook; }
    public void setFacebook(String facebook) { this.facebook = facebook; }

    public String getDescripcion() { return descripcion; }
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }

    public LocalDate getFechaFundacion() { return fechaFundacion; }
    public void setFechaFundacion(LocalDate fechaFundacion) { this.fechaFundacion = fechaFundacion; }

    public String getWebsite() { return website; }
    public void setWebsite(String website) { this.website = website; }

    public Integer getNumeroMiembros() { return numeroMiembros; }
    public void setNumeroMiembros(Integer numeroMiembros) { this.numeroMiembros = numeroMiembros; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getContrasena() { return contrasena; }
    public void setContrasena(String contrasena) { this.contrasena = contrasena; }
    
    // Constructor
    
    public ClubDto(Long clubId, String nombre, String sede, String email, String contrasena) {
        this.clubId = clubId;
        this.nombre = nombre;
        this.sede = sede;
        this.email = email;
        this.contrasena = contrasena;
    }

}

