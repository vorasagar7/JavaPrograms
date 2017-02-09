import java.util.*;
public class FindDisappearedNumbersInArray 
{
    public static List<Integer> findDisappearedNumbers(int[] nums) {
		List<Integer> l = new ArrayList<Integer>();
		for(int i=0;i<nums.length;i++)
		{
			int val = Math.abs(nums[i]) - 1; 
			if(val >= 0 && nums[val] >= 0)
			{
				nums[val] = -nums[val];
			}
		}
		for(int i=0;i<nums.length;i++)
		{
			if(nums[i] >= 0)
				l.add(i+1);
		}
        return l;
    } 
	public static void main (String args[])
	{
		int []sumArray = {1,2,3,1,4};
		List li = findDisappearedNumbers(sumArray);
		System.out.println(li);
	}
}