package com.kubi.sdk.site;

import com.kubi.sdk.site.helper.AppReview;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: SiteService.kt */
/* JADX INFO: loaded from: classes42.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.sdk.site.SiteService$fetchSiteInSplash$2$appReviewDeferred$1", m90122f = "SiteService.kt", m90123i = {}, m90124l = {500}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class SiteService$fetchSiteInSplash$2$appReviewDeferred$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Boolean>, Object> {
    int label;

    public SiteService$fetchSiteInSplash$2$appReviewDeferred$1(Continuation<? super SiteService$fetchSiteInSplash$2$appReviewDeferred$1> continuation) {
        super(2, continuation);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SiteService$fetchSiteInSplash$2$appReviewDeferred$1(continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Boolean> continuation) {
        return ((SiteService$fetchSiteInSplash$2$appReviewDeferred$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Exception {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 == 1) {
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        AppReview appReview = AppReview.f47908a;
        this.label = 1;
        Object objM58091a = appReview.m58091a(this);
        if (objM58091a == coroutine_suspended) {
            return coroutine_suspended;
        }
        return objM58091a;
    }
}
