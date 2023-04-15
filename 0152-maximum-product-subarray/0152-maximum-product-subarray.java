class Solution {
    public int maxProduct(int[] arr) {
        int prod1=arr[0], prod2=arr[0], res=arr[0];

				for(int i=1;i<arr.length;i++){
					int temp=Math.max(arr[i],Math.max(arr[i]*prod1,arr[i]*prod2));
					prod2=Math.min(arr[i],Math.min(arr[i]*prod1,arr[i]*prod2));
					prod1=temp;
					
					res=Math.max(res,prod1);
				}
				return res;
    }
}