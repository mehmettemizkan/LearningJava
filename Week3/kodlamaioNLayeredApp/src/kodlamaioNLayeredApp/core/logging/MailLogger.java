package kodlamaioNLayeredApp.core.logging;

public class MailLogger implements Logger{

	@Override
	public void log(String data) {
		System.out.println("Logged to mail : " + data);
		
	}

}
