package generic;

import java.util.ArrayList;

public class GenericExample {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		
		//요소 추가(객체 추가)
		list.add("grape");
		list.add("egg");
		list.add("coffee");
		
		System.out.println(list);
	}

}
