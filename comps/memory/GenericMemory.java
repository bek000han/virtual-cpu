package comps.memory;

import comps.Bus;

public abstract class GenericMemory {
    private byte data;
    private Bus stream;

    public GenericMemory(Bus reference) {
        this.data = 0x00000000;
        this.stream = reference;
    }

    public void set(byte input) {
        this.data = input;
    }
}
