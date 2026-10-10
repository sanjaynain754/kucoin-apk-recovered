package com.facebook.react.common;

import androidx.core.util.Pools;
import androidx.exifinterface.media.ExifInterface;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ClearableSynchronizedPool.kt */
/* JADX INFO: loaded from: classes45.dex */
@Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\f\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0002\u0010\rJ\u0015\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0011J\u0006\u0010\u0012\u001a\u00020\u0013R\u0018\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\tX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\nR\u000e\u0010\u000b\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0014"}, m90084d2 = {"Lcom/facebook/react/common/ClearableSynchronizedPool;", ExifInterface.GPS_DIRECTION_TRUE, "", "Landroidx/core/util/Pools$Pool;", "maxSize", "", "<init>", "(I)V", "pool", "", "[Ljava/lang/Object;", "size", "acquire", "()Ljava/lang/Object;", "release", "", "instance", "(Ljava/lang/Object;)Z", "clear", "", "ReactAndroid_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public final class ClearableSynchronizedPool<T> implements Pools.Pool<T> {

    @NotNull
    private final Object[] pool;
    private int size;

    @Override // androidx.core.util.Pools.Pool
    @Nullable
    public synchronized T acquire() {
        int i11 = this.size;
        if (i11 == 0) {
            return null;
        }
        int i12 = i11 - 1;
        this.size = i12;
        T t11 = (T) this.pool[i12];
        Intrinsics.checkNotNull(t11, "null cannot be cast to non-null type T of com.facebook.react.common.ClearableSynchronizedPool");
        this.pool[i12] = null;
        return t11;
    }

    public final synchronized void clear() {
        try {
            int i11 = this.size;
            for (int i12 = 0; i12 < i11; i12++) {
                this.pool[i12] = null;
            }
            this.size = 0;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // androidx.core.util.Pools.Pool
    public synchronized boolean release(@NotNull T instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        int i11 = this.size;
        Object[] objArr = this.pool;
        if (i11 == objArr.length) {
            return false;
        }
        objArr[i11] = instance;
        this.size = i11 + 1;
        return true;
    }

    public ClearableSynchronizedPool(int i11) {
        this.pool = new Object[i11];
    }
}
