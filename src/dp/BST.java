package dp;

public class BST {
	
/***
 * 计算1、2、3...n个数BST的个数
 * 
 * @param n
 * @return
 */
	public int numTrees(int n) {
		
		int []count = new int[n+1];
		
		count[0]=1;
		
		count[1]=1;
	    
		for (int i = 2; i <= n; ++i) {
	    
			for (int j = 1; j <= i; ++j) {
	        
				count[i] += count[j - 1] * count[i - j];
	            }
	        }
	    
	    return count[n];
	   
	}

	/***
	 * 主函数 main
	 * @param args
	 */
	public static void main(String[] args) {
		
		BST tree_BST_count = new BST();
		
		int count = tree_BST_count.numTrees(3);
		
		System.out.println(count);
	}

}
