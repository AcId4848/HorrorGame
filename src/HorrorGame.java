import java.io.IOException;
import java.util.Scanner;

public class HorrorGame {
    public static String variant = " ";
    public static Character visitor;
    public static Story story;
    public static int variant_int;

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
            while (true) {
                try {
                    variant = in.nextLine();

                    if (!isNumeric(variant)) {
                        throw new IllegalArgumentException("Введено не число\n");
                    }
                    variant_int = Integer.parseInt(variant);

                    if (variant_int < 1 || variant_int > 3) {
                        throw new IllegalArgumentException("Число должно быть от 1 до 3 включительно\n");
                    }
                    break;
                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                }
            }
            story.go(variant_int);
            System.out.println("Некорректный ввод, введите число от 1 до 3:");
        }
    }
    private static boolean isNumeric(String variant) {
        for (char c : variant.toCharArray()) {
            if (!java.lang.Character.isDigit(c)) {
                return false;
            }
        }
        return true;
    }

}