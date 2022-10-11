package abstractClasses; // classın abstract olabilmesi için abstract ifadesiyle besleniyor olmalı

public abstract class BaseGameCalculator {// abstract sınıflar new lenemez.

	public abstract void calculate(); /*
										 * bu classı inheritance eden class bu metodu kullanmak zorunda ve kullanılan
										 * classta kendi hesapla metodunun tasarlayacak. Override edecek.
										 */

	public final void gameOver() {
		System.out.println("Oyun bitti..."); /*
												 * bu metodu kullanacak class ise override edemiyor ve bu şekilde
												 * kullanmak zorunda. Sebebi ise "final anahtar kelimesidir."
												 */
	}

}
