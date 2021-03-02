package listaexercicio5poo;

public class ObjetoCliente {

	public static void main(String[] args) 
	{
		Cliente cliente1 = new Cliente ("Mariana Santos", 18);
		System.out.println(cliente1.getNomeCompleto());
		System.out.println(cliente1.getIdade());
	}

}