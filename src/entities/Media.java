package entities;

public abstract class Media {

    // ATTRIBUTI COMUNI anche alle sottoclassi
    private final String title;

    // COSTRUTTORI
    public Media(String title) {
        this.title = title;
    }

    // GETTER
    public String getTitle() {
        return this.title;
    }

    public abstract void avvia();


    @Override
    public String toString() {
        return "Media{" +
                "title='" + title + '\'' +
                '}';
    }

    // SETTER
}
