package Arrays;

class SparseArray {
    public int maxProfit(int[] prices) {
        //111111111
        //2222222
        //h1111111
        //h1111111
        //pull test
        
        int index1=0;
        int index2=prices.length-1;
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        while(true){
            if(prices[index1]<min){
                min=prices[index1];
                index1++;
            }
            if(index1==index2)break;
            if(prices[index2]>max){
                max=prices[index2];
                index2--;
            }
            if(index1==index2)break;
        }
        if(max>min)return max=min;
        else return 0;
    }
}
