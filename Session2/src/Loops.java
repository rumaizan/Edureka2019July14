
public class Loops {

	public static void main(String[] args) {
		
		int num = 5;
		int i = 100;
		
		// Table of a Number
		/*System.out.println(num+" "+i+"'s are "+(num*i));
		i++;
		System.out.println(num+" "+i+"'s are "+(num*i));
		i++;
		System.out.println(num+" "+i+"'s are "+(num*i));
		i++;
		System.out.println(num+" "+i+"'s are "+(num*i));
		i++;
		System.out.println(num+" "+i+"'s are "+(num*i));
		i++;
		System.out.println(num+" "+i+"'s are "+(num*i));
		i++;
		System.out.println(num+" "+i+"'s are "+(num*i));
		i++;
		System.out.println(num+" "+i+"'s are "+(num*i));
		i++;
		System.out.println(num+" "+i+"'s are "+(num*i));
		i++;
		System.out.println(num+" "+i+"'s are "+(num*i));*/
		
		System.out.println("*****while*****");
		
		while(i<=10){ // Entry Condition Check
			System.out.println(num+" "+i+"'s are "+(num*i));
			System.out.println("------------");
			i++;
		}
		
		System.out.println("num is "+num);
		System.out.println("i is "+i);
		
		System.out.println("*****do while*****");
		
		num = 7;
		i = 100;
		
		// Since Condition is checked in the end, one false case would be executed
		do{
			System.out.println(num+" "+i+"'s are "+(num*i));
			System.out.println("------------");
			i++;
		}while(i<=10); // Exit Condition Check
		
		
		System.out.println("*****for*****"); // Similar working as of while, But Syntatically its more easier
		
		num = 9;
		for(int j=1;j<=10;j++){
			System.out.println(num+" "+j+"'s are "+(num*j));
		}

		/*
		 * 	Complex Loop
			System.out.println("*****************");
			num = 11;
			for(int j=1,k=1;j<=10 && k<=10;j++,k++){
				System.out.println(num+" "+j+"'s are "+(num*j));
				System.out.println((num+1)+" "+k+"'s are "+((num+1)*k));
			}
		*/
		
		// Nested Loops
		System.out.println("*****************");
		for(int x = 1;x <= 3; x++){
			System.out.println("For x: "+x);
			for(int y = 1; y <= 5; y++){
				System.out.print(y+" ");
			}
			System.out.println();
			
			if(x==2){
				break; // terminate & exit from the loop
			}
			
		}
		
		// explore -> break and continue
		
	}

}
