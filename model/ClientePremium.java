package model;

public class ClientePremium extends Cliente {

    private Integer limiteCreditoEspecial;
    private String ejecutivoCuenta;
    private String beneficiosAdicionales;

    public ClientePremium(Integer id, String nombre, String apellidoOrazonSocial, String documentoOCuit,
            String direccion, String telefono, String correoElectronico, String fechaAlta,
            Integer limiteCreditoEspecial, String ejecutivoCuenta, String beneficiosAdicionales) {

        super(id, nombre, apellidoOrazonSocial, documentoOCuit, direccion, telefono, correoElectronico, fechaAlta);

        this.limiteCreditoEspecial = limiteCreditoEspecial;
        this.ejecutivoCuenta = ejecutivoCuenta;
        this.beneficiosAdicionales = beneficiosAdicionales;
    }

    public Integer getLimiteCreditoEspecial() {
        return limiteCreditoEspecial;
    }

    public String getEjecutivoCuenta() {
        return ejecutivoCuenta;
    }

    public String getBeneficiosAdicionales() {
        return beneficiosAdicionales;
    }

    public void setLimiteCreditoEspecial(Integer limiteCreditoEspecial) {
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
                "\nLímite Crédito: " + limiteCreditoEspecial +
                "\nEjecutivo: " + ejecutivoCuenta +
                "\nBeneficios: " + beneficiosAdicionales;
    }

    @Override
    public CalificacionCliente calcularCalificacion() {
        if (limiteCreditoEspecial < 200000) {
            return CalificacionCliente.BAJO;
        } else if (limiteCreditoEspecial < 500000) {
            return CalificacionCliente.MEDIO;
        } else if (limiteCreditoEspecial < 1000000) {
            return CalificacionCliente.ALTO;
        } else {
            return CalificacionCliente.AVANZADO;
        }
    }
}