package Math;

public class theDayofOneYear {

	 public int dayOfYear(String date) {

		 /***
		  * ֱ�Ӳ������鷨ֱ�����Ӷ���������죻
		  *��Ҫ�ж��Ƿ�Ϊ���꣬���·��Ƿ����2��
		  */
	        int []monthDays={0,31,28,31,30,31,30,31,31,30,31,30};
	        int sum=0;
	        
	        //�ַ����ķָ�split�����õ�string�������飬��Python����
	        String[] split = date.split("-");
	        int day = Integer.parseInt(split[2]);
	        int month = Integer.parseInt(split[1]);
	        int year = Integer.parseInt(split[0]);
	        for (int i=0;i<month;i++)
	        {
	            sum += monthDays[i];
	        }
	        sum+= day;
	        if((year%400==0)||((year%4==0)&&(year%100!=0))){
	            if(month>2)sum++;
	        }
	        return sum;

	    }
	
}
