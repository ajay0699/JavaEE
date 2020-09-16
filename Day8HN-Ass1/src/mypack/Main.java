package mypack;
import org.hibernate.Session;
import org.hibernate.Transaction;
import java.util.*;
public class Main 
{
	public static void main(String[] args) {
		Session session = HibernateUtil.getSessionFactory().openSession(); 
        Transaction transaction = null; 
        try { 
            transaction = session.beginTransaction(); 
            Student p=new Student();
            p.setName("Ajay");
            p.setAge(75);
            p.setAdd("Mumbai");
        
            session.save(p);      
            transaction.commit(); 
            System.out.println("done with employees");  
 }
        catch(Exception ee)
        {
        	System.out.println("in catch\t"+ee);
        }
}





}