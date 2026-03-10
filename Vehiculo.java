public class Vehiculo {

  private String marca;
  private String modelo;
  private int anio;
  private double precio;
  static int totalVehiculos;

  public Vehiculo(){
    totalVehiculos++;
  }

  public Vehiculo(String marca, String modelo, int anio, double precio, int totalVehiculos){
    this.marca = marca;
    this.modelo = modelo;
    this.anio = anio;
    this.precio = precio;
    this.totalVehiculos = totalVehiculos;
    totalVehiculos++;
  }

  public void mostrarInfo(){
    System.out.println("Informacion del Vehiculo");
    System.out.println("Marca: " + marca);
    System.out.println("Modelo: " + modelo);
    System.out.println("Año: " + anio);
    System.out.println("Precio: " + precio);
  }

  public void encender(){
    System.out.println("El vehiculo " + marca + " ha sido encendido");
  }

  public void aplicarDescuento(){
    precio = precio * 0.9;
    System.out.println("");
  }
}
