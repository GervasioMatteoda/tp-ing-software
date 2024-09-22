package models;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import models.Localidad;
import models.Pais;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-01-03T09:51:01")
@StaticMetamodel(Provincia.class)
public class Provincia_ { 

    public static volatile SingularAttribute<Provincia, Integer> id;
    public static volatile SingularAttribute<Provincia, String> nombre;
    public static volatile ListAttribute<Provincia, Localidad> localidades;
    public static volatile SingularAttribute<Provincia, Pais> pais;

}