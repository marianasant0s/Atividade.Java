package listaexercicio5poo;

public class ObjetoFuncionario {

	public static void main(String[] args) {
		
		Funcionarios funcionario = new Funcionarios ("Mariana Santos", "Desenvolvedora Java JR", 3000);
		System.out.println(funcionario.getNomeCompleto());
		System.out.println(funcionario.getFunção());
		System.out.print(funcionario.getSalario());

	}

}
