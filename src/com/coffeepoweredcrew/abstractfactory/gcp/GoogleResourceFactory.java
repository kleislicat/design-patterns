package com.coffeepoweredcrew.abstractfactory.gcp;

import com.coffeepoweredcrew.abstractfactory.Instance;
import com.coffeepoweredcrew.abstractfactory.Instance.Capacity;
import com.coffeepoweredcrew.abstractfactory.ResourceFactory;
import com.coffeepoweredcrew.abstractfactory.Storage;

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
