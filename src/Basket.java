import java.util.ArrayList;
import java.util.List;


public class Basket {
    private String date;

    private String status;

    private Invoice invoice;

    private List<Article> article = new ArrayList<Article> ();

    public void addArticle(Article newArticle) {
    	this.article.add(newArticle);
    	newArticle.decreaseUnit(1);
    }
    
    public void listArticles() {
        for(Article art : article) {
            System.out.println("Article: " + art.getId() + " has " + art.getUnits() + " units");
        }
    }
}