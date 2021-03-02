package listaexercicio5poo;

public class ObjetoProdutoEletronico {

	public static void main(String[] args) {
		
		ProdutoEletronico produto = new ProdutoEletronico ("Microondas", 110 ,"Magazine Luiza");
		System.out.println(produto.getProdutoEletronico());
		System.out.println(produto.getVoltagem()+"w");
		System.out.println(produto.getLoja());
		
	
		
	}

}
