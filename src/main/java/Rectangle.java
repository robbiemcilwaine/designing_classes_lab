public class Rectangle {
    int length;
    int width;
    public Rectangle(int inputLength, int inputWidth){
        this.length = inputLength;
        this.width = inputWidth;
    }
    public int calculateArea(){
        return this.length * this.width;
    }
    public boolean isSquare(){
        return this.length == this.width;
    }
}
