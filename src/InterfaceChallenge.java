import java.util.ArrayList;
import java.util.List;

public class InterfaceChallenge {
    public static void main(String[] args) {
        List<Mappable> mappables = new ArrayList<>();

        mappables.add(new Building("Sydney Opera House", UsageType.ENTERTAINMENT));
        mappables.add(new Building("Sydney Town Hall", UsageType.GOVERNMENT));
        mappables.add(new Building("Accor Stadium", UsageType.SPORTS));
        mappables.add(new Building("Centenary", UsageType.RESIDENTIAL));

        mappables.add(new UtilityLine("George St", UtilityType.GAS));
        mappables.add(new UtilityLine("Gleeson Ave", UtilityType.ELECTRICAL));
        mappables.add(new UtilityLine("Hunter St", UtilityType.FIBER_OPTIC));
        mappables.add(new UtilityLine("College St", UtilityType.WATER));

        for (var m : mappables) {
            Mappable.mapIt(m);
        }
    }
}

enum Geometry {LINE, POINT, POLYGON}
enum Color {BLACK, BLUE, GREEN, ORANGE, RED}
enum PointMarkers {CIRCLE, SQUARE, PUSH_PIN, STAR, TRIANGLE}
enum LineMarkers {DASHED, DOTTED, SOLID}
interface Mappable {
    String JSON_PROPERTY = """
            "properties": {%s}""";
    String getLabel();
    Geometry getShape();
    String getMarker();
    default String toJSON() {
        return """
                "type" : "%s", "label" : "%s", "marker" : "%s" """
                .formatted(getShape(), getLabel(), getMarker());
    }
    static void mapIt(Mappable mappable) {
        System.out.println(JSON_PROPERTY.formatted(mappable.toJSON()));
    }
}

enum UsageType {GOVERNMENT, ENTERTAINMENT, RESIDENTIAL, SPORTS}
class Building implements Mappable {
    private String name;
    private UsageType usage;

    public Building(String name, UsageType usage) {
        this.name = name;
        this.usage = usage;
    }

    @Override
    public String getLabel() {
        return name + " (" + usage + ")";
    }

    @Override
    public Geometry getShape() {
        return Geometry.POINT;
    }

    @Override
    public String getMarker() {
        return switch (usage) {
            case GOVERNMENT -> Color.RED + " " + PointMarkers.STAR;
            case ENTERTAINMENT -> Color.GREEN + " " + PointMarkers.TRIANGLE;
            case RESIDENTIAL -> Color.BLUE + " " + PointMarkers.SQUARE;
            case SPORTS-> Color.ORANGE + " " + PointMarkers.PUSH_PIN;
            default -> Color.BLACK + " " + PointMarkers.CIRCLE;
        };
    }

    @Override
    public String toJSON() {
        return Mappable.super.toJSON() + """
                , "name": "%s", "usage": "%s" """.formatted(name, usage);
    }
}

enum UtilityType {ELECTRICAL, FIBER_OPTIC, GAS, WATER}
class UtilityLine implements Mappable {
    private String name;
    private UtilityType type;

    public UtilityLine(String name, UtilityType type) {
        this.name = name;
        this.type = type;
    }

    @Override
    public String getLabel() {
        return name + " (" + type + ")";
    }

    @Override
    public Geometry getShape() {
        return Geometry.LINE;
    }

    @Override
    public String getMarker() {
        return switch (type) {
            case ELECTRICAL -> Color.RED + " " + LineMarkers.DASHED;
            case FIBER_OPTIC -> Color.GREEN + " " + LineMarkers.DOTTED;
            case GAS -> Color.ORANGE + " " + LineMarkers.SOLID;
            case WATER -> Color.BLUE + " " + LineMarkers.SOLID;
            default -> Color.BLACK + " " + LineMarkers.SOLID;
        };
    }

    @Override
    public String toJSON() {
        return Mappable.super.toJSON() + """
                , "name": "%s", "utility: "%s" """.formatted(name, type);
    }
}