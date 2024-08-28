public class Motocicleta  extends Vehiculo{

    public Motocicleta(int distanciaKilometros) {
        super(distanciaKilometros);
    }

    @Override
    public int calcularCosto() {
        return 5*getDistanciaKilometros();
    }
}
