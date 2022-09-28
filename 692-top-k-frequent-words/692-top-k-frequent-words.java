class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        if (words == null || words.length == 0) {
            return new ArrayList<String>();
        }

        Map<String, Integer> map = new HashMap();
        for (String s: words) {
            map.put(s, map.getOrDefault(s, 0) + 1);
        }

        List<String> candidates = new ArrayList(map.keySet());
        Collections.sort(candidates, (w1, w2) -> map.get(w1) != map.get(w2) ?
                map.get(w2) - map.get(w1) : w1.compareTo(w2));

        return candidates.subList(0, k);
    }
}