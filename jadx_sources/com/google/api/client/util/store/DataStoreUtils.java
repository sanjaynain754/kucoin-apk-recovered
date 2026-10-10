package com.google.api.client.util.store;

import java.io.IOException;

/* JADX INFO: loaded from: classes56.dex */
public final class DataStoreUtils {
    public static String toString(DataStore<?> dataStore) {
        try {
            StringBuilder sb2 = new StringBuilder();
            sb2.append('{');
            boolean z11 = true;
            for (String str : dataStore.keySet()) {
                if (z11) {
                    z11 = false;
                } else {
                    sb2.append(", ");
                }
                sb2.append(str);
                sb2.append('=');
                sb2.append(dataStore.get(str));
            }
            sb2.append('}');
            return sb2.toString();
        } catch (IOException e11) {
            throw new RuntimeException(e11);
        }
    }

    private DataStoreUtils() {
    }
}
