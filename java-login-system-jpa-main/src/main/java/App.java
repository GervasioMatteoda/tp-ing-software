import util.*;
import models.*;
import gui.LoginForm;
import javax.swing.JFrame;
import java.text.SimpleDateFormat;
import javax.persistence.EntityManager;

public class App {

    public static void main(String[] args) {
        inicializarDB();
        inicializarGUI();
    }
    
    private static void inicializarGUI() {
        JFrame pantalla;
        pantalla = new LoginForm();
        pantalla.setVisible(true);
        pantalla.setLocationRelativeTo(null);
    }
    
    private static void inicializarDB() {
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        EntityManager entityManager = EntityManagerUtil.getEntityManager();
        
        try {
            // Entidad -> País
            Pais pais1 = new Pais("Pais Nro. 1");
            Pais pais2 = new Pais("Pais Nro. 2");

            // Entidad -> Provincia
            Provincia provincia1 = new Provincia("Provincia Nro. 1", pais1);
            Provincia provincia2 = new Provincia("Provincia Nro. 2", pais1);
            Provincia provincia3 = new Provincia("Provincia Nro. 3", pais2);

            // Entidad -> Localidad
            Localidad localidad1 = new Localidad("Localidad Nro. 1", provincia1);
            Localidad localidad2 = new Localidad("Localidad Nro. 2", provincia1);
            Localidad localidad3 = new Localidad("Localidad Nro. 3", provincia2);
            Localidad localidad4 = new Localidad("Localidad Nro. 4", provincia2);
            Localidad localidad5 = new Localidad("Localidad Nro. 5", provincia3);
            Localidad localidad6 = new Localidad("Localidad Nro. 6", provincia3);

            // Entidad -> Usuario (Usuario y Dirección)
            Domicilio domicilio1 = new Domicilio("Hipólito Yrigoyen", 1245, null, null, localidad1, "R1900");
            Domicilio domicilio2 = new Domicilio("Avenida de las Américas", 483, 3, "A", localidad3, "P3100");
            Domicilio domicilio3 = new Domicilio("Avenida Ana Costa", 1234, null, null, localidad5, "11060-002");
            Usuario usuario1 = new Usuario(10000, "Nombre de Usuario 1", "Apellido de Usuario 1", "clave1", TipoDocumentoEnum.DNI, "Numero de DNI", formato.parse("01/01/1990"), domicilio1, EstadoUsuarioEnum.ACTIVO);
            Usuario usuario2 = new Usuario(20000, "Nombre de Usuario 2", "Apellido de Usuario 2", "clave2", TipoDocumentoEnum.PASAPORTE, "Numero de Pasaporte", formato.parse("02/02/1990"), domicilio2, EstadoUsuarioEnum.PENDIENTE);
            Usuario usuario3 = new Usuario(30000, "Nombre de Usuario 3", "Apellido de Usuario 3", "clave3", TipoDocumentoEnum.CUIT, "Numero de CUIT", formato.parse("03/03/2000"), domicilio3, EstadoUsuarioEnum.PENDIENTE);

            // Inserción de Datos
            entityManager.getTransaction().begin();
            // Creación de Localidades, Provincias y Paises
            entityManager.persist(localidad1);
            entityManager.persist(localidad2);
            entityManager.persist(localidad3);
            entityManager.persist(localidad4);
            entityManager.persist(localidad5);
            entityManager.persist(localidad6);
            //Creación de Usuarios y Domicilio
            entityManager.persist(usuario1);
            entityManager.persist(usuario2);
            entityManager.persist(usuario3);
            entityManager.getTransaction().commit();
        } catch (Exception e) {
            // Aviso de Problema
            MessageUtil.mensajeError("Error: Inicio", "Ha ocurrido un error: \n" + e.getMessage());
            System.out.println("Error: \n" + e);
        }
    }
}