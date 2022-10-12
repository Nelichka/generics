import java.lang.reflect.Array;
import java.util.Random;

public class MagicBox<T> {
    protected T[] items;
    protected int itemCount = 0;



    public MagicBox(int maxObject) {
        this.items = (T[]) new Object[maxObject];
       Random random = new Random();

    }

    public MagicBox(Class<T[]> randomInt, int maxObject) {
        this.items = randomInt.cast(Array.newInstance(randomInt.getComponentType(), maxObject));
       Random random = new Random();
    }

    public boolean add(T item) {
        if (items.length > itemCount) {
            items[itemCount++] = item;
            return true;
        } else {
            return false;
        }
    }

    public T pick() throws RuntimeException {
        if (itemCount < items.length) {
            throw new RuntimeException(String.format("Коробка не полна, свободно: %3d", items.length - itemCount));
        }
        Random random = new Random() ;
        return items[random.nextInt(itemCount - 1)];
    }
}