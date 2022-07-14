package collection.member;

public class MemberHashSetTest {

	public static void main(String[] args) {

		MemberHashSet memberHashSet = new MemberHashSet();
		
		// 회원 추가
		memberHashSet.addMember(new Member(1001, "네이버"));
		memberHashSet.addMember(new Member(1002, "카카오"));
		memberHashSet.addMember(new Member(1003, "엔씨소프트"));
		memberHashSet.addMember(new Member(1001, "네이버"));  // 중복 저장 불가

		
		// 회원목록 보기
		memberHashSet.showAllMember();
		System.out.println("===========================================");
		
		// 회원 삭제
		memberHashSet.removeMember(1003);
		memberHashSet.removeMember(1005);  //없는 번호를 입력했을 때
				               //결과값 : 1005번 회원이 존재하지 않습니다.
		
		memberHashSet.showAllMember();
	}

}
