package arrays;

public class RotateImage90Degrees {


    static int rows = 0;
    static int cols = 0;
    public static void main(String[] args) {



        int arr[][] = {{1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}};

        rows = arr.length;
        cols = arr[0].length;
        System.out.println("Printing array before rotation");
        printArray(arr);
        System.out.println("Printing array after rotation");
        arr = rotate90(arr);
        printArray(arr);
    }

    private static int[][] rotate90(int[][] arr) {

        for(int r=0;r<rows;r++) {

            for(int c=r; c<=cols/2;c++) {

                int temp = arr[r][c];

                arr[r][c] = arr[rows-c-1][r];
                arr[rows-c-1][r] = arr[rows-r-1][cols-c-1];
                arr[rows-r-1][cols-c-1] = arr[c][cols-r-1];
                arr[c][cols-r-1] = temp;

            }

        }


        return arr;

    }

    private static void printArray(int[][] arr) {

        for(int i=0;i<rows;i++) {
            for(int j =0 ;j <cols; j++) {
                System.out.print(arr[i][j] +" , ");
            }
            System.out.println();
        }
    }

}
