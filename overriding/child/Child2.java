class Child2 extends Parent2 { 
    // new m1() method 
    // unique to Child class 
    private void m1() { 
        System.out.println("From child m1()"); 
    } 
  
    // overriding method 
    // with more accessibility 
    @Override
    public void m2() { 
        System.out.println("From child m2()" + "\n"); 
    } 
} 