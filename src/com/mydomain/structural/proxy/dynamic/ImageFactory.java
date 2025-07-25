package com.mydomain.structural.proxy.dynamic;

import com.mydomain.structural.proxy.Image;
import java.lang.reflect.Proxy;

//Factory to get image objects. 
public class ImageFactory {
  //We'll provide proxy to caller instead of real object

  public static Image getImage(String name) {
    return (Image) Proxy.newProxyInstance(ImageFactory.class.getClassLoader(),
        new Class[]{Image.class},
        new ImageInvocationHandler(name));
  }
}
