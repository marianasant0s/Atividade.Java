package listaexercicio6poo;
/*4. Implemente a classe Administrador como subclasse da classe pessoa. Um determinado
administrador tem como atributos da classe Pessoa e tamb�m os atributos pr�prios como
ajudaDeCusto (ajudas referentes a viagens, estadias).*/
public class Administrador extends Pessoa
{
	private double AjudaDeCusto;
	
	public Administrador (String nome, String endere�o, int telefone, double ajudadecusto)
	{
		super (nome, endere�o, telefone);
		this.AjudaDeCusto= ajudadecusto;
	}

	public double getAjudaDeCusto() {
		return AjudaDeCusto;
	}

	public void setAjudaDeCusto(double ajudaDeCusto) {
		AjudaDeCusto = ajudaDeCusto;
	}
	
	
}
