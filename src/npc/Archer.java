package npc;

// Клас Archer, що наслідує NPC
public class Archer extends NPC {
    private int archerySkill;

    // Конструктор
    public Archer(String skin, String voice, int archerySkill) {
        super(skin, voice);
        this.archerySkill = archerySkill;
    }

    // Реалізація методів
    @Override
    public void walk() {
        System.out.println("Archer is walking with agility.");
    }

    @Override
    public void speak() {
        System.out.println("Archer says: 'Ready to shoot!'");
    }

    // Метод для стрільби
    public void shootArrow() {
        System.out.println("Archer shoots an arrow with skill level " + archerySkill);
    }

    // Геттер для archerySkill
    public int getArcherySkill() {
        return archerySkill;
    }
}
