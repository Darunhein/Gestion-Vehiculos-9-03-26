public class Main {
    public static void main (String[]args){

        //Object of PedirDatos
        PedirDatos pd = new PedirDatos();

        //Variable for the switch
        int opcion ;

        //Start of the do while
        do {

            //Menu with greeting
            System.out.println("Hello There");
            System.out.println("Menu (Please press the corresponding number to the option you desire)");
            opcion = pd.pedirEntero("1 Crear Auto \n2 Crear Camion \n3 Mostrar total de Vehiculos creados \n4 Para Salir", 1, 4);

            //Start of the switch
            switch(opcion){

                case 1:
                    System.out.println("Escribe los datos de tu Auto");
                    String marcaA = pd.pedirCadena("Marca del Auto");
                    String modeloA = pd.pedirCadena("Modelo del Auto");
                    int anioA = pd.pedirEntero("Año del Auto");
                    double precioA = pd.pedirDecimalD("Precio del Auto");
                    int numeroPuertas = pd.pedirEntero("Cantidad de puertas que tiene el Auto");
                    String tipoCombustible = pd.pedirCadena("Tipo de Combustible que usa el Auto");

                    Auto auto = new Auto(marcaA, modeloA, anioA, precioA, numeroPuertas, tipoCombustible);

                    auto.mostrarInfo();
                    auto.encender();
                    auto.aplicarDescuento();
                    auto.tocarClaxon();
                    auto.mostarPuertas();
                break;

                case 2:
                    System.out.println("Escribe los datos de tu Camión");
                    String marcaB = pd.pedirCadena("Marca del Camión");
                    String modeloB = pd.pedirCadena("Modelo del Camión");
                    int anioB = pd.pedirEntero("Año del Camión");
                    double precioB = pd.pedirDecimalD("Precio del Camión");
                    int capacidadCarga = pd.pedirEntero("Limite de la Capacidad de carga del Camión");
                    int numeroEjes = pd.pedirEntero("Numero de ejes del Camión");

                    Camion camion = new Camion(marcaB, modeloB, anioB, precioB, capacidadCarga, numeroEjes);

                    camion.mostrarInfo();
                    camion.encender();
                    camion.aplicarDescuento();
                    camion.cargarMercancia();
                    camion.mostarCapacidad();                
                break;

                case 3:
                    System.out.println("El total de vehiculos creados es " + Vehiculo.totalVehiculos);
                break;

                case 4:
                    System.out.println("GudBye");
                break;
            }

        //End of the do while    
        }while(opcion != 4); 
    }
}