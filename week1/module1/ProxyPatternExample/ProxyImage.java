public class ProxyImage implements Image {
    private RealImage ri;

    public void display() {
        if(ri == null) {
            this.ri = new RealImage();
        } else {
            System.out.println("Caching Image[-------]");
        }

        ri.display();
    }
}