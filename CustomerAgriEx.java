class Address {  
		 String city,state,country;  
		   
		 public Address(String city, String state, String country) {  
		     this.city = city;  
		     this.state = state;  
		     this.country = country;  
		 }  
		   
		 }  

public class CustomerAgriEx {
	int id;  
	String name;  
	Address address; //aggregation 
	  
	public CustomerAgriEx(int id, String name,Address address) {  
	    this.id = id;  
	    this.name = name;  
	    this.address=address;  
	}  
	  
	void display(){  
	System.out.println(id+" "+name);  
	System.out.println(address.city+" "+address.state+" "+address.country);  
	}  
	  
	public static void main(String[] args) {  
	Address address1=new Address("Nalgonda","Telangana","India");  
	Address address2=new Address("Hyderabad","Telangana","India");  
	  
	CustomerAgriEx e=new CustomerAgriEx(111,"venkatesh",address1);  
	CustomerAgriEx e2=new CustomerAgriEx(112,"phani",address2);  
	      
	e.display();  
	e2.display();  
	      
	}  
	

}
