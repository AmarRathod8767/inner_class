package inner_class;

public class AnonymousMain1 {
    
	public static void main(String[]args) {
      AnonymousTexst obj=new AnonymousTexst() {
    	  @Override
    	  	void sum() {
    		  super.sum();
    	  		// TODO Auto-generated method stub
    	  		System.out.println("Hello");
    	  	}
	   
      };
      obj.sum();
     // AnonymousTexst obj1=new AnonymousTexst();
      
      //obj1.sum();
     
	}
}
