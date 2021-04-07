import duplicate.*;

class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!" + "\n");

    Codec c = new Codec();
		System.out.println(c.encode("https://leetcode.com/problems/design-tinyurl"));

    int[] nums = {1,2,2,3};
    Duplicate depressing = new Duplicate();
    depressing.containsDuplicate(nums);

    Triples saddening = new Triples();
    saddening.findSingle(nums);
  

  
}
}

