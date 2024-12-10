public class Mirp {
    public static void main(String[] args) throws Exception {
        int n = Integer.parseInt(args[0]);
        for(int i = 2; i < n; i++) {
            boolean prime = true;
            for(int j = i-1; j >= 2; j--) {     //find prime number
                if(i%j == 0) {
                    prime = false;
                }
            }
            if(prime) { //check prime for mirp conditions
                boolean mirp = true;
                int conv = i;
                int dat = 0;
                while (conv != 0) { //turns the numbers digits around
                    dat *= 10;
                    int temp = conv % 10;
                    conv -= temp;
                    conv /= 10;
                    dat += temp;
                }
                for(int j = dat-1; j >= 2; j--) {   //checks if reverse is also prime
                    if(dat%j == 0) {
                        mirp = false;
                    }
                }
                if(mirp && (dat != i)) {        //makes sure that reverse != i
                    System.out.println(i+" ");
                }
            }
        }
    }
}
