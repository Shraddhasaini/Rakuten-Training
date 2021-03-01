import java.util.Optional;

public class Test {
	
	  public static final ChemicalElement first = new ChemicalElement(1, "h", "hy");
	    
	    public static Optional<ChemicalElement> readFromDB(int atmoicNumber) {
	        //connect to db
	        //search based on atomicnumber
	        //if found
	        boolean found = false;
	        if(found) {
	            ChemicalElement e = new ChemicalElement(0, null, null);
	            return Optional.of(e);
	        }else {
	        //if not found
	            System.out.println("not found");
	            return Optional.empty();
	        }
	    }
	
}
