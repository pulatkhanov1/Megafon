import java.util.List;
import java.util.stream.Collectors;

public class Task1 {
    public static void main(String[] args) {

    }

    public static List<Object> filterList(final List<Object> list) {
        // Проверка в наличии элементов в листе
        if (list.isEmpty()) {
            throw new NullPointerException("List is Empty");
        }
        // Фильтрация элементов с помощью потока(стрим)
        List<Object> filteredListOfObjects = list.stream()
        // Фильтрация Integer чисел
                .filter(obj -> obj instanceof Integer)
        // В случае негативных инпутов бросить исключение
                .filter(obj -> {
                    if ((Integer) obj < 0) {
                        throw new IllegalArgumentException("Entered Negative Number");
                    }
        // Конвертировать поток в лист
                    return true;
                }).collect(Collectors.toList());
        return filteredListOfObjects;
    }

}
