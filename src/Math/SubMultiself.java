package Math;

public class SubMultiself {
	
	/**
	 * 此问题是两数平方和问题
	 * @param c
	 * @return
	 */


    public boolean judgeSquareSum(int c) {
    	/***
    	 *@Description 直接使用算数的方法，直接遍历数组然后判断剩下的另一个数是否为整数即可
    	 * @result  结果时间超限
    	 * @param c
    	 * @return
    	 */
    	for (int i =0;i<= Math.sqrt(c);i++)
          {
              if(Math.sqrt(c-i*i)%1==0)
              return true;
          }
         return false;

      }
	
    public boolean _judgeSquareSum(int c) {
    	/***
    	 * @Description 双指针方法
    	 * 当 收尾指针和==结果的时候，则成立，否则< 则首指针增大，>尾指针减小
    	 */
        
       if (c < 0){
			return false;
		}
     	
       int start =0;
	   int end = (int) Math.sqrt(c);
	   
       while (start<=end){
           int res = start*start +end*end;
           if (res==c)return true;
           else if(res<c) start++;
           else end--;
       }
       
       return false;
    
    }
    
	public static void main(String[] args) {
		
		
		
}
}

