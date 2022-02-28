package inner_class;

public class SingletonMain {

	public static void main(String[] args) {
		
		SingletonClass o=SingletonClass.getInstance();
		o.show();
		
		SingletonClass o1=SingletonClass.getInstance();
		o1.show();
		

	}

}
