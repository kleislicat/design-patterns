package com.mydomain.creational.abstractfactory.aws;

import com.mydomain.creational.abstractfactory.Instance;
import com.mydomain.creational.abstractfactory.Instance.Capacity;
import com.mydomain.creational.abstractfactory.ResourceFactory;
import com.mydomain.creational.abstractfactory.Storage;

//Factory implementation for Google cloud platform resources
public class AwsResourceFactory implements ResourceFactory {

  @Override
  public Instance createInstance(Capacity capacity) {
    return new Ec2Instance(capacity);
  }

  @Override
  public Storage createStorage(int capMib) {
    return new S3Storage(capMib);
  }


}
