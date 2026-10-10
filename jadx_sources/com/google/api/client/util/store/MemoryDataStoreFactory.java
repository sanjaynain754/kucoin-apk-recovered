package com.google.api.client.util.store;

import java.io.IOException;
import java.io.Serializable;

/* JADX INFO: loaded from: classes56.dex */
public class MemoryDataStoreFactory extends AbstractDataStoreFactory {

    public static class InstanceHolder {
        static final MemoryDataStoreFactory INSTANCE = new MemoryDataStoreFactory();
    }

    public static class MemoryDataStore<V extends Serializable> extends AbstractMemoryDataStore<V> {
        @Override // com.google.api.client.util.store.AbstractDataStore, com.google.api.client.util.store.DataStore
        public MemoryDataStoreFactory getDataStoreFactory() {
            return (MemoryDataStoreFactory) super.getDataStoreFactory();
        }

        public MemoryDataStore(MemoryDataStoreFactory memoryDataStoreFactory, String str) {
            super(memoryDataStoreFactory, str);
        }
    }

    public static MemoryDataStoreFactory getDefaultInstance() {
        return InstanceHolder.INSTANCE;
    }

    @Override // com.google.api.client.util.store.AbstractDataStoreFactory
    public <V extends Serializable> DataStore<V> createDataStore(String str) throws IOException {
        return new MemoryDataStore(this, str);
    }
}
