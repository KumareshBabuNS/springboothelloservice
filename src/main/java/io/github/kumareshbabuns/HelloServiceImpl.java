package io.github.kumareshbabuns;

public class HelloServiceImpl implements HelloService{

	private String message = "Default Message";
	
	@Override
	public String sampleMessage(String message) {
		if(message.length() == 0) {
			this.message = message;
		}
		return message;
	}

}
