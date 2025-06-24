public class RealImage implements Image {
    public RealImage() {
        load();
    }

    private void load() {
        System.out.println("Loading Image from Remote Server...");
    }

    public void display() {
        System.out.println("Displaying Image[---------]");
    }
}