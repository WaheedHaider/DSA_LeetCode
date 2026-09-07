class Solution {
    public int maxProfit(int[] a) {
        int i=0,j=1,maxdiff=0;
        while(j<a.length){
            if(a[j]>a[i]) maxdiff=Math.max(a[j]-a[i],maxdiff);
            else i=j;
            j++;
        }
        return maxdiff;
    }
}