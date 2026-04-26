package model;

public class ClientePersonaFisica extends Cliente {

    private String dni;
    private String fechaNacimiento;
    private String profesion;
    private Integer ingresosDeclarados;

    public ClientePersonaFisica(int id, String nombre, String apellidoOrazonSocial, String documentoOCuit,
            String direccion, String telefono, String correoElectronico, String fechaAlta,
            String dni, String fechaNacimiento, String profesion, Integer ingresosDeclarados) {

        super(id, nombre, apellidoOrazonSocial, documentoOCuit, direccion, telefono, correoElectronico, fechaAlta);

        this.dni = dni;
        this.fechaNacimiento = fechaNacimiento;
        this.profesion = profesion;
        this.ingresosDeclarados = ingresosDeclarados;
    }

    public String getDni() {
        return dni;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public String getProfesion() {
        return profesion;
    }

    public Integer getIngresosDeclarados() {
        return ingresosDeclarados;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public void setIngresosDeclarados(Integer ingresosDeclarados) {
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