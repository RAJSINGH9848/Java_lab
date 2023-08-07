public class Conditonal {
    public static void main (String args[]){
            int a = 11;
           int k = a % 2 == 0? 1:0;
           if(k==1) {
               System.out.println("even");
           }
           else{
               System.out.println("odd");
           }
        String K = a % 2 == 0? "even": "odd";
           System.out.println(K);


    }
}
