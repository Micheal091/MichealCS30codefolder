public class coolnumbers {

    public static boolean iscoolnumber(int n) {
         
            if(n % 3== 1 && n %4 ==1 && n%5==1 && n%6 ==1){
                return true;
               

            }
            else {
             return false;         
            }}
            public int countcn(int end){
                   int count = 0;
                for(int n=6; n<=end; n++)
                {
                    if (iscoolnumber(n)){ 
                        count++;
                    }
                }
                return count;
            }

        }
