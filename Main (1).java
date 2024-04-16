import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Insira o primeiro nome do empregado:");
    String primeiroNome = input.next();
    System.out.println("Insira o sobrenome do empregado:");
    String sobrenome = input.next();
    System.out.println("Insira o salário do empregado:");
    double salario = input.nextDouble();

    empregado empregado1 = new empregado(primeiroNome, sobrenome, salario);
    System.out.println("\nO salário anual do empregado é: " + empregado1.getsalarioAnual());
    System.out.println("\nO salário anual com aumento de 10% é: " + empregado1.getsalarioAnual());
    System.out.print("\n");

    System.out.println("Insira o primeiro nome do segundo empregado:");
    String primeiroNome2 = input.next();
    System.out.println("Insira o sobrenome do segundo empregado:");
    String sobrenome2 = input.next();
    System.out.println("Insira o salário do segundo empregado:");
    double salario2 = input.nextDouble();
    empregado empregado2 = new empregado(primeiroNome2, sobrenome2, salario2);
    System.out.println("\nO salário anual do segundo empregado é: " + empregado2.getsalarioAnual());
    System.out.println("\nO salário anual com aumento de 10% do segundo empregado é: " + empregado2.getsalarioAnual());
  }

  }

  