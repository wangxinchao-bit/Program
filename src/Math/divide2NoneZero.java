package Math;

public class divide2NoneZero {

	  public int[] getNoZeroIntegers(int n) {

		  for (int i =1;i<n;i++)
		  {
			  int other = n-i;
			  if((String.valueOf(n-i).indexOf('0') != -1) || (String.valueOf(i).indexOf('0') != -1))
	               	return new int [] {i,other};
		  }
		 
		  
	  }
	
}
