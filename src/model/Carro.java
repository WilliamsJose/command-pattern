package model;

public class Carro {
	private String modelo;
    private String estado = "parado";
    private String ultimaAcao = "";
    
    public Carro(String modelo) {
        this.modelo = modelo;
    }
    
    public void anda() {
        this.estado = "Andando a 150km/h";
        this.ultimaAcao = "Andou";
        System.out.println("Carro está andando.");
    }
    
    public void viraAEsquerda() {
        this.estado = "Virou à esquerda a 150km/h";
        this.ultimaAcao = "Virou a Esquerda";
        System.out.println("Carro virou a esquerda.");
    }
    
    public void viraADireita() {
        this.estado = "Virou à direita a 150km/h";
        this.ultimaAcao = "Virou a Direita";
        System.out.println("Carro virou a direita.");
    }

	public String toString() {
		return "Carro [modelo=" + modelo + ", estado=" + estado + ", ultimaAcao=" + ultimaAcao + "]";
	}
}
