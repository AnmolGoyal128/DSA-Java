package ArrayDSA;
public class avg {
    static void main(){
        int[] arr = {2,4,5,8,9};
        System.out.println(getAverage(arr));

    }
    static double getAverage(int[] arr){
        double sum = 0;
        for(int index =0;index<arr.length;index++){
            int i = arr[index];
            sum = sum+i;

        }
        int size = arr.length;
        double average = sum/size;
        return average;

    } 
}
