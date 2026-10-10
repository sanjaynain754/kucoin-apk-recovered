package com.tencent.ugc.videobase.frame;

import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.ugc.videobase.frame.RefCounted;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.concurrent.Semaphore;

/* JADX INFO: loaded from: classes2.dex */
public abstract class LimitedFramePool<T extends RefCounted> {
    private static final String TAG = "LimitedFramePool";
    private final Deque<T> mDeque = new LinkedList();
    private volatile boolean mIsDestroyed = false;
    private final IRecycler<T> mRecycler = (IRecycler<T>) new IRecycler<T>() { // from class: com.tencent.ugc.videobase.frame.LimitedFramePool.1
        @Override // com.tencent.ugc.videobase.frame.IRecycler
        public final void recycle(T t11) {
            if (t11 == null) {
                return;
            }
            LimitedFramePool.this.mSemaphore.release();
            synchronized (LimitedFramePool.this) {
                try {
                    if (LimitedFramePool.this.mIsDestroyed) {
                        LimitedFramePool.this.destroyInstance(t11);
                    } else {
                        LimitedFramePool.this.mDeque.addFirst(t11);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    };
    private final Semaphore mSemaphore;

    public abstract T createInstance(IRecycler<T> iRecycler);

    public void destroy() {
        this.mIsDestroyed = true;
        evictAll();
    }

    public abstract void destroyInstance(T t11);

    public void evictAll() {
        ArrayList arrayList;
        synchronized (this) {
            arrayList = new ArrayList(this.mDeque);
            this.mDeque.clear();
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            destroyInstance((RefCounted) it.next());
        }
    }

    public T obtain() throws InterruptedException {
        T tRemoveFirst;
        this.mSemaphore.acquire();
        synchronized (this) {
            try {
                tRemoveFirst = !this.mDeque.isEmpty() ? this.mDeque.removeFirst() : (T) createInstance(this.mRecycler);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (tRemoveFirst.retain() != 1) {
            LiteavLog.m76085e(TAG, "invalid reference count for %s", tRemoveFirst);
        }
        return tRemoveFirst;
    }

    public LimitedFramePool(int i11) {
        this.mSemaphore = new Semaphore(i11);
    }
}
