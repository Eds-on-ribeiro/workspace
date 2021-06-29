import javax.swing.JOptionPane;

public class Questao05 {

	public static void main(String[] args) {
		
		double valor1 = Float.parseFloat(JOptionPane.showInputDialog("Digite o total de horas trabalhados: "));
		double valor2 = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor da hora:"));
		double salario = valor1 * valor2;
		
		JOptionPane.showMessageDialog(null, " O salário do funcionário é: " + salario);

	}

}
