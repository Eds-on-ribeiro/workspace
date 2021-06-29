package senai.org.br;

import java.time.LocalDate;

import java.time.format.DateTimeFormatter;

public class Pessoa {
	
	private String nome;
    private LocalDate dataNascimento;
    private float altura;
    
    public int idade () {
    	LocalDate hoje = LocalDate.now();
    	int idade = hoje.getYear() - dataNascimento.getYear();
    	if(dataNascimento.getMonthValue() > hoje.getMonthValue()
    			|| (dataNascimento.getMonthValue() == hoje.getMonthValue())
    		            && (dataNascimento.getDayOfMonth() > getDayOfMonth())
        ) {
        	idade --;
        }
    	return idade;
        }
    
    private int getDayOfMonth() {
		return 0;
	}
    
    public String dados() {
    DateTimeFormatter formatoData = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    return "Nome: "+ nome + "\nData Nascimento: " + dataNascimento.format(formatoData) + "\nAltura: " + altura + "\nIdade: " + idade();
    }
    
    public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento ) {
		this.dataNascimento = dataNascimento;
	}
	
	public double getAltura() {
		return altura;
	}

	public void setAltura (float altura) {
		this.altura = altura;
    }
}
