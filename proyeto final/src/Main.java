import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Aeropuerto> aeropuertos = cargarAeropuertos();
        List<Vuelo> vuelos = cargarVuelos(aeropuertos);

        mostrarVuelosSalida(aeropuertos, vuelos);
        mostrarVuelosLlegada(aeropuertos, vuelos);
    }

    private static List<Aeropuerto> cargarAeropuertos() {
        List<Aeropuerto> aeropuertos = new ArrayList<>();
        aeropuertos.add(new Aeropuerto("BCN01", "Barcelona - El Prat", "Barcelona", "España", 1));
        aeropuertos.add(new Aeropuerto("MAD01", "Madrid - Barajas", "Madrid", "España", 1));
        return aeropuertos;
    }

    private static List<Vuelo> cargarVuelos(List<Aeropuerto> aeropuertos) {
        List<Vuelo> vuelos = new ArrayList<>();
        Aeropuerto bcn = null, mad = null;

        // Encontrar los aeropuertos correspondientes en la lista
        for (Aeropuerto aeropuerto : aeropuertos) {
            if (aeropuerto.getCodigo().equals("BCN01")) {
                bcn = aeropuerto;
            } else if (aeropuerto.getCodigo().equals("MAD01")) {
                mad = aeropuerto;
            }
        }

        if (bcn != null && mad != null) {
            vuelos.add(new Vuelo(bcn, mad, "01:00", "Iberia", "Airbus", 150, "L-15:00 X-15:00 V-15:00 D-15:00"));
            vuelos.add(new Vuelo(mad, bcn, "01:00", "Iberia", "Airbus", 150, "L-18:00 J-20:00 S-20:00"));
        }

        return vuelos;
    }

    private static void mostrarVuelosSalida(List<Aeropuerto> aeropuertos, List<Vuelo> vuelos) {
        for (Aeropuerto aeropuerto : aeropuertos) {
            System.out.println("Vuelos de salida desde " + aeropuerto.getNombre() + ":");
            for (Vuelo vuelo : vuelos) {
                if (vuelo.getOrigen().getCodigo().equals(aeropuerto.getCodigo())) {
                    System.out.println("  " + vuelo);
                }
            }
        }
    }

    private static void mostrarVuelosLlegada(List<Aeropuerto> aeropuertos, List<Vuelo> vuelos) {
        for (Aeropuerto aeropuerto : aeropuertos) {
            System.out.println("Vuelos de llegada a " + aeropuerto.getNombre() + ":");
            for (Vuelo vuelo : vuelos) {
                if (vuelo.getDestino().getCodigo().equals(aeropuerto.getCodigo())) {
                    System.out.println("  " + vuelo);
                }
            }
        }
    }
}
