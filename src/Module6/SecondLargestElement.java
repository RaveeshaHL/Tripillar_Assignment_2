package Module6;

public class SecondLargestElement {
    public static void main(String[] args) {

        int arr[] ={20,45,32,12,58};

        int largest = arr[0];
        int secondlargest=arr[0];


            for (int i=0; i<arr.length;i++){
                if (arr[i]>largest){
                    secondlargest=largest;
                    largest=arr[i];

                }
                else if (arr[i]>secondlargest && arr[i] != largest){
                    secondlargest=arr[i];
                }
            }
            System.out.println("Second Largest Number:"+ secondlargest);
        }
    }