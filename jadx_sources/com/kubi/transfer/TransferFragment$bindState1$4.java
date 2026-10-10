package com.kubi.transfer;

import com.kubi.data.coin.AccountType;
import com.kubi.data.entity.CoinInfoEntity;
import com.kubi.transfer.entity.AccountInfos;
import com.kubi.utils.extensions.C27025c;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: TransferFragment.kt */
/* JADX INFO: loaded from: classes51.dex */
@Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", "Lcom/kubi/transfer/entity/AccountInfos;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.transfer.TransferFragment$bindState1$4", m90122f = "TransferFragment.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class TransferFragment$bindState1$4 extends SuspendLambda implements Function2<AccountInfos, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ TransferFragment this$0;

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(AccountInfos accountInfos, Continuation<? super Unit> continuation) {
        return ((TransferFragment$bindState1$4) create(accountInfos, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransferFragment$bindState1$4(TransferFragment transferFragment, Continuation<? super TransferFragment$bindState1$4> continuation) {
        super(2, continuation);
        this.this$0 = transferFragment;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        TransferFragment$bindState1$4 transferFragment$bindState1$4 = new TransferFragment$bindState1$4(this.this$0, continuation);
        transferFragment$bindState1$4.L$0 = obj;
        return transferFragment$bindState1$4;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        AccountInfos accountInfos = (AccountInfos) this.L$0;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        this.this$0.m64432o4();
        this.this$0.m64448P4();
        if (this.this$0.m64464r4() != null) {
            TransferFragment transferFragment = this.this$0;
            transferFragment.m64461o5(accountInfos, C27025c.m66566d(Boxing.boxBoolean(TransferFragment.m64406Y3(transferFragment).getIsMultiAccountMode())));
        }
        TransferFragment transferFragment2 = this.this$0;
        CoinInfoEntity coinInfo = TransferFragment.m64406Y3(transferFragment2).getCoinInfo();
        transferFragment2.sendIntent(new TransferStateContract$UiIntent.CheckNeedShowTip(coinInfo != null ? coinInfo.getCode() : null, accountInfos.getToType()));
        TransferFragment transferFragment3 = this.this$0;
        transferFragment3.m64466t4(TransferFragment.m64406Y3(transferFragment3).getIsSupportBatchTransfer());
        TransferFragment transferFragment4 = this.this$0;
        AccountType fromType = accountInfos.getFromType();
        String strName = fromType != null ? fromType.name() : null;
        AccountType toType = accountInfos.getToType();
        transferFragment4.sendIntent(new TransferStateContract$UiIntent.QueryBatchTransferConfig(strName, toType != null ? toType.name() : null));
        return Unit.INSTANCE;
    }
}
