package Math;


import java.util.Arrays;

public class triangle {
	/*
	 * 
给定由一些正数（代表长度）组成的数组 A，返回由其中三个长度组成的、面积不为零的三角形的最大周长。

如果不能形成任何面积不为零的三角形，返回 0。
	 */
	
		/***
		 * 直接从大到小进行搜索即可找打边界最大的周长
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
