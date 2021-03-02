package listaexercicio5poo;
/*3) Crie uma classe produto eletrônico e apresente os atributos e métodos
referentes esta classe, em seguida crie um objeto produto eletrônico,
defina as instancias deste objeto e apresente as informações deste objeto
no console.*/
public class ProdutoEletronico {

		private String produtoEletronico;
		private int Voltagem;
		private String Loja;
		
		public ProdutoEletronico (String produto, int voltagem, String loja)
		{
			produtoEletronico=produto;
			Voltagem=voltagem;
			Loja=loja;
		}

		public String getProdutoEletronico() {
			return produtoEletronico;
		}

		public void setProdutoEletronico(String produtoEletronico) {
			this.produtoEletronico = produtoEletronico;
		}

		public int getVoltagem() {
			return Voltagem;
		}

		public void setVoltagem(int voltagem) {
			Voltagem = voltagem;
		}

		public String getLoja() {
			return Loja;
		}

		public void setLoja(String loja) {
			Loja = loja;
		}
		
		
	
		
}
