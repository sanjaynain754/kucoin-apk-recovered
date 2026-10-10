package com.kubi.unify.utils;

import androidx.exifinterface.media.ExifInterface;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlinx.coroutines.flow.C41636g;
import kotlinx.coroutines.flow.InterfaceC41634e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: FlowEx.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a+\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006\u001a*\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\b0\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0006\u0010\t\u001a\u00020\n\u001aN\u0010\u000b\u001a\u0004\u0018\u0001H\u0002\"\u0004\b\u0000\u0010\u00022\u001e\u0010\f\u001a\u001a\b\u0001\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u0001H\u00020\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\r2\u0016\b\u0002\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0012\u0018\u00010\rH\u0086@¢\u0006\u0002\u0010\u0013¨\u0006\u0014"}, m90084d2 = {"throttleLatest", "Lkotlinx/coroutines/flow/Flow;", ExifInterface.GPS_DIRECTION_TRUE, "timeout", "Lkotlin/time/Duration;", "throttleLatest-HG0u8IE", "(Lkotlinx/coroutines/flow/Flow;J)Lkotlinx/coroutines/flow/Flow;", "bufferTime", "", "timeMillis", "", "catchCoroutine", TUIConstants.TIMPush.NOTIFICATION.ACTION, "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "", "failure", "", "", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "BUnifyAccountLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class FlowExKt {
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final <T> InterfaceC41634e<List<T>> m65457a(@NotNull InterfaceC41634e<? extends T> interfaceC41634e, long j11) {
        Intrinsics.checkNotNullParameter(interfaceC41634e, "<this>");
        return C41636g.m90921j(new FlowExKt$bufferTime$1(interfaceC41634e, j11, null));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    /* JADX INFO: renamed from: b */
    public static final <T> Object m65458b(@NotNull Function1<? super Continuation<? super T>, ? extends Object> function1, @Nullable Function1<? super Throwable, Unit> function2, @NotNull Continuation<? super T> continuation) {
        FlowExKt$catchCoroutine$1 flowExKt$catchCoroutine$1;
        if (continuation instanceof FlowExKt$catchCoroutine$1) {
            flowExKt$catchCoroutine$1 = (FlowExKt$catchCoroutine$1) continuation;
            int i11 = flowExKt$catchCoroutine$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                flowExKt$catchCoroutine$1.label = i11 - Integer.MIN_VALUE;
            } else {
                flowExKt$catchCoroutine$1 = new FlowExKt$catchCoroutine$1(continuation);
            }
        } else {
            flowExKt$catchCoroutine$1 = new FlowExKt$catchCoroutine$1(continuation);
        }
        Object obj = flowExKt$catchCoroutine$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = flowExKt$catchCoroutine$1.label;
        try {
            if (i12 != 0) {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            ResultKt.throwOnFailure(obj);
            flowExKt$catchCoroutine$1.L$0 = SpillingKt.nullOutSpilledVariable(function1);
            flowExKt$catchCoroutine$1.L$1 = function2;
            flowExKt$catchCoroutine$1.label = 1;
            Object objInvoke = function1.invoke(flowExKt$catchCoroutine$1);
            return objInvoke == coroutine_suspended ? coroutine_suspended : objInvoke;
        } catch (CancellationException e11) {
            throw e11;
        } catch (Throwable th2) {
            if (function2 == null) {
                return null;
            }
            function2.invoke(th2);
            return null;
        }
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ Object m65459c(Function1 function1, Function1 function2, Continuation continuation, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            function2 = null;
        }
        return m65458b(function1, function2, continuation);
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public static final <T> InterfaceC41634e<T> m65460d(@NotNull InterfaceC41634e<? extends T> throttleLatest, long j11) {
        Intrinsics.checkNotNullParameter(throttleLatest, "$this$throttleLatest");
        return C41636g.m90896T(C41636g.m90935r(throttleLatest), new FlowExKt$throttleLatest$1(new AtomicBoolean(true), j11, null));
    }
}
