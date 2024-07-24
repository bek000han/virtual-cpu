package comps.memory;

import comps.Bus;

public class GPRegister extends GenericMemory {
    private byte data;
    private Bus stream;

    public GPRegister(Bus reference) {
        super(reference);
    }

    public void enable() {
        this.stream.load(this.data);
    }
}
