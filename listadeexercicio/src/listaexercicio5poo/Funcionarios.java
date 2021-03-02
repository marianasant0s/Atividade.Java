package listaexercicio5poo;
/*4) Crie uma classe funcionário e apresente os atributos e métodos
referentes esta classe, em seguida crie um objeto funcionário, defina as
instancias deste objeto e apresente as informações deste objeto no
console.*/
public class Funcionarios {

	private String NomeCompleto;
	private String Função;
	private double Salario;
	
	public Funcionarios(String nomeCompleto, String função, double salario) {
		super();
		NomeCompleto = nomeCompleto;
		Função = função;
		Salario = salario;
	}

	public String getNomeCompleto() {
		return NomeCompleto;
	}

	public void setNomeCompleto(String nomeCompleto) {
		NomeCompleto = nomeCompleto;
	}

	public String getFunção() {
		return Função;
	}

	public void setFunção(String função) {
		Função = função;
	}

	public double getSalario() {
		return Salario;
	}

	public void setSalario(int salario) {
		Salario = salario;
	}
	
	
	
	
	
	
	
}
