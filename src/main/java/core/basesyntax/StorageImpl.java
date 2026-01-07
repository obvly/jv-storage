package core.basesyntax;

public class StorageImpl<K, V> implements Storage<K, V> {
    private static final int MAX_ITEMS = 10;
    private int size;
    private V[] values;
    private K[] keys;

    public StorageImpl() {
        this.keys = (K[]) new Object[MAX_ITEMS];
        this.values = (V[]) new Object[MAX_ITEMS];
        }

        @Override
        public void put(K key, V value) {
            for (int i = 0; i < size; i++) {
                if (keys[i] == key || (keys[i] != null && keys[i].equals(key))) {
                    values[i] = value;
                    return;
                }
            }
        }
            @Override
        public V get(K key) {
        for (int i = 0; i< size; i++) {
            if (keys[i] == key || (keys[i] != null && keys[i].equals(key))) {
                return values[i];
            }
        }
        return null;
    }

    @Override
    public int size() {
        return size;
    }
}
