import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Task1Test {
    //Тест1 для проверки правильность фильтрации
    @Test
    void filteringTest1() {
        //Создать переменную для сохранения данных от filterList для дальнейшего сравнивания
        var methodResult = Task1.filterList(List.of(1, 2, "a", "b"));
        //Создать лист для хранения ожидаемого результата
        List<Object> expectedResult = List.of(1, 2);
        //Сравнить результаты
        assertEquals(expectedResult, methodResult);

    }

    //Тест2 для проверки правильность фильтрации
    @Test
    void filteringTest2() {
        //Создать переменную для сохранения данных от filterList для дальнейшего сравнивания
        var methodResult = Task1.filterList(List.of(1, 2, "a", "b", 0, 15));
        //Создать лист для хранения ожидаемого результата
        List<Object> expectedResult = List.of(1, 2, 0, 15);
        //Сравнить результаты
        assertEquals(expectedResult, methodResult);

    }

    //Тест3 для проверки правильность фильтрации
    @Test
    void filteringTest3() {
        //Создать переменную для сохранения данных от filterList для дальнейшего сравнивания
        var methodResult = Task1.filterList(List.of(1, 2, "a", "b", "aasf", "1", "123", 231));
        //Создать лист для хранения ожидаемого результата
        List<Object> expectedResult = List.of(1, 2, 231);
        //Сравнить результаты
        assertEquals(expectedResult, methodResult);
    }
    //Тест для проверки в случае введенного пустого листа
    @Test
    void EmptyListCheckTest() {
        assertThrows(NullPointerException.class, () -> Task1.filterList(List.of()));
    }
    //Тест для проверки в случае если в отрицательного числа
    @Test
    void NegativeNumberCheckTest() {
        assertThrows(IllegalArgumentException.class, () -> Task1.filterList(List.of(-9, 36)));
    }

}