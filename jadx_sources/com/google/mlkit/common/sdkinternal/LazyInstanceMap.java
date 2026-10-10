package com.google.mlkit.common.sdkinternal;

import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: com.google.mlkit:common@@18.11.0 */
/* JADX INFO: loaded from: classes.dex */
@KeepForSdk
public abstract class LazyInstanceMap<K, V> {

    @GuardedBy("instances")
    private final Map zza = new HashMap();

    @NonNull
    @KeepForSdk
    public abstract V create(@NonNull K k11);

    @NonNull
    @KeepForSdk
    public V get(@NonNull K k11) {
        synchronized (this.zza) {
            try {
                if (this.zza.containsKey(k11)) {
                    return (V) this.zza.get(k11);
                }
                V vCreate = create(k11);
                this.zza.put(k11, vCreate);
                return vCreate;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
