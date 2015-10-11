import java.util.HashSet;

public class ContainsDuplicate {
	public boolean containsDuplicate(int[] nums) {
		
		HashSet<Integer> integerSet = new HashSet<Integer>();
		for(int i : nums){
			if (!integerSet.add(i))
				return true;
		}
		return false;
    }
}
