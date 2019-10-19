
public class Apple {
	int hour;
	 int min;
	 int sec;
	public void set_time(int h,int m,int s)
	{
		hour=(h>=0 && h<24)? h:0;
		min=(m>=0 && m<60)? m:0;
		sec=(s>=0 && s<60)? s:0;
	}
	public String to_military(){
		return String.format("%02d:%02d:%02d", hour,min,sec);
				
	}
	public String to_normal(){
		return String.format("%d:%02d::%02d %s",((hour==0 || hour==12)?12:hour%12),min,sec,(hour<12?"AM":"PM"));
	}
}
