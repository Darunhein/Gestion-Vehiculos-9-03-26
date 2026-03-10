public class Auto extends Vehiculo {

//Atributes
    protected int numeroPuertas;
    protected String tipoCombustible;

//Construct
    public Auto (String marca, String modelo, int anio, double precio, int numeroPuertas, String tipoCombustible){
        super(marca, modelo, anio, precio);
        this.numeroPuertas = numeroPuertas;
        this.tipoCombustible = tipoCombustible;
    }

//Methods


}