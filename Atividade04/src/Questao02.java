import javax.swing.JOptionPane;

public class Questao02 {

	public static void main(String[] args) {
		int num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero: "));
		int num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero: "));	
		
		if (num1 > num2) {
			JOptionPane.showMessageDialog(null, " O maior número é: "+ num1 );	
		}else if ( num1 < num2){
		    JOptionPane.showMessageDialog(null, " O maior número é: "+ num2);	
	    }else {
			  JOptionPane.showMessageDialog(null, " Número iguais");
	    }
	}
}
