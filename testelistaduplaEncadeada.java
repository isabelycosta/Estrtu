package listaduplaEncadeada;

public class testelistaduplaEncadeada {

	public static void main(String[] args) {
		
		listaduplaEncadeada lista = new listaduplaEncadeada();
		
		lista.insereInicio(new No(10,null,null));
		lista.imprimiLista();
		
		lista.insereInicio(new No(7,null,null));
		lista.imprimiLista();
		
		lista.insereFinal(new No(12,null,null));
		lista.imprimiLista();
		
		lista.insereFinal(new No(14,null,null));
		lista.imprimiLista();
		
		System.out.println();
		
		lista.removeFim();
		lista.imprimiLista();
		
		lista.removeFim();
		lista.imprimiLista();
		lista.removeInicio();
		lista.imprimiLista();
		
		lista.removeFim();
		lista.removeInicio();
		lista.imprimiLista();

	}

}
