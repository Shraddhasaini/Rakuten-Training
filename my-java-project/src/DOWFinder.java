
public class DOWFinder {
//2 / 10 / 2020
	
	public String findDOW(int day,int month,int year) {
		
		int numDays = (year - 1900) * 365;
		numDays += (year - 1900) / 4;
		
		switch(month) {
		case 12:
			numDays += 30;
		case 11:
			numDays += 31;
		case 10:
			numDays += 30;
		case 9:
			numDays += 31;
		case 8:
			numDays += 31;
		case 7:
			numDays += 30;
		case 6:
			numDays += 31;
		case 5:
			numDays += 30;
		case 4:
			numDays += 31;
		case 3:
			numDays += 28;
		case 2:
			numDays += 31;
		}
		
		numDays += day;
		
		if(year % 4 == 0 && month <= 2) {
			numDays--;
		}
		
		int dowIndex = numDays % 7;
		String[] dows = {"sunday","monday","tuesday","wednesday","thursday","friday","saturday"};
		return dows[dowIndex];
	}
	
	public static void main(String[] args) {
		DOWFinder finder = new DOWFinder();
		String dow = finder.findDOW(15,2,2021);
		System.out.println(dow);
	}
}
