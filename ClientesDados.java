package modulo;

import java.util.ArrayList;

public class ClientesDados {
	public ArrayList<ClientesDados> cadCliente = new ArrayList<>();
	public int codigo;
	public String nome;
	public String telefone;
	
	public ClientesDados() {
		codigo=0;
		nome="";
		telefone="";
		
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		
		this.codigo = codigo;
	}

	public String getNome() {
		
		return nome;
	}

	public void setNome(String nome) {
		
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		
		this.telefone = telefone;
	}
	
}
   


