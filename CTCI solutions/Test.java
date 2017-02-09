import java.util.*;
class MaxPossibleTime 
{

	List<Integer> calc(List<Integer> input) {
        List<Integer> output = new ArrayList<Integer>();
        Collections.sort(input, Collections.reverseOrder());
		System.out.println("input:"+input);
		System.out.println("output:"+output);
        if (findSolutions(0, output, input)) {
            return output;
        } else {
            return null;
        }
    }

    boolean findSolutions(int n, List<Integer> output, List<Integer> input) {

        if (output.size() == 4) {
            System.out.println(output);
            return true;
        }

        for (int i=0; i<input.size(); i++) {
            Integer val = input.get(i);
			System.out.println("isValid(val, n, output::"+isValid(val, n, output));
            if (isValid(val, n, output)) {
                applyValue(val, n, output);
                List<Integer> newInput = new ArrayList<Integer>();
                for (int j=0; j<input.size(); j++) {
                    if ( i != j) {
                        newInput.add(input.get(j));
                    }
                }
				System.out.println("newInput"+newInput);
                if (findSolutions(n+1, output, newInput))
                    return true;
                removeValue(val, n, output);
            }
        }
        return false;
    }


    boolean isValid(Integer value, int n,  List<Integer> output){
        return isGoodCandidate(output, value);
    }

    void applyValue(Integer value, int n,  List<Integer> output){
        if (output.size() > n)
            output.set(n, value);
        else
            output.add(n, value);
    }

    void removeValue(Integer value, int n,  List<Integer> output){
        output.remove(n);
    }

    boolean isGoodCandidate(List<Integer> result, Integer candidate){
        if (result.isEmpty()) {
            return checkH1(result, candidate);
        } else if (result.size()==1) {
            return checkH2(result, candidate);
        } else if (result.size()==2) {
            return checkM1(result, candidate);
        } else if (result.size()==3) {
            return checkM2(result, candidate);
        }
        return false;
    }

    boolean checkH1(List<Integer> result, Integer candidate){
        return candidate>=0 && candidate<=2;
    }

    boolean checkH2(List<Integer> result, Integer candidate){
        Integer d1 = result.get(0);
        Integer d2 = candidate;
        if (d1 == 2 && d2 > 3) {
            return false;
        } else if (d2 < 0 || d2 > 9) {
            return false;
        }
        return true;
    }

    boolean checkM1(List<Integer> result, Integer candidate){
        Integer d3 = candidate;
        if (d3 < 0 || d3 > 5) {
            return false;
        }
        return true;
    }

    boolean checkM2(List<Integer> result, Integer candidate){
        Integer d4 = candidate;
        if (d4 < 0 || d4 > 9) {
            return false;
        }
        return true;
    }

}
public class Test
{
	public static void main (String args[])
	{
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		
		List<Integer> li = new ArrayList<Integer>();
		li.add(a);
		li.add(b);
		li.add(c);
		li.add(d);
		MaxPossibleTime mt = new MaxPossibleTime();
		mt.calc(li);
	}

}