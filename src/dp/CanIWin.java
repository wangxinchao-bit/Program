package dp;

public class CanIWin {
	/**
	 * @Description:
	 * ����״̬������������д��ݡ��ڵݹ鵱�л��ܵ��ı䣬����׼ȷ��λ��ǰ״̬�������ڴ˴���Int��λ��ʾ״̬��1��ʾ�ù�,0��ʾδ�ù���
	 * �������DP״̬ѹ���ķ�ʽ��˼����������ƣ�ֻ�������״̬��ѹ������һ��bitArray��
	 * ״̬ѹ�������ǿ����ö����Ƶĵ�iλ��0����1����ʾi������ֵ�ѡȡ��������������ֵ�ѡȡ״̬�Ϳ�����һ�������ܷ���ı�ʾ��
	 * ��Ŀ˵�˲�����20λ����������Ϳ�����һ��int����ʾ״̬state��ͨ��state���ж�״̬�Ƿ�һ�£��������м��仯�Ĵ�ȡ
	 */

	  public boolean canIWin(int maxChoosableInteger, int desiredTotal) {

	        if (maxChoosableInteger >= desiredTotal) return true;
	        if ((1 + maxChoosableInteger) * maxChoosableInteger / 2 < desiredTotal) return false;
	        /**
	         *  dp��ʾ"ÿ��"ȡ��(A��B��ͬ���õĽ��)״̬�µ���Ӯ
	                 *  ����ֻ��1,2������ѡ����ô (1 << 2) - 1 = 4 - 1 = 3��״̬��ʾ��
	         *  01,10,11�ֱ��ʾ��A��B�Ѿ�ѡ��1���Ѿ�ѡ��2���Ѿ�ѡ��1��2״̬�£�A����Ӯ���
	                *  ���ҿɼ������ʾ����״̬��dp�����ÿ��״̬Ԫ�صĳ���ΪmaxChoosableIntegerλ�Ķ�������
	         */
	        Boolean[] dp = new Boolean[(1 << maxChoosableInteger) - 1];
	        return dfs(maxChoosableInteger, desiredTotal, 0, dp);
	    }

	    /**
	     * @param maxChoosableInteger ѡ������ķ�Χ[1,2,...maxChoosableInteger]
	     * @param desiredTotal Ŀ���
	     * @param state ��ǰ״̬��ʮ���Ʊ�ʾ����¼�ſ��ܲ�ֹһ������ѡ���״̬��
	     * @param dp ��¼����״̬
	     * @return
	     */
	    private boolean dfs(int maxChoosableInteger, int desiredTotal, int state, Boolean[] dp) {
	        if (dp[state] != null)
	            return dp[state];
	        /**
	         * ����maxChoosableInteger=2��ѡ�����ֻ��1,2������������ֻҪ��λ�Ϳ��Ա�ʾ���ǵ�ѡ��״̬
	         * ���λΪ2����2λ����Ҳ����1 << (2 - 1)�Ľ������������λ���Ա�ʾΪ  1 << (maxChoosableInteger - 1)
	         * ��С��λ���Ա�ʾΪ 1 << (1 - 1)��Ҳ����1����1λ��
	         * ����i��ʾ���ŵķ�Χ
	         */
	        for (int i = 1; i <= maxChoosableInteger; i++){
	            //��ǰ�������λ�������tmpʮ����ֻ��һλΪ1�������ж���Ϊ1��λ������state�Ƿ�Ҳ���ڸ�λ��Ϊ1
	            //���Ա�ʾ��λ�����֣��Ƿ�ʹ�ù�
	            /**
	             * (&������򣬶�1��Ϊ1)
	             * ����,i=3, tmp = 4, state = 3;
	             *  100
	             * &011
	             * =0  ��ʾ��λû�б�ʹ�ù���Ҳ���ǵ���λû�б�ʹ�ù���������3 (i)û�б�ʹ�ù�
	             */
	            int tmp = (1 << (i - 1));
	            if ((tmp & state) == 0){  //��λû�б�ʹ�ù�
	                //�����ǰѡ��i�Ѿ�Ӯ�˻���ѡ��i��ûӮ���Ǻ���Է�ѡ������,tmp|state��ʾ����״̬�ĸ���
	                /**
	                 * ����
	                 *  100
	                 * |011
	                 * =111
	                 */
	                //ע�����ﲢû�������һ������״̬��(��ֵ����)���¡�����
	                //��ʵ�����������˻��ݵģ�����ͨ���������ݸ��º��state
	                //������������������������state����û�н��и��µģ�����
	                //���൱�ڻ�����״̬��
	                if (desiredTotal - i <= 0 || !dfs(maxChoosableInteger, desiredTotal - i, tmp|state, dp)) {
	                    dp[state] = true;
	                    return true;
	                }
	            }
	        }
	        //�����Ӯ����
	        dp[state] = false;
	        return false;
	    }
	    
	public static void main(String[] args) {
		

	}

}
