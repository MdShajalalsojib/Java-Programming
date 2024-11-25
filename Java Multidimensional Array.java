----------------------------Multidimensional Arrays----------------------------
public class JavaArray {
        public static void main(String[] args) {            
            int[][] a = {
                {1, -2, 3,10}, 
                {-4, -5, 6, 9}, 
                {7,5,8}, 
            }; 
            for (int[] innerArray: a) {
                 
                for(int data: innerArray) {
                    System.out.println(data);
                }
            }
        }
    }

