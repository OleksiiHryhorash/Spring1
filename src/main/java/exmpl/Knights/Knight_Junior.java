package exmpl.Knights;

import exmpl.Intefaces.Knight_Interface;
import exmpl.Intefaces.Quest;

public class Knight_Junior implements Knight_Interface {
    private Quest quest;

    public Knight_Junior() {

    }

    public Knight_Junior(Quest quest) {
        this.quest = quest;
    }

    public void wakeUp() {
        System.out.println("Knight_Junior wake up...");
    }

    public void sleep() {
        System.out.println("Knight_Junior sleep...ZzZ");
    }

    public Quest getQuest() {
        return quest;
    }

    public void setQuest(Quest quest) {
        this.quest = quest;
    }
}
