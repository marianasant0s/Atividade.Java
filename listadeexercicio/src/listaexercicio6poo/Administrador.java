package listaexercicio6poo;
/*4. Implemente a classe Administrador como subclasse da classe pessoa. Um determinado
administrador tem como atributos da classe Pessoa e também os atributos próprios como
ajudaDeCusto (ajudas referentes a viagens, estadias).*/
public class Administrador extends Pessoa
{
	private double AjudaDeCusto;
	
	public Administrador (String nome, String endereço, int telefone, double ajudadecusto)
	{
		super (nome, endereço, telefone);
		this.AjudaDeCusto= ajudadecusto;
	}

	public double getAjudaDeCusto() {
		return AjudaDeCusto;
	}

	public void setAjudaDeCusto(double ajudaDeCusto) {
		AjudaDeCusto = ajudaDeCusto;
	}
	
	
}
