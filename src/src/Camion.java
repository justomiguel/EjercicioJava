public class Camion extends Vehiculo {


    public Camion(int distanciaKilometros) {
        super(distanciaKilometros);
    }

    @Override
    public int calcularCosto() {
        return 15*getDistanciaKilometros();
    }
}
