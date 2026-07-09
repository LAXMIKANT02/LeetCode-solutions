class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        int l=arr.length-1;
        int min=arr[l]-arr[l-1];
        for(int i=1;i<arr.length;i++){
            int min_a=arr[i]-arr[i-1];
            if(min_a<min){
                min=min_a;
            }
        }
        List<List<Integer>> result=new ArrayList<>();
        for(int i=1;i<arr.length;i++){
            if(arr[i]-arr[i-1]==min){
                result.add(Arrays.asList(arr[i-1],arr[i]));
            }
        }
        return result;
    }
}