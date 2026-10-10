package com.google.api.client.util.store;

import com.google.api.client.util.Preconditions;
import java.io.IOException;
import java.io.Serializable;

/* JADX INFO: loaded from: classes56.dex */
public abstract class AbstractDataStore<V extends Serializable> implements DataStore<V> {
    private final DataStoreFactory dataStoreFactory;

    /* JADX INFO: renamed from: id */
    private final String f12181id;

    @Override // com.google.api.client.util.store.DataStore
    public DataStoreFactory getDataStoreFactory() {
        return this.dataStoreFactory;
    }

    @Override // com.google.api.client.util.store.DataStore
    public final String getId() {
        return this.f12181id;
    }

    public AbstractDataStore(DataStoreFactory dataStoreFactory, String str) {
        this.dataStoreFactory = (DataStoreFactory) Preconditions.checkNotNull(dataStoreFactory);
        this.f12181id = (String) Preconditions.checkNotNull(str);
    }

    @Override // com.google.api.client.util.store.DataStore
    public boolean containsKey(String str) throws IOException {
        if (get(str) != null) {
            return true;
        }
        return false;
    }

    @Override // com.google.api.client.util.store.DataStore
    public boolean containsValue(V v11) throws IOException {
        return values().contains(v11);
    }

    @Override // com.google.api.client.util.store.DataStore
    public boolean isEmpty() throws IOException {
        if (size() == 0) {
            return true;
        }
        return false;
    }

    @Override // com.google.api.client.util.store.DataStore
    public int size() throws IOException {
        return keySet().size();
    }
}
