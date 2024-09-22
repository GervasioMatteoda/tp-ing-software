package dto;

import java.util.Date;

public class UsuarioDTO {
    
    private int id;
    
    private String nombre;
    private String apellido;
    private String clave;
    
    private String tipoDocumento;
    private int numeroDocumento;
    
    private DomicilioDTO domicilio;
    
    private Date fechaNacimiento;
    private String estadoUsuario;
    
    // Constructores - Getters - Setters
    public UsuarioDTO() {
    }

    public UsuarioDTO(int id, String clave) {
        this.id = id;
        this.clave = clave;
    }
    
    public UsuarioDTO(int id, String nombre, String apellido, String clave, String tipoDocumento, int numeroDocumento, DomicilioDTO domicilio, Date fechaNacimiento, String estadoUsuario) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.clave = clave;
        this.tipoDocumento = tipoDocumento;
        this.numeroDocumento = numeroDocumento;
        this.domicilio = domicilio;
        this.fechaNacimiento = fechaNacimiento;
        this.estadoUsuario = estadoUsuario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public int getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(int numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public DomicilioDTO getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(DomicilioDTO domicilio) {
        this.domicilio = domicilio;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getEstadoUsuario() {
        return estadoUsuario;
    }

    public void setEstadoUsuario(String estadoUsuario) {
        this.estadoUsuario = estadoUsuario;
    }
}