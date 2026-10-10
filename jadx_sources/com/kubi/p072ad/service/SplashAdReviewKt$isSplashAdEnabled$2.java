package com.kubi.p072ad.service;

import com.kubi.experiment.IExperimentService;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: SplashAdReview.kt */
/* JADX INFO: loaded from: classes45.dex */
@Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", ""}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.ad.service.SplashAdReviewKt$isSplashAdEnabled$2", m90122f = "SplashAdReview.kt", m90123i = {0}, m90124l = {16}, m90125m = "invokeSuspend", m90126n = {"it"}, m90127s = {"L$0"})
public final class SplashAdReviewKt$isSplashAdEnabled$2 extends SuspendLambda implements Function2<String, Continuation<? super Boolean>, Object> {
    /* synthetic */ Object L$0;
    int label;

    public SplashAdReviewKt$isSplashAdEnabled$2(Continuation<? super SplashAdReviewKt$isSplashAdEnabled$2> continuation) {
        super(2, continuation);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        SplashAdReviewKt$isSplashAdEnabled$2 splashAdReviewKt$isSplashAdEnabled$2 = new SplashAdReviewKt$isSplashAdEnabled$2(continuation);
        splashAdReviewKt$isSplashAdEnabled$2.L$0 = obj;
        return splashAdReviewKt$isSplashAdEnabled$2;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(String str, Continuation<? super Boolean> continuation) {
        return ((SplashAdReviewKt$isSplashAdEnabled$2) create(str, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String str = (String) this.L$0;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return obj;
        }
        ResultKt.throwOnFailure(obj);
        IExperimentService iExperimentService = IExperimentService.f21603a.get();
        this.L$0 = SpillingKt.nullOutSpilledVariable(str);
        this.label = 1;
        Object objMo23706b = iExperimentService.mo23706b(str, this);
        return objMo23706b == coroutine_suspended ? coroutine_suspended : objMo23706b;
    }
}
