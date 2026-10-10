package com.tencent.rmonitor.looper.meta;

import android.os.Looper;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import com.tencent.bugly.common.utils.RecyclablePool;
import com.tencent.bugly.proguard.C33800mg;

/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes56.dex */
@Keep
class PoolProvider {
    private final int capacity;
    private final Class<? extends RecyclablePool.Recyclable> clz;
    private volatile RecyclablePool mainThreadPool = null;
    private volatile RecyclablePool otherThreadPool = null;

    private RecyclablePool getMainThreadPool() {
        if (this.mainThreadPool == null) {
            this.mainThreadPool = new RecyclablePool(this.clz, this.capacity);
        }
        return this.mainThreadPool;
    }

    private RecyclablePool getOtherThreadPool() {
        if (this.otherThreadPool == null) {
            this.otherThreadPool = new RecyclablePool(this.clz, this.capacity);
        }
        return this.otherThreadPool;
    }

    public PoolProvider(Class<? extends RecyclablePool.Recyclable> cls, int i11) {
        this.clz = cls;
        this.capacity = i11;
    }

    private boolean isMonitoredThreadMainThread() {
        Thread thread = Looper.getMainLooper().getThread();
        Thread threadCurrentThread = Thread.currentThread();
        if (threadCurrentThread == thread || C33800mg.m74132a(thread).getThread() == threadCurrentThread) {
            return true;
        }
        return false;
    }

    @NonNull
    public RecyclablePool getPool() {
        if (isMonitoredThreadMainThread()) {
            return getMainThreadPool();
        }
        return getOtherThreadPool();
    }
}
