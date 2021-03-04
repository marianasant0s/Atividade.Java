package listaexercicio7poo;

public class TesteAnimal {

	public static void main(String[] args) {
		
		Cavalo SecretsGrace = new Cavalo ("SecretsGrace", 3 , "corre");
		
		System.out.println("Nome do cavalo: ");
		System.out.println(SecretsGrace.getNome());
		System.out.println("Idade : ");
		System.out.println(SecretsGrace.getIdade());
		System.out.println("Ele corre?");
		System.out.println(SecretsGrace.getCorrer());
		System.out.println("Qual som ele emite? ");
		System.out.println(SecretsGrace.emitirSom());
		
		
		Cachorro Xuxu = new Cachorro ("Xuxu", 10, "corre");
		
		System.out.println("\nNome do cachorro: ");
		System.out.println(Xuxu.getNome());
		System.out.println("Idade : ");
		System.out.println(Xuxu.getIdade());
		System.out.println("Ele corre?");
		System.out.println(Xuxu.getCorrer());
		System.out.println("Qual som ele emite? ");
		System.out.println(Xuxu.emitirSom());
		
		Preguiça suxi = new Preguiça ("Suxi", 5, "Sobe");
		
		System.out.println("\nNome do bicho preguiça: ");
		System.out.println(suxi.getNome());
		System.out.println("Idade : ");
		System.out.println(suxi.getIdade());
		System.out.println("Ele sobe em arvore?");
		System.out.println(suxi.getSubirArvore());
		System.out.println("Qual som ele emite? ");
		System.out.println(suxi.emitirSom());
		
	}
	
	
}
