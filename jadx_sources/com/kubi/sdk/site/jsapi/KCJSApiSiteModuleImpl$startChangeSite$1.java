package com.kubi.sdk.site.jsapi;

import com.kubi.sdk.protocol.ProtocolException;
import com.kubi.sdk.site.helper.SiteBridgeKnbHelper;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: KCJSApiSiteModuleImpl.kt */
/* JADX INFO: loaded from: classes45.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.sdk.site.jsapi.KCJSApiSiteModuleImpl$startChangeSite$1", m90122f = "KCJSApiSiteModuleImpl.kt", m90123i = {}, m90124l = {32}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class KCJSApiSiteModuleImpl$startChangeSite$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function2<Boolean, ProtocolException, Unit> $callback;
    final /* synthetic */ String $siteType;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public KCJSApiSiteModuleImpl$startChangeSite$1(String str, Function2<? super Boolean, ? super ProtocolException, Unit> function2, Continuation<? super KCJSApiSiteModuleImpl$startChangeSite$1> continuation) {
        super(2, continuation);
        this.$siteType = str;
        this.$callback = function2;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new KCJSApiSiteModuleImpl$startChangeSite$1(this.$siteType, this.$callback, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((KCJSApiSiteModuleImpl$startChangeSite$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
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
            SiteBridgeKnbHelper siteBridgeKnbHelper = SiteBridgeKnbHelper.f47909a;
            String str = this.$siteType;
            Function2<Boolean, ProtocolException, Unit> function2 = this.$callback;
            this.label = 1;
            if (siteBridgeKnbHelper.m58092a(str, function2, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
