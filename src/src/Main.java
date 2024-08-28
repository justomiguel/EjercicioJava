public class Main {
    public static void main(String[] args) {

        Vehiculo v1 = new Coche(100);
        Vehiculo v2 = new Camion(100);
        Vehiculo v3 = new Motocicleta(100);

        System.out.println("El costo de enviarlo por coche es:"+v1.calcularCosto());
        System.out.println("El costo de enviarlo por camion es:"+v2.calcularCosto());
        System.out.println("El costo de enviarlo por Motocicleta es:"+v3.calcularCosto());
    }


}