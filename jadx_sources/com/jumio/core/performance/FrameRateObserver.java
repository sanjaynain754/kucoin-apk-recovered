package com.jumio.core.performance;

import android.os.SystemClock;
import com.tencent.bugly.proguard.InterfaceC33730j9;
import com.tencent.bugly.proguard.InterfaceC33953u5;
import jumio.core.AbstractChoreographerFrameCallbackC40607V1;
import jumio.core.C40641b4;
import jumio.core.C40700n2;
import jumio.core.C40754y1;
import jumio.core.C40759z1;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.enums.EnumEntries;
import p852kotlin.enums.EnumEntriesKt;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0016B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0006\u0010\u0012\u001a\u00020\u0013J\u0006\u0010\u0014\u001a\u00020\u0013J\u0006\u0010\u0015\u001a\u00020\u0013R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u000e\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0017"}, m90084d2 = {"Lcom/jumio/core/performance/FrameRateObserver;", "", "samplingTimeInNs", "", "frameRateCallback", "Lcom/jumio/core/performance/FrameRateCallback;", InterfaceC33953u5.f72225u, "Lcom/jumio/core/performance/FrameRateObserver$THREAD;", "<init>", "(JLcom/jumio/core/performance/FrameRateCallback;Lcom/jumio/core/performance/FrameRateObserver$THREAD;)V", "framePerformanceCallback", "Lcom/jumio/core/performance/FramePerformanceRelayCallback;", "jFrameCallback", "Lcom/jumio/core/performance/JFrameCallback;", "framePerformance", "Lcom/jumio/core/performance/FramePerformance;", "getFramePerformance", "()Lcom/jumio/core/performance/FramePerformance;", "start", "", InterfaceC33730j9.f70350a, "doFrame", "THREAD", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class FrameRateObserver {

    /* JADX INFO: renamed from: a */
    public final C40759z1 f14462a;

    /* JADX INFO: renamed from: b */
    public final AbstractChoreographerFrameCallbackC40607V1 f14463b;

    @Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m90084d2 = {"Lcom/jumio/core/performance/FrameRateObserver$THREAD;", "", "<init>", "(Ljava/lang/String;I)V", "MAIN", "WORKER", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public enum THREAD {
        MAIN,
        WORKER;

        private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries(values());

        @NotNull
        public static EnumEntries<THREAD> getEntries() {
            return $ENTRIES;
        }
    }

    public FrameRateObserver(long j11, @NotNull FrameRateCallback frameRateCallback, @NotNull THREAD thread) {
        Intrinsics.checkNotNullParameter(frameRateCallback, "frameRateCallback");
        Intrinsics.checkNotNullParameter(thread, "thread");
        C40759z1 c40759z1 = new C40759z1(frameRateCallback);
        this.f14462a = c40759z1;
        this.f14463b = thread == THREAD.MAIN ? new C40700n2(j11, c40759z1) : new C40641b4(j11, c40759z1);
    }

    public final void doFrame() {
        AbstractChoreographerFrameCallbackC40607V1 abstractChoreographerFrameCallbackC40607V1 = this.f14463b;
        if (abstractChoreographerFrameCallbackC40607V1 instanceof C40641b4) {
            abstractChoreographerFrameCallbackC40607V1.doFrame(SystemClock.elapsedRealtimeNanos());
        }
    }

    @NotNull
    public final C40754y1 getFramePerformance() {
        C40759z1 c40759z1 = this.f14462a;
        synchronized (c40759z1.f90507c) {
            double dAverageOfInt = CollectionsKt.averageOfInt(c40759z1.f90506b);
            Integer num = (Integer) CollectionsKt.minOrNull((Iterable) c40759z1.f90506b);
            Integer num2 = (Integer) CollectionsKt.maxOrNull((Iterable) c40759z1.f90506b);
            if (num != null && num2 != null) {
                c40759z1.f90506b.clear();
                return new C40754y1((int) dAverageOfInt, num.intValue(), num2.intValue());
            }
            return new C40754y1();
        }
    }

    public final void start() {
        AbstractChoreographerFrameCallbackC40607V1 abstractChoreographerFrameCallbackC40607V1 = this.f14463b;
        if (abstractChoreographerFrameCallbackC40607V1.f90143e) {
            return;
        }
        abstractChoreographerFrameCallbackC40607V1.f90142d = 0L;
        abstractChoreographerFrameCallbackC40607V1.f90141c.clear();
        abstractChoreographerFrameCallbackC40607V1.f90143e = true;
        abstractChoreographerFrameCallbackC40607V1.mo89241b();
    }

    public final void stop() {
        this.f14463b.f90143e = false;
    }

    public /* synthetic */ FrameRateObserver(long j11, FrameRateCallback frameRateCallback, THREAD thread, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(j11, frameRateCallback, (i11 & 4) != 0 ? THREAD.WORKER : thread);
    }
}
