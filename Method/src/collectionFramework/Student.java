package collectionFramework;
import java.util.ArrayList;
public class Student {
int id;
String name;

   public Student(int id,String name)
   {
	   this.id=id;
	   this.name=name;
   }

@Override
public String toString() {
	return "Student [id=" + id + ", name=" + name + "]";
}
   public static void main(String[] args) {
	ArrayList<Object>al=new ArrayList<Object>();
	al.add(new Employee("abc12",65900d,1234567l));
	al.add(new Student(1234,"sam"));
	al.add(new Employee("2344",4568d,45678l));
	for(Object i:al)
	{
		System.out.println(i);
	}
}
}
