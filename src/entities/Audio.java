package entities;

import interfaces.Player;
import interfaces.VolumeDecreaser;
import interfaces.VolumeIncreaser;
import interfaces.Volumer;

public class Audio extends Media implements Player, Volumer, VolumeIncreaser, VolumeDecreaser {

    // ATTRIBUTI
    private final int duration;
    private int volume;

    // COSTRUTTORI
    public Audio(String title, int duration, int volume) {
        super(title); // Implemento il costruttore della sueprclasse dalla quale eredita, ossia Media
        this.duration = duration;
        this.volume = volume;
    }

    // GETTER


    // SETTER

    // METODI
    public void abbassaVolume(int reduceVolume) {
        this.volume -= reduceVolume;
    }

    public void alzaVolume(int addVolume) {
        this.volume += addVolume;
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
            System.out.println(getTitle() + showVolume());
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
        return "Audio{" +
                "duration=" + duration +
                ", volume=" + volume +
                "} " + super.toString();
    }
}
