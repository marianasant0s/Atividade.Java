package listaexercicio7poo;

public class Cachorro extends Animal
{
	private String Correr;
	
	public Cachorro (String nome, int idade, String correr)
	
	{
		super (nome, idade);
		this.Correr=correr;
	}

	public String emitirSom()
	{
		return "auau";
	}
	
	public String getCorrer() {
		return Correr;
	}

	public void setCorrer(String correr) {
		Correr = correr;
	}
	
	
}
