package com.kubi.home.v2.card;

import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: CardsViewModelV2.kt */
/* JADX INFO: loaded from: classes15.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "Lcom/kubi/home/v2/card/VipLevelUpDialogInfo;", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.home.v2.card.CardsViewModelV2$checkShowVipLevelUpDialog$1$info$1", m90122f = "CardsViewModelV2.kt", m90123i = {}, m90124l = {574}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class CardsViewModelV2$checkShowVipLevelUpDialog$1$info$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super VipLevelUpDialogInfo>, Object> {
    int label;

    public CardsViewModelV2$checkShowVipLevelUpDialog$1$info$1(Continuation<? super CardsViewModelV2$checkShowVipLevelUpDialog$1$info$1> continuation) {
        super(2, continuation);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CardsViewModelV2$checkShowVipLevelUpDialog$1$info$1(continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super VipLevelUpDialogInfo> continuation) {
        return ((CardsViewModelV2$checkShowVipLevelUpDialog$1$info$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
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
        HomeCardsRepositoryV2 homeCardsRepositoryV2 = HomeCardsRepositoryV2.f26494a;
        this.label = 1;
        Object objM30791h = homeCardsRepositoryV2.m30791h(this);
        if (objM30791h == coroutine_suspended) {
            return coroutine_suspended;
        }
        return objM30791h;
    }
}
