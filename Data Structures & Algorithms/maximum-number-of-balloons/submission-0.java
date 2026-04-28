class Solution {
    public int maxNumberOfBalloons(String text) {
        HashMap<Character, Integer> word = new HashMap<>();
        word.put('b', 1);
        word.put('a', 1);
        word.put('l', 2);
        word.put('o', 2);
        word.put('n', 1);

        HashMap<Character, Integer> track = new HashMap<>();
        for(char c : text.toCharArray()){
            if(word.containsKey(c)){
                track.put(c, track.getOrDefault(c, 0) + 1);
            }
        }

        int min = Integer.MAX_VALUE;
        for(Map.Entry<Character, Integer> entry : track.entrySet()){
            if(entry.getKey() == 'l' || entry.getKey() == 'o'){
                entry.setValue(entry.getValue() / 2);
            }
            min = Math.min(min, entry.getValue());
        }

        return min;
    }
}