//Regan Koopmans - 15043143 - Feb 2016

public class Recursion 
{
    
	public int recursion(int num)
    {
        if (num <= 6) return num;
		else return 1 + recursion(recursion(num/2)-3); 
    }

    
}
