class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> res=new Stack<Integer>();
        for(int i=0;i<asteroids.length;i++){
            if(res.isEmpty() || asteroids[i]>0){
                res.push(asteroids[i]);
            }else{
                while(true){
                    int peek=res.peek();
                    if(peek<0){
                        res.push(asteroids[i]);
                        break;
                    }else if(peek== -asteroids[i]){
                        res.pop();
                        break;
                    }else if(peek> -asteroids[i]){
                        break;
                    }else{
                        res.pop();
                        if(res.isEmpty()){
                            res.push(asteroids[i]);
                            break;
                        }
                    }
                }
            }
        }

        int arr[]=new int[res.size()];
        for(int i=arr.length-1;i>=0;i--){
            arr[i]=res.pop();
        }
        return arr;
    }
}