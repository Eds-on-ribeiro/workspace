import javax.swing.JOptionPane;

public class Questao03 {

	public static void main(String[] args) {
		int n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite 1 n�mero: "));
		int n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite 1 n�mero: "));
		
		String numeros = "";
		for(int i = n1; i <= n2; i++) {
			numeros = numeros + i + ", ";
		}
		JOptionPane.showMessageDialog(null, "os n�meros entre "+n1+" e "+n2+" s�o: " +numeros);
	}

}
