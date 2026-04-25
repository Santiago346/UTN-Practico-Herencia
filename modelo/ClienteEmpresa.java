package modelo;
public class ClienteEmpresa extends Cliente {

    private String razonSocial;
    private String cuit;
    private String rubro;
    private String representanteLegal;

    public ClienteEmpresa(int id, String nombre, String apellidoOrazonSocial, String documentoOCuit,
            String direccion, String telefono, String correoElectronico, java.time.LocalDate fechaAlta,
            String razonSocial, String cuit, String rubro, String representanteLegal) {

        super(id, nombre, apellidoOrazonSocial, documentoOCuit, direccion, telefono, correoElectronico, fechaAlta);

        this.razonSocial = razonSocial;
        this.cuit = cuit;
        this.rubro = rubro;
        this.representanteLegal = representanteLegal;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public String getCuit() {
        return cuit;
    }

    public String getRubro() {
        return rubro;
    }

    public String getRepresentanteLegal() {
        return representanteLegal;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public void setCuit(String cuit) {
        this.cuit = cuit;
    }

    public void setRubro(String rubro) {
        this.rubro = rubro;
    }

    public void setRepresentanteLegal(String representanteLegal) {
        this.representanteLegal = representanteLegal;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Razón Social: " + razonSocial +
                "CUIT: " + cuit +
                "Rubro: " + rubro +
                "Representante Legal: " + representanteLegal;
    }
}