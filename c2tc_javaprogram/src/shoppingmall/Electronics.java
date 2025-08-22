package shoppingmall;


public class Electronics implements Shopping{
	public void purchase() {
		System.out.println("Purchasing electronics from Reliance");
	}

	@Override
	public String toString() {
		return "Electronics []";
	}
	 

}