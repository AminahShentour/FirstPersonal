//package Sort;

//public class Model {}

/*public class SortThings {

    static class Thing {
        public final String name;
        public final int score;
        public Thing(String name, int score) {
            this.name = name;
            this.score = score;
        }
        @Override
        public String toString() {
            return "(" + name + ", " + score + ")";
        }
    }

    public static void main(String[] args) {
        Collection<Thing> things = Arrays.asList(
            new Thing("a", 3),
            new Thing("a", 9),
            new Thing("b", 7),
            new Thing("b", 10),
            new Thing("c", 8),
            new Thing("c", 3)
        );

        SortedSet<SortedSet<Thing>> sortedGroups = sortThings(things);

        System.out.println(sortedGroups);
    }

    private static SortedSet<SortedSet<Thing>> sortThings(Collection<Thing> things) {
        final Comparator<Thing> compareThings = new Comparator<Thing>() {
            public int compare(Thing a, Thing b) {
                Integer aScore = a.score;
                Integer bScore = b.score;
                return aScore.compareTo(bScore);
            }
        };

        // first pass
        Map<String, SortedSet<Thing>> groups = new HashMap<String, SortedSet<Thing>>();
        for (Thing obj: things) {
            SortedSet<Thing> group = groups.get(obj.name);
            if (group == null) {
                group = new TreeSet<Thing>(compareThings);
                groups.put(obj.name, group);
            }
            group.add(obj);
        }

        // second pass
        SortedSet<SortedSet<Thing>> sortedGroups = new TreeSet<SortedSet<Thing>>(new Comparator<SortedSet<Thing>>() {
            public int compare(SortedSet<Thing> a, SortedSet<Thing> b) {
                return compareThings.compare(a.last(), b.last());
            }
        });
        sortedGroups.addAll(groups.values());
        return sortedGroups;
    }

}
*/
