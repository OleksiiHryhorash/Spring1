package exmpl;

import exmpl.Knights.Knight_Senior;
import exmpl.Knights.Knight_Junior;
import exmpl.Quests.Quest1;
import exmpl.Quests.Quest2;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("context.xml");

        Knight_Junior kj = ctx.getBean(Knight_Junior.class);
        Knight_Senior ks = ctx.getBean(Knight_Senior.class);

        kj.setQuest(ctx.getBean(Quest1.class));
        ks.setQuest(ctx.getBean(Quest2.class));

        kj.wakeUp();
        kj.getQuest().questStart();
        kj.getQuest().questEnd();
        kj.sleep();
        System.out.println("--------------------");
        ks.wakeUp();
        ks.getQuest().questStart();
        ks.getQuest().questEnd();
        ks.sleep();
    }
}