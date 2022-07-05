package interfaceex.calculator;

public class Myclacator implements Calcator{

	@Override
	public int add(int n1, int n2) {
		return n1 + n2;
	}

	@Override
	public int subtract(int n1, int n2) {
		return n1 - n2;
	}

	@Override
	public int times(int n1, int n2) {
		return n1 * n2;
	}

	@Override
	public int divide(int n1, int n2) {
		if(n2 != 0)
		return n1 / n2;
		else
			return Calcator.ERROR;
	}

}
