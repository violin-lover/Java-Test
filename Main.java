class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!" + "\n");

    /*Base b = new Derived(); 
    b.fun(); 

    Derived2 d = new Derived2();
    d.fun(); 

    Parent obj1 = new Parent(); 
    obj1.show(); 
 
    Parent obj2 = new Child(); 
    obj2.show(); 

    Parent2 object1 = new Parent2(); 
    object1.m2(); 

    Parent2 object2 = new Child2(); 
    object2.m2(); 

    Parent3 object = new Child3(); 
    object.m1(); 
    object.m2(); 

    Parent4 child= new GrandChild4(); 
    child.show();

    Employee person1 = new Manager(); 
    System.out.print("Manager's salary : "); 
    printSalary(person1); 
  
    Employee person2 = new Clerk(); 
    System.out.print("Clerk's salary : "); 
    printSalary(person2); */

    DivisibleByTwo t = new DivisibleByTwo();
		for(int i = 1; i < 10001; i++){
			System.out.println(t.PowerOfTwo(i));
		}
  }

    Codec c = new Codec();
		System.out.println(c.encode("https://leetcode.com/problems/design-tinyurl"));

  /*static void printSalary(Employee e) { 
        System.out.println(e.salary()); 
    } */

  
}

