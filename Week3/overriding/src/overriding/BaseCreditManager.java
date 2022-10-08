package overriding;

public class BaseCreditManager {
	
//	calculateTotalValue fonksiyonu bu sınıfta tanımlandığı gibi kalsın, değişmesin isteseydik final ile tanımlamamız gerekirdi.
//	Böyle bir durumda programın hata vermemsi için alt sınıflardaki calculateTotalValue fonksiyonunu silmemiz ya da değiştirmemiz gerekir.
//	public final double calculateTotalValue(double value) {
	
	public double calculateTotalValue(double value) {
		return value * 1.40;		
	}
	
	
}
