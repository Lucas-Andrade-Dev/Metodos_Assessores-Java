package modulo;

public class Funcionario {
	//Declaracao das variaves privadas
	private int cod;
	private String nome;
	private double salario;
	
	//Declaracao do metodo construtor
	
	public Funcionario() {
		cod=0;
		nome="";
		salario=0;
	}

	public int getCod() {
		return cod;
	}

	public void setCod(int cod) {
		this.cod = cod;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

}
