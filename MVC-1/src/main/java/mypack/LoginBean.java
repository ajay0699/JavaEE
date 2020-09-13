package mypack;

public class LoginBean {
	public boolean check(String name,String pass)
	{
		if(name.equalsIgnoreCase("Scott") && pass.equalsIgnoreCase("tiger"))
		{
			return true;
		}else {
			return false;
		}
	}
}
