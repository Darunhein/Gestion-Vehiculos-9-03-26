public class Vehiculo {

//Atributes
  private String marca;
  private String modelo;
  private int anio;
  private double precio;
  static int totalVehiculos;

//Constructs
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

//Methods
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
    System.out.println("El precio del Vehiculo a bajado un 10%");
  }

//Setters n Getters 
  public void setMarca(String marca){
    this.marca = marca;
  }

  public String getMarca(){
    return marca;
  }

  public void setModelo(String modelo){
    this.modelo = modelo;
  }

  public String getModelo(){
    return modelo;
  }

  public void setAnio(int anio){
    this.anio = anio;
  }

  public int getAnio(){
    return anio;
  }

  public void setPrecio(double precio){
    this.precio = precio;
  }

  public double getPrecio(){
    return precio;
  }
}
