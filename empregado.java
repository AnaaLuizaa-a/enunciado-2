public class empregado {
  private String primeiroNome, sobrenome;
  private double salario, salarioAnual, aumento;

  //construtor que inicializa os três atributos
  public empregado(String primeiroNome, String sobrenome, double salario){
    this.primeiroNome = primeiroNome;
    this.sobrenome = sobrenome;
    this.salario = salario;
  }
  public String setPrimeiroNome(){
    return primeiroNome;
  }
  public String setsobrenome(){
    return sobrenome;
  }
  public double setsalario(){
    if (this.salario < 0){
      this.salario = 0.0;}
      return salario;
    }
 //exiba o salário anual de cada instância (soma dos salários mensais
  public double getsalarioAnual(){
    salarioAnual = salario * 12;
    return salarioAnual;
  }
  //dê a cada empregado um aumento de 10% e exiba novamente o salário anual de cada empregado.
  public double setAumento(){
    aumento = salarioAnual * 0.1;
    salarioAnual = salarioAnual + aumento;
    return salarioAnual;
  }
  }

  
  
  
