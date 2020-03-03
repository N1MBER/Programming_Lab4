public class Bird extends Being implements Hunting {
    private String condition;
    private Inception victim;
    private Place NowPlace;
    public Bird(String n){
        super(n);
    }
    public void flew(Place p){
        System.out.println(this.getName() + " порхает около места " + p.getName());
        this.NowPlace=p;
    }
    public void hunt(Inception i) {
        System.out.println(this.getName() + " охотятся на " + i.getName());
        this.condition="Hunting";
        this.victim=i;
    }
}