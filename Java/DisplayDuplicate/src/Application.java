import java.util.HashMap;
import java.util.Iterator;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] set = new int[] {1,3,6,3,7,7,2,8,10};
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
		
		for(int i=0; i<set.length;++i) {
			boolean isContains = map.containsKey(set[i]);
			
			if(isContains == false) {
				map.put(set[i], 1);
			}else {
				int value = map.get(set[i]);
				map.put(set[i], value + 1);
			}
		}
		
		System.out.println(map);
		
		for (Integer key : map.keySet()) {
			int value = map.get(key);
			
			if(value > 1) {
				System.out.println(key);
			}
			//System.out.println(value);
		   // System.out.println(key);
		}
		
	
			
			
			
			

	}

}
