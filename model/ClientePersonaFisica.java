package model;

import java.time.LocalDate;

public class ClientePersonaFisica extends Cliente {

    private String dni;
    private LocalDate fechaNacimiento;
    private String profesion;
    private double ingresosDeclarados;

    public ClientePersonaFisica(int id, String nombre, String apellidoOrazonSocial, String documentoOCuit,
            String direccion, String telefono, String correoElectronico, LocalDate fechaAlta,
            String dni, LocalDate fechaNacimiento, String profesion, double ingresosDeclarados) {

        super(id, nombre, apellidoOrazonSocial, documentoOCuit, direccion, telefono, correoElectronico, fechaAlta);

        this.dni = dni;
        this.fechaNacimiento = fechaNacimiento;
        this.profesion = profesion;
        this.ingresosDeclarados = ingresosDeclarados;
    }

    public String getDni() {
        return dni;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public String getProfesion() {
        return profesion;
    }

    public double getIngresosDeclarados() {
        return ingresosDeclarados;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public void setIngresosDeclarados(double ingresosDeclarados) {
        this.ingresosDeclarados = ingresosDeclarados;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nDNI: " + dni +
                "\nFecha Nacimiento: " + fechaNacimiento +
                "\nProfesión: " + profesion +
                "\nIngresos: " + ingresosDeclarados;
    }

    @Override
    public CalificacionCliente calcularCalificacion() {
        if (ingresosDeclarados < 100000) {
            return CalificacionCliente.BAJO;
        } else if (ingresosDeclarados < 300000) {
            return CalificacionCliente.MEDIO;
        } else if (ingresosDeclarados < 700000) {
            return CalificacionCliente.ALTO;
        } else {
            return CalificacionCliente.AVANZADO;
        }
    }

}