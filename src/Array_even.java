public class Array_even {
    public static void main(String[] args) {
        int arr[] = new int [100];
        int index = 0;
        for (int i=2 ;i <= 200 ;i++){
            if( i % 2 == 0){
                arr[index]=i;
                i++;
                System.out.println(index + "th element :" + arr[index]);
                index++;
            }

        }
    }
}
