public class Lockers {
  public static void main(String[] args) {
		boolean [] locker = new boolean [1024];//Array to hold lockers 0-1023 initialized to all be closed
		for (int i = 1; i<=1024; i++){//Person (i) goes through the lockers
			for (int j = 0; j < locker.length; j+=i){ //The lockers are flipped
				if (locker[j] == false) //Checks if locker is closed
					locker[j] = true; //Opens locker
				else//Checks if locker is open
					locker [j] = false;//Closes locker
			}
		}for (int i = 0; i < locker.length; i++){//Goes through the array lockers to output
			if (locker[i]==true)//Checks if locker is open
				System.out.println(i + " " + "open"); //Outputs that locker is open
			else//Checks if locker is closed
				System.out.println(i + " " + "closed");//Outputs that locker is closed
		}		
	}

}
