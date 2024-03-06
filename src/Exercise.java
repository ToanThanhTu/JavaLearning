import java.util.ArrayList;
import java.util.List;

public class Exercise {

    public static void main(String[] args) {

    }

}

interface ISaveable {
    List<String> write();
    void read(List<String> strings);
}

class Player implements ISaveable {
    private String name;
    private String weapon = "Sword";
    private int hitPoints;
    private int strength;

    public Player(String name, int hitPoints, int strength) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.strength = strength;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    @Override
    public List<String> write() {
        List<String> info = new ArrayList<>();
        info.add(getName());
        info.add(String.valueOf(getHitPoints()));
        info.add(String.valueOf(getStrength()));
        info.add(getWeapon());
        return info;
    }

    @Override
    public void read(List<String> strings) {
        if (strings == null || strings.isEmpty()) {
            return;
        }
        setName(strings.get(0));
        setHitPoints(Integer.parseInt(strings.get(1)));
        setStrength(Integer.parseInt(strings.get(2)));
        setWeapon(strings.get(3));
    }

    @Override
    public String toString() {
        return """
                Player{name='%s', hitPoints=%d, strength=%d, weapon='%s'}%n"""
                .formatted(getName(), getHitPoints(), getStrength(), getWeapon());
    }
}

class Monster implements ISaveable {
    private String name;
    private int hitPoints;
    private int strength;

    public Monster(String name, int hitPoints, int strength) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.strength = strength;
    }

    public String getName() {
        return name;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public int getStrength() {
        return strength;
    }

    @Override
    public List<String> write() {
        List<String> info = new ArrayList<>();
        info.add(getName());
        info.add(String.valueOf(getHitPoints()));
        info.add(String.valueOf(getStrength()));
        return info;
    }

    @Override
    public void read(List<String> strings) {
        if (strings == null || strings.isEmpty()) {
            return;
        }
        name = strings.get(0);
        hitPoints = Integer.parseInt(strings.get(1));
        strength = Integer.parseInt(strings.get(2));
    }

    @Override
    public String toString() {
        return """
                Monster{name='%s', hitPoints=%d, strength=%d}%n"""
                .formatted(getName(), getHitPoints(), getStrength());
    }
}