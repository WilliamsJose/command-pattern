package model;

public class Anda implements Command {
	private Carro carro;
    
    public Anda(Carro carro) {
        this.carro = carro;
    }
    
    public void execute() {
        carro.anda();
    }
}
