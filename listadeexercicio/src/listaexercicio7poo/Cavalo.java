package listaexercicio7poo;

public class Cavalo extends Animal
{
	private String Correr;
	
	public Cavalo (String nome, int idade,String correr)
	{
		super (nome, idade);
		this.Correr=correr;
	}

	public String emitirSom()
	{
		return "rinrin";
	}
	
	public String getCorrer() {
		return Correr;
	}

	public void setCorrer(String correr) {
		Correr = correr;
	}
	
	
}
