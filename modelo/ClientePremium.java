package modelo;
public class ClientePremium extends Cliente {

    private double limiteCreditoEspecial;
    private String ejecutivoCuenta;
    private String beneficiosAdicionales;

    public ClientePremium(int id, String nombre, String apellidoOrazonSocial, String documentoOCuit,
            String direccion, String telefono, String correoElectronico, java.time.LocalDate fechaAlta,
            double limiteCreditoEspecial, String ejecutivoCuenta, String beneficiosAdicionales) {

        super(id, nombre, apellidoOrazonSocial, documentoOCuit, direccion, telefono, correoElectronico, fechaAlta);

        this.limiteCreditoEspecial = limiteCreditoEspecial;
        this.ejecutivoCuenta = ejecutivoCuenta;
        this.beneficiosAdicionales = beneficiosAdicionales;
    }

    public double getLimiteCreditoEspecial() {
        return limiteCreditoEspecial;
    }

    public String getEjecutivoCuenta() {
        return ejecutivoCuenta;
    }

    public String getBeneficiosAdicionales() {
        return beneficiosAdicionales;
    }

    public void setLimiteCreditoEspecial(double limiteCreditoEspecial) {
        this.limiteCreditoEspecial = limiteCreditoEspecial;
    }

    public void setEjecutivoCuenta(String ejecutivoCuenta) {
        this.ejecutivoCuenta = ejecutivoCuenta;
    }

    public void setBeneficiosAdicionales(String beneficiosAdicionales) {
        this.beneficiosAdicionales = beneficiosAdicionales;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Límite Crédito: " + limiteCreditoEspecial +
                "Ejecutivo: " + ejecutivoCuenta +
                "Beneficios: " + beneficiosAdicionales;
    }
}