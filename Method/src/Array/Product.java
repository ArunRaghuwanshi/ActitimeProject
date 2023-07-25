package Array;

public class Product {
      int pid;
      String brand;
      float price;
       public Product(int pid,String brand,float price)
      {
    	  this.pid=pid;
    	  this.brand=brand;
    	  this.price=price;
      }
       public String toString()
       {
     	   Object ob= new Object ();
     	  return pid+" "+brand+" "+price;
       }  
      public boolean equals(Product p3)
      {
    	  if(this.brand.equals(p3.brand))
    		  return true;
    	  else
    		  return false;
      }
        public static void main(String[] args) {
		Product p1=new Product(103,"Cello",4523.1f);
		Product p2=new Product(103,"Raymond",3214f);
		Product p3=new Product(104,"Cello",142.f);
		System.out.println(p2.equals(p1));
		System.out.println(p2);
		System.out.println(p1.equals(p3));
	
        }
}



		
