package utilis;

public class Math {

	public Math() {
		}
 public static long factorial(int num){
	 if(num==0)
		 return 1;
	 else
	 return num*factorial(num-1);
	 }
 public static long factorialLoop(int value){
	 long result=1;
	 for(int i=1;i<=value;i++){
		 result = result*i;
	 }
	 return result;
	 }
}
