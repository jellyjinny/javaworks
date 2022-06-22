package ch01;

public class ByteShortType {
	
	public static void main(String[] args) {
		//정수 자료형
		//byte 범위 : -128 ~ 127(총 개수 : 256(8bit-2의 8제곱))
		byte bData = -128;
		System.out.println(bData);
		
		//byte bData2 = 128;  범위 초과이므로 오류가 난다
		
		//short 범위 : -32768 ~ 32767(총 개수 : 65536(16bit-2의 16제곱))
		short sData = 32767;
		System.out.println(sData);
		
		//short sData2 = 32768;  범위 초과이므로 오류가 난다
	}

}
