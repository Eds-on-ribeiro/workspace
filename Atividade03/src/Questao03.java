import javax.swing.JOptionPane;

public class Questao03 {

	public static void main(String[] args) {

		int num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um n�mero."));
		int num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite um n�mero."));
		int a = num1;
		int b = num2;
		int media = (a + b) / 2;
		
		JOptionPane.showMessageDialog(null, " A m�dia � " + media);

	}

}
