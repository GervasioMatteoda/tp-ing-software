package models;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import models.Provincia;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-01-03T09:51:01")
@StaticMetamodel(Pais.class)
public class Pais_ { 

    public static volatile ListAttribute<Pais, Provincia> provincias;
    public static volatile SingularAttribute<Pais, Integer> id;
    public static volatile SingularAttribute<Pais, String> nombre;

}