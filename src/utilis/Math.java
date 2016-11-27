package utilis;

public class Math {

	public Math() {
		}
 public static int factorial(int num){
	 if(num==0)
		 return 1;
	 else
	 return num*factorial(num-1);
	 }
 public static int factorialLoop(int value){
	 int result=1;
	 for(int i=1;i<=value;i++){
		 result = result*i;
	 }
	 return result;
	 }
}
