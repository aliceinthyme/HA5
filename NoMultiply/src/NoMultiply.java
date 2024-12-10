public class NoMultiply {
    public static void main(String[] args) throws Exception {
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);
        int z = Integer.parseInt(args[2]);
        int out = 0;
        if((y != 0) && (z != 0)) {      //if y or z is 0 then 0
            if(y != 1) {    //if y is one then no change
                for(int i = 1; i <= y; i++) {
                    out += x;
                }
            } else {out = x;}
            x = out;        //reset x to new number for multiplication
            out = 0;        //reset out to 0
            if(z != 1) {    //if z is one then no change (out goes back to being'x)
                for(int i = 1; i <= z; i++) {
                    out += x;
                }
            } else {out = x;}
            if((z == 1) && (y == 1)) {  //if both y and z are one then out is  x
                out = x;
            }
        }
        System.out.println(out);
    }
}
