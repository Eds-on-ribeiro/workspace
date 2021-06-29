import javax.swing.JOptionPane;

public class Questao04 {

	public static void main(String[] args) {
		
		for(int i = 1; i <= 5; i++); {
	    int i = 5;
			String palavra = JOptionPane.showInputDialog("Digite a palavra de acesso:");
			if (palavra.equals("Java-2021")) {
				JOptionPane.showMessageDialog(null, "Permissão: Aprovada");
				
			}else {
				JOptionPane.showMessageDialog(null, "Tente novamente " + i +" tentativas");
			}
		}
	}
}
