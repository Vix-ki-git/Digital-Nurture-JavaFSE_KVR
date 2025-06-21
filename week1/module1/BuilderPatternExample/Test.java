public class Test {
    public static void main(String args[]) {
        Computer obj = new Computer.Builder("HP 15")
                            .setCPU("AMD Ryzen 5000")
                            .setRAM("8GB")
                            .setStorage("512GB")
                            .build();
        System.out.println(obj);
    }
}