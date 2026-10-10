package p523p2;

import androidx.collection.ArrayMap;
import androidx.collection.SimpleArrayMap;

/* JADX INFO: renamed from: p2.b */
/* JADX INFO: compiled from: CachedHashCodeArrayMap.java */
/* JADX INFO: loaded from: classes.dex */
public final class C43355b<K, V> extends ArrayMap<K, V> {

    /* JADX INFO: renamed from: b */
    public int f95743b;

    @Override // androidx.collection.SimpleArrayMap, java.util.Map
    public void clear() {
        this.f95743b = 0;
        super.clear();
    }

    @Override // androidx.collection.SimpleArrayMap, java.util.Map
    public V put(K k11, V v11) {
        this.f95743b = 0;
        return (V) super.put(k11, v11);
    }

    @Override // androidx.collection.SimpleArrayMap
    public void putAll(SimpleArrayMap<? extends K, ? extends V> simpleArrayMap) {
        this.f95743b = 0;
        super.putAll(simpleArrayMap);
    }

    @Override // androidx.collection.SimpleArrayMap
    public V removeAt(int i11) {
        this.f95743b = 0;
        return (V) super.removeAt(i11);
    }

    @Override // androidx.collection.SimpleArrayMap
    public V setValueAt(int i11, V v11) {
        this.f95743b = 0;
        return (V) super.setValueAt(i11, v11);
    }

    @Override // androidx.collection.SimpleArrayMap, java.util.Map
    public int hashCode() {
        if (this.f95743b == 0) {
            this.f95743b = super.hashCode();
        }
        return this.f95743b;
    }
}
