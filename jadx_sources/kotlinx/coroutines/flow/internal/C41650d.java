package kotlinx.coroutines.flow.internal;

import androidx.exifinterface.media.ExifInterface;
import kotlinx.coroutines.flow.InterfaceC41634e;
import kotlinx.coroutines.flow.InterfaceC41635f;
import og0.C43059h0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.CoroutineContext;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.BaseContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugProbesKt;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.jvm.internal.TypeIntrinsics;

/* JADX INFO: renamed from: kotlinx.coroutines.flow.internal.d */
/* JADX INFO: compiled from: ChannelFlow.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a%\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a-\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00052\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\t\u001aZ\u0010\u0012\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\n2\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00028\u00012\b\b\u0002\u0010\u000e\u001a\u00020\r2\"\u0010\u0011\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0010\u0012\u0006\u0012\u0004\u0018\u00010\r0\u000fH\u0080@¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m90084d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/flow/e;", "Lkotlinx/coroutines/flow/internal/ChannelFlow;", "b", "(Lkotlinx/coroutines/flow/e;)Lkotlinx/coroutines/flow/internal/ChannelFlow;", "Lkotlinx/coroutines/flow/f;", "Lkotlin/coroutines/CoroutineContext;", "emitContext", "e", "(Lkotlinx/coroutines/flow/f;Lkotlin/coroutines/CoroutineContext;)Lkotlinx/coroutines/flow/f;", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "newContext", "value", "", "countOrElement", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "block", "c", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m90085k = 2, m90086mv = {2, 1, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nChannelFlow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChannelFlow.kt\nkotlinx/coroutines/flow/internal/ChannelFlowKt\n+ 2 CoroutineContext.kt\nkotlinx/coroutines/CoroutineContextKt\n*L\n1#1,241:1\n91#2,5:242\n*S KotlinDebug\n*F\n+ 1 ChannelFlow.kt\nkotlinx/coroutines/flow/internal/ChannelFlowKt\n*L\n222#1:242,5\n*E\n"})
public final class C41650d {
    @NotNull
    /* JADX INFO: renamed from: b */
    public static final <T> ChannelFlow<T> m90979b(@NotNull InterfaceC41634e<? extends T> interfaceC41634e) {
        ChannelFlow<T> channelFlow = interfaceC41634e instanceof ChannelFlow ? (ChannelFlow) interfaceC41634e : null;
        if (channelFlow == null) {
            return new C41651e(interfaceC41634e, null, 0, null, 14, null);
        }
        return channelFlow;
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ Object m90981d(CoroutineContext coroutineContext, Object obj, Object obj2, Function2 function2, Continuation continuation, int i11, Object obj3) {
        if ((i11 & 4) != 0) {
            obj2 = C43059h0.m94588g(coroutineContext);
        }
        return m90980c(coroutineContext, obj, obj2, function2, continuation);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: e */
    public static final <T> InterfaceC41635f<T> m90982e(InterfaceC41635f<? super T> interfaceC41635f, CoroutineContext coroutineContext) {
        return ((interfaceC41635f instanceof C41662p) || (interfaceC41635f instanceof C41657k)) ? interfaceC41635f : new UndispatchedContextCollector(interfaceC41635f, coroutineContext);
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public static final <T, V> Object m90980c(@NotNull CoroutineContext coroutineContext, V v11, @NotNull Object obj, @NotNull Function2<? super V, ? super Continuation<? super T>, ? extends Object> function2, @NotNull Continuation<? super T> continuation) {
        Object objInvoke;
        Object objM94590i = C43059h0.m94590i(coroutineContext, obj);
        try {
            C41663q c41663q = new C41663q(continuation, coroutineContext);
            if (!(function2 instanceof BaseContinuationImpl)) {
                objInvoke = IntrinsicsKt.wrapWithContinuationImpl(function2, v11, c41663q);
            } else {
                objInvoke = ((Function2) TypeIntrinsics.beforeCheckcastToFunctionOfArity(function2, 2)).invoke(v11, c41663q);
            }
            C43059h0.m94587f(coroutineContext, objM94590i);
            if (objInvoke == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                DebugProbesKt.probeCoroutineSuspended(continuation);
            }
            return objInvoke;
        } catch (Throwable th2) {
            C43059h0.m94587f(coroutineContext, objM94590i);
            throw th2;
        }
    }
}
