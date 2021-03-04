package listaexercicio7poo;

public class Preguiça extends Animal
{
	private String subirArvore;
	
	public Preguiça (String nome, int idade,String subirArvore)
	{
		super (nome, idade);
		this.subirArvore=subirArvore;
	}

	public String emitirSom()
	{
		return "Argh";
	}
	
	public String getSubirArvore() {
		return subirArvore;
	}

	public void setSubirArvore(String subirArvore) {
		this.subirArvore = subirArvore;
	}
	
}
