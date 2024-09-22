package models;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import models.Localidad;
import models.Usuario;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-01-03T09:51:01")
@StaticMetamodel(Domicilio.class)
public class Domicilio_ { 

    public static volatile SingularAttribute<Domicilio, Integer> piso;
    public static volatile SingularAttribute<Domicilio, Integer> numero;
    public static volatile SingularAttribute<Domicilio, String> codigoPostal;
    public static volatile SingularAttribute<Domicilio, String> calle;
    public static volatile SingularAttribute<Domicilio, String> departamento;
    public static volatile SingularAttribute<Domicilio, Localidad> localidad;
    public static volatile SingularAttribute<Domicilio, Integer> id;
    public static volatile SingularAttribute<Domicilio, Usuario> usuarios;

}