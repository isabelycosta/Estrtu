package filaencadeada;

public class testefilaEncadeada {

	public static void main(String[] args) {
		
		filaEncadeada fila = new filaEncadeada();
		
		fila.imprimiFila();
		
		fila.insereFinal(12);
		fila.insereFinal(15);
		fila.insereFinal(20);
		
		fila.imprimiFila();

	}

}
