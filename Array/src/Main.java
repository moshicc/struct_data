public class Main {

    public static void main(String[] args) {
	// write your code here

        int[] arr = new int[10];

        int[] scores = new int[]{100,99,66};
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }
//        for (int a: arr) {
//            System.out.println(a);
//        }

        for(int score: scores) {
            System.out.println(score);
        }

    }
}
