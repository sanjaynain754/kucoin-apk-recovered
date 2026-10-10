package kotlinx.coroutines.flow.internal;

import androidx.exifinterface.media.ExifInterface;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.sensorsdata.analytics.android.sdk.data.adapter.DbParams;
import kotlinx.coroutines.C41783z1;
import kotlinx.coroutines.flow.InterfaceC41635f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.CoroutineContext;
import p852kotlin.coroutines.EmptyCoroutineContext;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.CoroutineStackFrame;
import p852kotlin.coroutines.jvm.internal.DebugProbesKt;
import p852kotlin.jvm.JvmField;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.functions.Function3;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;

/* JADX INFO: compiled from: SafeCollector.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\f\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00020\u00032\u00020\u0004B\u001d\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0011\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0010\u001a\u00020\u000e2\u000e\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\rH\u0014¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00028\u0000H\u0096@¢\u0006\u0004\b\u0016\u0010\u0017J'\u0010\u001a\u001a\u0004\u0018\u00010\u000e2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00120\u00182\u0006\u0010\u0015\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ)\u0010\u001e\u001a\u00020\u00122\u0006\u0010\u001c\u001a\u00020\u00062\b\u0010\u001d\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0015\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ!\u0010\"\u001a\u00020\u00122\u0006\u0010!\u001a\u00020 2\b\u0010\u0015\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b\"\u0010#R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010$R\u0014\u0010\u0007\u001a\u00020\u00068\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010%R\u0014\u0010'\u001a\u00020&8\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0018\u0010)\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010%R\u001e\u0010*\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u0016\u0010.\u001a\u0004\u0018\u00010\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b,\u0010-R\u0014\u00101\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b/\u00100¨\u00062"}, m90084d2 = {"Lkotlinx/coroutines/flow/internal/SafeCollector;", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/flow/f;", "Lkotlin/coroutines/jvm/internal/ContinuationImpl;", "Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "collector", "Lkotlin/coroutines/CoroutineContext;", "collectContext", "<init>", "(Lkotlinx/coroutines/flow/f;Lkotlin/coroutines/CoroutineContext;)V", "Ljava/lang/StackTraceElement;", "getStackTraceElement", "()Ljava/lang/StackTraceElement;", "Lkotlin/Result;", "", DbParams.KEY_CHANNEL_RESULT, "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "", "releaseIntercepted", "()V", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/coroutines/Continuation;", "uCont", CmcdData.Factory.STREAMING_FORMAT_HLS, "(Lkotlin/coroutines/Continuation;Ljava/lang/Object;)Ljava/lang/Object;", "currentContext", "previousContext", "f", "(Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/CoroutineContext;Ljava/lang/Object;)V", "Lkotlinx/coroutines/flow/internal/f;", "exception", "i", "(Lkotlinx/coroutines/flow/internal/f;Ljava/lang/Object;)V", "Lkotlinx/coroutines/flow/f;", "Lkotlin/coroutines/CoroutineContext;", "", "collectContextSize", "I", "lastEmissionContext", "completion_", "Lkotlin/coroutines/Continuation;", "getCallerFrame", "()Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "callerFrame", "getContext", "()Lkotlin/coroutines/CoroutineContext;", "context", "kotlinx-coroutines-core"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSafeCollector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.kt\nkotlinx/coroutines/flow/internal/SafeCollector\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,182:1\n1#2:183\n*E\n"})
public final class SafeCollector<T> extends ContinuationImpl implements InterfaceC41635f<T>, CoroutineStackFrame {

    @JvmField
    @NotNull
    public final CoroutineContext collectContext;

    @JvmField
    public final int collectContextSize;

    @JvmField
    @NotNull
    public final InterfaceC41635f<T> collector;

    @Nullable
    private Continuation<? super Unit> completion_;

    @Nullable
    private CoroutineContext lastEmissionContext;

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl, p852kotlin.coroutines.jvm.internal.CoroutineStackFrame
    @Nullable
    public StackTraceElement getStackTraceElement() {
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SafeCollector(@NotNull InterfaceC41635f<? super T> interfaceC41635f, @NotNull CoroutineContext coroutineContext) {
        super(C41656j.f91697b, EmptyCoroutineContext.INSTANCE);
        this.collector = interfaceC41635f;
        this.collectContext = coroutineContext;
        this.collectContextSize = ((Number) coroutineContext.fold(0, new Function2() { // from class: kotlinx.coroutines.flow.internal.m
            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return Integer.valueOf(SafeCollector.m90964g(((Integer) obj).intValue(), (CoroutineContext.Element) obj2));
            }
        })).intValue();
    }

    /* JADX INFO: renamed from: g */
    public static final int m90964g(int i11, CoroutineContext.Element element) {
        return i11 + 1;
    }

    /* JADX INFO: renamed from: f */
    public final void m90965f(CoroutineContext currentContext, CoroutineContext previousContext, T value) {
        if (previousContext instanceof C41652f) {
            m90967i((C41652f) previousContext, value);
        }
        C41661o.m90986b(this, currentContext);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl, p852kotlin.coroutines.jvm.internal.CoroutineStackFrame
    @Nullable
    public CoroutineStackFrame getCallerFrame() {
        Continuation<? super Unit> continuation = this.completion_;
        if (continuation instanceof CoroutineStackFrame) {
            return (CoroutineStackFrame) continuation;
        }
        return null;
    }

    @Override // p852kotlin.coroutines.jvm.internal.ContinuationImpl, p852kotlin.coroutines.Continuation
    @NotNull
    public CoroutineContext getContext() {
        CoroutineContext coroutineContext = this.lastEmissionContext;
        return coroutineContext == null ? EmptyCoroutineContext.INSTANCE : coroutineContext;
    }

    /* JADX INFO: renamed from: i */
    public final void m90967i(C41652f exception, Object value) {
        throw new IllegalStateException(StringsKt.trimIndent("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + exception.e + ", but then emission attempt of value '" + value + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ").toString());
    }

    @Override // kotlinx.coroutines.flow.InterfaceC41635f
    @Nullable
    public Object emit(T t11, @NotNull Continuation<? super Unit> continuation) {
        try {
            Object objM90966h = m90966h(continuation, t11);
            if (objM90966h == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                DebugProbesKt.probeCoroutineSuspended(continuation);
            }
            if (objM90966h == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                return objM90966h;
            }
            return Unit.INSTANCE;
        } catch (Throwable th2) {
            this.lastEmissionContext = new C41652f(th2, continuation.getContext());
            throw th2;
        }
    }

    /* JADX INFO: renamed from: h */
    public final Object m90966h(Continuation<? super Unit> uCont, T value) {
        CoroutineContext context = uCont.getContext();
        C41783z1.m91406l(context);
        CoroutineContext coroutineContext = this.lastEmissionContext;
        if (coroutineContext != context) {
            m90965f(context, coroutineContext, value);
            this.lastEmissionContext = context;
        }
        this.completion_ = uCont;
        Function3 function3 = SafeCollectorKt.f91686a;
        InterfaceC41635f<T> interfaceC41635f = this.collector;
        Intrinsics.checkNotNull(interfaceC41635f, "null cannot be cast to non-null type kotlinx.coroutines.flow.FlowCollector<kotlin.Any?>");
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Unit>");
        Object objInvoke = function3.invoke(interfaceC41635f, value, this);
        if (!Intrinsics.areEqual(objInvoke, IntrinsicsKt.getCOROUTINE_SUSPENDED())) {
            this.completion_ = null;
        }
        return objInvoke;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public Object invokeSuspend(@NotNull Object result) {
        Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(result);
        if (thM103847exceptionOrNullimpl != null) {
            this.lastEmissionContext = new C41652f(thM103847exceptionOrNullimpl, getContext());
        }
        Continuation<? super Unit> continuation = this.completion_;
        if (continuation != null) {
            continuation.resumeWith(result);
        }
        return IntrinsicsKt.getCOROUTINE_SUSPENDED();
    }

    @Override // p852kotlin.coroutines.jvm.internal.ContinuationImpl, p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public void releaseIntercepted() {
        super.releaseIntercepted();
    }
}
