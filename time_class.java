
public class time_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Apple a=new Apple();
		System.out.println(a.to_military());
		System.out.println(a.to_normal());
		a.set_time(13, 27, 6);
		System.out.println(a.to_military());
		System.out.println(a.to_normal());
		System.out.println(a.hour);

	
	}

}
