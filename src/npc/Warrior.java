package npc;

// Клас Warrior, що наслідує NPC
public class Warrior extends NPC {
    private int level;

    // Конструктор
    public Warrior(String skin, String voice, int level) {
        super(skin, voice);
        this.level = level;
    }

    // Реалізація методів
    @Override
    public void walk() {
        System.out.println("Warrior is walking with strength.");
    }

    @Override
    public void speak() {
        System.out.println("Warrior says: 'Prepare for battle!'");
    }

    // Метод для боротьби
    public void fight() {
        System.out.println("Warrior is fighting with power level " + level);
    }

    // Геттер для level
    public int getLevel() {
        return level;
    }
}
