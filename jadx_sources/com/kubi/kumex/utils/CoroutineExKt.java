package com.kubi.kumex.utils;

import androidx.exifinterface.media.ExifInterface;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.C41686h;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.CoroutineContext;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: CoroutineEx.kt */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(m90083d1 = {"\u00000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aN\u0010\u0000\u001a\u0004\u0018\u0001H\u0001\"\u0004\b\u0000\u0010\u00012\u001e\u0010\u0002\u001a\u001a\b\u0001\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u0001H\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00032\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0003H\u0086@¢\u0006\u0002\u0010\t\u001a:\u0010\n\u001a\u0004\u0018\u0001H\u0001\"\u0004\b\u0000\u0010\u00012\u0006\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\u000e\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001H\u00010\u000fH\u0086@¢\u0006\u0002\u0010\u0010¨\u0006\u0011"}, m90084d2 = {"catchCoroutine", ExifInterface.GPS_DIRECTION_TRUE, TUIConstants.TIMPush.NOTIFICATION.ACTION, "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "", "failure", "", "", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "catchWithContext", "context", "Lkotlin/coroutines/CoroutineContext;", "source", "", "Lkotlin/Function0;", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "KumexLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class CoroutineExKt {
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    /* JADX INFO: renamed from: a */
    public static final <T> Object m36471a(@NotNull Function1<? super Continuation<? super T>, ? extends Object> function1, @Nullable Function1<? super Throwable, Unit> function2, @NotNull Continuation<? super T> continuation) {
        CoroutineExKt$catchCoroutine$1 coroutineExKt$catchCoroutine$1;
        if (continuation instanceof CoroutineExKt$catchCoroutine$1) {
            coroutineExKt$catchCoroutine$1 = (CoroutineExKt$catchCoroutine$1) continuation;
            int i11 = coroutineExKt$catchCoroutine$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                coroutineExKt$catchCoroutine$1.label = i11 - Integer.MIN_VALUE;
            } else {
                coroutineExKt$catchCoroutine$1 = new CoroutineExKt$catchCoroutine$1(continuation);
            }
        } else {
            coroutineExKt$catchCoroutine$1 = new CoroutineExKt$catchCoroutine$1(continuation);
        }
        Object obj = coroutineExKt$catchCoroutine$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = coroutineExKt$catchCoroutine$1.label;
        try {
            if (i12 != 0) {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            ResultKt.throwOnFailure(obj);
            coroutineExKt$catchCoroutine$1.L$0 = SpillingKt.nullOutSpilledVariable(function1);
            coroutineExKt$catchCoroutine$1.L$1 = function2;
            coroutineExKt$catchCoroutine$1.label = 1;
            Object objInvoke = function1.invoke(coroutineExKt$catchCoroutine$1);
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

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ Object m36472b(Function1 function1, Function1 function2, Continuation continuation, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            function2 = null;
        }
        return m36471a(function1, function2, continuation);
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public static final <T> Object m36473c(@NotNull CoroutineContext coroutineContext, @Nullable String str, @NotNull Function0<? extends T> function0, @NotNull Continuation<? super T> continuation) {
        return C41686h.m91049g(coroutineContext, new CoroutineExKt$catchWithContext$2(function0, str, null), continuation);
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ Object m36474d(CoroutineContext coroutineContext, String str, Function0 function0, Continuation continuation, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            str = null;
        }
        return m36473c(coroutineContext, str, function0, continuation);
    }
}
