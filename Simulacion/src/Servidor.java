import java.util.ArrayList;

public class Servidor {
	private int cccd, clientesEnCola;
	private ArrayList<Double> cola;
	private boolean estado;
	private double demora;
	
	public Servidor() {
		cola = new ArrayList<Double>();
		this.cccd = 0;
		this.estado = false;
		this.demora = 0;
		this.clientesEnCola = 0;
	}
	
	public int getCccd() {
		return cccd;
	}

	public void setCccd(int cccd) {
		this.cccd = cccd;
	}

	public int getClientesEnCola() {
		return clientesEnCola;
	}

	public void setClientesEnCola(int clientesEnCola) {
		this.clientesEnCola = clientesEnCola;
	}

	public double getDemora() {
		return demora;
	}

	public void setDemora(double demora) {
		this.demora = demora;
	}

	public ArrayList<Double> getCola() {
		return cola;
	}

	public void setCola(ArrayList<Double> cola) {
		this.cola = cola;
	}

	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}

	public void agregarTiempoACola(double tiempoArribo) {
		this.cola.add(tiempoArribo);
	}
	
	public void cambiarEstado(boolean estadoServidor) {
		this.estado = estadoServidor;
	}
	
	public void demora(double tiempoDemora) {
		this.demora = this.demora + tiempoDemora;
	}
	
	public void incrementarCccd() {
		this.cccd ++;
	}
	
	public void quitarTiempoDeCola() {
		this.cola.remove(0);
	}

}
