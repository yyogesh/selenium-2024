package ihookable;

import org.testng.IHookCallBack;
import org.testng.IHookable;
import org.testng.ITestResult;

public class MyListener implements IHookable {
    @Override
    public void run(IHookCallBack iHookCallBack, ITestResult iTestResult) {
        Object[] paramterValues = iHookCallBack.getParameters();
        if(paramterValues[0].equals("parameter 3")) {
            System.out.println("Skip the required parameter");
        } else {
            iHookCallBack.runTestMethod(iTestResult);
        }
    }
}
