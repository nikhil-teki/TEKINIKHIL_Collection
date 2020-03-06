package com.tekinikhil.collection;
import java.util.*;

public class App 
{
	private static class CustomCollectionList<T> extends AbstractList<T> {

	    private ArrayList<T> a=new ArrayList<>(10);

	    public T fetch(int index) 
	    {
	    	if(a.isEmpty())
	    		return null;
	        return a.get(index);
	    }
	    public T get(int index) 
	    {
	    	return a.get(index);
	    }
	    public void Add(T element) 
	    {
	        a.add(element);
	    }
	    public void Remove(T element)
	    {
	    	if((!a.isEmpty())&&a.contains(element))
	    		a.remove(element);
	    	else
	    		System.out.println("Warning : Either empty list or element not found");
	    }
	    public void Remove(int index)
	    {
	    	if(!a.isEmpty())
	    		a.remove(index);
	    	else
	    		System.out.println("Warning : Either empty list or element not found");
	    }
	    public void Print()
	    {
	    	for (T t:a)
	    	{
	    		System.out.println(t);
	    	}
	    	System.out.println();
	    }
	    public int size() 
	    {
	        return a.size();
	    }
	}
	public static void main( String[] args )
    {
        CustomCollectionList<String> ccl=new CustomCollectionList<>();
        Scanner scan=new Scanner(System.in);
        int ch,i;
        String s;
        while(true)
        {
        	System.out.println("=======MENU=======");
        	System.out.println("1.Add");
        	System.out.println("2.Remove by index");
        	System.out.println("3.Remove by element");
        	System.out.println("4.Fetch");
        	System.out.println("5.Print");
        	System.out.println("6.Exit");
        	ch=scan.nextInt();scan.nextLine();
        	switch(ch)
        	{
        	case 1:System.out.println("Enter a string:");
        	       s=scan.nextLine();
        	       ccl.Add(s);
        	       break;
        	case 2:System.out.println("Enter index:");
        	       i=scan.nextInt();scan.nextLine();
        	       ccl.Remove(i);
        	       break;
        	case 3:System.out.println("Enter deletable string:");
 	               s=scan.nextLine();
 	               ccl.Remove(s);
 	               break;
        	case 4:System.out.println("Enter index:");
        	       i=scan.nextInt();scan.nextLine();
 	               System.out.println(ccl.fetch(i));
 	               break;
        	case 5:ccl.Print();
        	       break;
        	case 6:scan.close();
        		   return;
        	}
        }
    }
}
