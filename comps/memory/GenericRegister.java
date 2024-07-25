package comps.memory;

public abstract class GenericRegister {
    private byte data;
    private Bus stream;

    public GenericRegister(Bus reference) {
        this.data = 0x00000000;
        this.stream = reference;
    }

    public void enable() {
        this.stream.load(this.data);
    }

    public void set(byte input) {
        this.data = input;
    }
}
