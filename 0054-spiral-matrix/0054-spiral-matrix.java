class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res=new ArrayList();
        int top=0,down=matrix.length-1,left=0,right=matrix[0].length-1;
        int dir=0;
        int i;
        while(top<=down && left<=right){
            if(dir==0){
                for(i=left;i<=right;i++){
                    res.add(matrix[top][i]);
                }
                top++;
            }else if(dir==1){
                for(i=top;i<=down;i++){
                    res.add(matrix[i][right]);
                }
                right--;
            }
            else if(dir==2){
                for(i=right;i>=left;i--){
                    res.add(matrix[down][i]);
                }
                down--;
            }
            else if(dir==3){
                for(i=down;i>=top;i--){
                    res.add(matrix[i][left]);
                }
                left++;
            }
            dir=(dir+1)%4;
        }
        return res;
    }
}