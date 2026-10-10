package kotlinx.coroutines;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.media3.exoplayer.upstream.CmcdData;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.KotlinNothingValueException;
import p852kotlin.Metadata;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.ContinuationInterceptor;
import p852kotlin.coroutines.CoroutineContext;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugProbesKt;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.time.Duration;
import p852kotlin.time.DurationKt;
import p852kotlin.time.DurationUnit;

/* JADX INFO: compiled from: Delay.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0010\u0010\u0001\u001a\u00020\u0000H\u0086@¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0086@¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0018\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH\u0086@¢\u0006\u0004\b\n\u0010\u0007\u001a\u0013\u0010\u000b\u001a\u00020\u0003*\u00020\bH\u0000¢\u0006\u0004\b\u000b\u0010\f\"\u0018\u0010\u0011\u001a\u00020\u000e*\u00020\r8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, m90084d2 = {"", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "timeMillis", "", "b", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/time/Duration;", TypedValues.TransitionType.S_DURATION, "c", "e", "(J)J", "Lkotlin/coroutines/CoroutineContext;", "Lkotlinx/coroutines/t0;", "d", "(Lkotlin/coroutines/CoroutineContext;)Lkotlinx/coroutines/t0;", "delay", "kotlinx-coroutines-core"}, m90085k = 2, m90086mv = {2, 1, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nDelay.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Delay.kt\nkotlinx/coroutines/DelayKt\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,159:1\n426#2,11:160\n426#2,11:171\n*S KotlinDebug\n*F\n+ 1 Delay.kt\nkotlinx/coroutines/DelayKt\n*L\n103#1:160,11\n123#1:171,11\n*E\n"})
public final class DelayKt {
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    /* JADX INFO: renamed from: a */
    public static final Object m90349a(@NotNull Continuation<?> continuation) {
        DelayKt$awaitCancellation$1 delayKt$awaitCancellation$1;
        if (continuation instanceof DelayKt$awaitCancellation$1) {
            delayKt$awaitCancellation$1 = (DelayKt$awaitCancellation$1) continuation;
            int i11 = delayKt$awaitCancellation$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                delayKt$awaitCancellation$1.label = i11 - Integer.MIN_VALUE;
            } else {
                delayKt$awaitCancellation$1 = new DelayKt$awaitCancellation$1(continuation);
            }
        } else {
            delayKt$awaitCancellation$1 = new DelayKt$awaitCancellation$1(continuation);
        }
        Object obj = delayKt$awaitCancellation$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = delayKt$awaitCancellation$1.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj);
            delayKt$awaitCancellation$1.label = 1;
            C41716o c41716o = new C41716o(IntrinsicsKt.intercepted(delayKt$awaitCancellation$1), 1);
            c41716o.m91142E();
            Object objM91171w = c41716o.m91171w();
            if (objM91171w == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                DebugProbesKt.probeCoroutineSuspended(delayKt$awaitCancellation$1);
            }
            if (objM91171w == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        throw new KotlinNothingValueException();
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public static final Object m90350b(long j11, @NotNull Continuation<? super Unit> continuation) {
        if (j11 <= 0) {
            return Unit.INSTANCE;
        }
        C41716o c41716o = new C41716o(IntrinsicsKt.intercepted(continuation), 1);
        c41716o.m91142E();
        if (j11 < Long.MAX_VALUE) {
            m90352d(c41716o.getContext()).scheduleResumeAfterDelay(j11, c41716o);
        }
        Object objM91171w = c41716o.m91171w();
        if (objM91171w == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return objM91171w == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM91171w : Unit.INSTANCE;
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public static final InterfaceC41758t0 m90352d(@NotNull CoroutineContext coroutineContext) {
        CoroutineContext.Element element = coroutineContext.get(ContinuationInterceptor.INSTANCE);
        InterfaceC41758t0 interfaceC41758t0 = element instanceof InterfaceC41758t0 ? (InterfaceC41758t0) element : null;
        return interfaceC41758t0 == null ? C41725q0.m91189a() : interfaceC41758t0;
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public static final Object m90351c(long j11, @NotNull Continuation<? super Unit> continuation) {
        Object objM90350b = m90350b(m90353e(j11), continuation);
        if (objM90350b == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            return objM90350b;
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: e */
    public static final long m90353e(long j11) {
        boolean zM105214isPositiveimpl = Duration.m105214isPositiveimpl(j11);
        if (zM105214isPositiveimpl) {
            return Duration.m105198getInWholeMillisecondsimpl(Duration.m105216plusLRDsOJo(j11, DurationKt.toDuration(999999L, DurationUnit.NANOSECONDS)));
        }
        if (!zM105214isPositiveimpl) {
            return 0L;
        }
        throw new NoWhenBranchMatchedException();
    }
}
