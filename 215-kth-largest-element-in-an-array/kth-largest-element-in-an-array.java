class Solution {
    public int findKthLargest(int[] a, int k) {
        PriorityQueue<Integer> p=new PriorityQueue<>();
        for(int num : a){
            p.add(num);
        }
        int size=p.size();
        for(int i=0;i<(size-k);i++){
            p.poll();
        }
        return p.peek();
    }
}