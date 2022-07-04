package protectedex.pack2;

import protectedex.pack1.A;

public class D extends A{
	
	public D() {
		//상속은 자식 클래스에게 접급 허용
		super();
		this.field = "value";
		this.method();
	}

}
