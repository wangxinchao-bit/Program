package Math;

public class SubMultiself {
	
	/**
	 * ������������ƽ��������
	 * @param c
	 * @return
	 */


    public boolean judgeSquareSum(int c) {
    	/***
    	 *@Description ֱ��ʹ�������ķ�����ֱ�ӱ�������Ȼ���ж�ʣ�µ���һ�����Ƿ�Ϊ��������
    	 * @result  ���ʱ�䳬��
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
    	 * @Description ˫ָ�뷽��
    	 * �� ��βָ���==�����ʱ�������������< ����ָ������>βָ���С
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

