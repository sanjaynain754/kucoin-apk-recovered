package p852kotlin.reflect.jvm.internal.impl.storage;

import p852kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: storage.kt */
/* JADX INFO: loaded from: classes61.dex */
public interface MemoizedFunctionToNullable<P, R> extends Function1<P, R> {
    boolean isComputed(P p11);
}
