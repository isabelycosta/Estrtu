package pilhaEncadeada;

public class testepilhaEncadeada {
	
	public static void main(String[] args) {
		
		pilhaEncadeada pilha = new pilhaEncadeada();
		
		pilha.imprimiPilha();
		pilha.insereTopo(10);
		pilha.insereTopo(11);
		pilha.insereTopo(12);
		pilha.imprimiPilha();
		pilha.removeTopo();
		pilha.removeTopo();
		pilha.imprimiPilha();
		
		pilha.removeTopo();
		pilha.imprimiPilha();
		pilha.removeTopo();
		pilha.imprimiPilha();
	}

}
