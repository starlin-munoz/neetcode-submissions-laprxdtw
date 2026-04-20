class Solution {
    public boolean checkInclusion(String s1, String s2) {

        if(s2.length() < s1.length()){
            return false;
        }

        HashMap<Character, Integer> map = new HashMap<>();

        for(int i = 0; i < s1.length(); i++){
            map.put(s1.charAt(i), map.getOrDefault(s1.charAt(i), 0) + 1);
        }

        HashMap<Character, Integer> window = new HashMap<>();
        for(int i = 0; i < s1.length(); i++){
            window.put(s2.charAt(i), window.getOrDefault(s2.charAt(i), 0) + 1);
        }

        if(window.equals(map)){
            return true;
        }

        for(int i = s1.length(); i < s2.length(); i++){
            char incoming = s2.charAt(i);
            window.put(incoming, window.getOrDefault(incoming, 0) + 1);

            char outgoing = s2.charAt(i - s1.length());
            window.put(outgoing, window.get(outgoing) - 1);

            if(window.get(outgoing) == 0){
                window.remove(outgoing);
            }
            if(window.equals(map)){
                return true;
            }
        }
        return false;
    }
}
