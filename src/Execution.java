/**
 * Main class to instantiate other classes
 * @author jordi
 *
 */
public class Execution {

	public static void main(String[] args) {
		Basket b = new Basket();
		Article a1 = new Article("id1","serialnumber1",5);
		// Check the number of articles 
		System.out.println("Article 1 - Number of units " + a1.getUnits());
		b.addArticle(a1);
		
		System.out.println(a1.getUnits());
		b.listArticles();
		
		// Create a new object of Customer
		Customer c = new Customer();
		c.setVip(true);
		c.setUsername("jcasas");
		System.out.println("Username: " + c.getUsername());
		System.out.println("Is this customer a VIP one? " + c.isVip());
	}

}
