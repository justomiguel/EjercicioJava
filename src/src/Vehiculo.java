public abstract class  Vehiculo {

    private int distanciaKilometros;

    public Vehiculo(int distanciaKilometros) {
        this.distanciaKilometros = distanciaKilometros;
    }

    public abstract int calcularCosto();

    public int getDistanciaKilometros() {
        //gurdao bd
        return distanciaKilometros;
    }
}
