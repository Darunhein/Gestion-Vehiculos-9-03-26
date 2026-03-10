public class Main {
    public static void main (String[]args){
        PedirDatos pd = new PedirDatos();

        int opcion ;

        do {

            System.out.println("Hello There");
            System.out.println("Menu (Please press the corresponding number to the option you desire)");
            opcion = pd.pediEntero("1 Crear Auto \n2 Crear Camion \n3 Mostrar total de Vehiculos creados", 1, 4);

            switch(opcion){
                case 1:
                    String marca = pd.pedirCadena("Marca del Auto");
                    String modelo = pd.pedirCadena("Modelo del Auto");
                    int anio = pd.pedirEntero("Año del Auto");
                    double precio = pd.pedirDecimalD("Precio del Auto");
                    int numeroPuertas = pd.pedirEntero("Precio del Auto");
                    String tipoCombustible = pd.pedirEntero("Tipo de Combustible que usa el Auto");



                break;
            }
        } 
    }
}