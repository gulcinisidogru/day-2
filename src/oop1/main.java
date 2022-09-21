package oop1;

public class main {

	public static void main(String[] args) {
		String mesaj = "Vade oranı";
		// set value: değer atamak .. set yazmak için
		// öğrenmek için backend gibi düşün
		Product product1 = new Product();
		product1.setName("Delonghi Kahve Makinesi");
		product1.setDiscount(7);
		product1.setUnitPrice(7500);
		product1.setUnitsInStock(3);
		product1.setImageUrl("image.jpg");
		
		// get okurken
		// öğrenmek için frontend gibi düşün
		// System.out.println(product1.name);
//gerçek hayatta bunlar DB den gelir ama şuan biz de olmadığı için böyle yapıyoruz
		Product product2 = new Product();
		product2.setName("Sweg Kahve Makinesi");
		product2.setDiscount(7);
		product2.setUnitPrice(7500);
		product2.setUnitsInStock(3);
		product2.setImageUrl("image2.jpg");
		

		Product product3 = new Product();
		product3.setName("Kitchen Aid Kahve Makinesi");
		product3.setDiscount(7);
		product3.setUnitPrice(7500);
		product3.setUnitsInStock(3);
		product3.setImageUrl("image3.jpg");
		
		
		Product[] products = { product1, product2, product3 };

		System.out.println("<ul>");
		for (Product product : products) {
			System.out.println("<li>" + product.getName() + "</li>");
		}
		System.out.println("</ul>");
		
		
		IndividualCustomer individualCustomer = new IndividualCustomer();
		individualCustomer.setId(1);
		individualCustomer.setPhone("0522266");
		individualCustomer.setCustomerNumber("12345");
		individualCustomer.setFirstName("Gülçin");
		individualCustomer.setLastName("İşidoğru");
		
		
		CorporateCustomer corporateCustomer = new CorporateCustomer();
		corporateCustomer.setId(2);
		corporateCustomer.setCompanyName("Kodlama.io");
		corporateCustomer.setPhone("0505685");
		corporateCustomer.setTaxNumber("1111111");
		corporateCustomer.setCustomerNumber("54321");	
		
		
		customer[] customers = {individualCustomer,corporateCustomer};
		
		
		
	}

}
