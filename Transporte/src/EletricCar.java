
public class EletricCar extends Car implements Motorized.Eletric {
	
	public EletricCar(String cor, String marca, String modelo, int numPassenger, float weight) {
		super(cor, marca, modelo, numPassenger, weight);
	}
	public void start() {
		System.out.println("Carro elétrico " + getMarca() + " " + getModelo() + " movimentando");
	}
	@Override
	public void carregarBateria() {
		// TODO Auto-generated method stub
		System.out.println("Carregando a bateria do carro " + getCor());
	}
	
}
