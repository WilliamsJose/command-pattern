package model;

import java.util.ArrayList;
import java.util.List;

public class CarroCommands {
	private List<Command> listaComandos = new ArrayList<Command>();
    
    public CarroCommands() {};
    
    public void recebeComando(Command comando) {
        listaComandos.add(comando);
    }
    
    public void executaComandos() {
        for(Command comando : listaComandos) {
            comando.execute();
        }
        listaComandos.clear();
    }
}
