public class Main21 {
   /*
   Дано четное число N (>0) и символы c1 и c2
   Написать метод, который вернет строку длины N, 
   которая состоит из чередующихся символов c1 и c2, 
   начиная с c1.
   Ответ: с1с2с1...с2 (всего N символов) 
   */ 
  public static void main(String[] args) {
    char c1='a';
    char c2='b';
    int n = 6;
    System.out.println(Luboe(c1, c2,n));
  }
    static String Luboe (char c1, char c2, int n){
        StringBuilder newString = new StringBuilder();
        for (int i = 0; i < n/2; i++) {
            newString.append(c1);
            newString.append(c2);
        }
        return newString.toString();  
  } 
}
