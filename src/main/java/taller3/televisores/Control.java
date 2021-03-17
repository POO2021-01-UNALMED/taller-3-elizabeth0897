package taller3.televisores;

public class Control {
	TV tv;
	
	public Control enlazar(TV tv) {
		this.tv = tv;
		tv.control = this;
		return this;
	}
	
	public void turnOn() {
		this.tv.turnOn();
	}
	
	public void turnOff() {
		this.tv.turnOff();
	}
	
	public void canalUp() {
		this.tv.canalUp();
	}
	
	public void canalDown() {
		this.tv.canalDown();
	}
	
	public void volumenUp() {
		this.tv.volumenUp();
	}
	
	public void volumenDown() {
		this.tv.volumenDown();
	}
	
	public void setCanal(int canal) {
		this.tv.setCanal(canal);
	}
	
	public void setTV(TV tv) {
		this.tv = tv;
	}
	
	public TV getTV() {
		return this.tv;
	}	
}