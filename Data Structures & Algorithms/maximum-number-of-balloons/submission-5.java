class Solution {
    public int maxNumberOfBalloons(String text) {
        HashSet<Character> word = new HashSet<>();
        word.add('b');
        word.add('a');
        word.add('l');
        word.add('o');
        word.add('n');

        HashMap<Character, Integer> track = new HashMap<>();
        for(char c : text.toCharArray()){
            if(word.contains(c)){
                track.put(c, track.getOrDefault(c, 0) + 1);
            }
        }

        if(track.isEmpty() || track.size() != 5){
           return 0; 
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