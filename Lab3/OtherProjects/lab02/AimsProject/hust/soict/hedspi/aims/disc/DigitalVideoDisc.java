package hust.soict.elitech.aims.disc;

public class DigitalVideoDisc {
	private static int nbDigitalVideoDiscs = 0;
    private String title;
    private String category;
    private String director;
    private int length;
    private float cost;
    private int id;
	public String getTitle() {
		return title;
	}
	public String getCategory() {
		return category;
	}
	public String getDirector() {
		return director;
	}
	public int getLength() {
		return length;
	}
	public float getCost() {
		return cost;
	}

    public int getId() {
		return id;
	}
    
	public static int getNbDigitalVideoDiscs() {
		return nbDigitalVideoDiscs;
	}
	
	public DigitalVideoDisc(String title) {
        this.title = title;
    }
    
    public DigitalVideoDisc(String category, String title, float cost) {
        this.category = category;
        this.title = title;
        this.cost = cost;
    }
    
    public DigitalVideoDisc(String director, String category, String title, float cost) {
        this.director = director;
        this.category = category;
        this.title = title;
        this.cost = cost;
    }

    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        this.title = title;
        this.category = category;
        this.director = director;
        this.length = length;
        this.cost = cost;
        
        nbDigitalVideoDiscs++;
        this.id = nbDigitalVideoDiscs;
    }
	public void setTitle(String title) {
		this.title = title;
	}
    
}
    
