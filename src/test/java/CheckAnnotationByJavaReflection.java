//import java.lang.annotation.Annotation;
//import java.lang.reflect.InvocationTargetException;
//import java.lang.reflect.Method;
//
//public class CheckAnnotationByJavaReflection {
//    public static void main(String[] args) throws IllegalAccessException, InstantiationException, InvocationTargetException {
//        TestExample testExample = new TestExample();
//        Class<? extends TestExample> clazz = testExample.getClass();
//        Annotation[] annotations = clazz.getAnnotations();
//        TesterInfo testerInfo = (TesterInfo) annotations[0];
//        for (String s : testerInfo.tags()) {
//            System.out.println(s);
//        }
//        Method[] declaredMethods = clazz.getDeclaredMethods();
//        for (Method declaredMethod : declaredMethods) {
//            Annotation[] annotations1 = declaredMethod.getAnnotations();
//            for (Annotation annotation : annotations1) {
//                Test test = (Test) annotation;
//                if (test.enabled()) {
//                    declaredMethod.invoke(clazz.newInstance());
//                }
//            }
//        }
//    }
//}
