public class Computer {
    private String Model;
    private String CPU;
    private String RAM;
    private String Storage;

    private Computer(Builder b) {
        this.Model = b.Model;
        this.CPU = b.CPU;
        this.RAM = b.RAM;
        this.Storage = b.Storage;
    }

    public static class Builder {
        private String Model;
        private String CPU;
        private String RAM;
        private String Storage;

        public Builder(String Model) {
            this.Model = Model;
        }
        public Builder setCPU(String c) {
            this.CPU = c;
            return this;
        }
        public Builder setRAM(String r) {
            this.RAM = r;
            return this;
        }
        public Builder setStorage(String s) {
            this.Storage = s;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }


    }
}