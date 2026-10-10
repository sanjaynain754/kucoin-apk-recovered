package kotlinx.coroutines.sync;

import androidx.concurrent.futures.C1481a;
import androidx.media3.exoplayer.upstream.CmcdData;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.google.common.util.concurrent.C8585f0;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.C41716o;
import kotlinx.coroutines.C41724q;
import kotlinx.coroutines.InterfaceC41708m;
import kotlinx.coroutines.InterfaceC41784z2;
import kotlinx.coroutines.selects.InterfaceC41754i;
import kotlinx.coroutines.sync.SemaphoreAndMutexImpl;
import og0.AbstractC43081x;
import og0.C43046b;
import og0.C43082y;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.CoroutineContext;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugProbesKt;
import p852kotlin.jvm.functions.Function3;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import rg0.C44091j;
import rg0.C44092k;

/* JADX INFO: compiled from: Semaphore.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0010\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007H\u0082@¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0013\u0010\u0015\u001a\u00020\u0010*\u00020\u0001H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\u0010¢\u0006\u0004\b\u0017\u0010\u0014J\u0010\u0010\u0018\u001a\u00020\u0007H\u0086@¢\u0006\u0004\b\u0018\u0010\tJ\u001d\u0010\u001a\u001a\u00020\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0019H\u0005¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001c\u001a\u00020\u0007¢\u0006\u0004\b\u001c\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR,\u0010$\u001a\u001a\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u00070\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0011\u0010&\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b%\u0010\u000bR\u0011\u0010)\u001a\b\u0012\u0004\u0012\u00020(0'8\u0002X\u0082\u0004R\u000b\u0010+\u001a\u00020*8\u0002X\u0082\u0004R\u0011\u0010,\u001a\b\u0012\u0004\u0012\u00020(0'8\u0002X\u0082\u0004R\u000b\u0010-\u001a\u00020*8\u0002X\u0082\u0004R\u000b\u0010/\u001a\u00020.8\u0002X\u0082\u0004¨\u00060"}, m90084d2 = {"Lkotlinx/coroutines/sync/SemaphoreAndMutexImpl;", "", "", "permits", "acquiredPermits", "<init>", "(II)V", "", "i", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", CmcdData.Factory.STREAM_TYPE_LIVE, "()I", "k", "()V", "Lkotlinx/coroutines/z2;", "waiter", "", "j", "(Lkotlinx/coroutines/z2;)Z", "v", "()Z", "u", "(Ljava/lang/Object;)Z", "t", "c", "Lkotlinx/coroutines/m;", CmcdData.Factory.STREAMING_FORMAT_HLS, "(Lkotlinx/coroutines/m;)V", "release", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "I", "Lkotlin/Function3;", "", "Lkotlin/coroutines/CoroutineContext;", "b", "Lkotlin/jvm/functions/Function3;", "onCancellationRelease", "m", "availablePermits", "Lkotlinx/atomicfu/AtomicRef;", "Lrg0/k;", TtmlNode.TAG_HEAD, "Lkotlinx/atomicfu/AtomicLong;", "deqIdx", "tail", "enqIdx", "Lkotlinx/atomicfu/AtomicInt;", "_availablePermits", "kotlinx-coroutines-core"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSemaphore.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Semaphore.kt\nkotlinx/coroutines/sync/SemaphoreAndMutexImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n+ 4 ConcurrentLinkedList.kt\nkotlinx/coroutines/internal/ConcurrentLinkedListKt\n+ 5 Semaphore.kt\nkotlinx/coroutines/sync/SemaphoreSegment\n*L\n1#1,396:1\n200#1,10:410\n200#1,10:420\n1#2:397\n444#3,12:398\n68#4,3:430\n42#4,8:433\n68#4,3:444\n42#4,8:447\n374#5:441\n374#5:442\n366#5:443\n377#5:455\n366#5:456\n374#5:457\n*S KotlinDebug\n*F\n+ 1 Semaphore.kt\nkotlinx/coroutines/sync/SemaphoreAndMutexImpl\n*L\n192#1:410,10\n216#1:420,10\n182#1:398,12\n284#1:430,3\n284#1:433,8\n317#1:444,3\n317#1:447,8\n288#1:441\n294#1:442\n308#1:443\n323#1:455\n329#1:456\n332#1:457\n*E\n"})
public class SemaphoreAndMutexImpl {

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f91852c = AtomicReferenceFieldUpdater.newUpdater(SemaphoreAndMutexImpl.class, Object.class, "head$volatile");

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ AtomicLongFieldUpdater f91853d = AtomicLongFieldUpdater.newUpdater(SemaphoreAndMutexImpl.class, "deqIdx$volatile");

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f91854e = AtomicReferenceFieldUpdater.newUpdater(SemaphoreAndMutexImpl.class, Object.class, "tail$volatile");

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ AtomicLongFieldUpdater f91855f = AtomicLongFieldUpdater.newUpdater(SemaphoreAndMutexImpl.class, "enqIdx$volatile");

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f91856g = AtomicIntegerFieldUpdater.newUpdater(SemaphoreAndMutexImpl.class, "_availablePermits$volatile");
    private volatile /* synthetic */ int _availablePermits$volatile;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final int permits;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final Function3<Throwable, Unit, CoroutineContext, Unit> onCancellationRelease;
    private volatile /* synthetic */ long deqIdx$volatile;
    private volatile /* synthetic */ long enqIdx$volatile;
    private volatile /* synthetic */ Object head$volatile;
    private volatile /* synthetic */ Object tail$volatile;

    /* JADX INFO: renamed from: u */
    public final boolean m91330u(Object obj) {
        if (!(obj instanceof InterfaceC41708m)) {
            if (obj instanceof InterfaceC41754i) {
                return ((InterfaceC41754i) obj).mo91278f(this, Unit.INSTANCE);
            }
            throw new IllegalStateException(("unexpected: " + obj).toString());
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
        InterfaceC41708m interfaceC41708m = (InterfaceC41708m) obj;
        Object objMo91115G = interfaceC41708m.mo91115G(Unit.INSTANCE, null, this.onCancellationRelease);
        if (objMo91115G == null) {
            return false;
        }
        interfaceC41708m.mo91118s(objMo91115G);
        return true;
    }

    public SemaphoreAndMutexImpl(int i11, int i12) {
        this.permits = i11;
        if (i11 > 0) {
            if (i12 >= 0 && i12 <= i11) {
                C44092k c44092k = new C44092k(0L, null, 2);
                this.head$volatile = c44092k;
                this.tail$volatile = c44092k;
                this._availablePermits$volatile = i11 - i12;
                this.onCancellationRelease = new Function3() { // from class: rg0.h
                    @Override // p852kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        return SemaphoreAndMutexImpl.m91321s(this.f97337b, (Throwable) obj, (Unit) obj2, (CoroutineContext) obj3);
                    }
                };
                return;
            }
            throw new IllegalArgumentException(("The number of acquired permits should be in 0.." + i11).toString());
        }
        throw new IllegalArgumentException(("Semaphore should have at least 1 permit, but had " + i11).toString());
    }

    /* JADX INFO: renamed from: s */
    public static final Unit m91321s(SemaphoreAndMutexImpl semaphoreAndMutexImpl, Throwable th2, Unit unit, CoroutineContext coroutineContext) {
        semaphoreAndMutexImpl.release();
        return Unit.INSTANCE;
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public final Object m91322c(@NotNull Continuation<? super Unit> continuation) {
        if (m91327l() > 0) {
            return Unit.INSTANCE;
        }
        Object objM91324i = m91324i(continuation);
        if (objM91324i == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            return objM91324i;
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: h */
    public final void m91323h(@NotNull InterfaceC41708m<? super Unit> waiter) {
        while (m91327l() <= 0) {
            Intrinsics.checkNotNull(waiter, "null cannot be cast to non-null type kotlinx.coroutines.Waiter");
            if (m91325j((InterfaceC41784z2) waiter)) {
                return;
            }
        }
        waiter.mo91117r(Unit.INSTANCE, this.onCancellationRelease);
    }

    /* JADX INFO: renamed from: i */
    public final Object m91324i(Continuation<? super Unit> continuation) {
        C41716o c41716oM91187b = C41724q.m91187b(IntrinsicsKt.intercepted(continuation));
        try {
            if (!m91325j(c41716oM91187b)) {
                m91323h(c41716oM91187b);
            }
            Object objM91171w = c41716oM91187b.m91171w();
            if (objM91171w == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                DebugProbesKt.probeCoroutineSuspended(continuation);
            }
            if (objM91171w == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                return objM91171w;
            }
            return Unit.INSTANCE;
        } catch (Throwable th2) {
            c41716oM91187b.m91149N();
            throw th2;
        }
    }

    /* JADX INFO: renamed from: j */
    public final boolean m91325j(InterfaceC41784z2 waiter) {
        Object objM94537c;
        C44092k c44092k = (C44092k) f91854e.get(this);
        long andIncrement = f91855f.getAndIncrement(this);
        SemaphoreAndMutexImpl$addAcquireToQueue$createNewSegment$1 semaphoreAndMutexImpl$addAcquireToQueue$createNewSegment$1 = SemaphoreAndMutexImpl$addAcquireToQueue$createNewSegment$1.INSTANCE;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f91854e;
        long j11 = andIncrement / ((long) C44091j.f97343f);
        loop0: while (true) {
            objM94537c = C43046b.m94537c(c44092k, j11, semaphoreAndMutexImpl$addAcquireToQueue$createNewSegment$1);
            if (!C43082y.m94648c(objM94537c)) {
                AbstractC43081x abstractC43081xM94647b = C43082y.m94647b(objM94537c);
                while (true) {
                    AbstractC43081x abstractC43081x = (AbstractC43081x) atomicReferenceFieldUpdater.get(this);
                    if (abstractC43081x.id >= abstractC43081xM94647b.id) {
                        break loop0;
                    }
                    if (!abstractC43081xM94647b.m94645u()) {
                        break;
                    }
                    if (C1481a.m2260a(atomicReferenceFieldUpdater, this, abstractC43081x, abstractC43081xM94647b)) {
                        if (!abstractC43081x.m94643p()) {
                            break loop0;
                        }
                        abstractC43081x.m94558n();
                        break loop0;
                    }
                    if (abstractC43081xM94647b.m94643p()) {
                        abstractC43081xM94647b.m94558n();
                    }
                }
            } else {
                break;
            }
        }
        C44092k c44092k2 = (C44092k) C43082y.m94647b(objM94537c);
        int i11 = (int) (andIncrement % ((long) C44091j.f97343f));
        if (!C8585f0.m13695a(c44092k2.getF97344f(), i11, null, waiter)) {
            if (C8585f0.m13695a(c44092k2.getF97344f(), i11, C44091j.f97339b, C44091j.f97340c)) {
                if (waiter instanceof InterfaceC41708m) {
                    Intrinsics.checkNotNull(waiter, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
                    ((InterfaceC41708m) waiter).mo91117r(Unit.INSTANCE, this.onCancellationRelease);
                } else if (waiter instanceof InterfaceC41754i) {
                    ((InterfaceC41754i) waiter).mo91276c(Unit.INSTANCE);
                } else {
                    throw new IllegalStateException(("unexpected: " + waiter).toString());
                }
                return true;
            }
            return false;
        }
        waiter.mo90632e(c44092k2, i11);
        return true;
    }

    /* JADX INFO: renamed from: k */
    public final void m91326k() {
        int i11;
        do {
            i11 = f91856g.get(this);
            if (i11 <= this.permits) {
                return;
            }
        } while (!f91856g.compareAndSet(this, i11, this.permits));
    }

    /* JADX INFO: renamed from: l */
    public final int m91327l() {
        int andDecrement;
        do {
            andDecrement = f91856g.getAndDecrement(this);
        } while (andDecrement > this.permits);
        return andDecrement;
    }

    /* JADX INFO: renamed from: m */
    public final int m91328m() {
        return Math.max(f91856g.get(this), 0);
    }

    public final void release() {
        do {
            int andIncrement = f91856g.getAndIncrement(this);
            if (andIncrement < this.permits) {
                if (andIncrement >= 0) {
                    return;
                }
            } else {
                m91326k();
                throw new IllegalStateException(("The number of released permits cannot be greater than " + this.permits).toString());
            }
        } while (!m91331v());
    }

    /* JADX INFO: renamed from: t */
    public final boolean m91329t() {
        while (true) {
            int i11 = f91856g.get(this);
            if (i11 > this.permits) {
                m91326k();
            } else {
                if (i11 <= 0) {
                    return false;
                }
                if (f91856g.compareAndSet(this, i11, i11 - 1)) {
                    return true;
                }
            }
        }
    }

    /* JADX INFO: renamed from: v */
    public final boolean m91331v() {
        Object objM94537c;
        C44092k c44092k = (C44092k) f91852c.get(this);
        long andIncrement = f91853d.getAndIncrement(this);
        long j11 = andIncrement / ((long) C44091j.f97343f);
        SemaphoreAndMutexImpl$tryResumeNextFromQueue$createNewSegment$1 semaphoreAndMutexImpl$tryResumeNextFromQueue$createNewSegment$1 = SemaphoreAndMutexImpl$tryResumeNextFromQueue$createNewSegment$1.INSTANCE;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f91852c;
        loop0: while (true) {
            objM94537c = C43046b.m94537c(c44092k, j11, semaphoreAndMutexImpl$tryResumeNextFromQueue$createNewSegment$1);
            if (C43082y.m94648c(objM94537c)) {
                break;
            }
            AbstractC43081x abstractC43081xM94647b = C43082y.m94647b(objM94537c);
            while (true) {
                AbstractC43081x abstractC43081x = (AbstractC43081x) atomicReferenceFieldUpdater.get(this);
                if (abstractC43081x.id >= abstractC43081xM94647b.id) {
                    break loop0;
                }
                if (!abstractC43081xM94647b.m94645u()) {
                    break;
                }
                if (C1481a.m2260a(atomicReferenceFieldUpdater, this, abstractC43081x, abstractC43081xM94647b)) {
                    if (!abstractC43081x.m94643p()) {
                        break loop0;
                    }
                    abstractC43081x.m94558n();
                    break loop0;
                }
                if (abstractC43081xM94647b.m94643p()) {
                    abstractC43081xM94647b.m94558n();
                }
            }
        }
        C44092k c44092k2 = (C44092k) C43082y.m94647b(objM94537c);
        c44092k2.m94549c();
        if (c44092k2.id > j11) {
            return false;
        }
        int i11 = (int) (andIncrement % ((long) C44091j.f97343f));
        Object andSet = c44092k2.getF97344f().getAndSet(i11, C44091j.f97339b);
        if (andSet == null) {
            int i12 = C44091j.f97338a;
            for (int i13 = 0; i13 < i12; i13++) {
                if (c44092k2.getF97344f().get(i11) == C44091j.f97340c) {
                    return true;
                }
            }
            return !C8585f0.m13695a(c44092k2.getF97344f(), i11, C44091j.f97339b, C44091j.f97341d);
        }
        if (andSet == C44091j.f97342e) {
            return false;
        }
        return m91330u(andSet);
    }
}
