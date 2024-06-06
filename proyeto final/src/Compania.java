public class Compania extends Entidad {
    public Compania(String nombre) {
        super(nombre);
    }



    @Override
    public void mostrarInformacion() {
        System.out.println("Compañía: " + getNombre());
    }
}
