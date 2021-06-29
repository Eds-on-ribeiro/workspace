package orientacao_objetos;

import java.time.format.DateTimeFormatter;

import java.time.LocalDate;

class Dados {
	//Atributos privados
	
	private String nome;
    private LocalDate dataNascimento;
    private float altura;
	
    //Calcular a idade da pessoa
    
    public int idade () {
    	LocalDate hoje = LocalDate.now();
    	int idade = hoje.getYear() - dataNascimento.getYear();
    	return idade;
    }
    
    //imprimir todos os dados da pessoa
    
   // public String Dados() {
    	
  //  	return "nome: "+ nome; + "\nData Nascimento :" + dataNascimento.Format(formatoData); "\nAltura: " + altura;
   // }
    
    //Metodos get e set
  
    public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public void setAnoNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	public double getAltura() {
		return altura;
	}

	public void setAltura (float altura) {
		this.altura = altura;
    }
}
