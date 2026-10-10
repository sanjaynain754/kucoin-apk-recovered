package og0;

import androidx.concurrent.futures.C1481a;
import androidx.exifinterface.media.ExifInterface;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.sensorsdata.analytics.android.sdk.data.adapter.DbParams;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.AbstractC41589f1;
import kotlinx.coroutines.AbstractC41697j0;
import kotlinx.coroutines.AbstractC41770w0;
import kotlinx.coroutines.C41554c0;
import kotlinx.coroutines.C41716o;
import kotlinx.coroutines.C41717o0;
import kotlinx.coroutines.C41760t2;
import kotlinx.coroutines.InterfaceC41708m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.CoroutineContext;
import p852kotlin.coroutines.jvm.internal.CoroutineStackFrame;
import p852kotlin.jvm.JvmField;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: og0.h */
/* JADX INFO: compiled from: DispatchedContinuation.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u00022\u00060\u0003j\u0002`\u00042\b\u0012\u0004\u0012\u00028\u00000\u0005B\u001d\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\n\u0018\u00010\u000bj\u0004\u0018\u0001`\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0012H\u0000¢\u0006\u0004\b\u0015\u0010\u0014J\u0017\u0010\u0017\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0016H\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u0019H\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001e\u001a\u00020\u000f2\u0006\u0010\u001d\u001a\u00020\u001aH\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ\u0011\u0010!\u001a\u0004\u0018\u00010 H\u0010¢\u0006\u0004\b!\u0010\"J\u001d\u0010%\u001a\u00020\u00122\f\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00000#H\u0016¢\u0006\u0004\b%\u0010&J\u001f\u0010*\u001a\u00020\u00122\u0006\u0010(\u001a\u00020'2\u0006\u0010)\u001a\u00028\u0000H\u0000¢\u0006\u0004\b*\u0010+J\u000f\u0010-\u001a\u00020,H\u0016¢\u0006\u0004\b-\u0010.R\u0014\u0010\u0007\u001a\u00020\u00068\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u001e\u00106\u001a\u0004\u0018\u00010 8\u0000@\u0000X\u0081\u000e¢\u0006\f\n\u0004\b3\u00104\u0012\u0004\b5\u0010\u0014R\u0014\u00107\u001a\u00020 8\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b!\u00104R\u001c\u0010:\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b8\u00109R\u001a\u0010=\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058PX\u0090\u0004¢\u0006\u0006\u001a\u0004\b;\u0010<R\u0014\u0010(\u001a\u00020'8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b>\u0010?R\u001a\u0010A\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00168BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b@\u0010\u0018R\u0013\u0010C\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010 0B8\u0002X\u0082\u0004¨\u0006D"}, m90084d2 = {"Log0/h;", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/w0;", "Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "Lkotlinx/coroutines/internal/CoroutineStackFrame;", "Lkotlin/coroutines/Continuation;", "Lkotlinx/coroutines/j0;", "dispatcher", "continuation", "<init>", "(Lkotlinx/coroutines/j0;Lkotlin/coroutines/Continuation;)V", "Ljava/lang/StackTraceElement;", "Lkotlinx/coroutines/internal/StackTraceElement;", "getStackTraceElement", "()Ljava/lang/StackTraceElement;", "", "n", "()Z", "", "i", "()V", "p", "Lkotlinx/coroutines/o;", "j", "()Lkotlinx/coroutines/o;", "Lkotlinx/coroutines/m;", "", "q", "(Lkotlinx/coroutines/m;)Ljava/lang/Throwable;", "cause", "o", "(Ljava/lang/Throwable;)Z", "", CmcdData.Factory.STREAMING_FORMAT_HLS, "()Ljava/lang/Object;", "Lkotlin/Result;", DbParams.KEY_CHANNEL_RESULT, "resumeWith", "(Ljava/lang/Object;)V", "Lkotlin/coroutines/CoroutineContext;", "context", "value", "k", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Object;)V", "", "toString", "()Ljava/lang/String;", "e", "Lkotlinx/coroutines/j0;", "f", "Lkotlin/coroutines/Continuation;", "g", "Ljava/lang/Object;", "get_state$kotlinx_coroutines_core$annotations", "_state", "countOrElement", "getCallerFrame", "()Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "callerFrame", "b", "()Lkotlin/coroutines/Continuation;", "delegate", "getContext", "()Lkotlin/coroutines/CoroutineContext;", CmcdData.Factory.STREAM_TYPE_LIVE, "reusableCancellableContinuation", "Lkotlinx/atomicfu/AtomicRef;", "_reusableCancellableContinuation", "kotlinx-coroutines-core"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nDispatchedContinuation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DispatchedContinuation.kt\nkotlinx/coroutines/internal/DispatchedContinuation\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 DispatchedContinuation.kt\nkotlinx/coroutines/internal/DispatchedContinuationKt\n+ 4 DispatchedTask.kt\nkotlinx/coroutines/DispatchedTaskKt\n+ 5 CoroutineContext.kt\nkotlinx/coroutines/CoroutineContextKt\n*L\n1#1,313:1\n224#1,8:377\n236#1:385\n237#1,2:396\n239#1:400\n1#2:314\n1#2:320\n1#2:361\n293#3,5:315\n298#3,12:321\n310#3:355\n293#3,5:356\n298#3,12:362\n310#3:415\n184#4,3:333\n187#4,14:341\n184#4,3:374\n187#4,14:401\n91#5,5:336\n103#5,10:386\n114#5,2:398\n103#5,13:416\n*S KotlinDebug\n*F\n+ 1 DispatchedContinuation.kt\nkotlinx/coroutines/internal/DispatchedContinuation\n*L\n214#1:377,8\n215#1:385\n215#1:396,2\n215#1:400\n195#1:320\n213#1:361\n195#1:315,5\n195#1:321,12\n195#1:355\n213#1:356,5\n213#1:362,12\n213#1:415\n195#1:333,3\n195#1:341,14\n213#1:374,3\n213#1:401,14\n196#1:336,5\n215#1:386,10\n215#1:398,2\n236#1:416,13\n*E\n"})
public final class C43058h<T> extends AbstractC41770w0<T> implements CoroutineStackFrame, Continuation<T> {

    /* JADX INFO: renamed from: i */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f95240i = AtomicReferenceFieldUpdater.newUpdater(C43058h.class, Object.class, "_reusableCancellableContinuation$volatile");
    private volatile /* synthetic */ Object _reusableCancellableContinuation$volatile;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @JvmField
    @NotNull
    public final AbstractC41697j0 dispatcher;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @JvmField
    @NotNull
    public final Continuation<T> continuation;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @JvmField
    @Nullable
    public Object _state;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @JvmField
    @NotNull
    public final Object countOrElement;

    /* JADX WARN: Multi-variable type inference failed */
    public C43058h(@NotNull AbstractC41697j0 abstractC41697j0, @NotNull Continuation<? super T> continuation) {
        super(-1);
        this.dispatcher = abstractC41697j0;
        this.continuation = continuation;
        this._state = C43060i.f95249a;
        this.countOrElement = C43059h0.m94588g(getContext());
    }

    @Override // p852kotlin.coroutines.jvm.internal.CoroutineStackFrame
    @Nullable
    public StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // p852kotlin.coroutines.jvm.internal.CoroutineStackFrame
    @Nullable
    public CoroutineStackFrame getCallerFrame() {
        Continuation<T> continuation = this.continuation;
        if (continuation instanceof CoroutineStackFrame) {
            return (CoroutineStackFrame) continuation;
        }
        return null;
    }

    @Override // p852kotlin.coroutines.Continuation
    @NotNull
    public CoroutineContext getContext() {
        return this.continuation.getContext();
    }

    @Override // kotlinx.coroutines.AbstractC41770w0
    @Nullable
    /* JADX INFO: renamed from: h */
    public Object mo91161h() {
        Object obj = this._state;
        this._state = C43060i.f95249a;
        return obj;
    }

    /* JADX INFO: renamed from: k */
    public final void m94576k(@NotNull CoroutineContext context, T value) {
        this._state = value;
        this.resumeMode = 1;
        this.dispatcher.dispatchYield(context, this);
    }

    @NotNull
    public String toString() {
        return "DispatchedContinuation[" + this.dispatcher + ", " + C41717o0.m91176c(this.continuation) + ']';
    }

    /* JADX INFO: renamed from: i */
    public final void m94574i() {
        while (f95240i.get(this) == C43060i.f95250b) {
        }
    }

    @Nullable
    /* JADX INFO: renamed from: j */
    public final C41716o<T> m94575j() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f95240i;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                f95240i.set(this, C43060i.f95250b);
                return null;
            }
            if (obj instanceof C41716o) {
                if (C1481a.m2260a(f95240i, this, obj, C43060i.f95250b)) {
                    return (C41716o) obj;
                }
            } else if (obj != C43060i.f95250b && !(obj instanceof Throwable)) {
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        }
    }

    /* JADX INFO: renamed from: l */
    public final C41716o<?> m94577l() {
        Object obj = f95240i.get(this);
        if (obj instanceof C41716o) {
            return (C41716o) obj;
        }
        return null;
    }

    /* JADX INFO: renamed from: n */
    public final boolean m94578n() {
        if (f95240i.get(this) != null) {
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: o */
    public final boolean m94579o(@NotNull Throwable cause) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f95240i;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            C43045a0 c43045a0 = C43060i.f95250b;
            if (Intrinsics.areEqual(obj, c43045a0)) {
                if (C1481a.m2260a(f95240i, this, c43045a0, cause)) {
                    return true;
                }
            } else {
                if (obj instanceof Throwable) {
                    return true;
                }
                if (C1481a.m2260a(f95240i, this, obj, null)) {
                    return false;
                }
            }
        }
    }

    /* JADX INFO: renamed from: p */
    public final void m94580p() {
        m94574i();
        C41716o<?> c41716oM94577l = m94577l();
        if (c41716oM94577l != null) {
            c41716oM94577l.m91167o();
        }
    }

    @Nullable
    /* JADX INFO: renamed from: q */
    public final Throwable m94581q(@NotNull InterfaceC41708m<?> continuation) {
        C43045a0 c43045a0;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f95240i;
        do {
            Object obj = atomicReferenceFieldUpdater.get(this);
            c43045a0 = C43060i.f95250b;
            if (obj != c43045a0) {
                if (obj instanceof Throwable) {
                    if (C1481a.m2260a(f95240i, this, obj, null)) {
                        return (Throwable) obj;
                    }
                    throw new IllegalArgumentException("Failed requirement.");
                }
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        } while (!C1481a.m2260a(f95240i, this, c43045a0, continuation));
        return null;
    }

    @Override // p852kotlin.coroutines.Continuation
    public void resumeWith(@NotNull Object result) {
        Object objM90499b = C41554c0.m90499b(result);
        if (C43060i.m94594d(this.dispatcher, getContext())) {
            this._state = objM90499b;
            this.resumeMode = 0;
            C43060i.m94593c(this.dispatcher, getContext(), this);
            return;
        }
        AbstractC41589f1 abstractC41589f1M91356b = C41760t2.f91865a.m91356b();
        if (abstractC41589f1M91356b.m90734R()) {
            this._state = objM90499b;
            this.resumeMode = 0;
            abstractC41589f1M91356b.m90731M(this);
            return;
        }
        abstractC41589f1M91356b.m90733P(true);
        try {
            CoroutineContext context = getContext();
            Object objM94590i = C43059h0.m94590i(context, this.countOrElement);
            try {
                this.continuation.resumeWith(result);
                Unit unit = Unit.INSTANCE;
                C43059h0.m94587f(context, objM94590i);
                while (abstractC41589f1M91356b.m90737U()) {
                }
            } catch (Throwable th2) {
                C43059h0.m94587f(context, objM94590i);
                throw th2;
            }
        } catch (Throwable th3) {
            try {
                m91371g(th3);
            } finally {
                abstractC41589f1M91356b.m90739p(true);
            }
        }
    }

    @Override // kotlinx.coroutines.AbstractC41770w0
    @NotNull
    /* JADX INFO: renamed from: b */
    public Continuation<T> mo91158b() {
        return this;
    }
}
