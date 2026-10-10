package com.google.common.base;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import java.lang.ref.SoftReference;

/* JADX INFO: loaded from: classes56.dex */
@J2ktIncompatible
@GwtIncompatible
@ElementTypesAreNonnullByDefault
public abstract class FinalizableSoftReference<T> extends SoftReference<T> implements FinalizableReference {
    public FinalizableSoftReference(T t11, FinalizableReferenceQueue finalizableReferenceQueue) {
        super(t11, finalizableReferenceQueue.queue);
        finalizableReferenceQueue.cleanUp();
    }
}
