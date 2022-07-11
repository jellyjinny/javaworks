package dbconnect;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import dbconnect.common.JDBCUtil;


//DAO(Data Access Object) DB 작업을 수행하는 코드
public class PersonDAO {
	
	private Connection conn = null;
	private PreparedStatement pstmt = null;
	private ResultSet rs = null;

	//CRUD(Create, Read, Update, Delete)
	//자료 삽입
	public void insertPerson(Person person) {
		conn = JDBCUtil.getConnection();
		String sql = "INSERT INTO person(userid, userpw, name, age) VALUES (?, ?, ?, ?)";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, person.getUserId());  //입력된 아이디 가져와서 sql에 세팅
			pstmt.setString(2, person.getUserPw());  //문자는 setString, 숫자는 setInt
			pstmt.setString(3, person.getName());
			pstmt.setInt(4, person.getAge());
			pstmt.executeUpdate();  //db에 저장
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(conn, pstmt);
		}
	}
	
	
	//자료 전체 조회
	public ArrayList<Person> getPersonList(){
		ArrayList<Person> personList = new ArrayList<>();
		//db 연결
		conn = JDBCUtil.getConnection();
		String sql = "SELECT * FROM person";
		try {
			pstmt = conn.prepareStatement(sql);  //sql 실행
			rs = pstmt.executeQuery();   //데이터 반환받음
			while(rs.next()) {  //자료가 있는 동안 반복
				Person person = new Person();
				person.setUserId(rs.getString("userid"));  //db 테이블의 칼럼 가져옴
				person.setUserPw(rs.getString("userPw"));  //person 객체에 세팅
				person.setName(rs.getString("name"));
				person.setAge(rs.getInt("age"));
				
				personList.add(person);  //생성 객체를 어레이리스트에 저장
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(conn, pstmt, rs);
		}
		return personList;
	}
		
	
	//자료 수정
	public void updatePerson(Person person) {
		conn = JDBCUtil.getConnection();
		String sql = "UPDATE person SET userpw = ?, name = ?, age = ? WHERE userid = ?";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, person.getUserPw());  //수정 자료를 db의 userpw에 저장
			pstmt.setString(2, person.getName());
			pstmt.setInt(3, person.getAge());
			pstmt.setString(4, person.getUserId());
			pstmt.executeUpdate();  //db에 저장
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(conn, pstmt);
		}
	}
	
	
	//자료 삭제
	public void deletePerson(Person person) {
		conn = JDBCUtil.getConnection();
		String sql = "DELETE FROM person WHERE userId = ?";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, person.getUserId());  //입력된 userid 저장
			pstmt.executeUpdate();  //db에 저장
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			JDBCUtil.close(conn, pstmt);
		}
	}
	
	//1명 조회(상세보기)
	public Person getPerson(String userId) {
		Person person = new Person();  // //새로운 객체 생성
		conn = JDBCUtil.getConnection();
		String sql = "SELECT * FROM person WHERE userid = ?";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, userId); //입력된 userID를 저장
			rs = pstmt.executeQuery();  //검색된 자료 반환
			if(rs.next()) { //자료가 있으면
				person.setUserId(rs.getString("userid")); //db에 있는 userid 가져옴
				person.setUserPw(rs.getString("userpw"));
				person.setName(rs.getString("name"));
				person.setAge(rs.getInt("age"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(conn, pstmt, rs);
		}	
		return person;
	}
}
