import javax.swing.JOptionPane;

public class Exemplo02 {

	public static void main(String[] args) {
		//int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade"));
		
		//JOptionPane.showMessageDialog(null, "A idade digitada foi: " + idade);
		
		String sexo = JOptionPane.showInputDialog("Digite M ou F para o sexo");
		String mensagem = "";
		
		if(sexo.length() != 1) {
	        mensagem = "Digite apenas 1 caracter!";
//		if (sexo.toUpperCase().equals("M")) {
			mensagem = "Masculino";
		}
		else if (sexo.toUpperCase().equals("F")) {  
			mensagem = "Feminino";

		}else {			
			mensagem = "Valor não encontrado";
		}
		JOptionPane.showConfirmDialog(null, mensagem);
		
		//else{
/*		if (idade >= 18) {
			JOptionPane.showInputDialog(null, "Ok você já pode tirar uma CNH");
	   }else {
		    JOptionPane.showInputDialog(null, "Desculpe, você não pode tirar uma CNH");
	   } */
	 }

}
