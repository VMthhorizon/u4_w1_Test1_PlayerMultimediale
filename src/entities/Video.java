package entities;

import interfaces.*;

public class Video extends Media implements Player, Brighter, Volumer, VolumeDecreaser, VolumeIncreaser {
    // ATTRIBUTI
    private int duration;
    private int volume;
    private final int brightness;

    // CONSTRUCTOR
    public Video(String title, int duration, int volume, int brightness) {
        super(title); // Implemento il costruttore della sueprclasse dalla quale eredita, ossia Media
        this.duration = duration;
        this.volume = volume;
        this.brightness = brightness;
    }

    //METODI

    public String showBrightness() {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < this.brightness; i++) {
            builder.append("*");
        }
        return builder.toString();
    }

    @Override
    public String showVolume() {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < this.volume; i++) {
            builder.append("!");
        }
        return builder.toString();
    }

    @Override
    public void play() {
        for (int i = 0; i < this.duration; i++) {
            System.out.println(getTitle() + showBrightness() + showVolume());
        }
    }

    @Override
    public int subtractVolume(int num) {
        return this.volume -= num;
    }

    @Override
    public int addVolume(int num) {
        return this.volume += num;
    }

    @Override
    public void avvia() {
        play();
    }

    @Override
    public String toString() {
        return "Video{" +
                "duration=" + duration +
                ", volume=" + volume +
                ", brightness=" + brightness +
                "} " + super.toString();
    }
}
