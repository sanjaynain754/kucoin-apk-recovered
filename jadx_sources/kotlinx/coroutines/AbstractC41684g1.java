package kotlinx.coroutines;

import androidx.concurrent.futures.C1481a;
import androidx.exifinterface.media.ExifInterface;
import androidx.media3.exoplayer.upstream.CmcdData;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import og0.C43067l0;
import og0.InterfaceC43069m0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.coroutines.CoroutineContext;
import p852kotlin.jvm.JvmField;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.ranges.RangesKt;
import p852kotlin.time.DurationKt;

/* JADX INFO: renamed from: kotlinx.coroutines.g1 */
/* JADX INFO: compiled from: EventLoop.common.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b \u0018\u00002\u00020\u00012\u00020\u0002:\u0004?@ABB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001b\u0010\t\u001a\u00020\b2\n\u0010\u0007\u001a\u00060\u0005j\u0002`\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u0004J\u000f\u0010\u000f\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0004J\u0017\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0019\u0010\u0004J\u000f\u0010\u001a\u001a\u00020\rH\u0016¢\u0006\u0004\b\u001a\u0010\u0004J%\u0010\u001e\u001a\u00020\r2\u0006\u0010\u001b\u001a\u00020\u00132\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\r0\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ#\u0010\"\u001a\u00020!2\u0006\u0010\u001b\u001a\u00020\u00132\n\u0010 \u001a\u00060\u0005j\u0002`\u0006H\u0004¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u0013H\u0016¢\u0006\u0004\b$\u0010%J!\u0010(\u001a\u00020\r2\u0006\u0010'\u001a\u00020&2\n\u0010 \u001a\u00060\u0005j\u0002`\u0006¢\u0006\u0004\b(\u0010)J\u001b\u0010*\u001a\u00020\r2\n\u0010\u0007\u001a\u00060\u0005j\u0002`\u0006H\u0016¢\u0006\u0004\b*\u0010+J\u001d\u0010,\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0010¢\u0006\u0004\b,\u0010-J\u000f\u0010.\u001a\u00020\rH\u0004¢\u0006\u0004\b.\u0010\u0004R$\u00100\u001a\u00020\b2\u0006\u0010/\u001a\u00020\b8B@BX\u0082\u000e¢\u0006\f\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\u0014\u00105\u001a\u00020\b8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b4\u00101R\u0014\u00107\u001a\u00020\u00138TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b6\u0010%R\u0013\u0010:\u001a\n\u0012\u0006\u0012\u0004\u0018\u000109088\u0002X\u0082\u0004R\u0013\u0010<\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010;088\u0002X\u0082\u0004R\u000b\u0010>\u001a\u00020=8\u0002X\u0082\u0004¨\u0006C"}, m90084d2 = {"Lkotlinx/coroutines/g1;", "Lkotlinx/coroutines/h1;", "Lkotlinx/coroutines/t0;", "<init>", "()V", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "task", "", "e0", "(Ljava/lang/Runnable;)Z", "b0", "()Ljava/lang/Runnable;", "", "d0", "a0", "Lkotlinx/coroutines/g1$c;", "p0", "(Lkotlinx/coroutines/g1$c;)Z", "", "now", "delayedTask", "", "m0", "(JLkotlinx/coroutines/g1$c;)I", "j0", "shutdown", "timeMillis", "Lkotlinx/coroutines/m;", "continuation", "scheduleResumeAfterDelay", "(JLkotlinx/coroutines/m;)V", "block", "Lkotlinx/coroutines/b1;", "n0", "(JLjava/lang/Runnable;)Lkotlinx/coroutines/b1;", ExifInterface.GPS_DIRECTION_TRUE, "()J", "Lkotlin/coroutines/CoroutineContext;", "context", "dispatch", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Runnable;)V", "c0", "(Ljava/lang/Runnable;)V", "l0", "(JLkotlinx/coroutines/g1$c;)V", "k0", "value", "isCompleted", "()Z", "o0", "(Z)V", "i0", "isEmpty", "O", "nextTime", "Lkotlinx/atomicfu/AtomicRef;", "", "_queue", "Lkotlinx/coroutines/g1$d;", "_delayed", "Lkotlinx/atomicfu/AtomicBoolean;", "_isCompleted", "c", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "b", "d", "kotlinx-coroutines-core"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nEventLoop.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EventLoop.common.kt\nkotlinx/coroutines/EventLoopImplBase\n+ 2 EventLoop.kt\nkotlinx/coroutines/EventLoopKt\n+ 3 ThreadSafeHeap.kt\nkotlinx/coroutines/internal/ThreadSafeHeap\n+ 4 Synchronized.common.kt\nkotlinx/coroutines/internal/Synchronized_commonKt\n+ 5 Synchronized.kt\nkotlinx/coroutines/internal/SynchronizedKt\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,547:1\n53#2:548\n51#3:549\n52#3,7:552\n29#4:550\n16#5:551\n1#6:559\n*S KotlinDebug\n*F\n+ 1 EventLoop.common.kt\nkotlinx/coroutines/EventLoopImplBase\n*L\n263#1:548\n336#1:549\n336#1:552,7\n336#1:550\n336#1:551\n*E\n"})
public abstract class AbstractC41684g1 extends AbstractC41688h1 implements InterfaceC41758t0 {

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f91726e = AtomicReferenceFieldUpdater.newUpdater(AbstractC41684g1.class, Object.class, "_queue$volatile");

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f91727f = AtomicReferenceFieldUpdater.newUpdater(AbstractC41684g1.class, Object.class, "_delayed$volatile");

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f91728g = AtomicIntegerFieldUpdater.newUpdater(AbstractC41684g1.class, "_isCompleted$volatile");
    private volatile /* synthetic */ Object _delayed$volatile;
    private volatile /* synthetic */ int _isCompleted$volatile;
    private volatile /* synthetic */ Object _queue$volatile;

    /* JADX INFO: renamed from: kotlinx.coroutines.g1$a */
    /* JADX INFO: compiled from: EventLoop.common.kt */
    @Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0082\u0004\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m90084d2 = {"Lkotlinx/coroutines/g1$a;", "Lkotlinx/coroutines/g1$c;", "", "nanoTime", "Lkotlinx/coroutines/m;", "", "cont", "<init>", "(Lkotlinx/coroutines/g1;JLkotlinx/coroutines/m;)V", "run", "()V", "", "toString", "()Ljava/lang/String;", "d", "Lkotlinx/coroutines/m;", "kotlinx-coroutines-core"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nEventLoop.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EventLoop.common.kt\nkotlinx/coroutines/EventLoopImplBase$DelayedResumeTask\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,547:1\n1#2:548\n*E\n"})
    public final class a extends c {

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @NotNull
        public final InterfaceC41708m<Unit> cont;

        /* JADX WARN: Multi-variable type inference failed */
        public a(@NotNull long j11, InterfaceC41708m<? super Unit> interfaceC41708m) {
            super(j11);
            this.cont = interfaceC41708m;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.cont.mo91114B(AbstractC41684g1.this, Unit.INSTANCE);
        }

        @Override // kotlinx.coroutines.AbstractC41684g1.c
        @NotNull
        public String toString() {
            return super.toString() + this.cont;
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.g1$b */
    /* JADX INFO: compiled from: EventLoop.common.kt */
    @Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0018\u0010\u0006\u001a\u00060\u0004j\u0002`\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m90084d2 = {"Lkotlinx/coroutines/g1$b;", "Lkotlinx/coroutines/g1$c;", "", "nanoTime", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "<init>", "(JLjava/lang/Runnable;)V", "", "run", "()V", "", "toString", "()Ljava/lang/String;", "d", "Ljava/lang/Runnable;", "kotlinx-coroutines-core"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
    public static final class b extends c {

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @NotNull
        public final Runnable block;

        @Override // java.lang.Runnable
        public void run() {
            this.block.run();
        }

        @Override // kotlinx.coroutines.AbstractC41684g1.c
        @NotNull
        public String toString() {
            return super.toString() + this.block;
        }

        public b(long j11, @NotNull Runnable runnable) {
            super(j11);
            this.block = runnable;
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.g1$c */
    /* JADX INFO: compiled from: EventLoop.common.kt */
    @Metadata(m90083d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0006\b \u0018\u00002\u00060\u0001j\u0002`\u00022\b\u0012\u0004\u0012\u00020\u00000\u00032\u00020\u00042\u00020\u00052\u00060\u0006j\u0002`\u0007B\u000f\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0000H\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\b¢\u0006\u0004\b\u0012\u0010\u0013J%\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fR\u0016\u0010\t\u001a\u00020\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0018\u0010\"\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\"\u0010*\u001a\u00020\r8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R0\u00100\u001a\b\u0012\u0002\b\u0003\u0018\u00010+2\f\u0010,\u001a\b\u0012\u0002\b\u0003\u0018\u00010+8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b-\u0010.\"\u0004\b$\u0010/¨\u00061"}, m90084d2 = {"Lkotlinx/coroutines/g1$c;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "", "Lkotlinx/coroutines/b1;", "Log0/m0;", "", "Lkotlinx/coroutines/internal/SynchronizedObject;", "", "nanoTime", "<init>", "(J)V", "other", "", "e", "(Lkotlinx/coroutines/g1$c;)I", "now", "", "g", "(J)Z", "Lkotlinx/coroutines/g1$d;", "delayed", "Lkotlinx/coroutines/g1;", "eventLoop", "f", "(JLkotlinx/coroutines/g1$d;Lkotlinx/coroutines/g1;)I", "", "dispose", "()V", "", "toString", "()Ljava/lang/String;", "b", "J", "_heap", "Ljava/lang/Object;", "c", "I", "getIndex", "()I", "d", "(I)V", "index", "Log0/l0;", "value", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "()Log0/l0;", "(Log0/l0;)V", "heap", "kotlinx-coroutines-core"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nEventLoop.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EventLoop.common.kt\nkotlinx/coroutines/EventLoopImplBase$DelayedTask\n+ 2 Synchronized.common.kt\nkotlinx/coroutines/internal/Synchronized_commonKt\n+ 3 Synchronized.kt\nkotlinx/coroutines/internal/SynchronizedKt\n+ 4 ThreadSafeHeap.kt\nkotlinx/coroutines/internal/ThreadSafeHeap\n*L\n1#1,547:1\n29#2:548\n29#2:551\n29#2:560\n16#3:549\n16#3:552\n16#3:561\n63#4:550\n64#4,7:553\n*S KotlinDebug\n*F\n+ 1 EventLoop.common.kt\nkotlinx/coroutines/EventLoopImplBase$DelayedTask\n*L\n441#1:548\n443#1:551\n483#1:560\n441#1:549\n443#1:552\n483#1:561\n443#1:550\n443#1:553,7\n*E\n"})
    public static abstract class c implements Runnable, Comparable<c>, InterfaceC41550b1, InterfaceC43069m0 {

        @Nullable
        private volatile Object _heap;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @JvmField
        public long nanoTime;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        public int index = -1;

        @Override // kotlinx.coroutines.InterfaceC41550b1
        public final void dispose() {
            synchronized (this) {
                try {
                    Object obj = this._heap;
                    if (obj == C41698j1.f91750a) {
                        return;
                    }
                    d dVar = obj instanceof d ? (d) obj : null;
                    if (dVar != null) {
                        dVar.m94616h(this);
                    }
                    this._heap = C41698j1.f91750a;
                    Unit unit = Unit.INSTANCE;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        /* JADX INFO: renamed from: f */
        public final int m91041f(long now, @NotNull d delayed, @NotNull AbstractC41684g1 eventLoop) {
            synchronized (this) {
                if (this._heap == C41698j1.f91750a) {
                    return 2;
                }
                synchronized (delayed) {
                    try {
                        c cVarM94611b = delayed.m94611b();
                        if (eventLoop.isCompleted()) {
                            return 1;
                        }
                        if (cVarM94611b == null) {
                            delayed.timeNow = now;
                        } else {
                            long j11 = cVarM94611b.nanoTime;
                            if (j11 - now < 0) {
                                now = j11;
                            }
                            if (now - delayed.timeNow > 0) {
                                delayed.timeNow = now;
                            }
                        }
                        long j12 = this.nanoTime;
                        long j13 = delayed.timeNow;
                        if (j12 - j13 < 0) {
                            this.nanoTime = j13;
                        }
                        delayed.m94610a(this);
                        return 0;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        }

        @Override // og0.InterfaceC43069m0
        @Nullable
        /* JADX INFO: renamed from: a */
        public C43067l0<?> mo91037a() {
            Object obj = this._heap;
            if (obj instanceof C43067l0) {
                return (C43067l0) obj;
            }
            return null;
        }

        @Override // og0.InterfaceC43069m0
        /* JADX INFO: renamed from: c */
        public void mo91038c(@Nullable C43067l0<?> c43067l0) {
            if (this._heap == C41698j1.f91750a) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            this._heap = c43067l0;
        }

        @Override // og0.InterfaceC43069m0
        /* JADX INFO: renamed from: d */
        public void mo91039d(int i11) {
            this.index = i11;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public int compareTo(@NotNull c other) {
            long j11 = this.nanoTime - other.nanoTime;
            if (j11 > 0) {
                return 1;
            }
            return j11 < 0 ? -1 : 0;
        }

        /* JADX INFO: renamed from: g */
        public final boolean m91042g(long now) {
            return now - this.nanoTime >= 0;
        }

        @Override // og0.InterfaceC43069m0
        public int getIndex() {
            return this.index;
        }

        @NotNull
        public String toString() {
            return "Delayed[nanos=" + this.nanoTime + ']';
        }

        public c(long j11) {
            this.nanoTime = j11;
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.g1$d */
    /* JADX INFO: compiled from: EventLoop.common.kt */
    @Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0006\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\t"}, m90084d2 = {"Lkotlinx/coroutines/g1$d;", "Log0/l0;", "Lkotlinx/coroutines/g1$c;", "", "timeNow", "<init>", "(J)V", "c", "J", "kotlinx-coroutines-core"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
    public static final class d extends C43067l0<c> {

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @JvmField
        public long timeNow;

        public d(long j11) {
            this.timeNow = j11;
        }
    }

    @Override // kotlinx.coroutines.AbstractC41589f1
    public void shutdown() {
        C41760t2.f91865a.m91357c();
        m91035o0(true);
        m91024a0();
        while (mo90736T() <= 0) {
        }
        m91030j0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isCompleted() {
        if (f91728g.get(this) == 1) {
            return true;
        }
        return false;
    }

    @Override // kotlinx.coroutines.AbstractC41589f1
    /* JADX INFO: renamed from: O */
    public long mo90732O() {
        c cVarM94614f;
        if (super.mo90732O() == 0) {
            return 0L;
        }
        Object obj = f91726e.get(this);
        if (obj != null) {
            if (obj instanceof LockFreeTaskQueueCore) {
                if (!((LockFreeTaskQueueCore) obj).m91095j()) {
                    return 0L;
                }
            } else {
                if (obj != C41698j1.f91751b) {
                    return 0L;
                }
                return Long.MAX_VALUE;
            }
        }
        d dVar = (d) f91727f.get(this);
        if (dVar == null || (cVarM94614f = dVar.m94614f()) == null) {
            return Long.MAX_VALUE;
        }
        long j11 = cVarM94614f.nanoTime;
        C41553c.m90497a();
        return RangesKt.coerceAtLeast(j11 - System.nanoTime(), 0L);
    }

    @Override // kotlinx.coroutines.AbstractC41589f1
    /* JADX INFO: renamed from: T */
    public long mo90736T() {
        if (m90737U()) {
            return 0L;
        }
        m91027d0();
        Runnable runnableM91025b0 = m91025b0();
        if (runnableM91025b0 != null) {
            runnableM91025b0.run();
            return 0L;
        }
        return mo90732O();
    }

    /* JADX INFO: renamed from: a0 */
    public final void m91024a0() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f91726e;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                if (C1481a.m2260a(f91726e, this, null, C41698j1.f91751b)) {
                    return;
                }
            } else if (obj instanceof LockFreeTaskQueueCore) {
                ((LockFreeTaskQueueCore) obj).m91091d();
                return;
            } else if (obj != C41698j1.f91751b) {
                LockFreeTaskQueueCore lockFreeTaskQueueCore = new LockFreeTaskQueueCore(8, true);
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type java.lang.Runnable");
                lockFreeTaskQueueCore.m91088a((Runnable) obj);
                if (C1481a.m2260a(f91726e, this, obj, lockFreeTaskQueueCore)) {
                    return;
                }
            } else {
                return;
            }
        }
    }

    /* JADX INFO: renamed from: b0 */
    public final Runnable m91025b0() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f91726e;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                return null;
            }
            if (obj instanceof LockFreeTaskQueueCore) {
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeTaskQueueCore<java.lang.Runnable>");
                LockFreeTaskQueueCore lockFreeTaskQueueCore = (LockFreeTaskQueueCore) obj;
                Object objM91098m = lockFreeTaskQueueCore.m91098m();
                if (objM91098m != LockFreeTaskQueueCore.f91744h) {
                    return (Runnable) objM91098m;
                }
                C1481a.m2260a(f91726e, this, obj, lockFreeTaskQueueCore.m91097l());
            } else {
                if (obj == C41698j1.f91751b) {
                    return null;
                }
                if (C1481a.m2260a(f91726e, this, obj, null)) {
                    Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type java.lang.Runnable");
                    return (Runnable) obj;
                }
            }
        }
    }

    /* JADX INFO: renamed from: c0 */
    public void mo91026c0(@NotNull Runnable task) {
        m91027d0();
        if (m91028e0(task)) {
            m91064Y();
        } else {
            RunnableC41721p0.f91769h.mo91026c0(task);
        }
    }

    /* JADX INFO: renamed from: d0 */
    public final void m91027d0() {
        c cVarM94617i;
        boolean zM91028e0;
        d dVar = (d) f91727f.get(this);
        if (dVar != null && !dVar.m94613e()) {
            C41553c.m90497a();
            long jNanoTime = System.nanoTime();
            do {
                synchronized (dVar) {
                    try {
                        c cVarM94611b = dVar.m94611b();
                        cVarM94617i = null;
                        if (cVarM94611b != null) {
                            c cVar = cVarM94611b;
                            if (cVar.m91042g(jNanoTime)) {
                                zM91028e0 = m91028e0(cVar);
                            } else {
                                zM91028e0 = false;
                            }
                            if (zM91028e0) {
                                cVarM94617i = dVar.m94617i(0);
                            }
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            } while (cVarM94617i != null);
        }
    }

    @Override // kotlinx.coroutines.AbstractC41697j0
    public final void dispatch(@NotNull CoroutineContext context, @NotNull Runnable block) {
        mo91026c0(block);
    }

    /* JADX INFO: renamed from: e0 */
    public final boolean m91028e0(Runnable task) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f91726e;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (isCompleted()) {
                return false;
            }
            if (obj == null) {
                if (C1481a.m2260a(f91726e, this, null, task)) {
                    return true;
                }
            } else if (obj instanceof LockFreeTaskQueueCore) {
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeTaskQueueCore<java.lang.Runnable>");
                LockFreeTaskQueueCore lockFreeTaskQueueCore = (LockFreeTaskQueueCore) obj;
                int iM91088a = lockFreeTaskQueueCore.m91088a(task);
                if (iM91088a == 0) {
                    return true;
                }
                if (iM91088a != 1) {
                    if (iM91088a == 2) {
                        return false;
                    }
                } else {
                    C1481a.m2260a(f91726e, this, obj, lockFreeTaskQueueCore.m91097l());
                }
            } else {
                if (obj == C41698j1.f91751b) {
                    return false;
                }
                LockFreeTaskQueueCore lockFreeTaskQueueCore2 = new LockFreeTaskQueueCore(8, true);
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type java.lang.Runnable");
                lockFreeTaskQueueCore2.m91088a((Runnable) obj);
                lockFreeTaskQueueCore2.m91088a(task);
                if (C1481a.m2260a(f91726e, this, obj, lockFreeTaskQueueCore2)) {
                    return true;
                }
            }
        }
    }

    /* JADX INFO: renamed from: i0 */
    public boolean m91029i0() {
        if (!m90735S()) {
            return false;
        }
        d dVar = (d) f91727f.get(this);
        if (dVar != null && !dVar.m94613e()) {
            return false;
        }
        Object obj = f91726e.get(this);
        if (obj == null) {
            return true;
        }
        if (obj instanceof LockFreeTaskQueueCore) {
            return ((LockFreeTaskQueueCore) obj).m91095j();
        }
        if (obj != C41698j1.f91751b) {
            return false;
        }
        return true;
    }

    @Override // kotlinx.coroutines.InterfaceC41758t0
    @NotNull
    public InterfaceC41550b1 invokeOnTimeout(long j11, @NotNull Runnable runnable, @NotNull CoroutineContext coroutineContext) {
        return InterfaceC41758t0.a.m91354b(this, j11, runnable, coroutineContext);
    }

    /* JADX INFO: renamed from: j0 */
    public final void m91030j0() {
        c cVarM94618j;
        C41553c.m90497a();
        long jNanoTime = System.nanoTime();
        while (true) {
            d dVar = (d) f91727f.get(this);
            if (dVar != null && (cVarM94618j = dVar.m94618j()) != null) {
                mo91063X(jNanoTime, cVarM94618j);
            } else {
                return;
            }
        }
    }

    /* JADX INFO: renamed from: k0 */
    public final void m91031k0() {
        f91726e.set(this, null);
        f91727f.set(this, null);
    }

    /* JADX INFO: renamed from: l0 */
    public final void m91032l0(long now, @NotNull c delayedTask) {
        int iM91033m0 = m91033m0(now, delayedTask);
        if (iM91033m0 != 0) {
            if (iM91033m0 != 1) {
                if (iM91033m0 != 2) {
                    throw new IllegalStateException("unexpected result");
                }
                return;
            } else {
                mo91063X(now, delayedTask);
                return;
            }
        }
        if (m91036p0(delayedTask)) {
            m91064Y();
        }
    }

    /* JADX INFO: renamed from: m0 */
    public final int m91033m0(long now, c delayedTask) {
        if (isCompleted()) {
            return 1;
        }
        d dVar = (d) f91727f.get(this);
        if (dVar == null) {
            C1481a.m2260a(f91727f, this, null, new d(now));
            Object obj = f91727f.get(this);
            Intrinsics.checkNotNull(obj);
            dVar = (d) obj;
        }
        return delayedTask.m91041f(now, dVar, this);
    }

    @NotNull
    /* JADX INFO: renamed from: n0 */
    public final InterfaceC41550b1 m91034n0(long timeMillis, @NotNull Runnable block) {
        long jM91110c = C41698j1.m91110c(timeMillis);
        if (jM91110c < DurationKt.MAX_MILLIS) {
            C41553c.m90497a();
            long jNanoTime = System.nanoTime();
            b bVar = new b(jM91110c + jNanoTime, block);
            m91032l0(jNanoTime, bVar);
            return bVar;
        }
        return C41689h2.f91736b;
    }

    /* JADX INFO: renamed from: o0 */
    public final void m91035o0(boolean z11) {
        f91728g.set(this, z11 ? 1 : 0);
    }

    /* JADX INFO: renamed from: p0 */
    public final boolean m91036p0(c task) {
        c cVarM94614f;
        d dVar = (d) f91727f.get(this);
        if (dVar != null) {
            cVarM94614f = dVar.m94614f();
        } else {
            cVarM94614f = null;
        }
        if (cVarM94614f == task) {
            return true;
        }
        return false;
    }

    @Override // kotlinx.coroutines.InterfaceC41758t0
    public void scheduleResumeAfterDelay(long timeMillis, @NotNull InterfaceC41708m<? super Unit> continuation) {
        long jM91110c = C41698j1.m91110c(timeMillis);
        if (jM91110c < DurationKt.MAX_MILLIS) {
            C41553c.m90497a();
            long jNanoTime = System.nanoTime();
            a aVar = new a(jM91110c + jNanoTime, continuation);
            m91032l0(jNanoTime, aVar);
            C41724q.m91186a(continuation, aVar);
        }
    }
}
