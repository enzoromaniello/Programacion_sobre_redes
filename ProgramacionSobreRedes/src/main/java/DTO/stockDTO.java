package DTO;

import java.util.Objects;

public class stockDTO implements generalDTO {
	
	private int id;
	private String nombre;
	private String Descripcion;
	private double PrecioComp;
	private double PrecioVent;
	private int cant;
	private boolean Discontinuo;
	public int getId() {
		return id;
	}
	
	
	public stockDTO(int id, String nombre, String Descripcion, double PrecioComp, double PrecioVent, int cant, boolean Discontinuo) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.Descripcion = Descripcion;
		this.PrecioComp = PrecioComp;
		this.PrecioVent = PrecioVent;
		this.cant = cant;
		this.Discontinuo = Discontinuo;
	}
	public stockDTO(String nombre, String Descripcion, double PrecioComp, double PrecioVent, int cant, boolean Discontinuo) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.Descripcion = Descripcion;
		this.PrecioComp = PrecioComp;
		this.PrecioVent = PrecioVent;
		this.cant = cant;
		this.Discontinuo = Discontinuo;
	}
	
	public stockDTO() {}
	
	public void setId(int id) {
		this.id = id;
	}
	public String getnombre() {
		return nombre;
	}
	public void setnombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescripcion() {
		return Descripcion;
	}
	public void setDescripcion(String Descripcion) {
		this.Descripcion = Descripcion;
	}
	public double getPrecioComp() {
		return PrecioComp;
	}
	public void setPrecioComp(double PrecioComp) {
		this.PrecioComp = PrecioComp;
	}
	public double getPrecioVent() {
		return PrecioVent;
	}
	public void setPrecioVent(double PrecioVent) {
		this.PrecioVent = PrecioVent;
	}
	public int getCant() {
		return cant;
	}
	public void setCant(int cant) {
		this.cant = cant;
	}
	public boolean getDiscontinuo() {
		return Discontinuo;
	}
	public void setDiscontinuo(boolean Discontinuo) {
		this.Discontinuo = Discontinuo;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(cant, Descripcion, Discontinuo, id, nombre, PrecioComp, PrecioVent);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		stockDTO other = (stockDTO) obj;
		return cant == other.cant && Objects.equals(Descripcion, other.Descripcion)
				&& Discontinuo == other.Discontinuo && id == other.id && Objects.equals(nombre, other.nombre)
				&& Double.doubleToLongBits(PrecioComp) == Double.doubleToLongBits(other.PrecioComp)
				&& Double.doubleToLongBits(PrecioVent) == Double.doubleToLongBits(other.PrecioVent);
	}
	
	@Override
	public String toString() {
		String str = "\n";
		str += "\nCodigo de producto: "+this.id;
		str += "\nNombre: "+this.nombre;
		str += "\nDescripcion: "+this.Descripcion;
		str += "\nPrecio de compra: "+this.PrecioComp;
		str += "\nPrecio de venta: "+this.PrecioVent;
		str += "\nCantidad Stock: "+this.cant;
		str += "\nEstado: ";
		if(this.Discontinuo){
			str += "Descontinuado";
		}else {
			str += "En venta";
		}
		
		return str;
	

	}
}
