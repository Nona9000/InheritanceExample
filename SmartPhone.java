
 public class SmartPhone extends MobilePhone {

	public SmartPhone(int year, int screenSize, String company) {
		super(year, screenSize, company);
	
	}

	@Override
	    public void call(int outputNumber) {
	        System.out.println("Calling the number " + outputNumber);
	    }

	    @Override
	    public void ring(int inputNumber) {
	        System.out.println("The caller is calling you " + inputNumber);
	    }
	
	}
		
	
	   
		 
    	
		
	


