
public class ChemicalElementApp {
 public static void main(String[] args) {
	 
	 //H
	 ChemicalElement h = new ChemicalElement(1,"H","Hydrogen");
	 System.out.println("Is Hydogen an Alkali Metal : " + h.isAlkaliMetal());
	 System.out.println("Is Hydogen a Transition Metal : " + h.isTransitionMetal());
	 System.out.println("Is Hydogen a Metal : " + h.isMetal());
	 
	 System.out.println("===========================================");
	 
	 //K
	 ChemicalElement k = new ChemicalElement(19,"K","Potassium");
	 System.out.println("Is Potassium an Alkali Metal : " + k.isAlkaliMetal());
	 System.out.println("Is Potassium a Transition Metal : " + k.isTransitionMetal());
	 System.out.println("Is Potassium a Metal : " + k.isMetal());
	 
	 System.out.println("===========================================");
	 
	 //Z
	 ChemicalElement z = new ChemicalElement(30,"Zn","Zinc");
	 System.out.println("Is Zinc an Alkali Metal : " + k.isAlkaliMetal());
	 System.out.println("Is Zinc a Transition Metal : " + k.isTransitionMetal());
	 System.out.println("Is Zinc a Metal : " + k.isMetal());
	 
	 System.out.println("_______________________________________________" + h.getName());
	 //System.out.println("Are Zinc and Hydrogen equal: " + );
	 
}
}
