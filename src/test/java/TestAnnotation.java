import com.mkyong.config.*;

@TestInfor(
        name = "doan thanh",
        lastModified = "hallo",
        note = "thank"
)
class TestExample {
    @Test
    public void testA() {
        if (true)
            throw new RuntimeException("This test always failed");
    }

    @Test(enable = true)
    void testB() {
        if (false)
            throw new RuntimeException("This test always passed");
    }

    @Test(enable = true)
    void testC() {
        if (10 > 1) {
            // do nothing, this test always passed.
        }
    }

}