import java.util.*;

public class Messages {
	static ArrayList<Message> messages=new ArrayList<Message>();
	public static void addMessage(Message m){
		messages.add(m);
	}
	public static void addMessage2(Date date, String text, String userName){
		messages.add(new Message(date, text, userName));
	}
	public static ArrayList<Message> getAllMessages(){
		for(Message x: messages){
			System.out.println(x.formattedText());
		}
		return messages;
	}
}
