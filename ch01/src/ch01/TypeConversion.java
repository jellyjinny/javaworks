package ch01;

public class TypeConversion {

	public static void main(String[] args) {
		//묵시적 형 변환
		int iNum = 20;
		float fNum = iNum;  //작은쪽에서 큰쪽에 저장(자동 형변환)
		System.out.println(iNum);  //20
		System.out.println(fNum);  //20.0

		double dNum;
		dNum = iNum + fNum;  //20 + 20.0
		System.out.println(dNum);  //40.0
		
		//명시적 형 변환
		double dNum2 = 1.2;
		float fNum2 = 0.9f;  //float에서는 숫자 뒤에 f를 넣어준다
		
		int iNum2 = (int)dNum2 + (int)fNum2; //소수점 이하(실수)가 사라진다.
		int iNum3 = (int)(dNum2 + fNum2); 
		
		System.out.println(iNum2);  //1
		System.out.println(iNum3);  //2
		
		
	}

}
