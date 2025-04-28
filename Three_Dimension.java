public class Three_Dimension {
  public static void main(String[] args) {
    int a[] = new int[8];
    int b[] = new int[8];
    int c[] = new int[8];

    for(int i=0; i<8;i++){
      a[i] = i+1;
      b[i] =(i+1)*10;
      c[i] =a[i]+b[i];
    }
    System.out.println("Arrays a:");
    for(int i=0; i<8;i++){
      System.out.println(a[i]+" ");
    }
    System.out.println("Arrays b:");
    for(int i=0; i<8;i++){
      System.out.println(b[i]+" ");
    }
     System.out.println("Arrays  c");
     for(int i=0;i<8;i++){
     System.out.println(c[i]+" ");
  }
}
}