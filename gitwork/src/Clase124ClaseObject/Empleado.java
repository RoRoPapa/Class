package Clase124ClaseObject;

public class Empleado {
	
	protected String nombre;
	protected double sueldo;
	
	public Empleado(String nombre, double sueldo) {
		this.nombre = nombre;
		this.sueldo = sueldo;
	}
	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getNombre() {
		return nombre;
	
	}
	public double getSueldo() {
		return sueldo;
	}
	@Override
	public String toString() {
		return "\nnombre:"+nombre+"\nsueldo:"+sueldo;
	}
	@Override
	public boolean equals(Object obj) {
		
		if(obj == null) {
			return false;
		}
		if (obj instanceof Empleado) {
			Empleado emp = (Empleado) obj;
			if(nombre.equals(emp.nombre) && Double.valueOf(sueldo).equals(emp.sueldo)) {
				return true;
			}else {
				return false;
			}
		}else {
			return false;
		}
	}
	@Override
	public int hashCode() {
		int hash = 7;
		hash = 31 * hash + this.nombre.hashCode();
		hash = 31 * hash + Double.valueOf(sueldo).hashCode();
		return hash;
	}
}
