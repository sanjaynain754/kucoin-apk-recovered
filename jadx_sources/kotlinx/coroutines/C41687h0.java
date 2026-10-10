package kotlinx.coroutines;

import androidx.media3.exoplayer.upstream.CmcdData;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.ContinuationInterceptor;
import p852kotlin.coroutines.CoroutineContext;
import p852kotlin.coroutines.EmptyCoroutineContext;
import p852kotlin.coroutines.jvm.internal.CoroutineStackFrame;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Ref;

/* JADX INFO: renamed from: kotlinx.coroutines.h0 */
/* JADX INFO: compiled from: CoroutineContext.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a\u001b\u0010\u0003\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001b\u0010\u0006\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0013\u0010\t\u001a\u00020\b*\u00020\u0001H\u0002¢\u0006\u0004\b\t\u0010\n\u001a'\u0010\u000e\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000e\u0010\u000f\u001a/\u0010\u0014\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0013*\u0006\u0012\u0002\b\u00030\u00102\u0006\u0010\u0002\u001a\u00020\u00012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u001a\u0010\u0017\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0013*\u00020\u0016H\u0080\u0010¢\u0006\u0004\b\u0017\u0010\u0018\"\u001a\u0010\u001c\u001a\u0004\u0018\u00010\u0019*\u00020\u00018@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, m90084d2 = {"Lkotlinx/coroutines/m0;", "Lkotlin/coroutines/CoroutineContext;", "context", "k", "(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;)Lkotlin/coroutines/CoroutineContext;", "addedContext", "j", "(Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/CoroutineContext;)Lkotlin/coroutines/CoroutineContext;", "", CmcdData.Factory.STREAMING_FORMAT_HLS, "(Lkotlin/coroutines/CoroutineContext;)Z", "originalContext", "appendContext", "isNewCoroutine", "d", "(Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/CoroutineContext;Z)Lkotlin/coroutines/CoroutineContext;", "Lkotlin/coroutines/Continuation;", "", "oldValue", "Lkotlinx/coroutines/x2;", "m", "(Lkotlin/coroutines/Continuation;Lkotlin/coroutines/CoroutineContext;Ljava/lang/Object;)Lkotlinx/coroutines/x2;", "Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", CmcdData.Factory.STREAM_TYPE_LIVE, "(Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;)Lkotlinx/coroutines/x2;", "", "g", "(Lkotlin/coroutines/CoroutineContext;)Ljava/lang/String;", "coroutineName", "kotlinx-coroutines-core"}, m90085k = 2, m90086mv = {2, 1, 0}, m90088xi = 48)
public final class C41687h0 {
    @Nullable
    /* JADX INFO: renamed from: g */
    public static final String m91056g(@NotNull CoroutineContext coroutineContext) {
        return null;
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [T, kotlin.coroutines.CoroutineContext] */
    /* JADX INFO: renamed from: e */
    public static final CoroutineContext m91054e(Ref.ObjectRef objectRef, boolean z11, CoroutineContext coroutineContext, CoroutineContext.Element element) {
        if (!(element instanceof InterfaceC41580d0)) {
            return coroutineContext.plus(element);
        }
        CoroutineContext.Element element2 = ((CoroutineContext) objectRef.element).get(element.getKey());
        if (element2 == null) {
            return coroutineContext.plus(z11 ? ((InterfaceC41580d0) element).m90716k() : (InterfaceC41580d0) element);
        }
        objectRef.element = ((CoroutineContext) objectRef.element).minusKey(element.getKey());
        return coroutineContext.plus(((InterfaceC41580d0) element).m90715g(element2));
    }

    /* JADX INFO: renamed from: f */
    public static final CoroutineContext m91055f(CoroutineContext coroutineContext, CoroutineContext.Element element) {
        return element instanceof InterfaceC41580d0 ? coroutineContext.plus(((InterfaceC41580d0) element).m90716k()) : coroutineContext.plus(element);
    }

    /* JADX INFO: renamed from: h */
    public static final boolean m91057h(CoroutineContext coroutineContext) {
        return ((Boolean) coroutineContext.fold(Boolean.FALSE, new Function2() { // from class: kotlinx.coroutines.e0
            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return Boolean.valueOf(C41687h0.m91058i(((Boolean) obj).booleanValue(), (CoroutineContext.Element) obj2));
            }
        })).booleanValue();
    }

    /* JADX INFO: renamed from: i */
    public static final boolean m91058i(boolean z11, CoroutineContext.Element element) {
        return z11 || (element instanceof InterfaceC41580d0);
    }

    @Nullable
    /* JADX INFO: renamed from: l */
    public static final C41776x2<?> m91061l(@NotNull CoroutineStackFrame coroutineStackFrame) {
        while (!(coroutineStackFrame instanceof C41766v0) && (coroutineStackFrame = coroutineStackFrame.getCallerFrame()) != null) {
            if (coroutineStackFrame instanceof C41776x2) {
                return (C41776x2) coroutineStackFrame;
            }
        }
        return null;
    }

    @Nullable
    /* JADX INFO: renamed from: m */
    public static final C41776x2<?> m91062m(@NotNull Continuation<?> continuation, @NotNull CoroutineContext coroutineContext, @Nullable Object obj) {
        if (!(continuation instanceof CoroutineStackFrame) || coroutineContext.get(C41780y2.f91883b) == null) {
            return null;
        }
        C41776x2<?> c41776x2M91061l = m91061l((CoroutineStackFrame) continuation);
        if (c41776x2M91061l != null) {
            c41776x2M91061l.m91385b1(coroutineContext, obj);
        }
        return c41776x2M91061l;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v4, types: [T, java.lang.Object] */
    /* JADX INFO: renamed from: d */
    public static final CoroutineContext m91053d(CoroutineContext coroutineContext, CoroutineContext coroutineContext2, final boolean z11) {
        boolean zM91057h = m91057h(coroutineContext);
        boolean zM91057h2 = m91057h(coroutineContext2);
        if (!zM91057h && !zM91057h2) {
            return coroutineContext.plus(coroutineContext2);
        }
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = coroutineContext2;
        EmptyCoroutineContext emptyCoroutineContext = EmptyCoroutineContext.INSTANCE;
        CoroutineContext coroutineContext3 = (CoroutineContext) coroutineContext.fold(emptyCoroutineContext, new Function2() { // from class: kotlinx.coroutines.f0
            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return C41687h0.m91054e(objectRef, z11, (CoroutineContext) obj, (CoroutineContext.Element) obj2);
            }
        });
        if (zM91057h2) {
            objectRef.element = ((CoroutineContext) objectRef.element).fold(emptyCoroutineContext, new Function2() { // from class: kotlinx.coroutines.g0
                @Override // p852kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return C41687h0.m91055f((CoroutineContext) obj, (CoroutineContext.Element) obj2);
                }
            });
        }
        return coroutineContext3.plus((CoroutineContext) objectRef.element);
    }

    @NotNull
    /* JADX INFO: renamed from: j */
    public static final CoroutineContext m91059j(@NotNull CoroutineContext coroutineContext, @NotNull CoroutineContext coroutineContext2) {
        if (!m91057h(coroutineContext2)) {
            return coroutineContext.plus(coroutineContext2);
        }
        return m91053d(coroutineContext, coroutineContext2, false);
    }

    @NotNull
    /* JADX INFO: renamed from: k */
    public static final CoroutineContext m91060k(@NotNull InterfaceC41709m0 interfaceC41709m0, @NotNull CoroutineContext coroutineContext) {
        CoroutineContext coroutineContextM91053d = m91053d(interfaceC41709m0.getF796b(), coroutineContext, true);
        if (coroutineContextM91053d != C41782z0.m91391a() && coroutineContextM91053d.get(ContinuationInterceptor.INSTANCE) == null) {
            return coroutineContextM91053d.plus(C41782z0.m91391a());
        }
        return coroutineContextM91053d;
    }
}
