package service;
/*
Thomas Boller
3-16-18
EmailServiceImpl.java
Programming Assignment 3
*/
public class EmailServiceImpl implements MessageService {

	@Override
	public void sendMessage(String msg, String rec) {
		//logic to send email
		System.out.println("Email sent to "+rec+ " with Message="+msg);
	}
}