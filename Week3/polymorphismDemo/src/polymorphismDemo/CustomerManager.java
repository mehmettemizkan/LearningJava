package polymorphismDemo;

public class CustomerManager {

	private BaseLogger logger;

	public CustomerManager(BaseLogger logger) {
		this.logger = logger;
	}

	public void add() {

		System.out.println("Customer added.");
		this.logger.log("'Log Message...'");

//		DatabaseLogger logger = new DatabaseLogger();
//		logger.log("log message");
	}
}
