public class clear_ith_bit {
    public static int clearithbit(int n,int i){
        int bitmask=~(1<<i);
        return n&bitmask;
    }
    public static void main(String args[]){
        System.out.println(clearithbit(6,2));
    }
}