package labPOO;

public class Carro extends Veiculo {
	private int cilindradas;
	private boolean airbag;
	
	public String toString() {
		return "Carro fabricado em " + getAnoDeFabricacao() + " com " + cilindradas + " cilindradas.";
	}
	
	Carro(int ano, String modelo, String marca, int cilindradas, boolean airbag) {
		super(ano, modelo, marca);
		this.cilindradas = cilindradas;
		this.airbag = airbag;
	}
	
	public static void main(String args[]) {
		Carro fordBigode = new Carro(1989, "Ford Bigode", "Ford", 2900, true);
		System.out.println("O veículo criado foi " + fordBigode);
	}

}
