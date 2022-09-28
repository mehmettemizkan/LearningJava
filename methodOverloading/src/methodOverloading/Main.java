package methodOverloading;

public class Main {

	public static void main(String[] args) {
		Addition addition = new Addition();
		
		System.out.println(addition.add(1, 5));
		System.out.println(addition.add(1, 5, 7));
		System.out.println(addition.add(1.2, 5.3 , 4.4));

	}

}
