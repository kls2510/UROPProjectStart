public class Test {
//returns value boolean value of the bit stored at the position in the long 64-bits
    public static boolean get(long packed , int position) {
        long check = (packed >> position);
        check = (check & 1L);
        return (check == 1L);
    } 
//sets the boolean value at a specified position to a specified value (0 or 1)
    public static long set(long packed, int position, boolean value){
        if (value) {
            packed = (packed) | (1L << position);
        } else {
            packed = (packed) & ~(1L << position);
        }
        return packed;
    }
}
