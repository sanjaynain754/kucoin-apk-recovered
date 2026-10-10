package com.kubi.kumex.record.currentDelegate.viewModel;

import com.kubi.broker.MultiBizFacadeManager;
import com.kubi.kumex.data.trade.model.TwapDelegateHistPageEntity;
import java.util.HashMap;
import p595rg.InterfaceC44081i;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: TwapDelegateHistViewModel.kt */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(m90083d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n"}, m90084d2 = {"<anonymous>", "Lcom/kubi/kumex/data/trade/model/TwapDelegateHistPageEntity;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.kumex.record.currentDelegate.viewModel.TwapDelegateHistViewModel$fetchOrders$1$records$1", m90122f = "TwapDelegateHistViewModel.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class TwapDelegateHistViewModel$fetchOrders$1$records$1 extends SuspendLambda implements Function1<Continuation<? super TwapDelegateHistPageEntity>, Object> {
    final /* synthetic */ String $orderIdLt;
    final /* synthetic */ String $symbol;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TwapDelegateHistViewModel$fetchOrders$1$records$1(String str, String str2, Continuation<? super TwapDelegateHistViewModel$fetchOrders$1$records$1> continuation) {
        super(1, continuation);
        this.$symbol = str;
        this.$orderIdLt = str2;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new TwapDelegateHistViewModel$fetchOrders$1$records$1(this.$symbol, this.$orderIdLt, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super TwapDelegateHistPageEntity> continuation) {
        return ((TwapDelegateHistViewModel$fetchOrders$1$records$1) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            InterfaceC44081i interfaceC44081iM20260s = MultiBizFacadeManager.m20260s(MultiBizFacadeManager.f19232a, null, 1, null);
            HashMap map = new HashMap();
            String str = this.$symbol;
            String str2 = this.$orderIdLt;
            map.put("status", "active");
            map.put("advancedType", "twap");
            if (str != null && str.length() != 0) {
                map.put("symbol", str);
            }
            map.put("pageSize", "50");
            if (str2 != null && str2.length() != 0) {
                map.put("orderIdLt", str2);
            }
            return interfaceC44081iM20260s.mo4511m(map);
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
