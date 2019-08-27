
public class Main {

    public static void main(String[] args) {
        // write testcode here
        int[] original = {1,2,3};
        int[] reverse = reverseCopy(original);
        
        for(int n: reverse){
            System.out.println(n);
        }
    }

    public static int[] copy(int[] array) {
        int[] copy = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            copy[i] = array[i];
        }
        return copy;
    }

    public static int[] reverseCopy(int[] array) {
        int[] reversed = new int[array.length];
        
        for (int i = 0; i < reversed.length; i++) {
            reversed[i] = array[array.length-1-i];            
        }
        
        return reversed;
    }

}
