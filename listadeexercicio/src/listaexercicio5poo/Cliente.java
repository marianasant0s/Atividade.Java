package listaexercicio5poo;
/*1) Crie uma classe cliente e apresente os atributos e métodos referentes
esta classe, em seguida crie um objeto cliente, defina as instancias deste
objeto e apresente as informações deste objeto no console.*/

public class Cliente {
	private String nomeCompleto;
	private int Idade;
	
	public Cliente (String nome, int idade)
	{
		nomeCompleto=nome;
		Idade=idade;
				
	}

	public String getNomeCompleto() {
		return nomeCompleto;
	}

	public int getIdade() {
		return Idade;
	}

	public void setIdade(int idade) {
		Idade = idade;
	}

	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}
	
	
}
