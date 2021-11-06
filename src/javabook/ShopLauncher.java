package javabook;

public class ShopLauncher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IShop shop = new Myshop();
		shop.setTitle("Myshop");
		shop.genUser();
		shop.genProduct();
		shop.start();
	}

}
