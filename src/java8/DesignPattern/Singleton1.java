package java8.DesignPattern;

public class Singleton1 implements Cloneable {

	private static Singleton1 s;

	private Singleton1() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public static Singleton1 getinstance() {
		synchronized (Singleton1.class) {
			if(s==null) {
				s=new Singleton1();
			}else {
				return s;
			}
		}
		return s;
	}
	
	@Override  
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return s;
	}

	public static void main(String[] args) throws CloneNotSupportedException {
		Singleton1 getinstance1 = Singleton1.getinstance();
		Singleton1 getinstance2 = (Singleton1) getinstance1.clone();
		System.out.println(getinstance1.hashCode());
		System.out.println(getinstance2.hashCode());
		
		

	}

}
