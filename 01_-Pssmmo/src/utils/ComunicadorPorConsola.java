package utils;

import java.util.Scanner;

public class ComunicadorPorConsola extends Comunicador {

	private Scanner sc;
	
	
	
	public ComunicadorPorConsola() {
		this.sc = new Scanner(System.in);
	}

	@Override
	public void enviar(String msj) {
		System.out.println(msj);
		
	}

	@Override
	public String recibir() {
		return sc.next();
	}

}
