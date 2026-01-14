class Gcd{
  public static void main(String[]args){
    int a = 10;
    int b= 15;
    int gcd = 1;
    int min = Math.min(a,b);
    for(int i = min; i>=1; i = i-1){
      if(a%i==0&&b%i==0){
        gcd = i;
        break;
      }
       
    }
     System.out.println(gcd);
  }
}
