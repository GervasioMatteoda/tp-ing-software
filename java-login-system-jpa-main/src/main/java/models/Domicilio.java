package models;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table (name = "Domicilio")
public class Domicilio implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "id")
    private int id;
    
    @OneToOne (mappedBy = "domicilio")
    private Usuario usuarios;
    
    @Column(name = "calle")
    private String calle;
    
    @Column(name = "numero")
    private Integer piso;
    
    @Column(name = "piso")
    private Integer numero;
    
    @Column(name = "departamento")
    private String departamento;
    
    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name="id_localidad")
    private Localidad localidad;
    
    @Column(name = "codigoPostal")
    private String codigoPostal;
    
    // Constructores
    public Domicilio() {
    }

    public Domicilio(String calle, Integer piso, Integer numero, String departamento, Localidad localidad, String codigoPostal) {
        this.calle = calle;
        this.piso = piso;
        this.numero = numero;
        this.departamento = departamento;
        this.localidad = localidad;
        this.codigoPostal = codigoPostal;
    }
    
    // Getters & Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public Integer getPiso() {
        return piso;
    }

    public void setPiso(Integer piso) {
        this.piso = piso;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public Localidad getLocalidad() {
        return localidad;
    }

    public void setLocalidad(Localidad localidad) {
        this.localidad = localidad;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public Usuario getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(Usuario usuarios) {
        this.usuarios = usuarios;
    }
}
