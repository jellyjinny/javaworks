package collection.member;

//VO(Value Object)
public class Member {
	private int memberId;        //회원 아이디
	private String memberName;   //회원 이름
	
	public Member(int memberId, String memberName) {
		this.memberId = memberId;
		this.memberName = memberName;
	}
	
	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}
	
	public int getMemberId() {
		return memberId;
	}
	
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	
	public String getMemberName() {
		return memberName;
	}

	@Override
	public String toString() {
		return memberName + " 회원님의 아이디는 " + memberId + "입니다.";
	}

	@Override
	public int hashCode() {
		//memberId.hashCode() <- 만약에 String형일 경우 이렇게 넣어줌
		return memberId;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member member = (Member)obj;
			if(member.memberId == memberId) {  //교재에 나온 방식. 이게 더 괜찮은 방법.
				//또는 'if(this.memberId == member.memberId) {' 이렇게도 쓸 수 있다. 
				return true;
			}
		}
		return false;
	}

	
}
