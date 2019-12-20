package torstring.com;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;

public class Ea6 {

	public static void main(String[] args) throws ParseException {
		LocalDate dqrq=LocalDate.now();
		LocalDate J_100=dqrq.plusDays(100);
		//System.out.prijtln(J_100);
		
		SimpleDateFormat sdf1=new SimpleDateFormat("yyyy-MM-dd");
		//将LocalDate对象的值改成String类的对象用toSTring方法
		String ybtyh_zfc=J_100.toString();
		//先通过SimpleDateFormat对一百天以后的字符串进行解析，用parse方法
		java.util.Date date_100=sdf1.parse(ybtyh_zfc);
		//再通过SimpleDateFormat对一百天以后的DAte对象进行格式化，用format方法
		SimpleDateFormat sdf2=new SimpleDateFormat("yyyy年M月dd日1");
		System.out.println("100天以后是"+sdf2.format(date_100));
		
		
		SimpleDateFormat sdf3=new SimpleDateFormat("yyyy/MM/dd");
		
		

	}

}
