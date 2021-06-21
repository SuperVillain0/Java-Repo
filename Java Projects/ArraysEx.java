import java.util.Arrays;

public class ArraysEx {
  public static void main (String[] args) {
    int[] array1 = { 0, 1, 2, 3, 4 ,5 ,6 ,7 ,8 ,9 ,10 };
    String strOdd = "", strEven = "";
    for(int i=0; i < array1.length; i++){
      if(array1[i]%2==0)
      strEven += array1[i] + ", ";
      else
      strOdd += array1[i] + ", ";
    }
      System.out.println("The Even Numbers Are: " + strEven);
      System.out.println("The Odd Numbers Are: " + strOdd);
    System.out.println(Arrays.toString(array1));
  }
}