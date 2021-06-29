import javax.swing.JOptionPane;

public class Questao01 {

		public static void main(String[] args) {
			
			String nome = JOptionPane.showInputDialog("Digite o nome do aluno: ");
			double b = Integer.parseInt(JOptionPane.showInputDialog("Digite a nota final: "));	
			
			if (b >= 7) {
				JOptionPane.showMessageDialog(null, " O aluno "+ nome +" esta com a nota : " + b + " Aprovado");	
			}else if ( b >= 4){
			    JOptionPane.showMessageDialog(null, " O aluno "+ nome +" esta com a nota : " + b + " Recuperação");	
		    }else {
				  JOptionPane.showMessageDialog(null, " O aluno "+ nome +" esta com a nota : " + b + " Reprovado");				
		    }

		}
}