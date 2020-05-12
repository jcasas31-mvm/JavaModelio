
public class Article {
    private String id;

    private String serialNumber;

    private int units;
    
    public Article(String id, String serialNumber, int units) {
    	this.id = id;
    	this.serialNumber = serialNumber;
    	this.units = units;
    }
    
    public void decreaseUnit(int units) {
    	this.units = this.units - units;
    }
    
    public void increaseUnit(int units) {
    	this.units = this.units + units;
    }
    
    public String getId() {
    	return this.id;
    }
    
    public String getSerialNumber() {
    	return this.serialNumber;
    }
    
    public int getUnits() {
    	return this.units;
    }

}
