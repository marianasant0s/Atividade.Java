package listaexercicio8poo;
/*3- Crie uma um programa para trabalhar com estoque de uma loja, o programa dever�
trabalhar com Collection do tipo List do Java para manipular os dados desse estoque, o
programa dever� atender as seguintes funcionalidades:
Armazenar dados da List
Remover dados da list;
Atualizar dados da list.
Apresentar todos os dados da list.*/

public class ExercicioList {

	private String produtos;
	private double preco;

	public ExercicioList(String produtos, double preco) 
		{
	 		super();
	 		this.produtos = produtos;
	 		this.preco = preco;
	 	}

	public String getProdutos() {
		return produtos;
	}

	public void setProdutos(String produtos) {
		this.produtos = produtos;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

}
