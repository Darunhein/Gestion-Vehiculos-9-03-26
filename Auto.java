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
    public void tocarClaxon(){
        System.out.println("El auto " + getMarca + " usa su claxon");
    }

    public void mostarPuertas(){
        System.out.println("El numero de puertas del auto " + getMarca + " es " + numeroPuertas);
    }
}