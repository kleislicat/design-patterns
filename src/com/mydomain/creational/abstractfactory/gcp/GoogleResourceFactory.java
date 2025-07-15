package com.mydomain.creational.abstractfactory.gcp;

import com.mydomain.creational.abstractfactory.Instance;
import com.mydomain.creational.abstractfactory.Instance.Capacity;
import com.mydomain.creational.abstractfactory.ResourceFactory;
import com.mydomain.creational.abstractfactory.Storage;

//Factory implementation for Google cloud platform resources
public class GoogleResourceFactory implements ResourceFactory {

  @Override
  public Instance createInstance(Capacity capacity) {
    return new GoogleComputeEngineInstance(capacity);
  }

  @Override
  public Storage createStorage(int capMib) {
    return new GoogleCloudStorage(capMib);
  }


}
