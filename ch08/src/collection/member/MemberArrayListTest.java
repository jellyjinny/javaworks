package collection.member;

public class MemberArrayListTest {

	public static void main(String[] args) {
		
		MemberArrayList memberArrayList = new MemberArrayList();
		
		//회원 생성 및 추가
		/*[방법 1]
		memberArrayList.addMember(new Member(1001, "추신수"));
		memberArrayList.addMember(new Member(1002, "손흥민"));
		memberArrayList.addMember(new Member(1003, "박인비"));
		memberArrayList.addMember(new Member(1004, "김연아"));
		*/
		
		//[방법 2]
		Member chu = new Member(1001, "추신수");
		Member son1 = new Member(1002, "손흥민");
		Member park = new Member(1003, "박인비");
		Member kim = new Member(1004, "김연아");
		Member son2 = new Member(1002, "손흥민");
		
		memberArrayList.addMember(chu);   //0
		memberArrayList.addMember(son1);  //1
		memberArrayList.addMember(park);  //2
		memberArrayList.addMember(kim);   //3
		memberArrayList.addMember(son2);  //4
		
		//회원 목록 조회
		memberArrayList.showAllMember();
		System.out.println("================================");
		
		//회원 삭제
		memberArrayList.removeMember(1002);
		memberArrayList.removeMember(1005);
		
		memberArrayList.showAllMember();
		
	}

}
