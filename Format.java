package javaprogram;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Format {
	public static void main(String[] args) {
		System.out.println("current date : " + new Date());
		SimpleDateFormat sdf=new
		SimpleDateFormat("yyyy/MM/dd");
		System.out.format("Date : "+sdf.format(new Date()));
	}
}
  