package Math;

public class Roman2number {
	
	
		/**
		 * 静态方法是类方法
		 * @param s
		 * @return
		 */
	   public static int romanToInt(String s) {
		      int sum = 0;
		        int preNum = getValue(s.charAt(0));
		        for(int i = 1;i < s.length(); i ++) {
		            int num = getValue(s.charAt(i));
		            if(preNum < num) {
		                sum -= preNum;
		            } else {
		                sum += preNum;
		            }
		            preNum = num;
		        }
		        sum += preNum;
		        return sum;
				   
	   }
	   public static int getValue(char s) {
		   int num =0;
		   switch (s) {
		   case 'I' :num =1; break;  
		   case 'V' :num =5; break;  
		   case 'X' :num =10; break;  
		   case 'L' :num =50; break;  
		   case 'C' :num =100; break;  
		   case 'D' :num =500; break;  
		   case 'M' :num =1000; break;  
		   default: num =0;break;
		   }
		   return num;
	   }
	   
	   public static void main(String[] args) {
		   System.out.println(Roman2number.romanToInt("IVXL"));
		   
		   
	   }
	   
	   }

