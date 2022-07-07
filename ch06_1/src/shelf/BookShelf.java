package shelf;

public class BookShelf extends Shelf implements Queue{

	@Override
	public void enQueue(String title) {
		shelf.add(title);  //리스트에 자료추가
		
	}

	@Override
	public String deQueue() {
		return shelf.remove(0); //리스트에서 자료삭제
	}

	@Override
	public int getSize() {
		return shelf.size(); //리스트 요소의 개수 반환
	}

}
