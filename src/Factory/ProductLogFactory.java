package Factory;

import aspect.LoggerAspect;
import service.ProductService;
import service.ProductServiceImpl;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProductLogFactory {

//    public static ProductService createService(){
//        //目标类
//        final ProductService productService = new ProductServiceImpl();
//        //切面类
//        final LoggerAspect loggerAspect = new LoggerAspect();
//
//        //代理类
//        ProductService proxyService = (ProductService) Proxy.newProxyInstance(
//                LoggerAspect.class.getClassLoader(),  //参数1
//                productService.getClass().getInterfaces(),  //参数2
//                new InvocationHandler() {                  //参数3
//                    @Override
//                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
//
//                        //前执行
//                        loggerAspect.before();
//
//                        //执行目标类方法
//                        Object obj = method.invoke(productService,args);
//
//                        //后执行
//                        loggerAspect.after();
//
//                        return obj;
//                    }
//                }
//        );
//        return proxyService;      //返回创建的代理类对象
//    }
}
