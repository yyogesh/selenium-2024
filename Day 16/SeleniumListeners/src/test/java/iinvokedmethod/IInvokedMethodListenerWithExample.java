package iinvokedmethod;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.*;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class IInvokedMethodListenerWithExample{
    @BeforeSuite
    public void method1() {
        System.out.println("before suite");
    }

    @BeforeMethod
    public void method2() {
        System.out.println("before method");
    }

    @Test
    public void method3() {
        System.out.println("test method 1 ");
    }

    @Test
    public void method4() {
        System.out.println("test method 2 ");
    }

    @AfterMethod
    public void method5() {
        System.out.println("after method");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("after suite");
    }

//    @Override
//    public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod) {
//       annotation.set
//    }
}
