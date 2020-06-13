
public class Android extends SmartPhone {

	public Android(int year, int screenSize, String company) {
		super(year, screenSize, company);
		
	}
	     public String getModel(){
		return "This is Android Mobile- ";
	}
	     public void call(int outputNumber) {
	         System.out.println("Rotate the knob");
	         System.out.println("Tell the caller number");
}
	     public void ring(int inputNumber) {
	         System.out.println("Phone calls"); 
	         
	     
}
}