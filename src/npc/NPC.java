package npc;

// Абстрактний клас NPC
public abstract class NPC {
    protected String skin;
    protected String voice;

    // Конструктор
    public NPC(String skin, String voice) {
        this.skin = skin;
        this.voice = voice;
    }

    // Абстрактні методи
    public abstract void walk();

    public abstract void speak();

    // Геттери
    public String getSkin() {
        return skin;
    }

    public String getVoice() {
        return voice;
    }
}
