import java.util.Hashtable;

public class Bank {

    private Hashtable rates = new Hashtable();

    Money reduce(Expression source, String to) {
        return source.reduce(this, to);
    }

    int rate(String from, String to) {
        Integer rate = (Integer) rates.get(new Pair(from, to));
        return rate.intValue();
    }

    void addRate(String from, String to, int rate) {
        rates.put(new Pair(from, to), Integer.valueOf(rate));
    }

    private class Pair {
        private String key;
        private String value;

        public Pair(String key, String value) {
            this.key = key;
            this.value = value;
        }

        public boolean equals(Object object) {
            Pair pair = (Pair) object;
            return key.equals(pair.key) && value.equals(pair.value);
        }

        public int hashCode() {
            return 0;
        }
    }

}
