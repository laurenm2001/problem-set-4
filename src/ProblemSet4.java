/**
 * INSTRUCTIONS.
 * 
 * Welcome to Problem Set 4, where we'll dive into writing our own methods with
 * parameters and return values. The focus, this time, will be on the built-in @String
 * and @Math classes.
 * 
 * You'll note that most of the methods have not been included. Instead, you'll see
 * specifications pertaining to their signatures (i.e., the method name, as well as
 * its return type and parameter list). You'll need to be sure to meet these
 * specifications exactly.
 * 
 * As always, please be mindful of your output (in this case, returned values rather
 * than printed text). Your solutions will be tested against a set of expected
 * values, and the grading script will expect an exact match.
 * 
 * This problem set contains 10 exercises worth 50 points. It is due no later than
 * 11:59pm on Sunday, November 4, 2018. Good luck! 
 */

public class ProblemSet4 {
	
	public static void main(String[] args) {
		ProblemSet4 ps = new ProblemSet4();
		System.out.println(ps.surroundMe("two", "<<>>"));
		System.out.println(ps.endsMeet("qwerty", 2));
		System.out.println(ps.middleMan("candy"));
		System.out.println(ps.doubleVision("qwerty"));
		System.out.println(ps.centered("qwerty", "qwe"));
		System.out.println(ps.upOrDown(12.2, 'r'));
		System.out.println(ps.countMe("and some more sample words", '+'));
		System.out.println(ps.isNotEqual("is not is not is"));

	}
	public String surroundMe(String in, String out) {
		int lengthIn = in.length();
		int lengthOut = out.length();
		
		if(in == null || out == null) {
			return null;
		}else if(lengthIn != 3 || lengthOut != 4) {
			return null;
		}else {
		String outfirst = out.substring(0, 2);
		String outlast = out.substring(2,lengthOut);
		String together = outfirst + in + outlast;
		return together;
		}
	}
	public String endsMeet(String str, int n) {
		if(str == null || str.length() < 1 || str.length() > 10 || n>str.length() || n<1) {
			return null;
		}else {
			String beg = str.substring(0, n);
			String last = str.substring((str.length()-n), str.length());
			String total = beg + last;
			return total;
		}
	}
	public String middleMan(String str) {
		if(str == null || str.length()%2==0) {
			return null;
		}else {
			int middle = str.length()/2;
			String three = str.substring(middle-1, middle+2);
			System.out.println(three);
			return three;
		}
	}
	public String doubleVision(String str) {
		if(str == null) {
			return null;
		}else {
			String total = "";
			for (int i = 0; i<str.length(); i++) {
				total = total + str.charAt(i);
				total = total + str.charAt(i);
			}
			return total;
		}
	}
	public boolean centered(String str, String target) {
		boolean checker;
		if(str == null || target == null || target.length() != 3) {
			return false;
		}else {
			int middle = str.length()/2;
			String mid = str.substring(middle-1, middle+2);
			if(mid.equals(target)) {
				checker = true;
			}else {
				checker = false;
			}return checker;
		}
	}
	public int upOrDown(double number, char operation) {
		int end;
		if(operation == 'r') {
			end = (int)Math.round(number);
			return end;
		}else if (operation == 'f') {
			end = (int)Math.floor(number);
			return end;
		}else if(operation == 'c') {
			end = (int)number + 1;
			return end;
		}else {
			return -1;
		}
	}
	public int countMe(String text, char end) {
		int count = 0;
		if(text == null || !Character.isLetter(end)){
			return -1;
		}else {
			for(int i = 0; i <text.length(); i++) {
				if(text.charAt(i) == end && text.charAt(i+1) == ' ' || text.charAt(i) == end && i == (text.length()-1)) {
					count = count + 1;
					}
			}
			return count;
		}
	}
	public boolean isNotEqual(String str) {
		if(str == null) {
			return false;
		}else{
			int countIs = 0;
			int countNot = 0;
			for(int i = 0; i<str.length(); i++) {
				if(i < str.length()-1) {
					if(str.substring(i, i+2).equals("is")) {
						countIs = countIs + 1;
					}
				}
				if(i< str.length()-2) {
					if(str.substring(i, i+3).equals("not")) {
					countNot = countNot + 1;
					}
				}
			}
			if(countIs == countNot) {
				return true;
			}else {
				return false;
			}
		}
	}
	public int triplets(String str) {
		int count = 0;
		if(str == null) {
			return -1;
		}
		
		for(int i = 0; i<str.length(); i++) {
			if(str.charAt(i) == ' ' || str.charAt(i) == '1') {
				return -1;
			}
		}
			for(int i = 0; i<str.length(); i++) {
				if(i<str.length()-2 && str.charAt(i)== str.charAt(i+1) && str.charAt(i)==str.charAt(i+2)) {
					count +=1 ;
				}
			}
			return count;
	}
public int addMe(String str, boolean digits) {
		int sum = 0;
		int count = 0;
		String temp;
		if(str == null) {
			return -1;
		}
		int length=str.length();
		for(int i=0;i<length;i++)
        {
            if(str.charAt(i)==' ') {
            	return -1;
            }
        }
		if(digits == true) {
			for(int i=0;i<length;i++) {
				if(Character.isDigit(str.charAt(i))) { 
				char c = str.charAt(i);
		            sum += (c-'0');}
			}return sum;
		}else {
		
		for(int i=0;i<=length-1;i=i+count+1)
        {
            count=0;
            if(str.charAt(i)==' ') {
            	return -1;
            }
            
            if(Character.isDigit(str.charAt(i)))
            {
                for(int c=i;c<=length-1;c++)
                {
                    if(Character.isDigit(str.charAt(c)))
                    {
                        count++;

                    }
                    else{
                        break;
                    }

                }
                temp=str.substring(i,i+count);
                 sum=sum+Integer.parseInt(temp);

            }
			
		}return sum;
		}

	}

}