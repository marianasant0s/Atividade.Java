package listaexercicio5poo;
/*4) Crie uma classe funcion�rio e apresente os atributos e m�todos
referentes esta classe, em seguida crie um objeto funcion�rio, defina as
instancias deste objeto e apresente as informa��es deste objeto no
console.*/
public class Funcionarios {

	private String NomeCompleto;
	private String Fun��o;
	private double Salario;
	
	public Funcionarios(String nomeCompleto, String fun��o, double salario) {
		super();
		NomeCompleto = nomeCompleto;
		Fun��o = fun��o;
		Salario = salario;
	}

	public String getNomeCompleto() {
		return NomeCompleto;
	}

	public void setNomeCompleto(String nomeCompleto) {
		NomeCompleto = nomeCompleto;
	}

	public String getFun��o() {
		return Fun��o;
	}

	public void setFun��o(String fun��o) {
		Fun��o = fun��o;
	}

	public double getSalario() {
		return Salario;
	}

	public void setSalario(int salario) {
		Salario = salario;
	}
	
	
	
	
	
	
	
}
