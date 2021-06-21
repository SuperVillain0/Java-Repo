public class StringsEx {
  public static void main(String[] args) {
    String message = "Hello World" + ".";
    System.out.println(message);
    System.out.println(message.length() + " Digits");
    System.out.println(message.indexOf("H"));
    System.out.println(message.startsWith("Hello"));
    System.out.println(message.replace(".", "!"));
  }
}