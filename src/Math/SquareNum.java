package Math;

public class SquareNum {

	/***
	 * 二分法判断一个数是否为完全平方数
	 * @param num
	 * @return
	 */
	
    public boolean isPerfectSquare(int num) {

    	//此处需要使用long 型数据用来存储数据，
    	//从而避免溢出的结果
        long start=1;
        long  end = num;
        while(start<=end)
        {
            long  middle = (start+end)/2;
            long  result = middle *middle;
            
            if(result==num) return true;
            else if(result>num) end=middle-1;
            else start=middle+1;
        }
        return false;
}
}
