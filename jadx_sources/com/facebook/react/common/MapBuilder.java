package com.facebook.react.common;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes45.dex */
@Deprecated
public class MapBuilder {

    public static final class Builder<K, V> {
        private Map mMap;
        private boolean mUnderConstruction;

        private Builder() {
            this.mMap = MapBuilder.newHashMap();
            this.mUnderConstruction = true;
        }

        public Map<K, V> build() {
            if (!this.mUnderConstruction) {
                throw new IllegalStateException("Underlying map has already been built");
            }
            this.mUnderConstruction = false;
            return this.mMap;
        }

        public Builder<K, V> put(K k11, V v11) {
            if (!this.mUnderConstruction) {
                throw new IllegalStateException("Underlying map has already been built");
            }
            this.mMap.put(k11, v11);
            return this;
        }
    }

    /* JADX INFO: renamed from: of */
    public static <K, V> Map<K, V> m10221of() {
        return newHashMap();
    }

    public static <K, V> Builder<K, V> builder() {
        return new Builder<>();
    }

    public static <K, V> HashMap<K, V> newHashMap() {
        return new HashMap<>();
    }

    /* JADX INFO: renamed from: of */
    public static <K, V> Map<K, V> m10222of(K k11, V v11) {
        Map<K, V> mapM10221of = m10221of();
        mapM10221of.put(k11, v11);
        return mapM10221of;
    }

    /* JADX INFO: renamed from: of */
    public static <K, V> Map<K, V> m10223of(K k11, V v11, K k12, V v12) {
        Map<K, V> mapM10221of = m10221of();
        mapM10221of.put(k11, v11);
        mapM10221of.put(k12, v12);
        return mapM10221of;
    }

    /* JADX INFO: renamed from: of */
    public static <K, V> Map<K, V> m10224of(K k11, V v11, K k12, V v12, K k13, V v13) {
        Map<K, V> mapM10221of = m10221of();
        mapM10221of.put(k11, v11);
        mapM10221of.put(k12, v12);
        mapM10221of.put(k13, v13);
        return mapM10221of;
    }

    /* JADX INFO: renamed from: of */
    public static <K, V> Map<K, V> m10225of(K k11, V v11, K k12, V v12, K k13, V v13, K k14, V v14) {
        Map<K, V> mapM10221of = m10221of();
        mapM10221of.put(k11, v11);
        mapM10221of.put(k12, v12);
        mapM10221of.put(k13, v13);
        mapM10221of.put(k14, v14);
        return mapM10221of;
    }

    /* JADX INFO: renamed from: of */
    public static <K, V> Map<K, V> m10226of(K k11, V v11, K k12, V v12, K k13, V v13, K k14, V v14, K k15, V v15) {
        Map<K, V> mapM10221of = m10221of();
        mapM10221of.put(k11, v11);
        mapM10221of.put(k12, v12);
        mapM10221of.put(k13, v13);
        mapM10221of.put(k14, v14);
        mapM10221of.put(k15, v15);
        return mapM10221of;
    }

    /* JADX INFO: renamed from: of */
    public static <K, V> Map<K, V> m10227of(K k11, V v11, K k12, V v12, K k13, V v13, K k14, V v14, K k15, V v15, K k16, V v16) {
        Map<K, V> mapM10221of = m10221of();
        mapM10221of.put(k11, v11);
        mapM10221of.put(k12, v12);
        mapM10221of.put(k13, v13);
        mapM10221of.put(k14, v14);
        mapM10221of.put(k15, v15);
        mapM10221of.put(k16, v16);
        return mapM10221of;
    }

    /* JADX INFO: renamed from: of */
    public static <K, V> Map<K, V> m10228of(K k11, V v11, K k12, V v12, K k13, V v13, K k14, V v14, K k15, V v15, K k16, V v16, K k17, V v17) {
        Map<K, V> mapM10221of = m10221of();
        mapM10221of.put(k11, v11);
        mapM10221of.put(k12, v12);
        mapM10221of.put(k13, v13);
        mapM10221of.put(k14, v14);
        mapM10221of.put(k15, v15);
        mapM10221of.put(k16, v16);
        mapM10221of.put(k17, v17);
        return mapM10221of;
    }
}
