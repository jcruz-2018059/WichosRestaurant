package modelos;
public class Productos {

	private String categoria;
	private String nombrep;
	private int stock;
	private int precio;

	public Productos(){}

	public Productos(String categoria,String nombrep, int stock, int precio){
		this.categoria = categoria;
		this.nombrep = nombrep;
		this.stock = stock;
		this.precio = precio;
	}
	public void setCategoria(String categoria){
		this.categoria = categoria;
	}
	public String getCategoria(){
		return this.categoria;
	}
	public void setNombrep(String nombrep){
	 	this.nombrep = nombrep;
	}
	public String getNombrep(){
		return this.nombrep;
	}

	public void setStock(int stock){
		this.stock = stock;
	}
	public int getStock(){
		return this.stock;
	}

	public void setPrecio(int precio){
		this.precio = precio;
	}
	public int getPrecio(){
		return this.precio;
	}


}