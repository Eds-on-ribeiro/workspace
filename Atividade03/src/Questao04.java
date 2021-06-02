import javax.swing.JOptionPane;

public class Questao04 {

	public static void main(String[] args) {
		
		double num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor da conta: "));
		double a = num1;
		double porcentagem = (a * 10) / 100;
		double soma = porcentagem + num1;
		
		JOptionPane.showMessageDialog(null, " 10% do garçom: " + porcentagem);
		JOptionPane.showMessageDialog(null, " Valor final: " + soma);

	}

}
