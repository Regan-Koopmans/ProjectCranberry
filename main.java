//Regan Koopmans - 15043143 - Feb 2016

public class main {
	public static void main(String[] args) {	
            /* Task1 - Recursion warmup */
            
            Recursion task1 = new Recursion();
            System.out.println("==========Task1==============");
            System.out.print("Case 1:");
            System.out.println(task1.recursion(1));
            System.out.print("Case 2:");
            System.out.println(task1.recursion(6));
            System.out.print("Case 3:");
            System.out.println(task1.recursion(8));
            System.out.print("Case 4:");
            System.out.println(task1.recursion(11));

            System.out.println("==========Task2==============");
            int[] a = {3,4,5,-3,100,1,89,54,23,20};
            Teams task2 = new Teams(a);
            task2.solve(0);
            task2.print();
            int [] a2 = {21,20,5,18,8};
            Teams task22 = new Teams(a2);
            task22.solve(0);
            task22.print();

			
			int [] a3 = {3,4,5,-3,100,1,89,54,23,20};
			Teams task23 = new Teams(a3);
			task23.solve(0);
			task23.print();
		
		
		/*
			Below, you will find the expected output for the code above. 
			NOTE: These simple test cases are only intended to give you an idea of whether you are on the right track or not. 
			If your code gives all the output below correctly, that does not necessarily mean that you will receive good marks. 
			There might be some cases that are not tested by the code here, but are tested by Fitchfork.
			It is thus very important that once you get the output below, you also come up with your own test cases to make sure that all possible edge cases are covered.
			******************************************
			Expected output for Recursion
			******************************************
                        recursion
                        ==========Task1==============
                        Case 1:1
                        Case 2:6
                        Case 3:2
                        Case 4:3
			******************************************
			Expected output for the Teams 
			******************************************
                        ==========Task2==============
                        [-3, 3, 5, 54, 89]
                        [1, 4, 20, 23, 100]
                        Difference between sets is: 0
                        [18, 20]
                        [5, 8, 21]
                        Difference between sets is: 4
		*/
		
	}
	
	
}
