import javax.swing.JOptionPane;

public class AlgoritmoCpf {

	public static void main(String[] args) {
		
		String txtCpf = JOptionPane.showInputDialog("Digite o Cpf: ");
		String[] str = txtCpf.split("");
		int[] cpf = new int[11];
		
		for(int i = 0; i <= 8; i++) {
			cpf[i] = Integer.parseInt(str[i]);
		}
		
		int p = 0;
		int soma = 0;
		
		for(int i = 10; i >= 2; i--) {
			
			int mult = i * cpf[p];
			soma = soma + mult;
			p = p + 1;	
		}
		
		int resto = soma %11;
		if(resto < 2) {
			cpf[9] = 0;
		}else {
			cpf[9] = 11 - resto;
		}
		
	p = 0;
		soma = 0;
		
		for(int i = 11; i >= 2; i--) {
			int mult = i * cpf[p];
			soma = soma + mult;
			p = p + 1;	
			
		}
		
		resto = soma % 11;
		if(resto < 2) {
			cpf[10] = 0;
		}else {
			cpf[10] = 11 - resto;
		}
		
		String cpfValido = "";
		for(int i = 0; i <= 10; i++) {
			cpfValido += cpf[i];
		}
		
		String msg = "";
		if(cpfValido.equals(txtCpf)) {
			msg = "Este é um CPF válido: " +cpfValido;
		} else {
			msg = "O CPF informado é invalido: " +txtCpf + " != " +cpfValido;
		}
		
		JOptionPane.showMessageDialog(null, msg);
		
	}
	
}
