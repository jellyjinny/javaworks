package collection.queue;

//자료형 VO
public class Message {
	public String command;  //수행방법
	public String to;   	//대상
	
	public Message(String command, String to) {
		this.command = command;
		this.to = to;
	}
}
