import java.util.Arrays;
import java.util.Random;

public class Main1 {
    /*
    Дан массив двоичных чисел, например[1,1,0,1,1,1]
    вывести максимальное количество подрад идущих 1.
     */
    public static void main(String[] args) {
        int[] arr = random(10,0, 2);
        System.out.println(Arrays.toString(arr));
        System.out.println(count(arr));
    }
    static int[] random(int kol, int min, int max){
        int[] arr = new int[kol];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] =random.nextInt(min, max);
        }
        return arr;
    }
    static int count(int[] arr){
        int max_kol=0;
        int kol =0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==1){
                kol++;
                if (max_kol<kol){
                    max_kol=kol;
                }
            }
            else{
                kol=0;
            }
        }
        return max_kol;
    }
}
