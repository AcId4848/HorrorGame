import java.util.Scanner;

public class HorrorGame {
    public static Character visitor;
    public static Story story;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Вы работаете доставщиком пиццы. И вот вам назначили очередной заказ.\n"
                + "Как только вам пришло уведомление вы сразу ощутили что это будет не обычный заказ...\n"
                + "Но всё же надо съездить. Да и причём дом в который надо привезти пиццу находится недалеко.\n"
                + "Вы быстро собрали заказ и поехали. Но прежде чем начать историю вам нужно ввести своё имя:");
        visitor = new Character(in.next());
        story = new Story();
        while (true) {
            visitor.fear_level += story.current_situation.dFear_level;
            visitor.hp += story.current_situation.dHP;
            visitor.bonus += story.current_situation.dBonus;
            System.out.println("=====\nУровень страха:" + visitor.fear_level + "\tПолоска жизни:"
                    + visitor.hp + "\tБонусы:" + visitor.bonus + "\n=====");
            System.out.println("============="
                    + story.current_situation.subject + "==============");
            System.out.println(story.current_situation.text);
            if (story.isEnd()) {
                System.out
                        .println("====================the end!===================");
                return;
            }
            story.go(in.nextInt());
        }
    }
}