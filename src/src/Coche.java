public class Coche extends Vehiculo{


    public Coche(int distanciaKilometros) {
        super(distanciaKilometros);
    }

    @Override
    public int calcularCosto() {
        return  getDistanciaKilometros() * 10;
    }
}
