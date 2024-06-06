public class Aeropuerto extends Entidad {
    private String codigo;
    private String poblacion;
    private String pais;
    private int gmt;

    public Aeropuerto(String codigo, String nombre, String poblacion, String pais, int gmt) {
        super(nombre);
        this.codigo = codigo;
        this.poblacion = poblacion;
        this.pais = pais;
        this.gmt = gmt;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(String poblacion) {
        this.poblacion = poblacion;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public int getGmt() {
        return gmt;
    }

    public void setGmt(int gmt) {
        this.gmt = gmt;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Aeropuerto: " + getNombre() + " (" + codigo + ")");
    }
}
