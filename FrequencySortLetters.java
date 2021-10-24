import java.util.*;
import java.lang.String;

class FrequencySortLetters {
    public static String frequencySort(String s) {
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        for(int i = 0; i< s.length(); i++)
        {
            if(map.containsKey(s.charAt(i)))
            {
                int present_count = map.get(s.charAt(i));
                map.replace(s.charAt(i), present_count + 1);
            }
            else
            {
                map.put(s.charAt(i), 1);
            }
        }
        List<Integer> freqs = new ArrayList<Integer>(map.values());
        
        Collections.sort(freqs, Collections.reverseOrder());
        String output = ""; 
        for(int f : freqs){
        	if(output.length()<s.length()){
	        for (char k : map.keySet())
	        {if (output.indexOf(k) == -1)
	        	if(map.get(k) == f){
	            for(int c = 1; c<= f; c++)
            	{
               		output = output + k;
            	}
            	}
	        }}
        }
        
    return output; 
    }
    public static void main(String[] args)
    {
    System.out.print(frequencySort("loveleetcode"));
    }
}