package injector;

import consumer.Consumer;
import consumer.MyDIApplication;
import service.SMSServiceImpl;
/*
Thomas Boller
3-16-18
SMSServiceInjector.java
Programming Assignment 3
*/
public class SMSServiceInjector implements MessageServiceInjector {

	@Override
	public Consumer getConsumer() {
		return new MyDIApplication(new SMSServiceImpl());
	}

}