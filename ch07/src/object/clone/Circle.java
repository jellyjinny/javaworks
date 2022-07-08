package object.clone;

public class Circle  implements Cloneable{
	//clone()을 사용하려면 Cloneable 인터페이스를 구현해야 한다
	Point point;  //중심점
	int radius;
	
	Circle(int x, int y, int radius){
		point = new Point(x, y);
		this.radius = radius;
	}

	@Override
	public String toString() {
		return "중심점은 " + point + "이고, 반지름은 " +
				radius + "입니다.";
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
	
}
