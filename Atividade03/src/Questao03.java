import javax.swing.JOptionPane;

public class Questao03 {

	public static void main(String[] args) {

		int num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número."));
		int num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número."));
		int a = num1;
		int b = num2;
		int media = (a + b) / 2;
		
		JOptionPane.showMessageDialog(null, " A média é " + media);

	}

}
