package utils;

public abstract class Comunicador {
	
	public abstract void enviar(String msj);
	
	public abstract String recibir();
	
	public int sumar(int a , int b) {
		return a+b;
	}
	
	public void saludar() {
		this.enviar("Hola");
	}
}
