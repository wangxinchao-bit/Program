package Math;


import java.util.Arrays;

public class triangle {
	/*
	 * 
������һЩ�����������ȣ���ɵ����� A����������������������ɵġ������Ϊ��������ε�����ܳ���

��������γ��κ������Ϊ��������Σ����� 0��
	 */
	
		/***
		 * ֱ�ӴӴ�С�������������Ҵ�߽������ܳ�
		 * @param a
		 * @return
		 */
	    public int largestPerimeter(int[] a) {
	        if(a.length<3) return 0;
	        Arrays.sort(a);
	        
	        for(int i=a.length-3;i>=0;i--){
	            if(a[i]+a[i+1]>a[i+2]){
	                return a[i]+a[i+1]+a[i+2];
	            }
	        }
	        
	        return 0;
	    }
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
