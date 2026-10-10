package com.tencent.ugc.videobase.frame;

import android.os.SystemClock;
import com.tencent.liteav.base.p130b.C34691a;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.ugc.videobase.frame.RefCounted;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public abstract class FramePool<T extends RefCounted> {
    private static final long MAX_TIME_OUT = TimeUnit.SECONDS.toMillis(1);
    private static final String TAG = "FramePool";
    private final Map<Key, Deque<T>> mDequeMap = new HashMap();
    private volatile boolean mIsDestroyed = false;
    private final C34691a mEvictThrottler = new C34691a(MAX_TIME_OUT);
    private final IRecycler<T> mRecycler = C35823a.m79309a(this);
    private final String mStackTrace = null;

    public interface Key {
        boolean equals(Object obj);

        int hashCode();
    }

    public abstract T createInstance(IRecycler<T> iRecycler, Key key);

    public void destroy() {
        this.mIsDestroyed = true;
        evictAll();
    }

    public abstract void destroyInstance(T t11);

    public abstract Key keyForObject(T t11);

    private void evictOverdueObjectsUnlock() {
        T tPeekLast;
        if (this.mEvictThrottler.m76041a()) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            ArrayList arrayList = new ArrayList();
            synchronized (this.mDequeMap) {
                try {
                    for (Deque<T> deque : this.mDequeMap.values()) {
                        while (!deque.isEmpty() && ((tPeekLast = deque.peekLast()) == null || jElapsedRealtime - tPeekLast.getLastUsedTimestamp() >= MAX_TIME_OUT)) {
                            deque.pollLast();
                            arrayList.add(tPeekLast);
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                destroyInstance((RefCounted) it.next());
            }
        }
    }

    private Deque<T> findDequeUnlock(Key key) {
        Deque<T> deque = this.mDequeMap.get(key);
        if (deque != null) {
            return deque;
        }
        LinkedList linkedList = new LinkedList();
        this.mDequeMap.put(key, linkedList);
        return linkedList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void lambda$new$0(FramePool framePool, RefCounted refCounted) {
        if (refCounted == 0) {
            return;
        }
        synchronized (framePool.mDequeMap) {
            try {
                if (framePool.mIsDestroyed) {
                    framePool.destroyInstance(refCounted);
                    return;
                }
                Deque<T> dequeFindDequeUnlock = framePool.findDequeUnlock(framePool.keyForObject(refCounted));
                refCounted.updateLastUsedTimestamp(SystemClock.elapsedRealtime());
                dequeFindDequeUnlock.addFirst(refCounted);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void evictAll() {
        ArrayList arrayList = new ArrayList();
        synchronized (this.mDequeMap) {
            try {
                Iterator<Deque<T>> it = this.mDequeMap.values().iterator();
                while (it.hasNext()) {
                    arrayList.addAll(it.next());
                }
                this.mDequeMap.clear();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            destroyInstance((RefCounted) it2.next());
        }
    }

    public T obtain(Key key) {
        T tRemoveFirst;
        synchronized (this.mDequeMap) {
            try {
                Deque<T> dequeFindDequeUnlock = findDequeUnlock(key);
                tRemoveFirst = !dequeFindDequeUnlock.isEmpty() ? dequeFindDequeUnlock.removeFirst() : null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        evictOverdueObjectsUnlock();
        if (tRemoveFirst == null) {
            tRemoveFirst = (T) createInstance(this.mRecycler, key);
        }
        if (tRemoveFirst.retain() != 1) {
            LiteavLog.m76085e(TAG, "invalid reference count for %s", tRemoveFirst);
        }
        return tRemoveFirst;
    }

    public void finalize() throws Throwable {
        super.finalize();
        if (!this.mIsDestroyed) {
            LiteavLog.m76085e(TAG, "%s must call destroy() before finalize()!\n%s", getClass().getName(), this.mStackTrace);
        }
    }
}
