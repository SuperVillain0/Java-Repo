public class ConstructorEx {
  int a = 0, b = 0;
  ConstructorEx(){
    this.a = 1;
    this.b = 2;
    System.out.println(a + "+" + b + " = " + (a + b));
  }
  ConstructorEx(int aa, int bb){
    this.a = aa;
    this.b = bb;
    System.out.println(aa + "+" + bb + " = " + (aa + bb));
  }
  public static void main(String[] args) {
    ConstructorEx ce1 = new ConstructorEx();
    ConstructorEx ce2 = new ConstructorEx(3,4);
  }
}