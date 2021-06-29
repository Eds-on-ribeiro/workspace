import javax.swing.JOptionPane;

public class Desafio02 {
	
	public static int aleatorio() {
		return (int) Math.random()* 3;
		
	}

	public static void main(String[] args) {
		
		Object[] opcoesJogo = new Object[3];
		opcoesJogo[0] = "Pedra";
		opcoesJogo[1] = "Papel";
		opcoesJogo[2] = "Tesoura";
		
		Object[] opcoesContinuar = {"sim", "N�o"};
		int continuar = 0;
		int v = 0;
		int e = 0;
		int d = 0;
		
		do {
		int cpu = aleatorio();
		int escolha = JOptionPane.showOptionDialog(null, "Escolha uma op��o", "Jogo", 0,
				JOptionPane.QUESTION_MESSAGE, null, opcoesJogo, opcoesJogo[1]);
		//System.out.print(escolha);
		aleatorio();
	
		String resultado ="";
		if((escolha == 0 && cpu == 2 ) || (escolha == 1 && cpu == 0) || (escolha == 2 && cpu == 1)) {
			resultado = "Vitoria";
			v++;
		}else if (escolha == cpu) {
			resultado = "Empate";
			e++;
		}else {
			resultado = "Derrota";
			d++;
		}
		
		continuar = JOptionPane.showOptionDialog(null, 
				"Eu (" + opcoesJogo[escolha]+") x Cpu ("+ opcoesJogo[cpu]+ ")" + "\nResultado: " + resultado
				        + "\nJogar Novamente? ",
				 "Jogo", 0, JOptionPane.QUESTION_MESSAGE, null, opcoesContinuar, opcoesContinuar[0]);
		
	} while (continuar == 0);
	
	    JOptionPane.showMessageDialog(null,
	    		"Placar final" + "\nVitorias: " + v + "\nDerrotas: " + d + "\nEmpate: " + e);
  }
	
}
