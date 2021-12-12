package hashtable.com;

public class hashtable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee smitagupta = new Employee("Smita" , "Gupta" , 102);
		Employee rajkapoor = new Employee("Raj" , "Kapoor" , 103);
		Employee  hritikakesharwani = new Employee("Hritika" , "Kesharwani" , 104);
		Employee meghapillai = new Employee("Megha" , "Pillai" , 105);
		Employee monicasilvestor = new Employee("Monica" , "Silvestor" , 106);
		 
		Simplehashtable ht = new Simplehashtable();
		ht.put("Gupta" , smitagupta);
		ht.put("Silvestor", monicasilvestor);
		ht.put("Pillai", meghapillai);
		ht.put("Kapoor", rajkapoor);
		ht.put("Kesharwani", hritikakesharwani);
		ht.printhashtable();
				

	}

}
