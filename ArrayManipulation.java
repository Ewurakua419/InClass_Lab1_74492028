import java.util.Scanner;
import java.util.Arrays;

public class ArrayManipulation {
    public static void main(String[] args){
        Scanner find= new Scanner(System.in);
        int[] arrayOrigional={2,5,8,3,4,6,10,15,20,1,11};
        boolean found1=false;
        boolean found2=false;
        int index1=0;
        int index2=0;
        int temp;
        int index=0;
        //identify the index of a given value
        System.out.println("Please enter the number to be found");
        int number=find.nextInt();
        
        for (index=0;index<arrayOrigional.length;index++){
            if (arrayOrigional[index]==number){
                System.out.println("The index of number "+number+ " is "+ index);
                break;

            }
            else if ((index==arrayOrigional.length-1) && (arrayOrigional[arrayOrigional.length-1]!=number)){
                System.out.println("Number cant be found");
            }
        }
        
        //Swap two values in an array
        System.out.println("Which two values do you want to swap");
        
        System.out.println("please enter the first");
        int val1=find.nextInt();
        
        for (index=0;index<arrayOrigional.length;index++){
            if (arrayOrigional[index]==val1){
                index1=index;
                found1=true;
                break;

            }
            else if ((index==arrayOrigional.length-1) && (arrayOrigional[arrayOrigional.length-1]!=val1)){
                System.out.println("Number cant be found");
            }
        }
        System.out.println("please enter the second");
        int val2=find.nextInt();
        
        for (index=0;index<arrayOrigional.length;index++){
            if (arrayOrigional[index]==val2){
                index2= index;
                found2=true;
                break;

            }
            else if ((index==arrayOrigional.length-1) && (arrayOrigional[arrayOrigional.length-1]!=val2)){
                System.out.println("Number cant be found");
            }
        }
        
        if (found1==true && found2==true){
            temp=arrayOrigional[index1];
            
            arrayOrigional[index1]=arrayOrigional[index2];
            arrayOrigional[index2]=temp;
            System.out.println("The new array after swapping"+val1+ " with "+val2+ " is "+Arrays.toString(arrayOrigional));
        }
        
        //sort an array in ascending or descending order
        //ascending order
        System.out.println("Enter 1 for ascend or 2 for descending");
        int order=find.nextInt();
        if (order==1){
            for (int i=0; i<arrayOrigional.length-1 ;i++){
                int currentMin=arrayOrigional[i];
                int currentIndex=i;
                for (int x=i+1; x<arrayOrigional.length; x++){
                    if (currentMin>arrayOrigional[x]){
                        currentMin=arrayOrigional[x];
                        currentIndex=x;
                    }

                }
                if (currentIndex!=i){
                arrayOrigional[currentIndex]=arrayOrigional[i];
                arrayOrigional[i]=currentMin;
                    
                }
            }
            System.out.println("new ascending array is "+Arrays.toString(arrayOrigional));
            //binary search
            System.out.println("please enter the value to be found");
            int binarySearch=find.nextInt();
            //int lowerBound=arrayOrigional[0];
            int lowerBoundIndex=0;
            //int upperBound=arrayOrigional[arrayOrigional.length-1];
            int upperBoundIndex=arrayOrigional.length-1;
            int middleValue=arrayOrigional[(lowerBoundIndex+upperBoundIndex)/2];
            int middleIndex=(lowerBoundIndex+upperBoundIndex)/2;
            while (lowerBoundIndex!=upperBoundIndex && binarySearch!=middleValue && binarySearch>arrayOrigional[0] && binarySearch<arrayOrigional[arrayOrigional.length-1]){
                if (binarySearch>middleValue){
                    lowerBoundIndex=middleIndex;
                }
                else if (binarySearch<middleValue){
                    upperBoundIndex=middleIndex;
                }
                middleValue=arrayOrigional[(lowerBoundIndex+upperBoundIndex)/2];
                middleIndex=(lowerBoundIndex+upperBoundIndex)/2;
                System.out.println(middleValue);
            }
            if (binarySearch==middleValue){
                System.out.println("found");
            }
            else{
                System.out.println("Not found");
            }
        
        }


        else if (order==2){
            for (int i=0; i<arrayOrigional.length-1 ;i++){
                int currentMax=arrayOrigional[i];
                int currentIndex=i;
                for (int x=i+1; x<arrayOrigional.length; x++){
                    if (currentMax<arrayOrigional[x]){
                        currentMax=arrayOrigional[x];
                        currentIndex=x;
                    }

                }
                if (currentIndex!=i){
                arrayOrigional[currentIndex]=arrayOrigional[i];
                arrayOrigional[i]=currentMax;
                    
                }
            }
            System.out.println("new descending array is "+Arrays.toString(arrayOrigional));
            //binary search
            System.out.println("please enter the value to be found");
            int binarySearch=find.nextInt();
            //int lowerBound=arrayOrigional[0];
            int lowerBoundIndex=0;
            //int upperBound=arrayOrigional[arrayOrigional.length-1];
            int upperBoundIndex=arrayOrigional.length-1;
            int middleValue=arrayOrigional[(lowerBoundIndex+upperBoundIndex)/2];
            int middleIndex=(lowerBoundIndex+upperBoundIndex)/2;
            while (lowerBoundIndex!=upperBoundIndex && binarySearch!=middleValue && binarySearch<arrayOrigional[0] && binarySearch>arrayOrigional[arrayOrigional.length-1]){
                if (binarySearch<middleValue){
                    lowerBoundIndex=middleIndex;
                }
                else if (binarySearch>middleValue){
                    upperBoundIndex=middleIndex;
                }
                middleValue=arrayOrigional[(lowerBoundIndex+upperBoundIndex)/2];
                middleIndex=(lowerBoundIndex+upperBoundIndex)/2;
            }
            if (binarySearch==middleValue){
                System.out.println("found");
            }
            else{
                System.out.println("Not found");
            }
            
        }
        //linear search
        System.out.println("Please enter the value to be found using linear search");
        int linearSearchVal=find.nextInt();
        for (index=0;index<arrayOrigional.length;index++){
            if (arrayOrigional[index]==linearSearchVal){
                System.out.println("found");
                break;

            }
            else if ((index==arrayOrigional.length-1) && (arrayOrigional[arrayOrigional.length-1]!=number)){
                System.out.println("Number cant be found");
            }
        }
        
        
        
    }
}
