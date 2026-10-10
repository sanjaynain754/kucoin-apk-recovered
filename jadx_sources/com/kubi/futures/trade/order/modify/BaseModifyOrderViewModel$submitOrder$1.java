package com.kubi.futures.trade.order.modify;

import com.kubi.futures.trade.submit.panel.tradeType.a3;
import com.kubi.futures.trade.submit.validate.Result;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: BaseModifyOrderViewModel.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.futures.trade.order.modify.BaseModifyOrderViewModel$submitOrder$1", m90122f = "BaseModifyOrderViewModel.kt", m90123i = {}, m90124l = {76}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class BaseModifyOrderViewModel$submitOrder$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ a3 $inputPanel;
    final /* synthetic */ com.kubi.futures.trade.submit.validate.f $panel;
    final /* synthetic */ com.kubi.futures.trade.submit.validate.e $panelInput;
    int label;
    final /* synthetic */ BaseModifyOrderViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseModifyOrderViewModel$submitOrder$1(a3 a3Var, com.kubi.futures.trade.submit.validate.e eVar, BaseModifyOrderViewModel baseModifyOrderViewModel, com.kubi.futures.trade.submit.validate.f fVar, Continuation<? super BaseModifyOrderViewModel$submitOrder$1> continuation) {
        super(2, continuation);
        this.$inputPanel = a3Var;
        this.$panelInput = eVar;
        this.this$0 = baseModifyOrderViewModel;
        this.$panel = fVar;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BaseModifyOrderViewModel$submitOrder$1(this.$inputPanel, this.$panelInput, this.this$0, this.$panel, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((BaseModifyOrderViewModel$submitOrder$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
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
            com.kubi.futures.trade.submit.validate.factory.f fVarA = this.$inputPanel.J1().a();
            com.kubi.futures.trade.submit.validate.e eVar = this.$panelInput;
            this.label = 1;
            obj = fVarA.a(eVar, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        com.kubi.futures.trade.submit.validate.l lVar = (Result) obj;
        if (lVar instanceof com.kubi.futures.trade.submit.validate.l) {
            this.this$0.m27224L(this.$panel, lVar.a());
        } else {
            this.this$0.m27227T().setValue(new Pair<>(null, null));
        }
        return Unit.INSTANCE;
    }
}
