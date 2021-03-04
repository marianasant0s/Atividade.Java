package listaexercicio7poo;

public class Pregui�a extends Animal
{
	private String subirArvore;
	
	public Pregui�a (String nome, int idade,String subirArvore)
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
