package suitlistener;

import org.testng.ISuite;
import org.testng.ISuiteListener;

public class ISuitListenerDemo implements ISuiteListener {
    @Override
    public void onStart(ISuite suite) {
        System.out.println("Suite is started :" + suite.getName());

    }

    @Override
    public void onFinish(ISuite suite) {
        System.out.println("Suite is ended");
    }
}
