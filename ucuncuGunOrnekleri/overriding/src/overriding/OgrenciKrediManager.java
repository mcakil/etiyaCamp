package overriding;

public class OgrenciKrediManager extends BaseKrediManager{
	//NOT: Java'da @Override yazılmasa da kod çalışır, fakat uzun vadede kod okunurluğunu etkileyebilir.
	@Override
	public double hesapla(double tutar) {
		return tutar * 1.10;
	}
}
