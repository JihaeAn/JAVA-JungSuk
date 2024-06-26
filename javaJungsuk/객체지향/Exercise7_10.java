package javaJungsuk.객체지향;

import java.util.Stack;

class MyTv2{
    private boolean isPowerOn;
    private int     channel;
    private int     volume;
    private int     prevChannel;

    final int MAX_VOLUME = 100;
    final int MIN_VOLUME = 0;
    final int MAX_CHANNEL = 100;
    final int MIN_CHANNEL = 1;

    public int getChannel() {
        return channel;
    }

    public void setChannel(int channel) {
        if(channel > MAX_CHANNEL || channel < MIN_CHANNEL) return;

        prevChannel = this.channel;     // 현재 채널을 이전 채널에 저장
        this.channel = channel;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        if(volume > MAX_VOLUME || volume < MIN_VOLUME) return;

        this.volume = volume;
    }

    void gotoPervChannel(){
        setChannel(prevChannel);    // 현재 채널을 이전 채널로 변경
        // this.channel = prevChannel;
    }
}
public class Exercise7_10 {
    public static void main(String[] args) {
        MyTv2 t = new MyTv2();

        t.setChannel(10);
        System.out.println("CH: " + t.getChannel());
        t.setVolume(20);
        System.out.println("CH: " + t.getVolume());
    }
}
