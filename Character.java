import java.util.*;

public class Character {
    private AttackStrategy attackStrategy;
    private List<DefenseStrategy> defenseStrategy;

    public Character(AttackStrategy attackStrategy, List<DefenseStrategy> defenseStrategy) {
        this.attackStrategy = attackStrategy;
        this.defenseStrategy = defenseStrategy;
    }

    public void performAttack() {
        attackStrategy.attack();
    }

    public void performDefense() {
        for (DefenseStrategy strategy : defenseStrategy) {
            strategy.defend();
        }
    }
}