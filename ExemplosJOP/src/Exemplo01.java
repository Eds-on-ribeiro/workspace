import javax.swing.JOptionPane;

public class Exemplo01 {

	public static void main(String[] args) {
		
        JOptionPane.showMessageDialog(null,"Hello JOption Pane -","Alerta!", JOptionPane.INFORMATION_MESSAGE);
        
        JOptionPane.showConfirmDialog(null, "Deseja continuar ?","Alerta" ,  JOptionPane.YES_NO_OPTION);
        
        Object[] options = {"OK", "Cancelar"};
        
        JOptionPane.showOptionDialog(null, "Click OK para continuar","Alerta", JOptionPane.DEFAULT_OPTION,
        		
        JOptionPane.WARNING_MESSAGE, null, options, options[0]);
        
        String nome = JOptionPane.showInputDialog("Digite seu nome:");
        
        System.out.println(" O nome digitado foi: " + nome);
        
        String idade = JOptionPane.showInputDialog("Digite sua idade:");
        
        System.out.println(" Sua idade é: " + idade);
        
        String cidade = JOptionPane.showInputDialog("Mora em qual cidade:");
        
        System.out.println(" Cidade: " + cidade);
        
        Object[] itens = { "Maçã", "Pera", "Banana", "Uva", "Goiaba"};
        
        Object itemSelecionado = JOptionPane.showInputDialog(null, " Escolha 1 item", "Itens",JOptionPane.INFORMATION_MESSAGE, null, itens, itens [1]);
        
        System.out.println(" Item selecionado: "+itemSelecionado.toString());
	}

}