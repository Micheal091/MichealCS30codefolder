public class App {
    public static void main(String[] args) throws Exception {
       System.out.println("4 double is " + numdouble(4));
       System.out.println("2 double is " + numdouble(2));
       System.out.println("17 double is " + numdouble(17));
       System.out.println("1347 double is " + numdouble(1347));
    }
    public static int numdouble(int num){
        int ans = num*2;
        return ans; 
    }
}
