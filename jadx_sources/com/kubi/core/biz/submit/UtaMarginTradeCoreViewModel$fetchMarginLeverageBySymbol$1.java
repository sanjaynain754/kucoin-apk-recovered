package com.kubi.core.biz.submit;

import com.kubi.core.base.utils.FlowExKt;
import com.kubi.core.biz.loan.entity.MarginLeverageEntity;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: UtaMarginTradeCoreViewModel.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.core.biz.submit.UtaMarginTradeCoreViewModel$fetchMarginLeverageBySymbol$1", m90122f = "UtaMarginTradeCoreViewModel.kt", m90123i = {}, m90124l = {49}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class UtaMarginTradeCoreViewModel$fetchMarginLeverageBySymbol$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $symbol;
    int label;
    final /* synthetic */ UtaMarginTradeCoreViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UtaMarginTradeCoreViewModel$fetchMarginLeverageBySymbol$1(UtaMarginTradeCoreViewModel utaMarginTradeCoreViewModel, String str, Continuation<? super UtaMarginTradeCoreViewModel$fetchMarginLeverageBySymbol$1> continuation) {
        super(2, continuation);
        this.this$0 = utaMarginTradeCoreViewModel;
        this.$symbol = str;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new UtaMarginTradeCoreViewModel$fetchMarginLeverageBySymbol$1(this.this$0, this.$symbol, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((UtaMarginTradeCoreViewModel$fetchMarginLeverageBySymbol$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
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
            C12068x4a01c848 c12068x4a01c848 = new C12068x4a01c848(this.this$0, this.$symbol, null);
            this.label = 1;
            obj = FlowExKt.m21211b(c12068x4a01c848, null, this, 2, null);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        MarginLeverageEntity marginLeverageEntity = (MarginLeverageEntity) obj;
        if (marginLeverageEntity == null) {
            marginLeverageEntity = new MarginLeverageEntity(null, null, null, null, null, null, 63, null);
        }
        this.this$0.f20672a0.postValue(marginLeverageEntity);
        return Unit.INSTANCE;
    }
}
