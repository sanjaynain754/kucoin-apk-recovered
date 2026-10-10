package kotlinx.coroutines.flow.internal;

import androidx.media3.exoplayer.upstream.CmcdData;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.flow.InterfaceC41634e;
import kotlinx.coroutines.flow.InterfaceC41635f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.BuilderInference;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugProbesKt;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.functions.Function3;
import p852kotlin.jvm.internal.SourceDebugExtension;
import pg0.C43466b;

/* JADX INFO: compiled from: FlowCoroutine.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000.\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aA\u0010\u0007\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002)\b\u0001\u0010\u0006\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0001¢\u0006\u0002\b\u0005H\u0080@¢\u0006\u0004\b\u0007\u0010\b\u001aR\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f\"\u0004\b\u0000\u0010\u000025\b\u0001\u0010\u0006\u001a/\b\u0001\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\t¢\u0006\u0002\b\u0005H\u0000¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m90084d2 = {"R", "Lkotlin/Function2;", "Lkotlinx/coroutines/m0;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "block", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/Function3;", "Lkotlinx/coroutines/flow/f;", "", "Lkotlinx/coroutines/flow/e;", "b", "(Lkotlin/jvm/functions/Function3;)Lkotlinx/coroutines/flow/e;", "kotlinx-coroutines-core"}, m90085k = 2, m90086mv = {2, 1, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nFlowCoroutine.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FlowCoroutine.kt\nkotlinx/coroutines/flow/internal/FlowCoroutineKt\n+ 2 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,59:1\n105#2:60\n*S KotlinDebug\n*F\n+ 1 FlowCoroutine.kt\nkotlinx/coroutines/flow/internal/FlowCoroutineKt\n*L\n46#1:60\n*E\n"})
public final class FlowCoroutineKt {

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: renamed from: kotlinx.coroutines.flow.internal.FlowCoroutineKt$a */
    /* JADX INFO: compiled from: SafeCollector.common.kt */
    @Metadata(m90083d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m90084d2 = {"kotlinx/coroutines/flow/internal/FlowCoroutineKt$a", "Lkotlinx/coroutines/flow/e;", "Lkotlinx/coroutines/flow/f;", "collector", "", "collect", "(Lkotlinx/coroutines/flow/f;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 FlowCoroutine.kt\nkotlinx/coroutines/flow/internal/FlowCoroutineKt\n*L\n1#1,108:1\n47#2,2:109\n*E\n"})
    public static final class C41646a<R> implements InterfaceC41634e<R> {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Function3 f91685b;

        public C41646a(Function3 function3) {
            this.f91685b = function3;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC41634e
        public Object collect(InterfaceC41635f<? super R> interfaceC41635f, Continuation<? super Unit> continuation) {
            Object objM90961a = FlowCoroutineKt.m90961a(new FlowCoroutineKt$scopedFlow$1$1(this.f91685b, interfaceC41635f, null), continuation);
            return objM90961a == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM90961a : Unit.INSTANCE;
        }
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    public static final <R> Object m90961a(@BuilderInference @NotNull Function2<? super InterfaceC41709m0, ? super Continuation<? super R>, ? extends Object> function2, @NotNull Continuation<? super R> continuation) {
        C41653g c41653g = new C41653g(continuation.getContext(), continuation);
        Object objM95683d = C43466b.m95683d(c41653g, c41653g, function2);
        if (objM95683d == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return objM95683d;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public static final <R> InterfaceC41634e<R> m90962b(@BuilderInference @NotNull Function3<? super InterfaceC41709m0, ? super InterfaceC41635f<? super R>, ? super Continuation<? super Unit>, ? extends Object> function3) {
        return new C41646a(function3);
    }
}
