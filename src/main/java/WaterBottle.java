public class WaterBottle {
    private int volume;

    public WaterBottle(int volume){
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void drink(){
        this.volume -= 10;
    }

    public void empty(){
        setVolume(0);
    }

    public void refill(){
        setVolume(100);
    }
}
