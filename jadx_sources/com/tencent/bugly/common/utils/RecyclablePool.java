package com.tencent.bugly.common.utils;

import androidx.annotation.Keep;
import com.tencent.bugly.proguard.C33799mf;
import com.tencent.rmonitor.common.logger.Logger;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicInteger;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
@Keep
@Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00152\u00020\u0001:\u0002\u0015\u0016B\u001d\u0012\u000e\u0010\u0002\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0006\u0010\u000f\u001a\u00020\u0006J\u0006\u0010\u0010\u001a\u00020\u0006J\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00042\u000e\u0010\u0002\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0003J\u0010\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0004R\u000e\u0010\b\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0017"}, m90084d2 = {"Lcom/tencent/bugly/common/utils/RecyclablePool;", "", "clz", "Ljava/lang/Class;", "Lcom/tencent/bugly/common/utils/RecyclablePool$Recyclable;", "cap", "", "(Ljava/lang/Class;I)V", "capacity", "count", "Ljava/util/concurrent/atomic/AtomicInteger;", "obtainCount", "queue", "Ljava/util/concurrent/ConcurrentLinkedQueue;", "recycleCount", "getObtainCount", "getRecycleCount", "obtain", "recycle", "", "recyclableObject", "Companion", "Recyclable", "bugly-pro_release"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
public final class RecyclablePool {

    @NotNull
    public static final String TAG = "Bugly_RPool";
    private final int capacity;

    @NotNull
    private AtomicInteger count;

    @NotNull
    private AtomicInteger obtainCount;

    @NotNull
    private final ConcurrentLinkedQueue<Recyclable> queue;

    @NotNull
    private AtomicInteger recycleCount;

    /* JADX INFO: compiled from: BUGLY */
    @Keep
    @Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0005\u001a\u00020\u0006J\u0006\u0010\u0003\u001a\u00020\u0004J\u0006\u0010\u0007\u001a\u00020\u0006J\b\u0010\b\u001a\u00020\u0006H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\t"}, m90084d2 = {"Lcom/tencent/bugly/common/utils/RecyclablePool$Recyclable;", "", "()V", "isInPool", "", "inPool", "", "outPool", "reset", "bugly-pro_release"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
    public static class Recyclable {
        private boolean isInPool;

        public final void inPool() {
            this.isInPool = true;
        }

        public final void outPool() {
            this.isInPool = false;
        }

        /* JADX INFO: renamed from: isInPool, reason: from getter */
        public final boolean getIsInPool() {
            return this.isInPool;
        }

        public void reset() {
        }
    }

    public RecyclablePool(@NotNull Class<? extends Recyclable> clz, int i11) {
        Intrinsics.checkNotNullParameter(clz, "clz");
        this.queue = new ConcurrentLinkedQueue<>();
        this.capacity = i11;
        this.count = new AtomicInteger();
        this.obtainCount = new AtomicInteger();
        this.recycleCount = new AtomicInteger();
        for (int i12 = 0; i12 < i11; i12++) {
            try {
                recycle(clz.newInstance());
            } catch (Throwable th2) {
                Logger.INSTANCE.mo77131e(TAG, C33799mf.m74131a("init ", th2));
            }
        }
    }

    public final int getObtainCount() {
        return this.obtainCount.get();
    }

    public final int getRecycleCount() {
        return this.recycleCount.get();
    }

    @Nullable
    public final Recyclable obtain(@NotNull Class<? extends Recyclable> clz) {
        Recyclable recyclablePoll;
        Intrinsics.checkNotNullParameter(clz, "clz");
        this.obtainCount.incrementAndGet();
        if (this.queue.isEmpty()) {
            recyclablePoll = null;
        } else {
            recyclablePoll = this.queue.poll();
            Recyclable recyclable = recyclablePoll;
            if (recyclable != null) {
                this.count.decrementAndGet();
                if (recyclable.getIsInPool()) {
                    recyclable.outPool();
                } else {
                    Logger.INSTANCE.mo77131e(TAG, "recyclable object not in pool");
                    recyclablePoll = null;
                }
            }
        }
        try {
            Recyclable recyclable2 = recyclablePoll;
            return recyclable2 == null ? clz.newInstance() : recyclable2;
        } catch (Throwable th2) {
            Logger.INSTANCE.mo77131e(TAG, C33799mf.m74131a("", th2));
            return null;
        }
    }

    public final void recycle(@Nullable Recyclable recyclableObject) {
        this.recycleCount.incrementAndGet();
        if (recyclableObject != null) {
            if (recyclableObject.getIsInPool()) {
                Logger.INSTANCE.mo77131e(TAG, "recyclable object already in pool");
                return;
            }
            recyclableObject.reset();
            if (this.count.get() >= this.capacity || !this.queue.offer(recyclableObject)) {
                return;
            }
            this.count.incrementAndGet();
            recyclableObject.inPool();
        }
    }
}
