import java.util.Arrays;

public class collections {
    public static void main(String []args){
        int[] array1;
        array1=new int[5];//array declaration in java. By defualt every value is assigned to be zero
        System.out.println(array1);// it does not work as expected. prints random garbage value
        System.out.println("Array1:"+Arrays.toString(array1));//tostring converts array to string

        array1[0]=1;//array individual elements access
        array1[1]=2;
        array1[2]=3;
        array1[3]=4;
        array1[4]=5;
        System.out.println(array1[4]);

        int[] array2={1,2,3,4,5};
        int array3[]={1,2,3,4,5};
        System.out.println("Array2:"+Arrays.toString(array2));
        System.out.println("Array3:"+Arrays.toString(array3));

        //array length
        System.out.println("Array1 length:"+array1.length);

        //array copy
        int[] array4=Arrays.copyOf(array1,10);//copies array1 to array4 and fills the rest with zeros
        System.out.println("Array4:"+Arrays.toString(array4));

        int[] array5=Arrays.copyOfRange(array1,0,3);//copies array1 from index 0 to 3 and fills the rest with zeros
        System.out.println("Array5:"+Arrays.toString(array5));

        // Adding elements to an array
        int[] numbers = {1, 2, 3, 4, 5};
        int[] newNumbers = Arrays.copyOf(numbers, numbers.length + 1);
        newNumbers[numbers.length] = 7;
        System.out.println(Arrays.toString(newNumbers)); // Output: [1, 2, 6, 4, 5, 7]

        // Removing elements from an array
        int[] fewerNumbers = Arrays.copyOf(numbers, numbers.length - 1);
        System.out.println(Arrays.toString(fewerNumbers)); // Output: [1, 2, 6, 4]



    }
}
