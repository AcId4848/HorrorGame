public class Story { Situation current_situation;
  Story() {
    start_story = new Situation(
            "Первая комната",
            "Вы только зашли в комнату и сразу же почувствовали запах... Сгоревших блинов."
                    +" Скорее всего тот кто их готовил делал это впервые, но сейчас не об этом.\n"
                    +"Вы видите перед собой три двери.\n"
                    +"(1)Первая дверь белого цвета \n"
                    +"Она выглядит довольно безобидно, но в глубине души вы чувствуете, что она может быть опасной.\n"
                    +"(2)Вторая дверь черного цвета.\n"
                    +"Она выглядит мрачно и зловеще. Вы уверены, что за ней скрывается что-то ужасное.\n"
                    +"(3)Третья дверь красного цвета.\n"
                    +"Она выглядит страстно и соблазнительно. Вы чувствуете, что она может привести вас в рай или ад.\n"
                    +"  \n"
                    +"Какую дверь вы выберете?", 3, 0, 0, 0);
    start_story.direction[0] = new Situation(
            "Вы открываете первую дверь и видите перед собой длинную тёмную лестницу.\n"
                    +"Вы начинаете подниматься по лестнице, и страх нарастает с каждым шагом.\n"
                    +"Чем выше вы поднимаетесь, тем сильнее вы чувствуете запах сгоревших блинов.\n"
                    +"И вот вы переступаете последнюю ступеньку, и видите слегка приоткрытую железную дверь.\n"
                    +"Вы заходите в эту комнату... И видите... Артура пирожкова???\n"
                    +"Он стоит у плиты и жарит блины. Вы медленно подходите к нему и спрашиваете:\n"
                    +"-Что вы здесь делаете?\n"
                    +"-Блинчики жарю\n"
                    +"-Что то плоховато они получаются у вас\n"
                    +"-ЧТООООООООООООООООООО???\n"
                    +"Артурчик разозлился и дал вам сковородой по голове. Вы мертвы", 0, 0, +20, -10, 0);
    start_story.direction[1] = new Situation(
            "Вы открываете вторую дверь и видите перед собой тёмный коридор.\n"
                    +"Вы начинаете идти по коридору, страх нарастает с каждым шагом.\n"
                    +"С каждым шагом вы начинаете замечать что всё сильнее и сильнее что то шумит в конце коридора.\n"
                    +"Наконец вы добираетесь до приоткрытой деревянной двери.\n"
                    +"Зайдя в комнату вы поняли откуда этот шум. Здесь стоит большое количество включенных старых телевизоров.\n"
                    +"Перед вами стоит стол, на столе стоит шкатулка. Недолго думая вы открываете её и берёте оттуда пульт.\n"
                    +"На нём единственная красная кнопка. Вы нажали на неё.\n"
                    +"На всех теликах показалась одна и та же картинка.\n"
                    +"К сожалению вы не поняли что на ней изображено, но вы поняли что на ней какое то послание от предков.\n"
                    +"Вы поняли что вам нужно во что бы то ни стало разгадать этот ребус.\n", 0, 0, -10, 0, 1);
    start_story.direction[2] = new Situation(
            "Вы открываете красную дверь и попадаете в прекрасный сад. В саду цветут цветы, поют птицы\n"
                    +"и вы слышите журчание фонтана, что находится неподалёку. Вы начинаете бродить по саду и вы чувствуете,\n"
                    +"что страх покидает вас. Вы начинаете чувствовать себя расслабленным и счастливым.\n"
                    +"Вы дошли до домика среди деревьев. Он был маленьким на вид, ни чем не примечательным.\n"
                    +"Вы решили заглянуть в него и открыли дверь. Как только вы шагнули в него вы ужаснулись.\n"
                    +"Снаружи этот дом казался совсем крохотным, а на самом деле внутри этого дома находились огромные комнаты.\n"
                    +"Вы решили зайти в одну из них. Дверь за вами захлопнулась. Посреди комнаты стоит маленькая табуретка.\n"
                    +"Вы решили медленно подойти к табуретке, но у вас это не получилось... Свет заморгал и на табуретке вы увидели\n"
                    +"что-то непонятное. Это существо смотрело на вас. С каждым миганием света вы всё больше и больше ощущали страх.\n"
                    +"Непонятное существо встало с табурета и протянуло вам руку. Оно сказало..."
                    +"После данного заявления вам не нашлось что сказать и вы пошли за клубникой.", 0, 0, -30, 0, 1);
    public void go(int num) {
      if (num <= current_situation.direction.length)
        current_situation = current_situation.direction[num - 1];
      else
        System.out.println("Вы можете выбрать из " + current_situation.direction[num - 1]);

    }

  }
}
  private Situation start;
  public
