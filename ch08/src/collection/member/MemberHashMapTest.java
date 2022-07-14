package collection.member;

public class MemberHashMapTest {

	public static void main(String[] args) {

		MemberHashMap memberHashMap = new MemberHashMap();
		
		//회원삽입
		//key는 중복 불가, value는 변경 가능
		memberHashMap.addMember(new Member(1001, "삼성전자"));
		memberHashMap.addMember(new Member(1002, "LG전자"));
		memberHashMap.addMember(new Member(1003, "네이버"));
		memberHashMap.addMember(new Member(1004, "카카오"));
		memberHashMap.addMember(new Member(1002, "현대자동차")); 
		
		//목록보기
		memberHashMap.showAllMember();
		System.out.println("=================================");
		
		//회원삭제
		memberHashMap.removeMember(1003);
		memberHashMap.removeMember(1005);
		
		memberHashMap.showAllMember();
		
	}

}
