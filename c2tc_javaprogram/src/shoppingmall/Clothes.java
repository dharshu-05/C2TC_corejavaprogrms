package shoppingmall;

public class Clothes implements Shopping {
	public void purchase() {
		System.out.println("Purchasing dresses from Zudio");
	}

	@Override
	public String toString() {
		return "Clothes []";
	}

}