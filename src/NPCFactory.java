import npc.Archer;
import npc.NPC;
import npc.Warrior;

// Фабрика для створення npc.NPC
public class NPCFactory {
    public NPC getNPC(String skin, String voice, String type) {
        if ("npc.Warrior".equalsIgnoreCase(type)) {
            return new Warrior(skin, voice, 1); // Встановлюється рівень за замовчуванням
        } else if ("npc.Archer".equalsIgnoreCase(type)) {
            return new Archer(skin, voice, 5); // Встановлюється рівень стрільця за замовчуванням
        }
        return null;
    }
}
