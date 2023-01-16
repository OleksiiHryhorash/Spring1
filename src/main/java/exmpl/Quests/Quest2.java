package exmpl.Quests;

import exmpl.Intefaces.Quest;

public class Quest2 implements Quest {
    public void questStart() {
        System.out.println("Knight broke the main BOSS!!");
    }

    public void questEnd() {
        System.out.println("Knight get 500xp! Well done!");
    }
}
