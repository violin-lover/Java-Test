public class DivisibleByTwo{
	static boolean divisi(int N){
		N = Integer.toBinaryString(N);
		if(N.substring(N.length()-1) == 0){
			return true;
		} return false;
	}
}