package com.kubi.kumex.record.done.viewModel;

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

/* JADX INFO: compiled from: TwapDelegateRecordViewModel.kt */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(m90083d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n"}, m90084d2 = {"<anonymous>", "Lcom/kubi/kumex/data/trade/model/TwapDelegateHistPageEntity;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.kumex.record.done.viewModel.TwapDelegateRecordViewModel$fetchRecords$1$records$1", m90122f = "TwapDelegateRecordViewModel.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class TwapDelegateRecordViewModel$fetchRecords$1$records$1 extends SuspendLambda implements Function1<Continuation<? super TwapDelegateHistPageEntity>, Object> {
    final /* synthetic */ Integer $currentPage;
    final /* synthetic */ Long $endTime;
    final /* synthetic */ Long $startTime;
    final /* synthetic */ String $symbol;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TwapDelegateRecordViewModel$fetchRecords$1$records$1(String str, Long l11, Long l12, Integer num, Continuation<? super TwapDelegateRecordViewModel$fetchRecords$1$records$1> continuation) {
        super(1, continuation);
        this.$symbol = str;
        this.$startTime = l11;
        this.$endTime = l12;
        this.$currentPage = num;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new TwapDelegateRecordViewModel$fetchRecords$1$records$1(this.$symbol, this.$startTime, this.$endTime, this.$currentPage, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super TwapDelegateHistPageEntity> continuation) {
        return ((TwapDelegateRecordViewModel$fetchRecords$1$records$1) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            InterfaceC44081i interfaceC44081iM20260s = MultiBizFacadeManager.m20260s(MultiBizFacadeManager.f19232a, null, 1, null);
            HashMap map = new HashMap();
            String str = this.$symbol;
            Long l11 = this.$startTime;
            Long l12 = this.$endTime;
            Integer num = this.$currentPage;
            map.put("status", "done");
            map.put("advancedType", "twap");
            if (str != null && str.length() != 0) {
                map.put("symbol", str);
            }
            if (l11 != null) {
                map.put("start", l11.toString());
            }
            if (l12 != null) {
                map.put("end", l12.toString());
            }
            map.put("pageSize", "50");
            if (num != null) {
                map.put("currentPage", num.toString());
            }
            return interfaceC44081iM20260s.mo4511m(map);
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
