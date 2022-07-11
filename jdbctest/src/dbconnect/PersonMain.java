package dbconnect;

import java.util.ArrayList;

public class PersonMain {

	public static void main(String[] args) {
		ArrayList<Person> personList = new ArrayList<>();
		PersonDAO dao = new PersonDAO();
		
		//자료 삽입
		/*Person p1 = new Person();
		p1.setUserId("sky");
		p1.setUserPw("sky11");
		p1.setName("투데이");
		p1.setAge(15);
		
		dao.insertPerson(p1);*/
			
		//자료 수정
		Person p2 = new Person();
		p2.setUserId("today");
		p2.setUserPw("today11");  //비번수정
		p2.setName("투데이");      //이름수정
		p2.setAge(35);
		
		dao.updatePerson(p2);  //자료 수정 메소드 호출
		
		//자료 삭제
		Person deleteOne = new Person();
		deleteOne.setUserId("sky");
		
		dao.deletePerson(deleteOne);
		
		//특정한 1명 조회
		Person selectOne = dao.getPerson("cloud");
		printPerson(selectOne);
		System.out.println("===============================");
	
		
		//전체 조회
		personList = dao.getPersonList();
		
		for(int i=0; i<personList.size(); i++) {
			Person person = personList.get(i);
			printPerson(person);
		}
		
	}//main() 닫기

	private static void printPerson(Person person) {
		System.out.println("아이디: " + person.getUserId());
		System.out.println("비밀번호: " + person.getUserPw());
		System.out.println("이름: " + person.getName());
		System.out.println("나이: " + person.getAge());
	}
}
