package Lab4Exercise3;

//main superclass Item
abstract class Item {
	private
	//UniIdentiNumer - Unique Identiofication Number of book
	String uniIdNum;
	String title;
	int numOfCopies;
	
	//constructor
	public Item(String uniIdNum, String title, int numOfCopies) {
		super();
		this.uniIdNum = uniIdNum;
		this.title = title;
		this.numOfCopies = numOfCopies;
	}
	//getters and setters
	public String getUniIdNum() {
		return uniIdNum;
	}

	public void setUniIdNum(String uniIdNum) {
		this.uniIdNum = uniIdNum;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getNumOfCopies() {
		return numOfCopies;
	}

	public void setNumOfCopies(int numOfCopies) {
		this.numOfCopies = numOfCopies;
	}
}
//subclass1-i WrittenItem 
abstract class WrittenItem extends Item{

	private String author;
	
	public WrittenItem(String uniIdNum, String title, int numOfCopies) {
		super(uniIdNum, title, numOfCopies);
		// TODO Auto-generated constructor stub
	}
	
}
//subclass2 Book
abstract class Book extends WrittenItem {

	public Book(String uniIdNum, String title, int numOfCopies) {
		super(uniIdNum, title, numOfCopies);
		// TODO Auto-generated constructor stub
	}

}
//subclass2 JournalPaper
abstract class JournalPaper extends WrittenItem{
	
	private int year_of_publish;

	public JournalPaper(String uniIdNum, String title, int numOfCopies) {
		super(uniIdNum, title, numOfCopies);
		// TODO Auto-generated constructor stub
	}

}
//subclass1-ii MediaItem
abstract class MediaItem extends Item{

	public MediaItem(String uniIdNum, String title, int numOfCopies) {
		super(uniIdNum, title, numOfCopies);
		// TODO Auto-generated constructor stub
	}

}
//subclass3-i Video
abstract class Video extends MediaItem {
	private
	String director, genre;
	int year_release;

	public Video(String uniIdNum, String title, int numOfCopies) {
		super(uniIdNum, title, numOfCopies);
		// TODO Auto-generated constructor stub
	}
	
}
//subclass3-ii CD
abstract class CD extends MediaItem{
	
	private String artist, genre;

	public CD(String uniIdNum, String title, int numOfCopies) {
		super(uniIdNum, title, numOfCopies);
		// TODO Auto-generated constructor stub
	}
	
}
