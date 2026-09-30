class Solution {
    public int[] rearrangeArray(int[] a) {
        int b[]=new int[a.length];
        int pos=0,neg=1;
        for(int num : a){
            if(num<0){
                b[neg]=num; neg+=2;
            }
            else{
                b[pos]=num; pos+=2;
            }
        }
        return b;
    }
}