package p852kotlin.reflect.jvm.internal.impl.storage;

import org.jetbrains.annotations.NotNull;
import p852kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: storage.kt */
/* JADX INFO: loaded from: classes61.dex */
public interface CacheWithNotNullValues<K, V> {
    @NotNull
    V computeIfAbsent(K k11, @NotNull Function0<? extends V> function0);
}
