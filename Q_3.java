import java.util.HashMap;

public class Q_3 {

    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()) return false;
        int[] s_freq = new int[26];
        int[] t_freq=  new int[26];
        for(int i = 0; i < s.length(); ++i){
            s_freq[s.charAt(i) - 'a']++;
            t_freq[t.charAt(i) - 'a']++;
        }

        HashMap<Integer,Integer> s_map = new HashMap<>();
        HashMap<Integer,Integer> t_map = new HashMap<>();
        for(int i = 0; i < s_freq.length; ++i){
            if(s_freq[i] != 0){
                s_map.put(i, s_map.getOrDefault(i,0) + 1);
            }

            if(t_freq[i] != 0){
                t_map.put(i,t_map.getOrDefault(i,0) + 1);
            }
        }

        for(int key: t_map.keySet()){
            if(!s_map.containsKey(key) || s_map.get(key) != t_map.get(key)) return false;
        }

        return true;

    }

}
