package com.tencent.ugc.videobase.frame;

import com.tencent.liteav.base.p130b.C34691a;
import com.tencent.liteav.base.util.LiteavLog;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes2.dex */
public abstract class RefCounted {
    private static final String TAG = "RefCounted";
    private static final C34691a sThrottler = new C34691a(TimeUnit.SECONDS.toMillis(1));
    private final IRecycler mRecycler;
    private String mStackTrace;
    private final AtomicInteger mRefCnt = new AtomicInteger(0);
    private long mLastUsedTimestamp = -1;

    public int retain() {
        this.mStackTrace = null;
        return this.mRefCnt.addAndGet(1);
    }

    public long getLastUsedTimestamp() {
        return this.mLastUsedTimestamp;
    }

    public void release() {
        IRecycler iRecycler;
        if (this.mRefCnt.decrementAndGet() != 0 || (iRecycler = this.mRecycler) == null) {
            return;
        }
        iRecycler.recycle(this);
    }

    public void updateLastUsedTimestamp(long j11) {
        this.mLastUsedTimestamp = j11;
    }

    public RefCounted(IRecycler iRecycler) {
        this.mRecycler = iRecycler;
    }

    public void finalize() throws Throwable {
        super.finalize();
        if (this.mRecycler != null && this.mRefCnt.get() != 0) {
            LiteavLog.m76082e(sThrottler, TAG, "Object's reference count(%d) isn't zero when finalize.\n retainTrack:%s", Integer.valueOf(this.mRefCnt.get()), this.mStackTrace);
        }
    }
}
