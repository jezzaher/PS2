//Jaouad Ezzaher
public class MyInteger {
	
	private int value;
	
	
	
	public MyInteger(int value){
		value=value;
	}
	public int getValue(){
		return value;	
	}
	public boolean isEven(){
			return (value%2==0);	
	}
	public boolean isOdd(){
			return (value%2!=0);	
	}
	public boolean IsPrime(){
		 if (value == 2 ||value == 3) {
	            return true;
	        }
	        if (value % 2 == 0) {
	            return false;
	        }
	        int sqrt = (int) Math.sqrt(value) + 1;
	        for (int i = 3; i < sqrt; i += 2) {
	            if (value % i == 0) {
	                return false;
	            }
	        }
	        return true;
	}
	public static boolean IsEven(int value){
		return (value%2==0);
	}
	public static boolean IsOdd(int value){
		return (value%2!=0);
	}
	public static boolean IsPrime(int value){
		for (int f = 2; f < value / 2; f++) {
			if (value % f == 0) {
				 return false;
				 }
			}
		return true;
}
	public static boolean IsEven(MyInteger Myint){
		return Myint.isEven();
	}
	public static boolean IsOdd(MyInteger Myint){
		return Myint.isOdd();
	}
	public static boolean IsPrime(MyInteger Myint){
		return Myint.IsPrime();
}
	public boolean equals(int value1) {
		return value == value1;
}
	public boolean equals(MyInteger myInt) {
		return equals(myInt.getValue());
	}
	public static int parseInt(char[] chr) {
		return Integer.parseInt(new String(chr));
	}
	public static int parseInt(String str) {
		return Integer.parseInt(str);
	}
	
}