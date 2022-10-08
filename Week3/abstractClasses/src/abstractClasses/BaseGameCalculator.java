package abstractClasses;

public abstract class BaseGameCalculator { 
	public abstract void hesapla(); // abstract ekleyerek bu fonksiyonun tanımlı olduğu sınıfın(BaseGameCalculator) her alt
									// sınıfında hesapla adıyla bir fonksiyon tanımlanmasını zorunlu kıldık.
	
	public final void gameOver() {
		System.out.println("Game Over.");
	}
}
