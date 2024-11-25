 public class JavaArray {
    public static void main(String[] args) {
        int[] Number = {2, 4, 8,71,9,12,31};
        int sum = 0;
        double average;
        for(int Num:Number){
            sum += Num;
        }
        int arrayLength = Number.length;
        average =  ((double)sum / (double)arrayLength);
        System.out.println("Sum :"+sum);
        System.out.println("Average :"+average);

    }
}
