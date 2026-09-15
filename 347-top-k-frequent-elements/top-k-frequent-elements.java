class Solution {
    public int[] topKFrequent(int[] a, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<a.length;i++){
            map.put(a[i], map.getOrDefault(a[i],0)+1);
        }
        List<Integer>[] bucket=new List[a.length+1];
        for(int num : map.keySet()){
            int freq=map.get(num);
            if(bucket[freq]==null) bucket[freq]=new ArrayList<>();
            bucket[freq].add(num);
        }
        int counter=0;
        int b[]=new int[k];
        for(int i=bucket.length-1; i>=0 && counter<k; i--){
            if(bucket[i]!=null){
                for(int num : bucket[i]){
                  b[counter]=num;
                  counter++;  
                  if(counter==k) return b;
                }
            }
        }
        return b;
    }
}