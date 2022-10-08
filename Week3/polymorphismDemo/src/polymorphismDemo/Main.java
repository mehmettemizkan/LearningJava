package polymorphismDemo;

public class Main {

	public static void main(String[] args) {
//		BaseLogger[] loggers = new BaseLogger[] {new FileLogger(), new EmailLogger(), new DatabaseLogger(), new BaseLogger()};
//		for (BaseLogger logger : loggers) {
//			logger.log("");
//		}
		
		CustomerManager customerManager = new CustomerManager(new DatabaseLogger());
		customerManager.add();
	
	
	} 
}
