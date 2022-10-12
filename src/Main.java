public class Main {

    public static void main(String[] args) {

        MagicBox<Integer> integerMagicBox = new MagicBox<>(Integer[].class, 6);
        MagicBox<String> stringMagicBox = new MagicBox<>(String[].class, 6);

        // Заполним коробки
        int j = 0;
        while (integerMagicBox.add(++j)) {
        }
        j = 0;
        while (stringMagicBox.add(String.format("%3d", ++j))) {
        }
        //Достанем из коробок по 6 значений
        for (int i = 0; i < 6; i++) {
            System.out.printf("<Integer>:%3d  <String>: %s\n",
                    integerMagicBox.pick(), stringMagicBox.pick());
        }
    }
}