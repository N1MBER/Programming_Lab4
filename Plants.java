public class Plants implements Getname{
    private Wasp WaspNearPlants;
    private Place Location;
    private Bee BeeNearPlants;
    private String name;
    private String charicter;

    public Plants (String n, String ch){
        this.name = n;
        this.charicter = ch;
    }
    public String getName(){
        return this.name;
    }

    public String getCharicter(){
        return this.charicter;
    }

    public void NearSpin(Wasp w,Bee b){
        this.WaspNearPlants = w;
        this.BeeNearPlants = b;
        System.out.println("Рядом с растением " + this.getName() + " летает" + w.getName() + " " + b.getName());
    }

    @Override
    public boolean equals(Object obj) {
        if (obj.toString() == this.toString()) {
            return true;
        }
        else
            return false;
    }

    @Override
    public int hashCode()
    {
        final float kek = 14.88f;
        int sis = 17;
        sis = ((int)kek * sis)/3 + hashCode();
        return sis;
    }

    @Override
    public String toString(){
        return this.name;
    }
    static class Rjabina extends Plants {
        private String aroma;
        private Place NowPlace;
        private String time;
        public Rjabina(String n, String ch, String a, String t){
            super(n,ch);
            this.aroma = a;
            this.time = t;
        }

        public void fill(Place p){
            System.out.println(time + " " + aroma + " " + this.getName() + " " + this.getCharicter() + " " + " заполонил " + p.getName());
            this.NowPlace=p;
            super.Location=p;
        }

    }
    public Flower CreateFlower(String n,String ch){
        return new Flower(n,ch);
    }
    public class Flower extends Plants {
        public  Flower(String n, String ch){
            super(n,ch);
        }
    }

}
