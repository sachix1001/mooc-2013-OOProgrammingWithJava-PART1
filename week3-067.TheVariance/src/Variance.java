import java.util.ArrayList;

public class Variance {
    public static int sum(ArrayList<Integer> list) {
        int sum = 0;
        for(int item : list){
            sum += item;
        }
        return sum;
    }
    

    public static double average(ArrayList<Integer> list) {
        double avarage = (double)sum(list) / list.size();
        // write code here
        return avarage;
    }

    public static double variance(ArrayList<Integer> list) {
        // write code here
        double molecule = 0;
        double average = average(list);
        for(int n : list){
            molecule += Math.pow((n - average),2);
        }
        double variance = molecule / (list.size() -1);
        return variance;
    }
    
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);
        
        System.out.println("The variance is: " + variance(list));
    }

}
