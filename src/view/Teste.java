package view;

import model.Anda;
import model.Carro;
import model.CarroCommands;
import model.ViraADireita;
import model.ViraAEsquerda;

public class Teste {

	public static void main(String[] args) {
		Carro carro = new Carro("Fiat de firma com escada");
        ViraADireita direitaMover = new ViraADireita(carro);
        Anda anda = new Anda(carro);
        ViraAEsquerda esquerdaMover = new ViraAEsquerda(carro);
        
        CarroCommands comandos = new CarroCommands();
        comandos.recebeComando(anda);
        comandos.recebeComando(direitaMover);
        comandos.recebeComando(direitaMover);
        comandos.recebeComando(esquerdaMover);
        
        comandos.executaComandos();
        
        System.out.println(carro.toString());
	}

}
