public class Bitwise {
    public static void main(String[] args) throws Exception {
        int imp = Integer.parseInt(args[0]);
        int mul = imp << 1;
        int div = imp >> 1;
        System.out.println("intput: "+imp+"\ntimes 2: "+mul+"\ndiv 2: "+div);
    }
}
