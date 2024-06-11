package product;

public class Product
{
	
	//fields/variables
	private int productId;
	private String productName;
	private double productPrice;
	
	//initializers(constructors and blocks)
	
	/**
	 * 
	 * => What is constructor in java?
	 *    
	 *    Answer: Constructor is a special method in java, the constructor name and 
	 *            class name should be same, which do not have a return type.
	 * 
	 * => Why we use constructor in java?
	 * 	  
	 * 	  Answer: We use constructor to initialize the java objects
	 * 
	 * => How to implement constructor in java?
	 * 	  
	 * 	  syntax: 
	 * 	  Answer: access modifier class-name(){  }
	 * 
	 */
	public Product()
	{
		productId = 3039;
		productName = "Iphone 15";
		productPrice = 145000.45;
	}
	
	
	//methods
	public void getProduct()
	{
		System.out.println(productId);
		System.out.println(productName);
		System.out.println(productPrice);		
	}
	
	//inner classes


}
