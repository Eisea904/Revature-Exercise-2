public class Question11 {
    public static void main(String[] args){
        int[] outer = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        // int inner = 1;

        for (int i = 0; i<outer.length; i++){
            int x = outer[i];
            for (int y = 1; y<=10; y++){
                System.out.println(x + " * " + y + " = " + x*y);
            }
        }
    }
}
