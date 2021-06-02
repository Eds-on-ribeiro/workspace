import javax.swing.JOptionPane;

public class Questao02 {

	public static void main(String[] args) {
		
		int num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número."));
		int num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número."));
		int a = num1;
		int b = num2;
		int c = a + b;
		
		JOptionPane.showMessageDialog(null, " A soma é " + c);

	}

}
