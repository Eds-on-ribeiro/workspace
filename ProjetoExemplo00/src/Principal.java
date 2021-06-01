public class Principal {
  public static void main(String[] args) {
  // operados lógicos
  boolean x2 = false;
  boolean x1; 
  x1 = true;
  int idade = 17;
  
  // operador lógico not
  System.out.println(!x1);
  
  // operador lógico or
  System.out.println(x1 || x2);
  
  // operador lógico and
  System.out.println(x1 && !x2);
  
  // exemplos de operadores de comparação
    System.out.println(idade > 17);
    System.out.println(idade >= 18);
    System.out.println(18 <= idade);
    System.out.println(17 < idade);
  }
}