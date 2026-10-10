package kotlinx.coroutines.flow.internal;

import androidx.exifinterface.media.ExifInterface;
import androidx.media3.exoplayer.upstream.CmcdData;
import kotlinx.coroutines.C41687h0;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.channels.InterfaceC41574m;
import kotlinx.coroutines.flow.InterfaceC41634e;
import kotlinx.coroutines.flow.InterfaceC41635f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.ContinuationInterceptor;
import p852kotlin.coroutines.CoroutineContext;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.jvm.JvmField;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ChannelFlow.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\b\b \u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\b\u0012\u0004\u0012\u00028\u00010\u0003B-\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u001e\u0010\u0011\u001a\u00020\u00102\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00010\u000eH¤@¢\u0006\u0004\b\u0011\u0010\u0012J\u001e\u0010\u0015\u001a\u00020\u00102\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00010\u0013H\u0094@¢\u0006\u0004\b\u0015\u0010\u0016J\u001e\u0010\u0017\u001a\u00020\u00102\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00010\u000eH\u0096@¢\u0006\u0004\b\u0017\u0010\u0012J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ&\u0010\u001c\u001a\u00020\u00102\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00010\u000e2\u0006\u0010\u001b\u001a\u00020\u0006H\u0082@¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0004X\u0085\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006 "}, m90084d2 = {"Lkotlinx/coroutines/flow/internal/ChannelFlowOperator;", ExifInterface.LATITUDE_SOUTH, ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/flow/internal/ChannelFlow;", "Lkotlinx/coroutines/flow/e;", "flow", "Lkotlin/coroutines/CoroutineContext;", "context", "", "capacity", "Lkotlinx/coroutines/channels/BufferOverflow;", "onBufferOverflow", "<init>", "(Lkotlinx/coroutines/flow/e;Lkotlin/coroutines/CoroutineContext;ILkotlinx/coroutines/channels/BufferOverflow;)V", "Lkotlinx/coroutines/flow/f;", "collector", "", "q", "(Lkotlinx/coroutines/flow/f;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlinx/coroutines/channels/m;", "scope", CmcdData.Factory.STREAMING_FORMAT_HLS, "(Lkotlinx/coroutines/channels/m;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "collect", "", "toString", "()Ljava/lang/String;", "newContext", "p", "(Lkotlinx/coroutines/flow/f;Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "e", "Lkotlinx/coroutines/flow/e;", "kotlinx-coroutines-core"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
public abstract class ChannelFlowOperator<S, T> extends ChannelFlow<T> {

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @JvmField
    @NotNull
    public final InterfaceC41634e<S> flow;

    @Nullable
    /* JADX INFO: renamed from: q */
    public abstract Object mo90956q(@NotNull InterfaceC41635f<? super T> interfaceC41635f, @NotNull Continuation<? super Unit> continuation);

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ <S, T> Object m90953n(ChannelFlowOperator<S, T> channelFlowOperator, InterfaceC41635f<? super T> interfaceC41635f, Continuation<? super Unit> continuation) {
        if (channelFlowOperator.capacity == -3) {
            CoroutineContext context = continuation.get$context();
            CoroutineContext coroutineContextM91059j = C41687h0.m91059j(context, channelFlowOperator.context);
            if (Intrinsics.areEqual(coroutineContextM91059j, context)) {
                Object objMo90956q = channelFlowOperator.mo90956q(interfaceC41635f, continuation);
                return objMo90956q == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objMo90956q : Unit.INSTANCE;
            }
            ContinuationInterceptor.Companion companion = ContinuationInterceptor.INSTANCE;
            if (Intrinsics.areEqual(coroutineContextM91059j.get(companion), context.get(companion))) {
                Object objM90955p = channelFlowOperator.m90955p(interfaceC41635f, coroutineContextM91059j, continuation);
                return objM90955p == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM90955p : Unit.INSTANCE;
            }
        }
        Object objCollect = super.collect(interfaceC41635f, continuation);
        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ <S, T> Object m90954o(ChannelFlowOperator<S, T> channelFlowOperator, InterfaceC41574m<? super T> interfaceC41574m, Continuation<? super Unit> continuation) {
        Object objMo90956q = channelFlowOperator.mo90956q(new C41662p(interfaceC41574m), continuation);
        return objMo90956q == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objMo90956q : Unit.INSTANCE;
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    @NotNull
    public String toString() {
        return this.flow + " -> " + super.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ChannelFlowOperator(@NotNull InterfaceC41634e<? extends S> interfaceC41634e, @NotNull CoroutineContext coroutineContext, int i11, @NotNull BufferOverflow bufferOverflow) {
        super(coroutineContext, i11, bufferOverflow);
        this.flow = interfaceC41634e;
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow, kotlinx.coroutines.flow.InterfaceC41634e
    @Nullable
    public Object collect(@NotNull InterfaceC41635f<? super T> interfaceC41635f, @NotNull Continuation<? super Unit> continuation) {
        return m90953n(this, interfaceC41635f, continuation);
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    @Nullable
    /* JADX INFO: renamed from: h */
    public Object mo90741h(@NotNull InterfaceC41574m<? super T> interfaceC41574m, @NotNull Continuation<? super Unit> continuation) {
        return m90954o(this, interfaceC41574m, continuation);
    }

    /* JADX INFO: renamed from: p */
    public final Object m90955p(InterfaceC41635f<? super T> interfaceC41635f, CoroutineContext coroutineContext, Continuation<? super Unit> continuation) {
        return C41650d.m90981d(coroutineContext, C41650d.m90982e(interfaceC41635f, continuation.get$context()), null, new ChannelFlowOperator$collectWithContextUndispatched$2(this, null), continuation, 4, null);
    }
}
