public class controlFlow{
    public static void main(String[] args){
        
        //conditional statements

        //if else
        int a=10;
        if(a>10){
            System.out.println("a is greater than 10");
        }
        else if(a<10){
            System.out.println("a is less than 10");
        }
        else{
            System.out.println("a is equal to 10");
        }

        //switch case
        int b=10;
        switch(b){
            case 10:
                System.out.println("b is equal to 10");
                break;
            case 20:
                System.out.println("b is equal to 20");
                break;
            default:
                System.out.println("b is neither 10 nor 20");
        }



        //loops

        //while loop
        int i=0;
        while(i<10){
            System.out.print(i);
            i++;
        }
        System.out.println("");


        //using while loop with arrays
        int[] arr={1,2,3,4,5};
        int index=0;
        while(index<arr.length){
            System.out.print(arr[index]);
            index++;
        }
        System.out.println("");


        //do while loop
        int j=0;
        do{
            System.out.print(j);
            j++;
        }while(j<10);
        System.out.println("");



        //using do while loop with arrays
        int[] arr1={1,2,3,4,5};
        int index1=0;
        do{
            System.out.print(arr1[index1]);
            index1++;
        }while(index1<arr1.length);
        System.out.println("");            



        //for loop
        for(int k=0;k<10;k++){
            System.out.print(k);
        }
        System.out.println("");

        //using for loop with arrays
        int[] arr2={1,2,3,4,5};
        for(int index2=0;index2<arr2.length;index2++){
            System.out.print(arr2[index2]);
        }
        System.out.println("");

        //break
        for(int l=0;l<10;l++){
            if(l==5){
                break;
            }
            System.out.print(l);
        }
        System.out.println("");


        //continue
        for(int m=0;m<10;m++){
            if(m==5){
                continue;
            }
            System.out.print(m);
        }
        System.out.println("");



        //return
        for(int n=0;n<10;n++){
            if(n==5){
                return;
            }
            System.out.print(n);
        }
        System.out.println("");


        //special for each loop- used to iterate over any iterable objects like arrays 
        int[] array={1,2,3,4,5};
        for(int element:array){
            System.out.print(element);
        }
        System.out.println("");





    }
}