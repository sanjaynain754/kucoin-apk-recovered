package com.kubi.sdk.thread.monitor;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.kubi.monitor.TechnologyEvent;
import com.kubi.sdk.thread.IKExecutor;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ThreadPoolExecutor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p569qq.C43840a;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import q00.InterfaceC43574c;
import ro.C44128b;

/* JADX INFO: compiled from: ExecutorTimerMonitor.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0004\b\u0000\u0018\u0000 \u00142\u00020\u0001:\u00024\u0012B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000f\u0010\u000eJ!\u0010\u0012\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\f¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\f¢\u0006\u0004\b\u0016\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0018R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0019R\u0014\u0010\u001d\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R \u0010&\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u001f0#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0016\u0010(\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010\u0018R\u0016\u0010*\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010\u0018R\u0016\u0010,\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010\u0018R\u0016\u0010.\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010\u0018R\u0016\u00100\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u0010\u0018R\u0016\u00103\u001a\u0002018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u00102¨\u00065"}, m90084d2 = {"Lcom/kubi/sdk/thread/monitor/ExecutorTimerMonitor;", "Lq00/c;", "Lcom/kubi/sdk/thread/IKExecutor;", "executor", "", "watchCostTime", "", "enableWaitTime", "<init>", "(Lcom/kubi/sdk/thread/IKExecutor;JZ)V", "Ljava/lang/Runnable;", "runnable", "", "c", "(Ljava/lang/Runnable;)V", "b", "", "t", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Ljava/lang/Runnable;Ljava/lang/Throwable;)V", "m", "()V", CmcdData.Factory.STREAM_TYPE_LIVE, "Lcom/kubi/sdk/thread/IKExecutor;", "J", "Z", "", "d", "Ljava/lang/String;", "namePrefix", "Ljava/lang/ThreadLocal;", "Lcom/kubi/sdk/thread/monitor/ExecutorTimerMonitor$a;", "e", "Ljava/lang/ThreadLocal;", "executeTimer", "Ljava/util/concurrent/ConcurrentHashMap;", "f", "Ljava/util/concurrent/ConcurrentHashMap;", "runnableMap", "g", "count", CmcdData.Factory.STREAMING_FORMAT_HLS, "allWaitTime", "i", "allCostTime", "j", "maxWaitTime", "k", "maxCostTime", "", "I", "maxActiveCount", "Companion", "ThreadPoolMonitor_release"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
public final class ExecutorTimerMonitor implements InterfaceC43574c {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final IKExecutor executor;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final long watchCostTime;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public final boolean enableWaitTime;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final String namePrefix;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final ThreadLocal<C24199a> executeTimer;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public final ConcurrentHashMap<Runnable, C24199a> runnableMap;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public long count;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public long allWaitTime;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public long allCostTime;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public long maxWaitTime;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public long maxCostTime;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    public int maxActiveCount;

    /* JADX INFO: renamed from: com.kubi.sdk.thread.monitor.ExecutorTimerMonitor$a */
    /* JADX INFO: compiled from: ExecutorTimerMonitor.kt */
    @Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\r\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\"\u0010\u000e\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u000b\u0010\b\"\u0004\b\f\u0010\rR\u0011\u0010\u000f\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\n\u0010\bR\u0011\u0010\u0010\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\b¨\u0006\u0011"}, m90084d2 = {"Lcom/kubi/sdk/thread/monitor/ExecutorTimerMonitor$a;", "", "<init>", "()V", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "J", "getPutTime", "()J", "putTime", "b", "getStartTime", "c", "(J)V", "startTime", "waitTime", "costTime", "ThreadPoolMonitor_release"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
    public static final class C24199a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        public final long putTime;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public long startTime;

        /* JADX INFO: renamed from: b */
        public final long m58241b() {
            return this.startTime - this.putTime;
        }

        /* JADX INFO: renamed from: c */
        public final void m58242c(long j11) {
            this.startTime = j11;
        }

        public C24199a() {
            long jCurrentTimeMillis = System.currentTimeMillis();
            this.putTime = jCurrentTimeMillis;
            this.startTime = jCurrentTimeMillis;
        }

        /* JADX INFO: renamed from: a */
        public final long m58240a() {
            return System.currentTimeMillis() - this.startTime;
        }
    }

    public ExecutorTimerMonitor(@NotNull IKExecutor executor, long j11, boolean z11) {
        Intrinsics.checkNotNullParameter(executor, "executor");
        this.executor = executor;
        this.watchCostTime = j11;
        this.enableWaitTime = z11;
        this.namePrefix = executor.getName();
        this.executeTimer = new ThreadLocal<>();
        this.runnableMap = new ConcurrentHashMap<>();
    }

    @Override // q00.InterfaceC43574c
    /* JADX INFO: renamed from: a */
    public void mo58235a(@NotNull Runnable runnable, @Nullable Throwable t11) {
        C24199a c24199aRemove;
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        if (this.enableWaitTime) {
            c24199aRemove = this.runnableMap.remove(runnable);
            if (c24199aRemove == null) {
                return;
            }
        } else {
            c24199aRemove = this.executeTimer.get();
            if (c24199aRemove == null) {
                return;
            }
        }
        this.count++;
        long jM58241b = c24199aRemove.m58241b();
        long jM58240a = c24199aRemove.m58240a();
        this.maxCostTime = Math.max(this.maxCostTime, jM58240a);
        this.allWaitTime = Math.max(this.allWaitTime, jM58241b);
        if (jM58240a > this.watchCostTime) {
            C43840a.m96548b("run in " + this.namePrefix + ' ' + ((Object) runnable.getClass().getName()) + " in " + ((Object) Thread.currentThread().getName()) + " wait:" + jM58241b + " cost:" + jM58240a, "ExecutorTimerMonitor");
        }
        if (t11 != null) {
            C44128b.m97262f("ExecutorTimerMonitor", "run in " + this.namePrefix + " with Error", t11);
        }
    }

    @Override // q00.InterfaceC43574c
    /* JADX INFO: renamed from: b */
    public void mo58236b(@NotNull Runnable runnable) {
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        if (!this.enableWaitTime) {
            this.executeTimer.set(new C24199a());
            return;
        }
        C24199a c24199a = this.runnableMap.get(runnable);
        if (c24199a == null) {
            return;
        }
        c24199a.m58242c(System.currentTimeMillis());
    }

    @Override // q00.InterfaceC43574c
    /* JADX INFO: renamed from: c */
    public void mo58237c(@NotNull Runnable runnable) {
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        if (this.enableWaitTime) {
            this.runnableMap.put(runnable, new C24199a());
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m58238l() {
        this.count = 0L;
        this.allWaitTime = 0L;
        this.allCostTime = 0L;
        this.maxWaitTime = 0L;
        this.maxCostTime = 0L;
        this.maxActiveCount = 0;
    }

    /* JADX INFO: renamed from: m */
    public final void m58239m() {
        long j11 = this.count;
        if (j11 > 0) {
            Object obj = this.executor;
            int largestPoolSize = obj instanceof ThreadPoolExecutor ? ((ThreadPoolExecutor) obj).getLargestPoolSize() : 1;
            TechnologyEvent technologyEvent = TechnologyEvent.f35482a;
            TechnologyEvent.EventParametersBuilder eventParametersBuilderAcquire = TechnologyEvent.EventParametersBuilder.INSTANCE.acquire();
            eventParametersBuilderAcquire.m42393d("type", this.namePrefix);
            eventParametersBuilderAcquire.m42396g("count", largestPoolSize);
            eventParametersBuilderAcquire.m42396g(TypedValues.TransitionType.S_DURATION, this.maxCostTime);
            eventParametersBuilderAcquire.m42396g("duration1", this.allCostTime / j11);
            if (this.enableWaitTime) {
                long j12 = this.allWaitTime / j11;
                eventParametersBuilderAcquire.m42396g("duration2", this.maxWaitTime);
                eventParametersBuilderAcquire.m42396g("duration3", j12);
            }
            try {
                int iActiveCount = Thread.activeCount();
                this.maxActiveCount = Math.max(this.maxActiveCount, iActiveCount);
                eventParametersBuilderAcquire.m42396g("size", iActiveCount);
                eventParametersBuilderAcquire.m42396g("times", this.maxActiveCount);
            } catch (Throwable unused) {
            }
            TechnologyEvent.m42388d("threadStatus", eventParametersBuilderAcquire);
        }
    }
}
