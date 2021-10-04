public class CheckDuplicates {
    // Dit gaan we later gebruiken om te controleren op duplicaten en deze duplicaten weg te halen.
    public static <T> List getDuplicate(Collection<T> list) {

        final List<T> duplicatedObjects = new ArrayList<T>();
        Set<T> set = new HashSet<T>() {
            @Override
            public boolean add(T e) {
                if (contains(e)) {
                    duplicatedObjects.add(e);
                }
                return super.add(e);
            }
        };
        for (T t : list) {
            set.add(t);
        }
        return duplicatedObjects;
    }


    public static <T> boolean hasDuplicate(Collection<T> list) {
        if (getDuplicate(list).isEmpty())
            return false;
        return true;
    }
}
