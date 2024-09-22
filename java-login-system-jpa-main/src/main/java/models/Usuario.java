package models;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;
import javax.validation.constraints.Digits;

@Entity
@Table (name = "Usuario")
public class Usuario implements Serializable {
    
    @Id
    @Column (name = "id")
    @Digits (integer = 5, fraction = 0, message = "El identificador debe tener exactamente 5 dígitos.")
    private Integer id;
    
    @Column(name = "nombre")
    private String nombre;
    
    @Column(name = "apellido")
    private String apellido;
    
    @Column(name = "clave")
    private String clave;
    
    @Enumerated(EnumType.STRING)
    @Column(name = "tipoDocumento")
    private TipoDocumentoEnum tipoDocumento;
    
    @Column(name = "numeroDocumento")
    private String numeroDocumento;
    
    @Temporal(TemporalType.DATE)
    @Column (name = "fechaNacimiento")
    private Date fechaNacimiento;
    
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_domicilio")
    private Domicilio domicilio;
    
    @Column (name = "estadoUsuario")
    private EstadoUsuarioEnum estadoUsuario;
    
    // Constructores
    public Usuario() {
    }

    public Usuario(Integer id, String nombre, String apellido, String clave, TipoDocumentoEnum tipoDocumento, String numeroDocumento, Date fechaNacimiento, Domicilio domicilio, EstadoUsuarioEnum estadoUsuario) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.clave = clave;
        this.tipoDocumento = tipoDocumento;
        this.numeroDocumento = numeroDocumento;
        this.fechaNacimiento = fechaNacimiento;
        this.domicilio = domicilio;
        this.estadoUsuario = estadoUsuario;
    }
    
    // Getters & Setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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

    public TipoDocumentoEnum getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(TipoDocumentoEnum tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Domicilio getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(Domicilio domicilio) {
        this.domicilio = domicilio;
    }

    public EstadoUsuarioEnum getEstadoUsuario() {
        return estadoUsuario;
    }

    public void setEstadoUsuario(EstadoUsuarioEnum estadoUsuario) {
        this.estadoUsuario = estadoUsuario;
    }
}
