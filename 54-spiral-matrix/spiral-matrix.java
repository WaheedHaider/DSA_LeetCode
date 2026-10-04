class Solution {
    public List<Integer> spiralOrder(int[][] a) {
        List<Integer> list=new ArrayList<>();
        int m=a.length;
        int n=a[0].length;
        int top=0;
        int bottom=m-1;
        int left=0;
        int right=n-1;
        while(top<=bottom && left<=right){
            for(int i=left;i<=right;i++){
                list.add(a[top][i]);
            }
            top++;
            for(int i=top;i<=bottom;i++){
                list.add(a[i][right]);
            }
            right--;
            if(top<=bottom){
                for(int i=right;i>=left;i--){
                    list.add(a[bottom][i]);
                }
                bottom--;
            }
            if(left<=right){
                for(int i=bottom;i>=top;i--){
                    list.add(a[i][left]);
                }
                left++;
            }
        }
        return list;
    }
}