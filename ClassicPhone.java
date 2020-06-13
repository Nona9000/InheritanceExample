
public class ClassicPhone extends MobilePhone {
  
	 private String operationSystem; 
	 
	public ClassicPhone(int year, int screenSize, String company) {
		super(year, screenSize, company);
		
    }
	    public String operationSystem(String operationSystem) {
		return this.operationSystem = operationSystem;
	}
         public void install(String program){
    System.out.println("Install " + program + "from" + operationSystem);
}
	}

	

