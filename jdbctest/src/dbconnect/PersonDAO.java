package dbconnect;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.naming.spi.DirStateFactory.Result;

import dbconnect.common.JDBCUtil;

//DAO(Data Access Object) DB 작업을 수행하는 코드
public class PersonDAO {
	
	private Connection conn = null;
	private PreparedStatement pstmt = null;
	private ResultSet rs = null;
	
	//CRUD(Create, Read, Update, Delete)
	//자료삽입
	public void insertPerson(Person person) {
		try {  //try{}catch{} 단축키 : alt + shift + z
			conn = JDBCUtil.getConnection();  
			String sql = "INSERT INTO person (userId, userPw, name, age) values (?, ?, ?, ?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, person.getUserId());  //입력된 아이디 가져와서 sql에 세팅
			pstmt.setString(2, person.getUserPw());
			pstmt.setString(3, person.getName());
			pstmt.setInt(4, person.getAge());  //db에 저장
			
			pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(conn, pstmt);
		}
	}
	
	
	//자료 전체 조회
	public ArrayList<Person> getPersonList(){
		ArrayList<Person> personList = new ArrayList<>();
		try{
		conn = JDBCUtil.getConnection();
		String sql = "SELECT * FROM person";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				Person person = new Person();
				person.setUserId(rs.getString("userId"));
				person.setUserPw(rs.getString("userPw"));
				person.setName(rs.getString("name"));
				person.setAge(rs.getInt("age"));
				
				personList.add(person);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(conn, pstmt, rs);
		}
		return personList;
	}
	
	
	//자료 수정
	/*public void updatePerson(Person person) {
		try {
			conn = JDBCUtil.getConnection();
			String sql = "UPDATE person SET userPw = ?, name = ?, age = ? WHERE userId = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, person.getUserPw());
			pstmt.setString(2, person.getName());
			pstmt.setInt(3, person.getAge());
			pstmt.setString(4, person.getUserId());
			pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(conn, pstmt);
		}
	}
	
	
	//자료 삭제
	public void deletePerson(Person person) {
		try {
			conn = JDBCUtil.getConnection();
			String sql = "DELETE FROM person WHERE userId = ?, name = ?, age = ? WHERE userId = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, person.getUserId());
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(conn, pstmt);
		}
	}*/
}
