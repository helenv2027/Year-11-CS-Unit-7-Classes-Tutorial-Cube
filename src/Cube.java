public class Cube {
    private int side;
    public Cube(int side){
        if (side<1){
            System.out.print("A cube’s side length cannot be less than 1");
            throw new IllegalArgumentException();
        }
        this.side=side;
    }
    public Cube(){ //setting the side to 1 if parameters are empty
        this.side=1;
    }
    public int getSide(){
        return side;
    }
    public void setSide(int side){ //pass in another parameter but u dont wanna create another one and lose ur other codes
        if (side<1){
            System.out.print("A cube’s side length cannot be less than 1");
            throw new IllegalArgumentException();
        }
        this.side=side;
    }
    public int calculateSurfaceArea(){
        return side*side*6;
    }
    public int calculateVolume(){
        return side*side*side;
    }
}
