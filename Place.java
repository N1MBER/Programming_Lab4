public class Place implements Getname{
    private String name;
    public Place(String n){
        this.name=n;
    }

    public String getName(){
        return this.name;
    }

    @Override
    public String toString(){
        return this.name;
    }
}
