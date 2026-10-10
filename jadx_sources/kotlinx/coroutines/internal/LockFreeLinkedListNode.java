package kotlinx.coroutines.internal;

import androidx.concurrent.futures.C1481a;
import androidx.media3.exoplayer.upstream.CmcdData;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.C41717o0;
import og0.C43068m;
import og0.C43078u;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.PublishedApi;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference0Impl;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: LockFreeLinkedList.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\n\u0010\u0005\u001a\u00060\u0000j\u0002`\u0004¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\u000b\u001a\u00020\u00062\n\u0010\u0005\u001a\u00060\u0000j\u0002`\u00042\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\t¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0012\u001a\u00020\u00062\n\u0010\u0005\u001a\u00060\u0000j\u0002`\u00042\n\u0010\u0011\u001a\u00060\u0000j\u0002`\u0004H\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\n\u0018\u00010\u0000j\u0004\u0018\u0001`\u0004H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ \u0010\u001f\u001a\u00060\u0000j\u0002`\u00042\n\u0010\u001e\u001a\u00060\u0000j\u0002`\u0004H\u0082\u0010¢\u0006\u0004\b\u001f\u0010 J\u001b\u0010!\u001a\u00020\u000e2\n\u0010\u0011\u001a\u00060\u0000j\u0002`\u0004H\u0002¢\u0006\u0004\b!\u0010\"J\u0018\u0010#\u001a\n\u0018\u00010\u0000j\u0004\u0018\u0001`\u0004H\u0082\u0010¢\u0006\u0004\b#\u0010\u0017R\u0014\u0010%\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b$\u0010\u0015R\u0011\u0010\u0011\u001a\u00020\u00018F¢\u0006\u0006\u001a\u0004\b&\u0010'R\u0015\u0010)\u001a\u00060\u0000j\u0002`\u00048F¢\u0006\u0006\u001a\u0004\b(\u0010\u0017R\u0015\u0010+\u001a\u00060\u0000j\u0002`\u00048F¢\u0006\u0006\u001a\u0004\b*\u0010\u0017R\u0011\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00010,8\u0002X\u0082\u0004R\u0011\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00000,8\u0002X\u0082\u0004R\u0013\u0010/\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0,8\u0002X\u0082\u0004¨\u00060"}, m90084d2 = {"Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", "", "<init>", "()V", "Lkotlinx/coroutines/internal/Node;", "node", "", "e", "(Lkotlinx/coroutines/internal/LockFreeLinkedListNode;)Z", "", "permissionsBitmask", "c", "(Lkotlinx/coroutines/internal/LockFreeLinkedListNode;I)Z", "forbiddenElementsBit", "", "f", "(I)V", "next", "d", "(Lkotlinx/coroutines/internal/LockFreeLinkedListNode;Lkotlinx/coroutines/internal/LockFreeLinkedListNode;)Z", "q", "()Z", "r", "()Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", "", "toString", "()Ljava/lang/String;", "Log0/u;", CmcdData.Factory.STREAMING_FORMAT_SS, "()Log0/u;", "current", CmcdData.Factory.STREAMING_FORMAT_HLS, "(Lkotlinx/coroutines/internal/LockFreeLinkedListNode;)Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", "i", "(Lkotlinx/coroutines/internal/LockFreeLinkedListNode;)V", "g", "p", "isRemoved", "j", "()Ljava/lang/Object;", "k", "nextNode", CmcdData.Factory.STREAM_TYPE_LIVE, "prevNode", "Lkotlinx/atomicfu/AtomicRef;", "_next", "_prev", "_removedRef", "kotlinx-coroutines-core"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nLockFreeLinkedList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LockFreeLinkedList.kt\nkotlinx/coroutines/internal/LockFreeLinkedListNode\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,288:1\n1#2:289\n*E\n"})
public class LockFreeLinkedListNode {

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f91738b = AtomicReferenceFieldUpdater.newUpdater(LockFreeLinkedListNode.class, Object.class, "_next$volatile");

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f91739c = AtomicReferenceFieldUpdater.newUpdater(LockFreeLinkedListNode.class, Object.class, "_prev$volatile");

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f91740d = AtomicReferenceFieldUpdater.newUpdater(LockFreeLinkedListNode.class, Object.class, "_removedRef$volatile");
    private volatile /* synthetic */ Object _next$volatile = this;
    private volatile /* synthetic */ Object _prev$volatile = this;
    private volatile /* synthetic */ Object _removedRef$volatile;

    /* JADX INFO: renamed from: f */
    public final void m91075f(int forbiddenElementsBit) {
        m91072c(new C43068m(forbiddenElementsBit), forbiddenElementsBit);
    }

    @NotNull
    public String toString() {
        return new PropertyReference0Impl(this) { // from class: kotlinx.coroutines.internal.LockFreeLinkedListNode.toString.1
            @Override // p852kotlin.jvm.internal.PropertyReference0Impl, p852kotlin.reflect.KProperty0
            public Object get() {
                return C41717o0.m91174a(this.receiver);
            }
        } + '@' + C41717o0.m91175b(this);
    }

    /* JADX INFO: renamed from: c */
    public final boolean m91072c(@NotNull LockFreeLinkedListNode node, int permissionsBitmask) {
        LockFreeLinkedListNode lockFreeLinkedListNodeM91081l;
        do {
            lockFreeLinkedListNodeM91081l = m91081l();
            if (lockFreeLinkedListNodeM91081l instanceof C43068m) {
                if ((((C43068m) lockFreeLinkedListNodeM91081l).forbiddenElementsBitmask & permissionsBitmask) == 0 && lockFreeLinkedListNodeM91081l.m91072c(node, permissionsBitmask)) {
                    return true;
                }
                return false;
            }
        } while (!lockFreeLinkedListNodeM91081l.m91073d(node, this));
        return true;
    }

    @PublishedApi
    /* JADX INFO: renamed from: d */
    public final boolean m91073d(@NotNull LockFreeLinkedListNode node, @NotNull LockFreeLinkedListNode next) {
        f91739c.set(node, this);
        f91738b.set(node, next);
        if (!C1481a.m2260a(f91738b, this, next, node)) {
            return false;
        }
        node.m91078i(next);
        return true;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m91074e(@NotNull LockFreeLinkedListNode node) {
        f91739c.set(node, this);
        f91738b.set(node, this);
        while (m91079j() == this) {
            if (C1481a.m2260a(f91738b, this, this, node)) {
                node.m91078i(this);
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: g */
    public final LockFreeLinkedListNode m91076g() {
        LockFreeLinkedListNode lockFreeLinkedListNode;
        Object obj;
        while (true) {
            LockFreeLinkedListNode lockFreeLinkedListNode2 = (LockFreeLinkedListNode) f91739c.get(this);
            lockFreeLinkedListNode = lockFreeLinkedListNode2;
            while (true) {
                LockFreeLinkedListNode lockFreeLinkedListNode3 = null;
                while (true) {
                    obj = f91738b.get(lockFreeLinkedListNode);
                    if (obj == this) {
                        if (lockFreeLinkedListNode2 != lockFreeLinkedListNode && !C1481a.m2260a(f91739c, this, lockFreeLinkedListNode2, lockFreeLinkedListNode)) {
                            break;
                        }
                        break;
                    }
                    if (mo91082p()) {
                        return null;
                    }
                    if (obj instanceof C43078u) {
                        if (lockFreeLinkedListNode3 != null) {
                            break;
                        }
                        lockFreeLinkedListNode = (LockFreeLinkedListNode) f91739c.get(lockFreeLinkedListNode);
                    } else {
                        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
                        lockFreeLinkedListNode3 = lockFreeLinkedListNode;
                        lockFreeLinkedListNode = (LockFreeLinkedListNode) obj;
                    }
                }
                if (!C1481a.m2260a(f91738b, lockFreeLinkedListNode3, lockFreeLinkedListNode, ((C43078u) obj).ref)) {
                    break;
                }
                lockFreeLinkedListNode = lockFreeLinkedListNode3;
            }
        }
        return lockFreeLinkedListNode;
    }

    /* JADX INFO: renamed from: h */
    public final LockFreeLinkedListNode m91077h(LockFreeLinkedListNode current) {
        while (current.mo91082p()) {
            current = (LockFreeLinkedListNode) f91739c.get(current);
        }
        return current;
    }

    /* JADX INFO: renamed from: i */
    public final void m91078i(LockFreeLinkedListNode next) {
        LockFreeLinkedListNode lockFreeLinkedListNode;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f91739c;
        do {
            lockFreeLinkedListNode = (LockFreeLinkedListNode) atomicReferenceFieldUpdater.get(next);
            if (m91079j() != next) {
                return;
            }
        } while (!C1481a.m2260a(f91739c, next, lockFreeLinkedListNode, this));
        if (mo91082p()) {
            next.m91076g();
        }
    }

    @NotNull
    /* JADX INFO: renamed from: j */
    public final Object m91079j() {
        return f91738b.get(this);
    }

    @NotNull
    /* JADX INFO: renamed from: k */
    public final LockFreeLinkedListNode m91080k() {
        C43078u c43078u;
        LockFreeLinkedListNode lockFreeLinkedListNode;
        Object objM91079j = m91079j();
        if (objM91079j instanceof C43078u) {
            c43078u = (C43078u) objM91079j;
        } else {
            c43078u = null;
        }
        if (c43078u != null && (lockFreeLinkedListNode = c43078u.ref) != null) {
            return lockFreeLinkedListNode;
        }
        Intrinsics.checkNotNull(objM91079j, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
        return (LockFreeLinkedListNode) objM91079j;
    }

    @NotNull
    /* JADX INFO: renamed from: l */
    public final LockFreeLinkedListNode m91081l() {
        LockFreeLinkedListNode lockFreeLinkedListNodeM91076g = m91076g();
        if (lockFreeLinkedListNodeM91076g == null) {
            return m91077h((LockFreeLinkedListNode) f91739c.get(this));
        }
        return lockFreeLinkedListNodeM91076g;
    }

    /* JADX INFO: renamed from: p */
    public boolean mo91082p() {
        return m91079j() instanceof C43078u;
    }

    /* JADX INFO: renamed from: q */
    public boolean m91083q() {
        if (m91084r() == null) {
            return true;
        }
        return false;
    }

    @PublishedApi
    @Nullable
    /* JADX INFO: renamed from: r */
    public final LockFreeLinkedListNode m91084r() {
        Object objM91079j;
        LockFreeLinkedListNode lockFreeLinkedListNode;
        do {
            objM91079j = m91079j();
            if (objM91079j instanceof C43078u) {
                return ((C43078u) objM91079j).ref;
            }
            if (objM91079j == this) {
                return (LockFreeLinkedListNode) objM91079j;
            }
            Intrinsics.checkNotNull(objM91079j, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
            lockFreeLinkedListNode = (LockFreeLinkedListNode) objM91079j;
        } while (!C1481a.m2260a(f91738b, this, objM91079j, lockFreeLinkedListNode.m91085s()));
        lockFreeLinkedListNode.m91076g();
        return null;
    }

    /* JADX INFO: renamed from: s */
    public final C43078u m91085s() {
        C43078u c43078u = (C43078u) f91740d.get(this);
        if (c43078u == null) {
            C43078u c43078u2 = new C43078u(this);
            f91740d.set(this, c43078u2);
            return c43078u2;
        }
        return c43078u;
    }
}
