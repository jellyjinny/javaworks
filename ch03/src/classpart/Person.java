package classpart;

public class Person {
	//필드
	String name;
	float height;
	float weight;
	
	//기본생성자
	public Person(){}
	
	//매개변수가 있는 생성자
	public Person(String n) {//이름을 외부에서 
		name = n;	
	}
	
	public Person(String n, float h, float w) {
		name = n;
		height = h;
		weight = w;
	}	
	
	//메서드
	public void showInfo() {
		System.out.println("이름: " + name + ", 키: " + height + 
				", 몸무게" + weight);
	}
}
