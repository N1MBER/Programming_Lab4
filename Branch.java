public class Branch extends Plants{
    public Branch(String n, String ch){
        super(n, ch);
    }
    boolean curv = false;
    public void bend(){
        System.out.println("Ствол красиво изогнулся.");
        curv=true;
    }
    public boolean getCurv(){
        return this.curv;
    }
}
