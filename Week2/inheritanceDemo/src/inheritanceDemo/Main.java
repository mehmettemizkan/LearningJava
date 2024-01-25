package inheritanceDemo;

public class Main {

	public static void main(String[] args) {
//		TeacherCreditManager teacherCreditManager = new TeacherCreditManager();
//		teacherCreditManager.Calculate();
		
		CreditUI creditUI = new CreditUI();
		creditUI.CalculateCredit(new SoldierCreditManager());

	}

}
