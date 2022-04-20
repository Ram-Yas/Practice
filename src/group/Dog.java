package group;

public class Dog {

    private int size;
    private String country;
    protected String color;


    public void bark() {
        // public her taraftan ulasilabiliyor. en genis acc. mod
        System.out.println("woof woof !!");;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {

        if (size<0){
            this.size =size*(-1);
        } else {
            this.size = size;
        }

    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color.equals("Kirmizi")){
            //System.out.println("");
            this.color = "Kirmizi kopek olmaz";
        }else
        this.color = color;
    }

    protected static void sleep(){
        //package ici classlarimiz ve baska package'daki child classlarimiz
        System.out.println("sleeping");
    }

    void jump(){ //default acc mod
        // //package ici classlarimiz (bu class ve package'daki diger classlar)
        System.out.println("jumping");
    }

    private void eat (){
        // sadece ve sadece olusturuldugu class icinde gecerlidir
        System.out.println("eating");
    }


    public Dog(int size, String country) {
        this.size = size;
        this.country = country;
    }

    public Dog(int size, String country, String color) {
        setSize(size);
        this.country = country;
        setColor(color);
    }

    @Override
    public String toString() {
        return "Dog{" +
                "size=" + size +
                ", country='" + country + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
