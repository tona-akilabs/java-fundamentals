package lang;

public class PatternRecordDestruction {
    record Graduate(String name, String degree, int year){}

    void main() {
        // Create some Graduate records
        Object[] grads = {
            new Graduate("Alice", "BSc", 2020),
            new Graduate("Bob", "MSc", 2021),
            new Graduate("Charlie", "PhD", 2022)
        };
        // with instanceof:
        for (Object o : grads) {
            if (o instanceof Graduate(var nm, var deg, var year)) {
                System.out.printf("%s graduated %d with a %s\n", nm, year, deg);
            }
        }

        // pattern match in switch:
        for (Object o : grads) {
            switch(o) {
                case Graduate(var nm, var deg, var year) ->
                        System.out.printf("%s graduated %d with a %s\n", nm, year, deg);
                default -> {}
            }
        }
    }
}
