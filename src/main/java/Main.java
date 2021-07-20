import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    System.out.println("Simple Calculator");
    System.out.println();
    
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter two numbers: ");
    int a, b;
    
    a = sc.nextInt();
    b = sc.nextInt();
    
    add(a, b);
    mul(a, b);
    sub(a, b);
    div(a, b);
    
    sc.close();
  }

  public static void add(int i, int j) {
    System.out.println("Soma " + (i + j));
  }

  public static void mul(int i, int j) {
    System.out.println("Multiplicacao " + (i * j));
  }

  public static void sub(int i, int j) {
    System.out.println("Subtracao " + (i - j));
  }

  public static void div(int i, int j) {
    if (j != 0) {
      System.out.println("Divisao " + (i / j));
    } else {
      System.out.println("Impossivel divisao por 0");
    }
  }
}
