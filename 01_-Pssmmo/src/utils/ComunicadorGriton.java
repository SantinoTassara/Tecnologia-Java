package utils;

import java.util.Scanner;

public class ComunicadorGriton extends Comunicador {

    private Scanner sc;

    public ComunicadorGriton(){
        this.sc = new Scanner(System.in);
    }
    
    //retorna el mensaje en MAYUS
    @Override
    public void enviar(String msj) {
        System.out.println(msj.toUpperCase());    
    }

    @Override
    public String recibir() {
        return sc.next();
    }
    
}
