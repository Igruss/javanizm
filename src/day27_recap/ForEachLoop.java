package day27_recap;

public class ForEachLoop {

    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};

        for(int i = 0;i <= arr.length -1;i ++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("==============================");

        for (int each : arr){
            System.out.print(each + " ");
        }
        System.out.println();
        System.out.println("==============================");

        for(int i= arr.length -1;i>=0;i--){
            System.out.print(arr[i] +" ");
        }
        System.out.println();
        System.out.println("==============================");

        int [] scores ={10,20,30,40,50,60,70,80,90,100,110};
        int countBy3 = 0;

        for(int each : scores){
            if(each %3 != 0){
                continue;
            }
            countBy3 ++;
            System.out.print(each + " ");
            System.out.print(countBy3);
        }

        System.out.println();
        System.out.println("==============================");

        String [] names = {"AB","ABC","A","AB","ABCD"};

        for(String each : names){
            if(!each.contains("C")){
                continue;
            }
            System.out.print(each+ " ");
        }
        System.out.println();
        System.out.println("===========================");

        int [] score = {80,75,65,115,90,45,66,72,};
        int max = score[0];
        int min = score[0];

        for(int each : score){
            if(each > max){
                max = each;
            }
            if( each < min){
                min = each;
            }
        }
        System.out.println("Max number : "+max);
        System.out.println("Min number : "+min);

    }
}
