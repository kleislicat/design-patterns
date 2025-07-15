package com.mydomain.creational.singleton;

public class Client {

  public static void main(String[] args) {
    EagerRegistry registry = EagerRegistry.getInstance();
    EagerRegistry registry2 = EagerRegistry.getInstance();
    System.out.println(registry == registry2);

    LazyRegistryWithDCL lazySingleton = LazyRegistryWithDCL.getInstance();
    LazyRegistryWithDCL lazySingleton2 = LazyRegistryWithDCL.getInstance();
    System.out.println(lazySingleton == lazySingleton2);

    LazyRegistryIODH singleton;

    singleton = LazyRegistryIODH.getInstance();
    LazyRegistryIODH singleton2 = LazyRegistryIODH.getInstance();
    System.out.println(singleton == singleton2);
  }

}
