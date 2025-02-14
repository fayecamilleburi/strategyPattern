import java.util.*;

public class GameApp {

    public static void main(String[] args) {

        // Knight: Attacks with a sword; uses 3 strategies to defend
        Character knight = new Character(new SwingSword(), 
            Arrays.asList(new Shield(), new Dodge(), new CreateMagic()));
        knight.performAttack();
        knight.performDefense();

        System.out.println("--------------");

        // Wizard: Casts spells; uses magic barrier to defend
        Character wizard = new Character(new CastSpell(), 
            Arrays.asList(new CreateMagic()));
        wizard.performAttack();
        wizard.performDefense();

        System.out.println("--------------");

        // Archer: Shoots arrows; uses dodge to defend
        Character archer = new Character(new ShootArrow(), 
            Arrays.asList(new Dodge()));
        archer.performAttack();
        archer.performDefense();
    }
}