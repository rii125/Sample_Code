public class Main {
  public static void main(String[] args) {
    // プレイヤーのインスタンスの初期化
    Player p = new Player();
    p.name = "rii_125";
    p.hp = 200;

    // 敵のインスタンスの初期化
    Enemy e = new Enemy();
    e.defffix = "お化けA";
    e.hp = 100;

    public static void enemySee(Enemy e) {
      System.out.println(e.deffix + "が現れた！");
    }


    public static void playerGameOver(Enemy e) {
      System.out.println(e.deffix + "の戦いで" + p.name + "はﾀﾋんだ");
      System.out.println("最終HPは" + p.hp);
    }
    // 冒険開始
    p.start();
    enemySee(e);
    p.attack(e);
    e.sleepAttack(p);
    p.sleep();
    e.attack(p);
    p.getUp();
    for (int i; i < 5; i++) {
      p.attack(e);
    }
    if (e.hp <= 100) {
      p.win(e);
    } else {
      e.attack(p);
      e.win(p);
      playerGameOver(e);
    }
  }
}
