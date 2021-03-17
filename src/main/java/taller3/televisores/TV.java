package taller3.televisores;

public class TV {
	
	private Marca marca;
	private int canal = 1;
	private int precio = 500;
	private int volumen = 1;
	private boolean estado;
	Control control;
	private static int numTV;
	
	public TV(Marca marca,boolean estado) { //constructor
		this.marca = marca;
		this.estado = estado;
		numTV += 1;
	}
	
	public void setMarca(Marca marca) {
		this.marca = marca;	
	}	
	public void setControl(Control control) {
		this.control = control;	
	}
	public void setPrecio(int precio) {
		this.precio = precio;	
	}
	public void setVolumen(int volumen) {
		if(this.estado == true && 1 >= volumen && volumen <= 7) {
		this.volumen = volumen;	
		}
	}
	public void setCanal(int canal) {
		if(this.estado == true && 0 >= canal && canal <= 120) {
		this.canal = canal;
		}
	}
	public static void setNumTV(int numero) {
		numTV = numero;	
	}
	
	public Marca getMarca() {
		return marca;
	}
	public Control getControl() {
		return this.control;
	}
	public int getPrecio() {
		return precio;
	}
	public int getVolumen() {
		return volumen;
	}
	public int getCanal() {
		return canal;
	}
	public boolean getEstado() {
		return estado;
	}
	
	public static int getNumTV() {
		return numTV;
	}
	
	public void turnOn() {
		estado = true;
	}
	
	public void turnOff() {
		estado = false;
	}
	
	public void canalUp() {
		if(this.estado == true && 1 <= canal && canal < 120){
			canal += 1;			
		}
	}
	
	public void canalDown() {
		if(this.estado == true && 1 < canal && canal <= 120){
			canal -= 1;
		}
		
	}
	
	public void volumenUp() {
		if(this.estado == true && 0 <= volumen && canal < 7){
			volumen += 1;
		}		
	}
	
	public void volumenDown() {
		if(this.estado == true && 0 < volumen && canal <= 7){
			volumen -= 1;
		}
	}
}