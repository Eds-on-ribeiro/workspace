public class Principal {
  public static void main(String[] args) {
  // operados l�gicos
  boolean x2 = false;
  boolean x1; 
  x1 = true;
  int idade = 17;
  
  // operador l�gico not
  System.out.println(!x1);
  
  // operador l�gico or
  System.out.println(x1 || x2);
  
  // operador l�gico and
  System.out.println(x1 && !x2);
  
  // exemplos de operadores de compara��o
    System.out.println(idade > 17);
    System.out.println(idade >= 18);
    System.out.println(18 <= idade);
    System.out.println(17 < idade);
  }
}