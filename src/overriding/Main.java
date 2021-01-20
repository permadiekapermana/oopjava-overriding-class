public class Main {
    public static void main(String[] args) {
        System.out.println("Hero dari class Hero");
        Hero hero1 = new Hero();
        hero1.name = "Zilong";
        hero1.showHero();
        System.out.println();

        System.out.println("Hero dari class Hero Tank");
        HeroTank hero2 = new HeroTank();
        hero2.name = "Johnson";
        hero2.deffPoint = 500;
        hero2.showHero();
    }
}
