package dto;

public class DomicilioDTO {

    private String calle;
    private String departamento;
    
    private int numero;
    private int piso;
    
    private String localidad;
    private String codigoPostal;
    
    // Constructores - Getters - Setters
    public DomicilioDTO() {
    }

    public DomicilioDTO(String calle, String departamento, int numero, int piso, String localidad, String codigoPostal) {
        this.calle = calle;
        this.departamento = departamento;
        this.numero = numero;
        this.piso = piso;
        this.localidad = localidad;
        this.codigoPostal = codigoPostal;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getPiso() {
        return piso;
    }

    public void setPiso(int piso) {
        this.piso = piso;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }
}
