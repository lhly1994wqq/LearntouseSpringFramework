package aspect;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.aspectj.lang.ProceedingJoinPoint;

public class LoggerAspect {
//    public void before(){
//        System.out.println("在添加商品前做些什么");
//    }
//    public void after(){
//        System.out.println("在添加商品后做些什么");
//    }

    public Object log(ProceedingJoinPoint joinPoint) throws Throwable {

        //前执行
        System.out.println("在操作商品前做些什么");

        //手动执行目标方法
        Object obj = joinPoint.proceed();

        //后执行
        System.out.println("在操作商品后做些什么");
        return obj;
    }
}
