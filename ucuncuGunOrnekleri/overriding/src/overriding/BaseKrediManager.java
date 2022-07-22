package overriding;

public class BaseKrediManager {
	//NOT: Bir metodun override edilmesi istenmiyorsa final keywordü kullanılabilir.
	public double hesapla(double tutar) {
		return tutar * 1.18;
	}
}
