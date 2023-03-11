import java.util.Arrays;

public class Main {
    public static void main(String[] args ) {

        /*
        Необходимо реализовать следующий метод
        1.Получить на входе массив чисел.
        2.Все четные числа увеличить на единицу.
        3.возвращаем кусок списка с 3 по 7 элемент.
        */
        int[]array={1,2,3,4,5,6,7};
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(returnArray(array)));


    }
    public static int[]returnArray(int[]array){
        int[]result=new int[5];
        for( int i=0, j=0; i< array.length; i++){
            if(array[i]%2==0){
                array[i]++;
            }
            if( i>=2&& i<=6){
                result[j++]=array[i];
            }
        }
        return result;
    }



}