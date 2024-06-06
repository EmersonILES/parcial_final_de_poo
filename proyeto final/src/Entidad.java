public class Entidad {
    private String nombre;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Entidad(String nombre) {
        this.nombre = nombre;
    }



    public void mostrarInformacion() {
        System.out.println("Entidad: " + nombre);
    }
}
