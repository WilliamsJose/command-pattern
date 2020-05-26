package model;

public class ViraAEsquerda implements Command {
	private Carro carro;
    
    public ViraAEsquerda(Carro carro) {
        this.carro = carro;
    }
    
    public void execute() {
        carro.viraAEsquerda();
    }
}
