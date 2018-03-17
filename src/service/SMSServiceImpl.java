package service;
/*
Thomas Boller
3-16-18
SMSServiceImpl.java
Programming Assignment 3
*/
public class SMSServiceImpl implements MessageService {

	@Override
	public void sendMessage(String msg, String rec) {
		//logic to send SMS
		System.out.println("SMS sent to "+rec+ " with Message="+msg);
	}

}