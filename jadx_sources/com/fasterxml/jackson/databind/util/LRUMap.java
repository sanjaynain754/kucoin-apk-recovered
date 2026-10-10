package com.fasterxml.jackson.databind.util;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes45.dex */
public class LRUMap<K, V> implements InterfaceC6493j<K, V>, Serializable {
    private static final long serialVersionUID = 1;
    protected transient int _jdkSerializeMaxEntries;
    protected final transient ConcurrentHashMap<K, V> _map;
    protected final transient int _maxEntries;

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeInt(this._jdkSerializeMaxEntries);
    }

    @Override // com.fasterxml.jackson.databind.util.InterfaceC6493j
    public void clear() {
        this._map.clear();
    }

    @Override // com.fasterxml.jackson.databind.util.InterfaceC6493j
    public V get(Object obj) {
        return this._map.get(obj);
    }

    public V put(K k11, V v11) {
        if (this._map.size() >= this._maxEntries) {
            synchronized (this) {
                try {
                    if (this._map.size() >= this._maxEntries) {
                        clear();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return this._map.put(k11, v11);
    }

    @Override // com.fasterxml.jackson.databind.util.InterfaceC6493j
    public V putIfAbsent(K k11, V v11) {
        if (this._map.size() >= this._maxEntries) {
            synchronized (this) {
                try {
                    if (this._map.size() >= this._maxEntries) {
                        clear();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return this._map.putIfAbsent(k11, v11);
    }

    public Object readResolve() {
        int i11 = this._jdkSerializeMaxEntries;
        return new LRUMap(i11, i11);
    }

    public int size() {
        return this._map.size();
    }

    public LRUMap(int i11, int i12) {
        this._map = new ConcurrentHashMap<>(i11, 0.8f, 4);
        this._maxEntries = i12;
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException {
        this._jdkSerializeMaxEntries = objectInputStream.readInt();
    }
}
