import static org.junit.jupiter.api.Assertions.*;

class CurrentArrayTest {

    @org.junit.jupiter.api.Test
    void valueArray() {
        CurrentArray array=new CurrentArray(4,1);
        array.valueArray(1,4);
        assertEquals(1,array.getValue(4));//без ошибки
    }

    @org.junit.jupiter.api.Test
    void deleteValue() {
        CurrentArray array=new CurrentArray(4,1);
        array.valueArray(2,2);
        array.deleteValue(3);
        assertEquals(1,array.getValue(0));//без ошибки
    }

    @org.junit.jupiter.api.Test
    void getValue() {
        CurrentArray array=new CurrentArray(3,1);
        array.valueArray(2,1);
        assertEquals(1,array.getValue(3));//без ошибки
    }
}