import java.util.Comparator;

public class ChemicalElementNameLengthComparator implements Comparator<ChemicalElement> {

	@Override
	public int compare(ChemicalElement o1, ChemicalElement o2) {
		return o1.getName().length() - o2.getName().length();
		
	}

}

class ChemicalElementNameComparator implements Comparator<ChemicalElement> {

	@Override
	public int compare(ChemicalElement o1, ChemicalElement o2) {
		return o1.getName().compareTo(o2.getName());
		
	}

}