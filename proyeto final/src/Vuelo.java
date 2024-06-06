public class Vuelo extends Entidad {
    private Aeropuerto origen;
    private Aeropuerto destino;
    private String duracion;
    private String aerolinea;
    private String avion;
    private int plazas;
    private String horario;

    public Vuelo(Aeropuerto origen, Aeropuerto destino, String duracion, String aerolinea, String avion, int plazas, String horario) {
        super(aerolinea);
        this.origen = origen;
        this.destino = destino;
        this.duracion = duracion;
        this.avion = avion;
        this.plazas = plazas;
        this.horario = horario;
    }

    public Aeropuerto getOrigen() {
        return origen;
    }

    public void setOrigen(Aeropuerto origen) {
        this.origen = origen;
    }

    public Aeropuerto getDestino() {
        return destino;
    }

    public void setDestino(Aeropuerto destino) {
        this.destino = destino;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public String getAerolinea() {
        return aerolinea;
    }

    public void setAerolinea(String aerolinea) {
        this.aerolinea = aerolinea;
    }

    public String getAvion() {
        return avion;
    }

    public void setAvion(String avion) {
        this.avion = avion;
    }

    public int getPlazas() {
        return plazas;
    }

    public void setPlazas(int plazas) {
        this.plazas = plazas;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println(getNombre() + " vuelo de " + origen.getNombre() + " a " + destino.getNombre() + " (" + avion + "), duración: " + duracion + ", plazas: " + plazas + ", horario: " + horario);
    }
}
