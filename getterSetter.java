class MyEmployee{
  private int id;
  private String name;
  public String setName;

   public String getName(){
     return name;
   }
    public void setName(String n){
      name = n;
    }
    public void setId(int i){
      id = i;
    }
    public int getId(){
      return id;
    }
}
public class getterSetter{
  public static void main(String [] args){
 MyEmployee gk = new MyEmployee();
   gk.setId(17);
   gk.setName = ("gautam kumar");
   System.out.println(gk.getId());
   System.out.println(gk.getName());

  }
}