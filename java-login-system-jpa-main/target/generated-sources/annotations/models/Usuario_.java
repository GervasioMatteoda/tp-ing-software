package models;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import models.Domicilio;
import models.EstadoUsuarioEnum;
import models.TipoDocumentoEnum;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-01-03T09:51:01")
@StaticMetamodel(Usuario.class)
public class Usuario_ { 

    public static volatile SingularAttribute<Usuario, TipoDocumentoEnum> tipoDocumento;
    public static volatile SingularAttribute<Usuario, String> clave;
    public static volatile SingularAttribute<Usuario, Domicilio> domicilio;
    public static volatile SingularAttribute<Usuario, Date> fechaNacimiento;
    public static volatile SingularAttribute<Usuario, String> apellido;
    public static volatile SingularAttribute<Usuario, EstadoUsuarioEnum> estadoUsuario;
    public static volatile SingularAttribute<Usuario, Integer> id;
    public static volatile SingularAttribute<Usuario, String> numeroDocumento;
    public static volatile SingularAttribute<Usuario, String> nombre;

}