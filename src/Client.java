import npc.Archer;
import npc.NPC;
import npc.Warrior;

// Клієнтський клас для використання фабрики та npc.NPC
public class Client {
    public static void main(String[] args) {
        // Створення NPCFactory
        NPCFactory npcFactory = new NPCFactory();

        // Створення npc.NPC через фабрику
        NPC warrior = npcFactory.getNPC("WarriorSkin", "WarriorVoice", "npc.Warrior");
        NPC archer = npcFactory.getNPC("ArcherSkin", "ArcherVoice", "npc.Archer");

        // Використання методів npc.NPC
        System.out.println("\nnpc.Warrior info:");
        warrior.walk();
        warrior.speak();
        ((Warrior) warrior).fight(); // Перетворення для доступу до специфічних методів

        System.out.println("\nnpc.Archer info:");
        archer.walk();
        archer.speak();
        ((Archer) archer).shootArrow(); // Перетворення для доступу до специфічних методів
    }
}
