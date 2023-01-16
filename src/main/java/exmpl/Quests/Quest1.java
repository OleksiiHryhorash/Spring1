package exmpl.Quests;

import exmpl.Intefaces.Quest;

public class Quest1 implements Quest {
    public void questStart() {
        System.out.println("Knight killed 10 mobs");
    }

    public void questEnd() {
        System.out.println("Knight get 100xp");
    }
}
