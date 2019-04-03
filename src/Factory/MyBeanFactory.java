package Factory;

import aspect.MyAspect;
import service.UserService;
import service.UserServiceImpl;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class MyBeanFactory {

//    public static UserService creatService(){
//        //1 Target
//        final UserService userService = new UserServiceImpl();
//        //2 Aspect
//        final MyAspect myAspect = new MyAspect();
//        //3 proxy
//        UserService proxService = (UserService) Proxy.newProxyInstance(
//                MyBeanFactory.class.getClassLoader(), userService.getClass().getInterfaces(),
//                new InvocationHandler() {
//                    @Override
//                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
//                        //before
//                        myAspect.before();
//                        //method of target
//                        Object object = method.invoke(userService,args);
//                        //after
//                        myAspect.after();
//                        return object;
//                    }
//                }
//        );
//        return proxService;
//    }
}
