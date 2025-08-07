package seleniumpackage;

public class Rev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "Aman";
		String reverse = "";

		        for (int i = input.length() - 1; i >= 0; i--) 
		        {
		            char c1 = input.charAt(i);
		            reverse = reverse + c1;
		        }

		        System.out.println(reverse);



	}

}
