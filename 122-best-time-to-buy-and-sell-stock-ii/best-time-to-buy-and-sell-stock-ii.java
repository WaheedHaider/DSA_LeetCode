class Solution {
    public int maxProfit(int[] a) {
        if(a.length==1) return 0;
        int i=0,j=1,sum=0;
        while(j<a.length){
            if(a[i]<a[j]) sum=sum+(a[j]-a[i]);
            i++;
            j++;
        }
        return sum;
    }
}