package injector;
/*
Thomas Boller
3-16-18
EmailServiceInjector.java
Programming Assignment 3
*/
import consumer.Consumer;
import consumer.MyDIApplication;
import service.EmailServiceImpl;

public class EmailServiceInjector implements MessageServiceInjector {

	@Override
	public Consumer getConsumer() {
		return new MyDIApplication(new EmailServiceImpl());
	}

}