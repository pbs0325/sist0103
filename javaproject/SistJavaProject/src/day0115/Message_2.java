package day0115;

import java.util.LinkedList;
import java.util.Queue;

public class Message_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Message> messageQueue = new LinkedList<>();
		
		messageQueue.offer(new Message("sendMail","홍길동"));
		messageQueue.offer(new Message("sendSMS","신용권"));
		messageQueue.offer(new Message("sendKakaotalk","감자바"));
		
		while(!messageQueue.isEmpty()) {
			
		}
	}

}
