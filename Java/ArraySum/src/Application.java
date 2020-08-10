import java.util.HashMap;

public class Application {

	public static void findPairs(int sumToFind, HashMap<Integer,Integer> map) {
		
		for (Integer key : map.keySet()) {
			
			int pairToFind = sumToFind - key;
			boolean isPair = map.containsKey(pairToFind);
			
			if(isPair == true) {
				System.out.println(key + " -> " + pairToFind);
			}
			
		
		
	
			//System.out.println(key);
		}
		
			
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sumToFind = 10;
		int[] set = new int[] { 1, 2, 3, 5, 8 };

		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int i = 0; i < set.length; ++i) {
			map.put(set[i], set[i]);
		}

		// System.out.println(map);

		findPairs(sumToFind, map);

	}

}
