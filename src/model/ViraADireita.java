package model;

public class ViraADireita implements Command {
	private Carro carro;
    
    public ViraADireita(Carro carro) {
        this.carro = carro;
    }
    
    public void execute() {
        carro.viraADireita();
    }
}
