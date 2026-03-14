package Module6;

public class LargestandSmalletElement {
            public static void main(String[] args) {

                int arr[] ={20,45,32,12,58};

                int smallest = arr[0];
                int largest = arr[0];

                for(int i = 1; i < arr.length; i++) {

                    if(arr[i] < smallest) {
                        smallest = arr[i];
                    }

                    if(arr[i] > largest) {
                        largest = arr[i];
                    }
                }

                System.out.println("Smallest number: " + smallest);
                System.out.println("Largest number: " + largest);
            }
        }


