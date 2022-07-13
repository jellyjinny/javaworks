package generic.printer;

public class GenericPrinter<T> {
	private T material;
	
	public void setMaterial(T material) {
		this.material = material;
	}
	
	public T getmaterial() {
		return material;
	}

	@Override
	public String toString() {
		return material.toString();
	}
	
}
