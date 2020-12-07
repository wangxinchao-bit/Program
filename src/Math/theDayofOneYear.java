package Math;

public class theDayofOneYear {

	 public int dayOfYear(String date) {

		 /***
		  * 直接采用数组法直接求解从而算出多少天；
		  *需要判断是否为闰年，且月份是否大于2月
		  */
	        int []monthDays={0,31,28,31,30,31,30,31,31,30,31,30};
	        int sum=0;
	        
	        //字符串的分割split函数得到string类型数组，与Python无异
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
