package models;

import java.io.Serializable;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table (name = "Pais")
public class Pais implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "id")
    private Integer id;
    
    @Column (name = "nombre")
    private String nombre;
    
    @OneToMany(mappedBy = "pais", fetch = FetchType.LAZY)
    private List<Provincia> provincias = new ArrayList<>();
    
    // Constructores
    public Pais() {
    }

    public Pais(String nombre) {
        this.nombre = nombre;
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

    public List<Provincia> getProvincias() {
        return provincias;
    }

    public void setProvincias(List<Provincia> provincias) {
        this.provincias = provincias;
    }
    
}
