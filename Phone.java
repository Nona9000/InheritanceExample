public  abstract class Phone{
	 
	private int year;
	private int screenSize;
	
    public Phone(int year, int screenSize) {
        this.setYear(year);
        this.setScreenSize(screenSize);
    }    
    public Phone(int year, int screenSize, String company) {
	
	}
    public abstract void call(int outputNumber);
    
    public abstract void ring (int inputNumber);
    
	public int getScreenSize() {
		return screenSize;
	}
	public void setScreenSize(int screenSize) {
		this.screenSize = screenSize;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
    
}