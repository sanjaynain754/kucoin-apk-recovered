package com.tencent.liteav.videobase.frame;

import com.tencent.liteav.base.p130b.C34691a;
import com.tencent.liteav.base.util.LiteavLog;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: com.tencent.liteav.videobase.frame.j */
/* JADX INFO: loaded from: classes59.dex */
public abstract class AbstractC34891j {
    private static final String TAG = "RefCounted";
    private static final C34691a sThrottler = new C34691a(TimeUnit.SECONDS.toMillis(1));
    private final InterfaceC34888g mRecycler;
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
        InterfaceC34888g interfaceC34888g;
        if (this.mRefCnt.decrementAndGet() != 0 || (interfaceC34888g = this.mRecycler) == null) {
            return;
        }
        interfaceC34888g.mo76520a(this);
    }

    public void updateLastUsedTimestamp(long j11) {
        this.mLastUsedTimestamp = j11;
    }

    public AbstractC34891j(InterfaceC34888g interfaceC34888g) {
        this.mRecycler = interfaceC34888g;
    }

    public void finalize() throws Throwable {
        super.finalize();
        if (this.mRecycler != null && this.mRefCnt.get() != 0) {
            LiteavLog.m76082e(sThrottler, TAG, "Object's reference count(%d) isn't zero when finalize.\n retainTrack:%s", Integer.valueOf(this.mRefCnt.get()), this.mStackTrace);
        }
    }
}
