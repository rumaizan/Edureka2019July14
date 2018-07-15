
public class Choices {

	public static void main(String[] args) {
		
		// Code here in the main method
		
		System.out.println("=============If/Else===============");
		
		byte age = 2;
		
		if(age > 18){
			System.out.println("You can Vote");
		}else{
			System.out.println("You cannot Vote");
		}
		
		System.out.println("=============Nested If/Else===============");
		
		boolean isInternetEnabled = true;
		boolean isGPSEnabled = false;
		
		// Nested If/Else
		/*if(isInternetEnabled){
			if(isGPSEnabled){
				System.out.println("You can use Google Maps");
			}else{
				System.out.println("Enable GPS to Use Google Maps !!");
			}
		}else{
			System.out.println("Enable Internet to Use Google Maps !!");
		}*/
		
		if(isInternetEnabled && isGPSEnabled){
			System.out.println("You can use Google Maps");
		}else{
			System.out.println("Internet or GPS is disabled !! Enable both to Use Google Maps !!");
		}
		
		System.out.println("=============Ladder If/Else===============");
		
		// Assuming:
		// 1 is UberGo
		// 2 is UberX
		// 3 is UberMoto
		
		int cabType = 100;
		
		if(cabType == 1){
			System.out.println("Your UberGo is booked. Its on the Way");
		}else if(cabType == 2){
			System.out.println("Your UberX is booked. Its on the Way");
		}else if(cabType == 3){
			System.out.println("Your UberMoto is booked. Its on the Way");
		}else{
			System.out.println("Please Select the type of Cab before booking !!");
		}
		
	}

}
