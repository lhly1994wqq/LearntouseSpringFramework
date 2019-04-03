package Factory;

import aspect.LoggerAspect;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;
import service.ProductService;
import service.ProductServiceImpl;

import java.lang.reflect.Method;

public class ProductLogFactory1 {

//    public static ProductServiceImpl createService(){
//        //目标类
//        final ProductServiceImpl productService = new ProductServiceImpl();
//        //切面类
//        final LoggerAspect loggerAspect = new LoggerAspect();
//        //代理类, 采用cglib, 底层创建目标类的子类
//        //核心类
//        Enhancer enhancer = new Enhancer();
//        //设置父类为目标类
//        enhancer.setSuperclass(productService.getClass());
//        //设置回调函数
//        enhancer.setCallback(new MethodInterceptor() {
//            @Override
//            public Object intercept(Object proxy, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
//
//                //前执行
//                loggerAspect.before();
//
//                //执行目标类的方法
//                Object obj = method.invoke(productService,args);
//                //执行代理类的父类  目标类是代理类的父类
//                methodProxy.invokeSuper(proxy,args);
//
//                //后执行
//                loggerAspect.after();
//
//                return obj;
//            }
//        });
//        //创建代理
//        ProductServiceImpl proxyService = (ProductServiceImpl)enhancer.create();
//
//        return proxyService;
//    }
}
