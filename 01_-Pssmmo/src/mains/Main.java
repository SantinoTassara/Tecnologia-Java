package mains;

import utils.Comunicador;
import utils.ComunicadorGriton;
//import utils.ComunicadorPorConsola;

public class Main {

	public static void main(String[] args) {

		Comunicador comunicador = new ComunicadorGriton();
		
		comunicador.saludar();
		
		comunicador.enviar("Como estas?");
		
		String respuesta = comunicador.recibir();
		
		
		if(respuesta.length() < 15) {
			comunicador.enviar("Zzzz... mucho texto");
		}else {
			comunicador.enviar("Me alegro que estes "
						+respuesta);
		}
		
	}

}
