import javax.swing.JOptionPane;

public class Desafio01 {

	public static void main(String[] args) {
		
		int n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite 1 n�mero!"));
		int n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite 1 n�mero!"));
		int n3 = Integer.parseInt(JOptionPane.showInputDialog("Digite 1 n�mero!"));
        
		int aux = 0;
		if(n1 > n2) {
			aux = n1;
			n1 = n2;
			n2 = aux;
		}
		if(n1 > n3) {
			aux = n1;
			n1 = n3;
			n3 = aux;
		}
		if(n1 > n3) {
			aux = n2;
			n2 = n3;
			n3 = aux;
		}
		JOptionPane.showMessageDialog(null, "N�meros ordenados: "+n1+", "+n2+", " +n3);
	}

}
