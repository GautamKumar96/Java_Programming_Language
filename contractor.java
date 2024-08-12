class myEployee{
  private int id;
  private String name;

  public myEployee(){
    id = 17;
    name = " Gautam kumar";
  }
  public String getName(){
    return name;
  }
  public int getId(){
    return id;
  }
   public void setName(String n){
    this.name = n;
   }
   public void setId(int i){
    this.id = i;
   }
}
public class contractor {
  public static void main(String [] args){
   myEployee obj = new myEployee();
   obj.setId(17);
   obj.setName("gautam kumar");

   System.out.println(obj.getId());
   System.out.println(obj.getName());
  }
}
