package model;

public abstract class Cliente implements Calificable {

    protected int id;
    protected String nombre;
    protected String apellidoOrazonSocial;
    protected String documentoOCuit;
    protected String direccion;
    protected String telefono;
    protected String correoElectronico;
    protected String fechaAlta;

    public Cliente() {
    }

    public Cliente(int id, String nombre, String apellidoOrazonSocial, String documentoOCuit,
            String direccion, String telefono, String correoElectronico, String fechaAlta) {
        this.id = id;
        this.nombre = nombre;
        this.apellidoOrazonSocial = apellidoOrazonSocial;
        this.documentoOCuit = documentoOCuit;
        this.direccion = direccion;
        this.telefono = telefono;
        this.correoElectronico = correoElectronico;
        this.fechaAlta = fechaAlta;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidoOrazonSocial(String apellidoOrazonSocial) {
        this.apellidoOrazonSocial = apellidoOrazonSocial;
    }

    public void setDocumentoOCuit(String documentoOCuit) {
        this.documentoOCuit = documentoOCuit;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public void setFechaAlta(String fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidoOrazonSocial() {
        return apellidoOrazonSocial;
    }

    public String getDocumentoOCuit() {
        return documentoOCuit;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public String getFechaAlta() {
        return fechaAlta;
    }

    @Override
    public String toString() {
        return "ID: " + id +
                "\nNombre: " + nombre +
                "\nApellido/Razón Social: " + apellidoOrazonSocial +
                "\nDocumento/CUIT: " + documentoOCuit +
                "\nDirección: " + direccion +
                "\nTeléfono: " + telefono +
                "\nEmail: " + correoElectronico +
                "\nFecha Alta: " + fechaAlta;
    }
}