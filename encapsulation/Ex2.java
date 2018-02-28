package encapsulation;

public class Ex2 {
	
	private String name;
	
	public void getName()
	{
		System.out.println(name);
	}
	
	public void setName(String name)
	{
		this.name=name;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Ex2 obj=new Ex2();
obj.setName("ram");
obj.getName();
	}

}
