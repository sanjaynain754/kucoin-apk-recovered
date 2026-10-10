package com.kubi.mine.lib.manger;

import kotlinx.coroutines.InterfaceC41709m0;
import p694vk.AbstractC45585n0;
import p694vk.C45591t;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: AppUpgradeManger.kt */
/* JADX INFO: loaded from: classes29.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.mine.lib.manger.AppUpgradeManger$getAPPUpgradeInfo$1$2$1", m90122f = "AppUpgradeManger.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class AppUpgradeManger$getAPPUpgradeInfo$1$2$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ AbstractC45585n0 $appUpgradeType;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppUpgradeManger$getAPPUpgradeInfo$1$2$1(AbstractC45585n0 abstractC45585n0, Continuation<? super AppUpgradeManger$getAPPUpgradeInfo$1$2$1> continuation) {
        super(2, continuation);
        this.$appUpgradeType = abstractC45585n0;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AppUpgradeManger$getAPPUpgradeInfo$1$2$1(this.$appUpgradeType, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((AppUpgradeManger$getAPPUpgradeInfo$1$2$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            AppUpgradeManger.f35082d.put(this.$appUpgradeType, Boxing.boxBoolean(false));
            C45591t.f102713a.m100681a("appUpgradeDialog-getAPPUpgradeInfo_onFail");
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
