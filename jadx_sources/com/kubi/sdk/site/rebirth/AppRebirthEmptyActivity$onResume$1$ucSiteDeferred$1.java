package com.kubi.sdk.site.rebirth;

import kotlinx.coroutines.InterfaceC41709m0;
import n00.C42697c;
import n00.InterfaceC42695a;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import ro.C44128b;

/* JADX INFO: compiled from: AppRebirthEmptyActivity.kt */
/* JADX INFO: loaded from: classes45.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.sdk.site.rebirth.AppRebirthEmptyActivity$onResume$1$ucSiteDeferred$1", m90122f = "AppRebirthEmptyActivity.kt", m90123i = {}, m90124l = {69}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class AppRebirthEmptyActivity$onResume$1$ucSiteDeferred$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Boolean>, Object> {
    int label;
    final /* synthetic */ AppRebirthEmptyActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppRebirthEmptyActivity$onResume$1$ucSiteDeferred$1(AppRebirthEmptyActivity appRebirthEmptyActivity, Continuation<? super AppRebirthEmptyActivity$onResume$1$ucSiteDeferred$1> continuation) {
        super(2, continuation);
        this.this$0 = appRebirthEmptyActivity;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AppRebirthEmptyActivity$onResume$1$ucSiteDeferred$1(this.this$0, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Boolean> continuation) {
        return ((AppRebirthEmptyActivity$onResume$1$ucSiteDeferred$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            InterfaceC42695a interfaceC42695aM93585b = C42697c.f94506a.m93585b();
            this.label = 1;
            obj = interfaceC42695aM93585b.mo89708a(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        C44128b.m97266j(this.this$0.getF47936i(), "fetchUserCenterSiteConfigFromServer remoteUcSiteSuc=" + zBooleanValue);
        return Boxing.boxBoolean(zBooleanValue);
    }
}
