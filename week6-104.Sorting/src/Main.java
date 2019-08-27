
public class Main {
    public static void main(String[] args) {
        // write testcode here
        int[] values = {8, 3, 7, 9, 1, 2, 4};
        sort(values);
        
    }
    
    public static int smallest(int[] array){
            int smallest = array[0];
            
            for(int i : array){
                if(i < smallest)
                    smallest = i;
            }
            return smallest;
        }
    
    public static int indexOfTheSmallest(int[] array){
        int index = 0;
        int smallest = smallest(array);
        
        for(int i = 0; i < array.length; i++){
            if(smallest == array[i]){
                index = i;
            }
        }
        return index;
    }
    
    public static int indexOfTheSmallestStartingFrom(int[] array, int index){
        int smallestIndex = index;
        int smallest = array[smallestIndex];
        
        for(int i = index; i < array.length; i++){
            if(array[i] < smallest){
                smallestIndex = i;
                smallest = array[i];
            }
        }
        return smallestIndex;
    }
    
    public static void swap(int[] array, int index1, int index2){
        int number1 = array[index1];
        int number2 = array[index2];
        array[index1] = number2;
        array[index2] = number1;
    }
    
    public static void sort(int[] array){
        print(array);
        
        for(int i = 0; i < array.length ; i++){
            int smallestIndex = indexOfTheSmallestStartingFrom(array,i);
            swap(array,i,smallestIndex);
            print(array);
        }
    }
    
    public static void print(int[] array){
        System.out.print("[" + array[0]);
        for(int i = 1; i < array.length; i++){
            System.out.print(", " + array[i]);
        }
        System.out.print("]");
        System.out.println();
    }

}
