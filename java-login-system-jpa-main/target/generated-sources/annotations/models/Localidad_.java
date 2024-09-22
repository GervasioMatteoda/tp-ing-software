package models;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import models.Domicilio;
import models.Provincia;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-01-03T09:51:01")
@StaticMetamodel(Localidad.class)
public class Localidad_ { 

    public static volatile ListAttribute<Localidad, Domicilio> domicilios;
    public static volatile SingularAttribute<Localidad, Integer> id;
    public static volatile SingularAttribute<Localidad, Provincia> provincia;
    public static volatile SingularAttribute<Localidad, String> nombre;

}