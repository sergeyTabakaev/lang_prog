class Gen<T> {
	//Declaring a general class type
	T ob;
	//defining class construntor
	//assigning generalized object as a parameter
	Gen(T o) {
		ob = o;
	}

	//<method that returns class object
	T getOb(){
		return ob;
	}
	//method that returns the name of a class type
	void showType() {

		System.out.println("type T:" + ob.getClass().getName());
	}

}

		

class Pr001 {
	public static void main(String[] args) {
		//creating class pointer with object type ingeger
		Gen<Integer> iOb;
		//assighing a new class instanse of type integer to our pointer
		iOb = new Gen<Integer>(88);
		//show object type
		iOb.showType();
		//assigning object value  to a varalable
		int v = iOb.getOb();

		System.out.println("znachenie: " + v);
		System.out.println("Value: " + v + "\n");
  

		//Creating a class pointer with object type String
		//Assigning a new class instance of type String to our pointer 
		Gen<String> strob = new Gen<String>("String of generalized class");
		//Showing object Type
		strob.showType();
		//Assigning object value to a variable
		String str = strob.getOb();
		System.out.println("Value: " + str + "\n");
	}
}
