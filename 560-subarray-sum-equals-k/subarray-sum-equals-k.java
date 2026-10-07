class Solution {
    public int subarraySum(int[] a, int k) {
        int n=a.length,count=0;
        for(int i=0;i<n;i++){
            int sum=a[i];
            if(sum==k){ count++;}
            for(int j=i+1;j<n;j++){
                sum+=a[j];
                if(sum==k) count++;
            }
        }
        return count;
    }
}