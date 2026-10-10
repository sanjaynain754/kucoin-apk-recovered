package com.kubi.p072ad.service;

import com.kubi.p072ad.exception.AdException;
import java.util.concurrent.CancellationException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p569qq.C43846g;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;

/* JADX INFO: compiled from: SplashAdReview.kt */
/* JADX INFO: loaded from: classes45.dex */
@Metadata(m90083d1 = {"\u0000 \n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u001a4\u0010\u0003\u001a\u00020\u00042$\b\u0002\u0010\u0005\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0006H\u0080@¢\u0006\u0002\u0010\t\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\n"}, m90084d2 = {"TAG", "", "SPLASH_AD_KEY", "isSplashAdEnabled", "", "getCachedExperimentResult", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "AdLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSplashAdReview.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SplashAdReview.kt\ncom/kubi/ad/service/SplashAdReviewKt\n+ 2 AdIssue.kt\ncom/kubi/ad/exception/AdIssueKt\n*L\n1#1,28:1\n46#2,2:29\n*S KotlinDebug\n*F\n+ 1 SplashAdReview.kt\ncom/kubi/ad/service/SplashAdReviewKt\n*L\n23#1:29,2\n*E\n"})
public final class SplashAdReviewKt {
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    /* JADX INFO: renamed from: a */
    public static final Object m14678a(@NotNull Function2<? super String, ? super Continuation<? super Boolean>, ? extends Object> function2, @NotNull Continuation<? super Boolean> continuation) throws Exception {
        SplashAdReviewKt$isSplashAdEnabled$1 splashAdReviewKt$isSplashAdEnabled$1;
        boolean zBooleanValue;
        if (continuation instanceof SplashAdReviewKt$isSplashAdEnabled$1) {
            splashAdReviewKt$isSplashAdEnabled$1 = (SplashAdReviewKt$isSplashAdEnabled$1) continuation;
            int i11 = splashAdReviewKt$isSplashAdEnabled$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                splashAdReviewKt$isSplashAdEnabled$1.label = i11 - Integer.MIN_VALUE;
            } else {
                splashAdReviewKt$isSplashAdEnabled$1 = new SplashAdReviewKt$isSplashAdEnabled$1(continuation);
            }
        } else {
            splashAdReviewKt$isSplashAdEnabled$1 = new SplashAdReviewKt$isSplashAdEnabled$1(continuation);
        }
        Object objInvoke = splashAdReviewKt$isSplashAdEnabled$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = splashAdReviewKt$isSplashAdEnabled$1.label;
        try {
            if (i12 == 0) {
                ResultKt.throwOnFailure(objInvoke);
                splashAdReviewKt$isSplashAdEnabled$1.L$0 = SpillingKt.nullOutSpilledVariable(function2);
                splashAdReviewKt$isSplashAdEnabled$1.label = 1;
                objInvoke = function2.invoke("experience_splash_ad", splashAdReviewKt$isSplashAdEnabled$1);
                if (objInvoke == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objInvoke);
            }
            zBooleanValue = ((Boolean) objInvoke).booleanValue();
        } catch (Exception e11) {
            if (e11 instanceof CancellationException) {
                throw e11;
            }
            C43846g.m96568c(new AdException(e11, "SplashAdReview", false, null, 8, null), null, 2, null);
            C44128b.m97261e("SplashAdReview", "load splash ad review error: " + e11.getMessage());
            zBooleanValue = false;
        }
        return Boxing.boxBoolean(zBooleanValue);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ Object m14679b(Function2 function2, Continuation continuation, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            function2 = new SplashAdReviewKt$isSplashAdEnabled$2(null);
        }
        return m14678a(function2, continuation);
    }
}
