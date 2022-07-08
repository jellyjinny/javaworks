package dbconnect;

import java.util.ArrayList;

public class PersonMain {

	public static void main(String[] args) {
		ArrayList<Person> personList = new ArrayList<>();
		PersonDAO dao = new PersonDAO();
		
		//자료 삽입
		Person p1 = new Person();
		p1.setUserId("today");
		p1.setUserPw("today11");
		p1.setName("투데이");
		p1.setAge(15);
		
		dao.insertPerson(p1);
			
		
		//전체 조회
		personList = dao.getPersonList();
		
		for(int i=0; i<personList.size(); i++) {
			Person person = personList.get(i);
			System.out.println("아이디: " + person.getUserId());
			System.out.println("비밀번호: " + person.getUserPw());
			System.out.println("이름: " + person.getName());
			System.out.println("나이: " + person.getAge());
		}
	}
}
