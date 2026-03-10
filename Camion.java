public class Camion extends Vehiculo {
    
    //Atributes
    protected int capacidadCarga;
    protected int numeroEjes;

    //Construct
    public Camion(String marca, String modelo, int anio, double precio, int capacidadCarga, int numeroEjes){
        super(marca, modelo, anio, precio);
        this.capacidadCarga = capacidadCarga;
        this.numeroEjes = numeroEjes;
    }
    
    //Methods
    public void cargarMercancia(){
        System.out.println("El camion " + getMarca() + "está cargando mercancía");
    }

    public void mostarCapacidad(){
        System.out.println("El limite de la capacidad de carga del camion " + getMarca() + " es " + capacidadCarga);
    }
}