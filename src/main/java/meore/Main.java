package meore;

public class Main {
    public static void main(String[] args) {

        int[] arr = {18, -3, 5, -7, 6, 89, 13, 0, -89};
        for (int i = 0 ; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int array = 0;
                if (arr[i] > arr[j]){
                    array = arr[i];
                    arr[i] = arr[j];
                    arr[j] = array;
                }

            }
        }
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + ",");
        }
    }

}
