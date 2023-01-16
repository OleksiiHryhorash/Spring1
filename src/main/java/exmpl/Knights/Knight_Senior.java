package exmpl.Knights;

import exmpl.Intefaces.Quest;

public class Knight_Senior {
    private Quest quest;

    public Knight_Senior() {

    }

    public Knight_Senior(Quest quest) {
        this.quest = quest;
    }

    public void wakeUp() {
        System.out.println("Knight_Senior wake up...");
    }

    public void sleep() {
        System.out.println("Knight_Senior sleep...ZzZ");
    }

    public Quest getQuest() {
        return quest;
    }

    public void setQuest(Quest quest) {
        this.quest = quest;
    }
}
