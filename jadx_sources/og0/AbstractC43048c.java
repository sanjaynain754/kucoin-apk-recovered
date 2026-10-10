package og0;

import androidx.concurrent.futures.C1481a;
import androidx.media3.exoplayer.upstream.CmcdData;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import og0.AbstractC43048c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: og0.c */
/* JADX INFO: compiled from: ConcurrentLinkedList.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0003\b \u0018\u0000*\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00002\u00020\u0002B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00028\u0000¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\u0007¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\fR\u0013\u0010\u0012\u001a\u0004\u0018\u00018\u00008F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0014\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u000eR\u0013\u0010\u0003\u001a\u0004\u0018\u00018\u00008F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0011R\u0014\u0010\u0017\u001a\u00020\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u000eR\u0016\u0010\u001a\u001a\u0004\u0018\u00010\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001c\u001a\u0004\u0018\u00018\u00008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0011R\u0014\u0010\u001e\u001a\u00028\u00008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u0011R\u0013\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u001f8\u0002X\u0082\u0004R\u0013\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u001f8\u0002X\u0082\u0004¨\u0006\""}, m90084d2 = {"Log0/c;", "N", "", "prev", "<init>", "(Log0/c;)V", "value", "", "o", "(Log0/c;)Z", "", "c", "()V", "m", "()Z", "n", "f", "()Log0/c;", "next", CmcdData.Factory.STREAM_TYPE_LIVE, "isTail", CmcdData.Factory.STREAMING_FORMAT_HLS, "k", "isRemoved", "g", "()Ljava/lang/Object;", "nextOrClosed", "d", "aliveSegmentLeft", "e", "aliveSegmentRight", "Lkotlinx/atomicfu/AtomicRef;", "_next", "_prev", "kotlinx-coroutines-core"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nConcurrentLinkedList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConcurrentLinkedList.kt\nkotlinx/coroutines/internal/ConcurrentLinkedListNode\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,265:1\n103#1,7:266\n1#2:273\n*S KotlinDebug\n*F\n+ 1 ConcurrentLinkedList.kt\nkotlinx/coroutines/internal/ConcurrentLinkedListNode\n*L\n111#1:266,7\n*E\n"})
public abstract class AbstractC43048c<N extends AbstractC43048c<N>> {

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f95235b = AtomicReferenceFieldUpdater.newUpdater(AbstractC43048c.class, Object.class, "_next$volatile");

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f95236c = AtomicReferenceFieldUpdater.newUpdater(AbstractC43048c.class, Object.class, "_prev$volatile");
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ Object _prev$volatile;

    /* JADX INFO: renamed from: k */
    public abstract boolean mo94555k();

    public AbstractC43048c(@Nullable N n11) {
        this._prev$volatile = n11;
    }

    /* JADX INFO: renamed from: c */
    public final void m94549c() {
        f95236c.set(this, null);
    }

    /* JADX INFO: renamed from: d */
    public final N m94550d() {
        N n11 = (N) m94554h();
        while (n11 != null && n11.mo94555k()) {
            n11 = (N) f95236c.get(n11);
        }
        return n11;
    }

    /* JADX INFO: renamed from: e */
    public final N m94551e() {
        AbstractC43048c abstractC43048cM94552f;
        N n11 = (N) m94552f();
        Intrinsics.checkNotNull(n11);
        while (n11.mo94555k() && (abstractC43048cM94552f = n11.m94552f()) != null) {
            n11 = (N) abstractC43048cM94552f;
        }
        return n11;
    }

    @Nullable
    /* JADX INFO: renamed from: f */
    public final N m94552f() {
        Object objM94553g = m94553g();
        if (objM94553g == C43046b.f95234a) {
            return null;
        }
        return (N) objM94553g;
    }

    /* JADX INFO: renamed from: g */
    public final Object m94553g() {
        return f95235b.get(this);
    }

    @Nullable
    /* JADX INFO: renamed from: h */
    public final N m94554h() {
        return (N) f95236c.get(this);
    }

    /* JADX INFO: renamed from: l */
    public final boolean m94556l() {
        if (m94552f() == null) {
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: m */
    public final boolean m94557m() {
        return C1481a.m2260a(f95235b, this, null, C43046b.f95234a);
    }

    /* JADX INFO: renamed from: n */
    public final void m94558n() {
        Object obj;
        AbstractC43048c abstractC43048c;
        if (m94556l()) {
            return;
        }
        while (true) {
            AbstractC43048c abstractC43048cM94550d = m94550d();
            AbstractC43048c abstractC43048cM94551e = m94551e();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f95236c;
            do {
                obj = atomicReferenceFieldUpdater.get(abstractC43048cM94551e);
                if (((AbstractC43048c) obj) == null) {
                    abstractC43048c = null;
                } else {
                    abstractC43048c = abstractC43048cM94550d;
                }
            } while (!C1481a.m2260a(atomicReferenceFieldUpdater, abstractC43048cM94551e, obj, abstractC43048c));
            if (abstractC43048cM94550d != null) {
                f95235b.set(abstractC43048cM94550d, abstractC43048cM94551e);
            }
            if (!abstractC43048cM94551e.mo94555k() || abstractC43048cM94551e.m94556l()) {
                if (abstractC43048cM94550d == null || !abstractC43048cM94550d.mo94555k()) {
                    return;
                }
            }
        }
    }

    /* JADX INFO: renamed from: o */
    public final boolean m94559o(@NotNull N value) {
        return C1481a.m2260a(f95235b, this, null, value);
    }
}
