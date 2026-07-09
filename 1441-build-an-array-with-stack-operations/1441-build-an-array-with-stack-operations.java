class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String> ops = new ArrayList<>();
        int i=0;
        for(int num=1; num<=n; num++){
            if(i==target.length) break;
            if(num == target[i]){
                ops.add("Push");
                i++;
            }else{
                ops.add("Push");
                ops.add("Pop");
            }
        }
        return ops;
    }
}