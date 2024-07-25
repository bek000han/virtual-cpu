package comps.memory;

public class SetOnlyRegister {
    private byte data;

    public SetOnlyRegister() {
        this.data = 0x00000000;
    }

    public void set(byte input) {
        this.data = input;
    }

    public byte contents() {
        return this.data;
    }
    
}
