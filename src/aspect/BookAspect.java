package aspect;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

import java.lang.reflect.Method;
import java.sql.SQLOutput;

public class BookAspect implements MethodInterceptor {
    @Override
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {

       // Method method = methodInvocation.getMethod();

        Object obj = methodInvocation.proceed();



        return obj;
    }
}
