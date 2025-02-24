import java.util.Scanner; 
public class Main {
  public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);
    System.out.println("Digite cualquier numero, que sea multiplo de 3 o de 5 o de ambos");
    
    int numero = scanner.nextInt();
    
    if (numero % 3 == 0 && numero % 5 == 0) {
      System.out.println("El numero es multiplo de 3 y de 5");
    } else if (numero % 3 == 0) {
      System.out.println("El numero es multiplo de 3");
    } else if (numero % 5 == 0) {
      System.out.println("El numero es multiplo de 5");
    } else {
      System.out.println("El numero no es multiplo de 3 ni de 5");
    }
    
  }
}
