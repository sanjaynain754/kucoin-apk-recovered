package kotlinx.coroutines;

import androidx.exifinterface.media.ExifInterface;
import androidx.media3.exoplayer.upstream.CmcdData;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugProbesKt;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Ref;
import p852kotlin.time.Duration;
import p852kotlin.time.DurationKt;
import p852kotlin.time.DurationUnit;
import pg0.C43466b;

/* JADX INFO: compiled from: Timeout.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000B\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aT\u0010\t\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u00012'\u0010\b\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003¢\u0006\u0002\b\u0007H\u0086@\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0001¢\u0006\u0004\b\t\u0010\n\u001aI\u0010\u000b\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u00012'\u0010\b\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003¢\u0006\u0002\b\u0007H\u0086@¢\u0006\u0004\b\u000b\u0010\n\u001aI\u0010\u000e\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00002\u0006\u0010\r\u001a\u00020\f2'\u0010\b\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003¢\u0006\u0002\b\u0007H\u0086@¢\u0006\u0004\b\u000e\u0010\n\u001a^\u0010\u0012\u001a\u0004\u0018\u00010\u0006\"\u0004\b\u0000\u0010\u000f\"\b\b\u0001\u0010\u0000*\u00028\u00002\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00102'\u0010\b\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003¢\u0006\u0002\b\u0007H\u0002¢\u0006\u0004\b\u0012\u0010\u0013\u001a'\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0014\u001a\u00020\u00012\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0011\u001a\u00020\u0017H\u0000¢\u0006\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, m90084d2 = {ExifInterface.GPS_DIRECTION_TRUE, "", "timeMillis", "Lkotlin/Function2;", "Lkotlinx/coroutines/m0;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "block", "c", "(JLkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "d", "Lkotlin/time/Duration;", "timeout", "e", "U", "Lkotlinx/coroutines/v2;", "coroutine", "b", "(Lkotlinx/coroutines/v2;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "time", "Lkotlinx/coroutines/t0;", "delay", "Lkotlinx/coroutines/x1;", "Lkotlinx/coroutines/TimeoutCancellationException;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(JLkotlinx/coroutines/t0;Lkotlinx/coroutines/x1;)Lkotlinx/coroutines/TimeoutCancellationException;", "kotlinx-coroutines-core"}, m90085k = 2, m90086mv = {2, 1, 0}, m90088xi = 48)
public final class TimeoutKt {
    /* JADX WARN: Code duplicated, block: B:9:0x0018  */
    /* JADX WARN: Instruction removed from duplicated block: B:9:0x0018, please report this as an issue */
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final TimeoutCancellationException m90466a(long j11, @NotNull InterfaceC41758t0 interfaceC41758t0, @NotNull InterfaceC41775x1 interfaceC41775x1) {
        String strM91359o;
        InterfaceC41762u0 interfaceC41762u0 = interfaceC41758t0 instanceof InterfaceC41762u0 ? (InterfaceC41762u0) interfaceC41758t0 : null;
        if (interfaceC41762u0 != null) {
            Duration.Companion companion = Duration.INSTANCE;
            strM91359o = interfaceC41762u0.m91359o(DurationKt.toDuration(j11, DurationUnit.MILLISECONDS));
            if (strM91359o == null) {
                strM91359o = "Timed out waiting for " + j11 + " ms";
            }
        } else {
            strM91359o = "Timed out waiting for " + j11 + " ms";
        }
        return new TimeoutCancellationException(strM91359o, interfaceC41775x1);
    }

    /* JADX INFO: renamed from: b */
    public static final <U, T extends U> Object m90467b(RunnableC41768v2<U, ? super T> runnableC41768v2, Function2<? super InterfaceC41709m0, ? super Continuation<? super T>, ? extends Object> function2) {
        C41783z1.m91405k(runnableC41768v2, DelayKt.m90352d(runnableC41768v2.uCont.getContext()).invokeOnTimeout(runnableC41768v2.time, runnableC41768v2, runnableC41768v2.getContext()));
        return C43466b.m95684e(runnableC41768v2, runnableC41768v2, function2);
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public static final <T> Object m90468c(long j11, @NotNull Function2<? super InterfaceC41709m0, ? super Continuation<? super T>, ? extends Object> function2, @NotNull Continuation<? super T> continuation) {
        if (j11 <= 0) {
            throw new TimeoutCancellationException("Timed out immediately");
        }
        Object objM90467b = m90467b(new RunnableC41768v2(j11, continuation), function2);
        if (objM90467b == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return objM90467b;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v1, types: [T, kotlinx.coroutines.v2] */
    @Nullable
    /* JADX INFO: renamed from: d */
    public static final <T> Object m90469d(long j11, @NotNull Function2<? super InterfaceC41709m0, ? super Continuation<? super T>, ? extends Object> function2, @NotNull Continuation<? super T> continuation) {
        TimeoutKt$withTimeoutOrNull$1 timeoutKt$withTimeoutOrNull$1;
        Ref.ObjectRef objectRef;
        if (continuation instanceof TimeoutKt$withTimeoutOrNull$1) {
            timeoutKt$withTimeoutOrNull$1 = (TimeoutKt$withTimeoutOrNull$1) continuation;
            int i11 = timeoutKt$withTimeoutOrNull$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                timeoutKt$withTimeoutOrNull$1.label = i11 - Integer.MIN_VALUE;
            } else {
                timeoutKt$withTimeoutOrNull$1 = new TimeoutKt$withTimeoutOrNull$1(continuation);
            }
        } else {
            timeoutKt$withTimeoutOrNull$1 = new TimeoutKt$withTimeoutOrNull$1(continuation);
        }
        Object obj = timeoutKt$withTimeoutOrNull$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = timeoutKt$withTimeoutOrNull$1.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj);
            if (j11 <= 0) {
                return null;
            }
            Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
            try {
                timeoutKt$withTimeoutOrNull$1.L$0 = function2;
                timeoutKt$withTimeoutOrNull$1.L$1 = objectRef2;
                timeoutKt$withTimeoutOrNull$1.J$0 = j11;
                timeoutKt$withTimeoutOrNull$1.label = 1;
                ?? r11 = (T) new RunnableC41768v2(j11, timeoutKt$withTimeoutOrNull$1);
                objectRef2.element = r11;
                Object objM90467b = m90467b(r11, function2);
                if (objM90467b == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    DebugProbesKt.probeCoroutineSuspended(timeoutKt$withTimeoutOrNull$1);
                }
                return objM90467b == coroutine_suspended ? coroutine_suspended : objM90467b;
            } catch (TimeoutCancellationException e11) {
                e = e11;
                objectRef = objectRef2;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            objectRef = (Ref.ObjectRef) timeoutKt$withTimeoutOrNull$1.L$1;
            try {
                ResultKt.throwOnFailure(obj);
                return obj;
            } catch (TimeoutCancellationException e12) {
                e = e12;
            }
        }
        if (e.coroutine == objectRef.element) {
            return null;
        }
        throw e;
    }

    @Nullable
    /* JADX INFO: renamed from: e */
    public static final <T> Object m90470e(long j11, @NotNull Function2<? super InterfaceC41709m0, ? super Continuation<? super T>, ? extends Object> function2, @NotNull Continuation<? super T> continuation) {
        return m90469d(DelayKt.m90353e(j11), function2, continuation);
    }
}
