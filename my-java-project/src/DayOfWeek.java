
public class DayOfWeek {
	
	
	public static boolean leap(int year) {
	    if (year % 4 == 0) {
	      if (year % 100 == 0) {
	        if (year % 400 == 0)
	          return true;
	        else
	          return false;
	      }
	      else
	        return true;
	    }
	    
	    else
	      return false;
		
	}
	
	public static String findDOW(int day,int month,int year) {
		int sub = (year - 1900)*365 + ((year-1900)/4);
		leap(year);
		if(leap(year) && month == 01 || month == 02) {
			sub = sub-1;
			
		}
		return "yes";
	}
	public static void main(String[] args) {
		
		String res = findDOW(18,02,1999);
		System.out.println(res);
	}
	
}
