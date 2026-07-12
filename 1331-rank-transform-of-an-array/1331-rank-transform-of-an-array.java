class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int[] sortedArr = arr.clone();
        Arrays.sort(sortedArr);
        Map<Integer, Integer> rank = new HashMap<>();
        int Rank=1;
        for(int num : sortedArr){
            if(!rank.containsKey(num)){
                rank.put(num, Rank++);
            }
        }
        int[] ans = new int[arr.length];
        for(int i=0; i<arr.length; i++){
            ans[i]=rank.get(arr[i]);
        }
        return ans;
    }
}