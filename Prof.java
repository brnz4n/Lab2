package lab2;


public class Prof extends Cliente{
	private String nome;
	private int SIASPE;
	
	public Prof(String nome, int siaspe) {
		this.nome = nome;
		this.SIASPE = siaspe;
	}

	public String getNome() {
		return nome;
	}

	public int getsiaspe() {
		return SIASPE;
	}
}