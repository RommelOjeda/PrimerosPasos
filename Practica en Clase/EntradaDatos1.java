import java.util.Scanner;

public class EntradaDatos1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in) ;
    String nombres, apellidos;
    byte edad;
    int km_viajados;
    float estatura;

    System.out.print("¿Cuales son sus nombres? ");
    nombres = System.console().readLine();
    System.out.print("¿Cuales son sus apellidos? ");
    apellidos = sc.nextLine();
    System.out.print("¿Cuantos años tiene?: ");
    edad = sc.nextByte();
    System.out.print("¿Cuales Km a viajado?: ");
    km_viajados = sc.nextInt();
    System.out.print("¿Cual es su estatura en metros?: ");
    estatura = sc.nextFloat();

    System.out.println("\nAgradecemos sus respuestas\n");
    System.out.print("Su nombre es " + nombres + " " + apellidos + ", ");
    System.out.print("tiene " + edad + " años, mide " + estatura + "m ");
    System.out.println("y ha viajado " + km_viajados + "Km.");
  }  
}