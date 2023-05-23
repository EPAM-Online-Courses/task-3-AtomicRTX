package efs.task.oop;

public class Main {
    public static void main(String[] args) {
        Villager kashya = new Villager("Kashya", 30);
        Villager akara = new ExtraordinaryVillager("Akara", 40, ExtraordinaryVillager.Skill.SHELTER);
        Villager gheed = new Villager("Gheed", 50);
        Villager deckardCain = new ExtraordinaryVillager("Deckard Cain", 85, ExtraordinaryVillager.Skill.IDENTIFY);
        Villager warriv = new Villager("Warriv", 35);
        Villager flawia = new Villager("Flawia", 25);

        kashya.sayHello();
        akara.sayHello();
        gheed.sayHello();
        deckardCain.sayHello();
        warriv.sayHello();
        flawia.sayHello();


        Object objectDeckardCain = deckardCain;
        Object objectAkara = akara;

        while(Monsters.getMonstersHealth() > 0){
            if(Monsters.andariel.getHealth() > 0) {
                epicFight(kashya, Monsters.andariel);
                epicFight(gheed, Monsters.andariel);
                epicFight(warriv, Monsters.andariel);
                epicFight(flawia, Monsters.andariel);
            }
            if(Monsters.blacksmith.getHealth() > 0){
                epicFight(kashya, Monsters.blacksmith);
                epicFight(gheed, Monsters.blacksmith);
                epicFight(warriv, Monsters.blacksmith);
                epicFight(flawia, Monsters.blacksmith);
            }
        }
        System.out.println("Obozowisko ocalone!");
        deckardCain = (ExtraordinaryVillager) objectDeckardCain;
        akara = (ExtraordinaryVillager) objectAkara;

        akara.sayHello();
    }

    public static void epicFight(Villager vil, Monster mon){
        System.out.println("Potwory posiadaja jeszcze " + mon.getHealth() + " punkty zycia");
        System.out.println("Aktualnie walczacy osadnik to " + vil.name);
        vil.attack(mon);
        mon.attack(vil);
    }
}
