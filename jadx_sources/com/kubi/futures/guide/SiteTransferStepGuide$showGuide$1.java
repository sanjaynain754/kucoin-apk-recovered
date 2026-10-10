package com.kubi.futures.guide;

import com.kubi.sdk.site.migration.SiteMigrationService;
import com.kubi.search.searchresult.SearchCategory$Companion;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: SiteTransferStepGuide.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.futures.guide.SiteTransferStepGuide$showGuide$1", m90122f = "SiteTransferStepGuide.kt", m90123i = {}, m90124l = {28}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class SiteTransferStepGuide$showGuide$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ SiteTransferStepGuide this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SiteTransferStepGuide$showGuide$1(SiteTransferStepGuide siteTransferStepGuide, Continuation<? super SiteTransferStepGuide$showGuide$1> continuation) {
        super(2, continuation);
        this.this$0 = siteTransferStepGuide;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SiteTransferStepGuide$showGuide$1(this.this$0, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((SiteTransferStepGuide$showGuide$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
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
            SiteMigrationService siteMigrationService = SiteMigrationService.f47924a;
            this.label = 1;
            obj = siteMigrationService.m58150j(SearchCategory$Companion.FUTURES, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        if (!((Boolean) obj).booleanValue()) {
            this.this$0.getF23075d().run();
        }
        return Unit.INSTANCE;
    }
}
