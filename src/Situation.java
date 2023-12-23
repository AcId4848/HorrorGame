public class Situation {
  Situation[] direction;
  String subject, text;
  int dFear_level, dHP, dBonus;
  public Situation (String subject, String text, int variants, int dfear_level, int dhp, int dbonus) {
    this.subject = subject;
    this.text = text;
    dFear_level = dfear_level;
    dHP = dhp;
    dBonus= dbonus;
    direction = new Situation[variants];
  }
}
