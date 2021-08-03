package practice6;
public class Pr06_19t {
    public static void main(String args[]) {
        MyTv1 t = new MyTv1();
        System.out.println(t);
        t.turnOnOff();
        t.channelDown();
        t.volumeDown();
        System.out.println(t);
        t.channelUp();
        t.volumeUp();
        t.turnOnOff();
        System.out.println(t);
    }

}
class MyTv1 {
    private boolean isPowerOn;
    private int channel;
    private int volume;

    final int MAX_VOLUME = 100;
    final int MIN_VOLUME = 0;
    final int MAX_CHANNEL = 100;
    final int MIN_CHANNEL = 1;

    @Override
    public String toString() {
        return "전원:"+isPowerOn+",CH:" + channel + ", VOL:" + volume;
    }

    public void setChannel(int channel) {
        if(isPowerOn==true)
            if(channel >= MAX_CHANNEL)
                channel=MIN_CHANNEL;
            else
                this.channel=channel;
    }

    public void setVolume(int volume) {
        if(isPowerOn==true)
            if(volume < MAX_VOLUME)
                this.volume = volume;
    }

    void turnOnOff() {
        isPowerOn=!isPowerOn;
    }
    void volumeUp() {
        if(isPowerOn==true)
        if(volume < MAX_VOLUME)
            volume++;
    }
    void volumeDown() {
        if(isPowerOn==true)
        if(volume > MIN_VOLUME)
            volume--;
    }
    void channelUp() {
        if(isPowerOn==true)
        if(channel >= MAX_CHANNEL)
            channel=MIN_CHANNEL;
        else
            channel++;
    }
    void channelDown() {
        if(isPowerOn==true)
        if(channel < MIN_CHANNEL)
            channel = MAX_CHANNEL;
        else
            channel--;
    }
}


