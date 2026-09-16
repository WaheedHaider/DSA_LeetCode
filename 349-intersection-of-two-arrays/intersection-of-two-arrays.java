class Solution {
    public int[] intersection(int[] a, int[] b) {
        HashSet<Integer> setA=new HashSet<>();
        HashSet<Integer> setB=new HashSet<>();
        for(int i=0;i<a.length;i++){ setA.add(a[i]);}
        for(int i=0;i<b.length;i++){
            if(setA.contains(b[i])) setB.add(b[i]);
        }
        int res[]=new int[setB.size()];
        int i=0;
        for(int num : setB){
            res[i++]= num;
        }
        return res;
    }
}