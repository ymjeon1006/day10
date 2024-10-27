package etc;


import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex02 {
	public static void main(String[] args) {
		long time = System.currentTimeMillis();
		System.out.println(time);
		
		SimpleDateFormat sim = new SimpleDateFormat("yyyy년 MM월 dd일 aa hh-mm-ss초");//형식 틀잡기
		String t = sim.format(time);//형식바꿔서 실행
		System.out.println(t);
		
		Date date = new Date();//다른형식
		System.out.println(date);
		System.out.println(sim.format(date));
	}
}