package com.kubi.transfer;

import c60.C4850d;
import com.kubi.data.entity.CoinInfoEntity;
import com.kubi.transfer.view.TransferAmountView;
import com.kubi.transfer.view.TransferCoinView;
import com.kubi.transfer.view.TransferTipView;
import p569qq.C43841b;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: TransferFragment.kt */
/* JADX INFO: loaded from: classes51.dex */
@Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", "Lcom/kubi/data/entity/CoinInfoEntity;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.transfer.TransferFragment$bindState1$2", m90122f = "TransferFragment.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class TransferFragment$bindState1$2 extends SuspendLambda implements Function2<CoinInfoEntity, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ TransferFragment this$0;

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(CoinInfoEntity coinInfoEntity, Continuation<? super Unit> continuation) {
        return ((TransferFragment$bindState1$2) create(coinInfoEntity, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransferFragment$bindState1$2(TransferFragment transferFragment, Continuation<? super TransferFragment$bindState1$2> continuation) {
        super(2, continuation);
        this.this$0 = transferFragment;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        TransferFragment$bindState1$2 transferFragment$bindState1$2 = new TransferFragment$bindState1$2(this.this$0, continuation);
        transferFragment$bindState1$2.L$0 = obj;
        return transferFragment$bindState1$2;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        TransferTipView transferTipView;
        TransferAmountView transferAmountView;
        TransferCoinView transferCoinView;
        CoinInfoEntity coinInfoEntity = (CoinInfoEntity) this.L$0;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        if (coinInfoEntity != null) {
            this.this$0.m64432o4();
            C4850d c4850dM64464r4 = this.this$0.m64464r4();
            if (c4850dM64464r4 != null && (transferCoinView = c4850dM64464r4.f4956j) != null) {
                transferCoinView.m64826d(coinInfoEntity);
            }
            C4850d c4850dM64464r5 = this.this$0.m64464r4();
            if (c4850dM64464r5 != null && (transferAmountView = c4850dM64464r5.f4954h) != null) {
                transferAmountView.m64816x(coinInfoEntity.getCurrency());
            }
            C4850d c4850dM64464r6 = this.this$0.m64464r4();
            if (c4850dM64464r6 != null && (transferTipView = c4850dM64464r6.f4957k) != null) {
                transferTipView.setCoin(coinInfoEntity.getCode());
            }
            this.this$0.m64448P4();
            C43841b.m96557d("b1overview_transfer_load", "data_load_finish", null, 4, null);
            this.this$0.sendIntent(new TransferStateContract$UiIntent.CheckNeedShowTip(coinInfoEntity.getCode(), TransferFragment.m64406Y3(this.this$0).getAccountInfo().getToType()));
        }
        return Unit.INSTANCE;
    }
}
