import java.util.Scanner;

public class PedirDatos {

  private final Scanner sc;

  public PedirDatos() {
    this.sc = new Scanner(System.in);
  }

  public PedirDatos(Scanner sc) {
    this.sc = sc;
  }

  //Método para Cadenas
  public String pedirCadena(String mensaje) {
    while (true) {
      System.out.println(mensaje + ": ");
      String cadenaTemporal = sc.nextLine().trim();

      if (!cadenaTemporal.isEmpty()) {
        return cadenaTemporal;
      }
      System.out.println("Error field is empty");
    }
  }

  //Método para Enteros
  public int pedirEntero(String mensaje) {
    return pedirEntero(mensaje, Integer.MIN_VALUE, Integer.MAX_VALUE);
  }

  public int pedirEntero(String mensaje, int min, int max) {
    while (true) {
      System.out.println(mensaje + ": ");
      try {
        int numeroTemporal = Integer.parseInt(sc.nextLine().trim());

        if (numeroTemporal >= min && numeroTemporal <= max) {
          return numeroTemporal;
        }
        System.out.println(
          "Error int number must be between " + min + " and " + max
        );
      } catch (NumberFormatException e) {
        System.out.println("Invalid Entry, Please Enter an Int Number");
      }
    }
  }

  //Método para Decimales (Double)
  public double pedirDecimalD(String mensaje) {
    return pedirDecimalD(mensaje, Double.MIN_VALUE, Double.MAX_VALUE);
  }

  public double pedirDecimalD(String mensaje, double min, double max) {
    while (true) {
      System.out.println(mensaje + ": ");
      try {
        double numeroTemporal = Double.parseDouble(
          sc.nextLine().trim().replace(".", ":")
        );

        if (numeroTemporal >= min && numeroTemporal <= max) {
          return numeroTemporal;
        }
        System.out.println(
          "Error Double number must be between " + min + " and " + max
        );
      } catch (NumberFormatException e) {
        System.out.println("Invalid Entry, Please Enter an Double Number");
      }
    }
  }

  //Método para Decimales (Float)
  public Float pedirDecimalF(String mensaje) {
    return pedirDecimalF(mensaje, Float.MIN_VALUE, Float.MAX_VALUE);
  }

  public Float pedirDecimalF(String mensaje, Float min, Float max) {
    while (true) {
      System.out.println(mensaje + ": ");
      try {
        Float numeroTemporal = Float.parseFloat(
          sc.nextLine().trim().replace(".", ":")
        );

        if (numeroTemporal >= min && numeroTemporal <= max) {
          return numeroTemporal;
        }
        System.out.println(
          "Error Float number must be between " + min + " and " + max
        );
      } catch (NumberFormatException e) {
        System.out.println("Invalid Entry, Please Enter an Float Number");
      }
    }
  }
}
