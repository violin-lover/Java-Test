public class PowerofTwo{
  static boolean powerofTwo(int N){
    if(N == 0){
      return false;
    }
  

    for(int i = 0; i <= Math.sqrt(N); i++){
      if(Math.pow(2,i) == N){
          return true;
      }
    }
    return false;
  }
}


