class Solution {
    public void rotate(int[][] a) {
        int n=a.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i<j){
                    int temp=a[i][j];
                    a[i][j]=a[j][i];
                    a[j][i]=temp;
                }
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n/2;j++){
                int tmp=a[i][j];
                a[i][j]=a[i][n-1-j];
                a[i][n-1-j]=tmp;
            }
        }
    }
}