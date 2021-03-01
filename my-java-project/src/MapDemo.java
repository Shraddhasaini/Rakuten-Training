import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

//import com.rakuten.training.basics.ChemicalElement;

public class MapDemo {

	public static void main(String[] args) {
		//simpleMapOps();
		demoUserDefinedClassInMap();
	}

	private static void demoUserDefinedClassInMap() {
		Map<ChemicalElement,Double> earthComposition = new HashMap<>();
		ChemicalElement h = new ChemicalElement(1, "H", "Hydrogen");
		ChemicalElement k = new ChemicalElement(19, "K", "Potassium");
		ChemicalElement o = new ChemicalElement(8, "O", "Oxygen");
		
		earthComposition.put(h, 15.3);
		earthComposition.put(o, 40d);
		earthComposition.put(k, 3.4);
		
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter an atmicNumber: ");
		int atomicNumber = Integer.parseInt(kb.nextLine());
		ChemicalElement unknown = new ChemicalElement(atomicNumber, null, null);
		if(earthComposition.containsKey(unknown)) {
			double percentage = earthComposition.get(unknown);
			System.out.println("Element with atmoic number "+atomicNumber+" is "+percentage+" % of earth!");
		}else {
			System.out.println("No data for element with atomic number "+atomicNumber);
		}
	}

	private static void simpleMapOps() {
		Map<String, Integer> runs = new LinkedHashMap<>();
		runs.put("Virat", 99);
		runs.put("Rohit", 36);
		runs.put("Ashwin", 100);
		
		System.out.println("Do we have runs of Virat? "+runs.containsKey("Virat"));
		System.out.println("Do we have runs of Jinx? "+runs.containsKey("Rahane"));
		System.out.println("Runs scored by Virat: "+runs.get("Virat"));
		System.out.println("Has anyone scored a perfect 100? "+runs.containsValue(100));
		
		Set<String> keys = runs.keySet();
		for(String aKey : keys) {
			System.out.println(aKey+" ---> "+runs.get(aKey));
		}
	}

}