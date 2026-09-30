class Solution {
    public void nextPermutation(int[] a) {
        int n=a.length;
        if(n==1) return;
        int i=n-2,j=n-1;
        while(i>=0 && a[i]>=a[i+1]){ 
            i--;
        }
        if(i>=0){
            j=n-1;
            while(i<j){
                if(a[j]>a[i]){
                    int temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                    break;
                }
                j--;
            }
        }
        i++;
        j=n-1;
        while(i<j){
            int temp=a[i];
            a[i]=a[j];
            a[j]=temp;
            i++;j--;
        }
    }
}