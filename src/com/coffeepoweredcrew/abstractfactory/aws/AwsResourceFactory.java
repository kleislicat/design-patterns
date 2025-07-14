package com.coffeepoweredcrew.abstractfactory.aws;

import com.coffeepoweredcrew.abstractfactory.Instance;
import com.coffeepoweredcrew.abstractfactory.Instance.Capacity;
import com.coffeepoweredcrew.abstractfactory.ResourceFactory;
import com.coffeepoweredcrew.abstractfactory.Storage;
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
