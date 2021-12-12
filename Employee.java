package hashtable.com;

 

public class Employee {
	private String firstname;
    private String lastname;
    private int id;
    
    public Employee(String firstname, String lastname, int id) {
    	this.firstname = firstname;
    	this.lastname=lastname;
    	this.id= id;
    }
    	
    	public String getfirstName() {
    		return firstname;
    	}
    	public void setfirstName(String firstname) {
    		this.firstname=firstname;
    	}
     public String getlastName() {
    	 return lastname;
     }
     public void setlastName(String lastname) {
    	 this.lastname = lastname;
     }
     public int getid() {
    	 return id;
     }
     public void setid(int id) {
    	 this.id = id;
     }
     public boolean equals(Object o) {
	        if (this == o) return true;
	        if (o == null || getClass() != o.getClass()) return false;

	        Employee employee = (Employee) o;

	        if (id != employee.id) return false;
	        if (!firstname.equals(employee.firstname)) return false;
	        return lastname.equals(employee.lastname);
	    }

	    @Override
	    public int hashCode() {
	        int result = firstname.hashCode();
	        result = 31 * result + lastname.hashCode();
	        result = 31 * result + id;
	        return result;
	    }

	    @Override
	    public String toString() {
	        return "Employee{" +
	                "firstName='" + firstname + '\'' +
	                ", lastName='" + lastname + '\'' +
	                ", id=" + id +
	                '}';
	    

	    }

}
