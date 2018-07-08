//import com.mkyong.config.Test;
//import com.mkyong.config.TestInfor;
//
//import java.lang.annotation.Annotation;
//import java.lang.reflect.Method;
//
//public class RunTest {
//
//    public static void main(String[] args) throws Exception {
//
//        System.out.println("Testing...");
//
//        int passed = 0, failed = 0, count = 0, ignore = 0;
//
//        Class<TestExample> obj = TestExample.class;
//
//        // Process @TestInfor
//        if (obj.isAnnotationPresent(TestInfor.class)) {
//
//            Annotation annotation = obj.getAnnotation(TestInfor.class);
//            TestInfor TestInfor = (TestInfor) annotation;
//
//
//
//        // Process @Test
//        for (Method method : obj.getDeclaredMethods()) {
//
//            // if method is annotated with @Test
//            if (method.isAnnotationPresent(Test.class)) {
//
//                Annotation annotation = method.getAnnotation(Test.class);
//                Test test = (Test) annotation;
//
//                // if enabled = true (default)
//                if (test.enabled()) {
//
//                    try {
//                        method.invoke(obj.newInstance());
//                        System.out.printf("%s - Test '%s' - passed %n", ++count, method.getName());
//                        passed++;
//                    } catch (Throwable ex) {
//                        System.out.printf("%s - Test '%s' - failed: %s %n", ++count, method.getName(), ex.getCause());
//                        failed++;
//                    }
//
//                } else {
//                    System.out.printf("%s - Test '%s' - ignored%n", ++count, method.getName());
//                    ignore++;
//                }
//
//            }
//
//        }
//        System.out.printf("%nResult : Total : %d, Passed: %d, Failed %d, Ignore %d%n", count, passed, failed, ignore);
//
//    }
//}
