package java_sess;

public class ReferencingObjects {
	private int id;
	private String name;
	private int age;
	    public ReferencingObjects(Integer id,String name,Integer age)
	    {
	        this.id=id;
	        this.name=name;
	        this.age=age;
	    }
	    public void showData() {
	        System.out.println("ID:"+id+" "+"Name:"+name+" "+"Age:"+age);
	    }
	    public static void main(String args[])
	    {
	        ReferencingObjects cs1 = new ReferencingObjects(21,"John",23);
	        ReferencingObjects cs2 = new ReferencingObjects(21,"John",23);
	        System.out.println(cs1==cs2);
	    }
}
