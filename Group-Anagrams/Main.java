class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        
        for (String s : strs) {
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars); 
            
            map.computeIfAbsent(key, x -> new ArrayList<>()).add(s); // если key есть в map то добавим значение, если нету то создаем новый arrayList и добавляем новое значение
        }
        
        return new ArrayList<>(map.values());
    }
}
