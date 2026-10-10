package com.kubi.sdk.site;

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
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.sdk.site.SiteService$fetchSiteInSplash$2$fetchSiteTypeDeferred$1", m90122f = "SiteService.kt", m90123i = {}, m90124l = {506}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class SiteService$fetchSiteInSplash$2$fetchSiteTypeDeferred$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $defaultSiteType;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SiteService$fetchSiteInSplash$2$fetchSiteTypeDeferred$1(String str, Continuation<? super SiteService$fetchSiteInSplash$2$fetchSiteTypeDeferred$1> continuation) {
        super(2, continuation);
        this.$defaultSiteType = str;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SiteService$fetchSiteInSplash$2$fetchSiteTypeDeferred$1(this.$defaultSiteType, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((SiteService$fetchSiteInSplash$2$fetchSiteTypeDeferred$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
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
            SiteService siteService = SiteService.f47793a;
            String str = this.$defaultSiteType;
            SiteService.SwitchFromType switchFromType = SiteService.SwitchFromType.Splash;
            this.label = 1;
            if (siteService.m57998l(str, switchFromType, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
