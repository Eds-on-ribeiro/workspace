import javax.swing.JOptionPane;

public class principal02 {

	public static void main(String[] args) {
		
		int valor1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));
		int valor2 = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));	
		int valor3 = valor1 / valor2;
			
	    JOptionPane.showMessageDialog(null, "A resultado da divisao foi: " + valor3);
	}
}
