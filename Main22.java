public class Main22 {
    /*
     * Напишите метод, который сжимает строку.
     * Пример: вход aaaabbbcdd.
     * Результат: a4b3cd2.
     */
    public static void main(String[] args) {
        String s="aaaabbbcdd";
        System.out.println(squeeze(s));
    }
    static String squeeze(String line){
        int count =1;
        char[] chars= line.toCharArray();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 1; i < line.length(); i++) {
            if (chars[i] ==chars[i-1]){
                count++;
            }else{
            stringBuilder.append(chars[i-1]);
            if (count!=1){
                 stringBuilder.append(count);
                 count =1;
                }
              } 
          }
            stringBuilder.append(chars[chars.length-1]);
            if (count!=1){
                 stringBuilder.append(count);
        }
     return stringBuilder.toString();
    }
}
