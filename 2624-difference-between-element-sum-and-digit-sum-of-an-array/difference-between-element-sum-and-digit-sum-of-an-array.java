class Solution {
    public int differenceOfSum(int[] a) {
        int sum1=0,sum2=0;
        for(int i=0;i<a.length;i++){
            sum1+=a[i];
        }
        for(int i=0;i<a.length;i++){
            if(a[i]<10) sum2+=a[i];
            else{
                int temp=a[i];
                while(temp>0){
                    int rem=temp%10;
                    sum2+=rem;
                    temp/=10;
                }
            }
        }
        return Math.abs(sum1-sum2);
    }
}