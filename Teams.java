//Regan Koopmans - 15043143 - Feb 2016

import java.util.ArrayList;
import java.util.Collections;


public class Teams {
    
    public static ArrayList<Integer> team1 = new ArrayList<Integer>();
    public static ArrayList<Integer> team2 = new ArrayList<Integer>();
    public static int minDiff;
    public static boolean[] myTeam;
    public static int[]members;

    
    public Teams(int[] iArr)
    {
        minDiff = Integer.MAX_VALUE;
        members = iArr;
        myTeam = new boolean[iArr.length];

    }
    
    public void solve(int index)
    {
		
		updateLists();

		if (myTeam.length == 1) 
		{
			minDiff = members[index];
			updateLists();
			return;
		}

		if (myTeam.length == 2)
		{
			myTeam[index] = true; 
			minDiff = Math.abs(members[0]-members[1]);
			updateLists();
			return;
		}
		
		if (index+1 >= myTeam.length) return;
		
		if (getDiffTeamStrength() < minDiff)
			minDiff	= getDiffTeamStrength();

		myTeam[index] = true;
		solve(index+1);	
		int left = getDiffTeamStrength();
		myTeam[index] = false;
		solve(index+1);
		int right =getDiffTeamStrength();

		if (left <= right)
		{
			myTeam[index] = true;
			solve(index+1);
		}
		else 
		{
			myTeam[index] = false;
			solve(index+1);
		}
		
		updateLists();
    }
    
    public void updateLists()
    {
        ArrayList<Integer> tempLeft = new ArrayList<Integer>();
        ArrayList<Integer> tempRight = new ArrayList<Integer>();
        int i = 0;
        
        for(boolean item:myTeam)
        {
            if(item == true)
            {
                tempLeft.add(members[i]);
            }
            else
            {
                tempRight.add(members[i]);
            }
            i++;
        }
        team1 = tempLeft;
        team2 = tempRight;
    }
    
    public void print()
    {
        Collections.sort(team1);
        Collections.sort(team2);
        System.out.println(team1);
        System.out.println(team2);
        System.out.println("Difference between sets is: " + minDiff);
    }
    
    public int getDiffTeamStrength()
    {
        int team1Sum,team2Sum;
        int i = team1Sum = team2Sum = 0;
        
        for(boolean item:myTeam)
        {
            if(item == true)
            {
                team1Sum += members[i];
            }
            else
            {
                team2Sum += members[i];
            }
            i++;
        }
        return Math.abs(team1Sum - team2Sum);   
    }  
}
