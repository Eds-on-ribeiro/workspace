package senai.org.br;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		Pessoa p1 = new Pessoa();
		p1.setNome(JOptionPane.showInputDialog("Digite o seu nome: "));
		DateTimeFormatter formatoData = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		p1.setDataNascimento(LocalDate.parse(
				JOptionPane.showInputDialog("Digite a sua data de nascimento no formato DD-MM-YYYY: "), formatoData));
		p1.setAltura(Float.parseFloat(JOptionPane.showInputDialog("Digite a sua altura: ")));
		
		JOptionPane.showMessageDialog(null, p1.dados());
						
		} 
}
