package Math;

public class cardDivide {
/***
 * ���Ʒ���
 */
	
	 public boolean hasGroupsSizeX(int[] deck) {
		 
		 
		 //���ÿ��Ԫ�صĸ���
	        int[] count = new int[10000];
	        for (int c: deck)
	            count[c]++;

	     
	        int g = -1;
	        for (int i = 0; i < 10000; ++i)
	            if (count[i] > 0) {
	                if (g == -1)
	                    g = count[i];
	                else
	                    g = gcd(g, count[i]);
	            }

	        return g >= 2;
	    }
	 
	 
	   //շת�����
	    public int gcd(int x, int y) {
	        return x == 0 ? y : gcd(y%x, x);
	    }

		public static void main(String[] args) {
			
			cardDivide card= new cardDivide();
			int result = card.gcd(48,20);
			System.out.println(result);
			
		}
		

}
