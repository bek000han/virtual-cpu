package comps;

public class Bus {
    private byte data;

    public Bus() {
        this.data = 0x00000000;
    }   
    
    public void load(byte data){
        this.data = data;
    }
}