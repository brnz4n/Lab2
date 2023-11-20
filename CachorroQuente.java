package lab2;

import java.util.ArrayList;

public abstract class CachorroQuente {

	protected String bebiba;
	protected double valor; 
	protected ArrayList<String> ingredientes;
	protected String queijo;
	
	public CachorroQuente(String queijo) {
		this.queijo = queijo;		
	}
	
	public double getValor() {
		return valor;
	}
	public void adicionarIngredientes(String ingrediente) {
		ingredientes.add(ingrediente);
	}
}