package overriding;

public class Main {

	public static void main(String[] args) {
		BaseCreditManager[] credits = new BaseCreditManager[] {new TeacherCreditManager(), new StudentCreditManager(), new EntrepreneurCreditManager()};
		
		for (BaseCreditManager credit : credits) {
		System.out.println(credit.calculateTotalValue(1000));	
		}

	}

}
