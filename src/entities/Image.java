package entities;

import interfaces.Brighter;
import interfaces.Shower;

public class Image extends Media implements Shower, Brighter {
    // ATTRIBUTI
    private int brightness;

    // CONSTRUTTORE
    public Image(String title, int brightness) {
        super(title);
        this.brightness = brightness;
    }


    //METODI
    @Override
    public String showBrightness() {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < this.brightness; i++) {
            builder.append("*");
        }
        return builder.toString();
    }

    @Override
    public void avvia() {
        show();
    }

    @Override
    public String toString() {
        return "Image{" +
                "brightness=" + brightness +
                "} " + super.toString();
    }

    @Override
    public void show() {
        System.out.println(getTitle() + showBrightness());
    }
}
