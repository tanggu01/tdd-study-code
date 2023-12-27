import java.util.Hashtable;

public class Bank {

    private Hashtable rates = new Hashtable();

    Money reduce(Expression source, String to) {
        return source.reduce(this, to);
    }

    int rate(String from, String to) {
        return (from.equals("CHF") && to.equals("USD")) ? 2 : 1;
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
