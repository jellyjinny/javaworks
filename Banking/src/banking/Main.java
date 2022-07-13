package banking;

import java.util.Scanner;

public class Main {
	//배열의 크기가 100인 Account형 배열 선언
	private static Account[] accountArray = new Account[100];
	private static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		boolean run = true; //실행변수
		
		while(run) {
			System.out.println("-------------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("-------------------------------------------");
			System.out.print("선택> ");
			
			String selectNo = scanner.next();  //nextLine()이 자동 줄바꿈이 되는 경우가 있어서 사용 안함.
			if(selectNo.equals("1")) {
				createAccount();  //계좌생성
			}else if(selectNo.equals("2")) {
				accountList();    //계좌목록
			}else if(selectNo.equals("3")) {
				deposit();        //예금
			}else if(selectNo.equals("4")) {
				withdraw();       //출금  
						//전부 작성 후 withdraw(); 부분에 마우스 가져다대고 클릭! 역순으로 올라가면서 클릭! 하단 내용 자동으로 나타남
			}else if(selectNo.equals("5")) {
				run = false;      //프로그램 종료
			}else {
				System.out.println("지원되지 않는 기능입니다.");
			}
		}
		System.out.println("프로그램 종료!");
	}

	private static void createAccount() {
		System.out.println("-------------------------------------------");
		System.out.println("계좌생성");
		System.out.println("-------------------------------------------");	
		
		System.out.println("계좌 번호: ");
		String ano = scanner.next();
		
		System.out.println("계좌주: ");
		String owner = scanner.next();
		
		System.out.println("초기 입금액: ");
		int balance = scanner.nextInt();
			
		//계좌 객체 생성
		Account newAccount = new Account(ano, owner, balance);
		for(int i=0; i<accountArray.length; i++) {
			if(accountArray[i] == null) {      //배열의 공간([i])이 null인 경우 
				accountArray[i] = newAccount;  //계좌를 배열에 저장
				System.out.println("결과: 계좌가 생성되었습니다.");
				break;
			}
		}	
	}

	private static void accountList() {
		System.out.println("-------------------------------------------");
		System.out.println("계좌목록");
		System.out.println("-------------------------------------------");	
		
		for(int i=0; i<accountArray.length; i++) {
			Account account = accountArray[i];    //배열에 저장된 account를 대입
			if(account != null) {
				System.out.print("계좌 번호: " + account.getAno() + "\t");
				System.out.print("계좌주: " + account.getOwner() + "\t");
				System.out.println("잔액: " + account.getBalance() + "\t");
			}
		}	
	}

	private static void deposit() {
		System.out.println("-------------------------------------------");
		System.out.println("예금");
		System.out.println("-------------------------------------------");

		System.out.println("계좌 번호: ");
		String ano = scanner.next();
		//'계좌가 없습니다. 다시 입력하세요.' 구현하기
		if(findAccount(ano) == null) {
			System.out.println("계좌가 없습니다. 다시 입력하세요.");
			System.out.println("계좌 번호 :");
			ano = scanner.next();
		}
		
		Account account = findAccount(ano);  //검색한 계좌번호의 account 반환
		
		System.out.println("입금액: ");
		int money = scanner.nextInt();
		
		account.setBalance(account.getBalance() + money);
		System.out.println("결과: 입금을 성공하였습니다.");
	}

	private static void withdraw() {
		System.out.println("-------------------------------------------");
		System.out.println("출금");
		System.out.println("-------------------------------------------");

		System.out.println("계좌 번호: ");
		String ano = scanner.next();
		
		Account account = findAccount(ano);  //검색한 계좌번호의 account 반환
		
		System.out.println("출금액: ");
		int money = scanner.nextInt();
		
		account.setBalance(account.getBalance() - money);
		System.out.println("결과: 출금을 성공하였습니다.");
	}
	
	private static Account findAccount(String ano) {
		Account account = null;
		for(int i=0; i<accountArray.length; i++) {
			if(accountArray[i] != null) {
				String dbAno = accountArray[i].getAno();    //저장된 계좌를 가져와서
				if(dbAno.equals(ano) ) {     //이미 저장된 계좌와 새로 입력한 계좌가 일치한다면
					account = accountArray[i];
					break;
				}
			}
		}
		return account;
	}

}
