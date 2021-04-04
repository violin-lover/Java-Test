class Child3 extends Parent3 { 
    // This method hides m1() in Parent 
    static void m1() { 
        System.out.println("From child static m1()"); 
    } 
  
    // This method overrides m2() in Parent 
    @Override
    public void m2() { 
        System.out.println("From child " + "non-static(instance) m2()" + "\n"); 
    } 
} 