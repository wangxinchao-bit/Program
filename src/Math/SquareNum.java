package Math;

public class SquareNum {

	/***
	 * ���ַ��ж�һ�����Ƿ�Ϊ��ȫƽ����
	 * @param num
	 * @return
	 */
	
    public boolean isPerfectSquare(int num) {

    	//�˴���Ҫʹ��long �����������洢���ݣ�
    	//�Ӷ���������Ľ��
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
