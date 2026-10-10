package com.kubi.transfer;

import c60.C4850d;
import com.kubi.data.entity.CoinInfoEntity;
import com.kubi.kumex.entity.BalanceEntity;
import com.kubi.transfer.entity.AccountInfos;
import com.kubi.transfer.view.TransferAmountView;
import com.kubi.utils.extensions.C27025c;
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
@Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", ""}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.transfer.TransferFragment$bindState1$6", m90122f = "TransferFragment.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class TransferFragment$bindState1$6 extends SuspendLambda implements Function2<String, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ TransferFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransferFragment$bindState1$6(TransferFragment transferFragment, Continuation<? super TransferFragment$bindState1$6> continuation) {
        super(2, continuation);
        this.this$0 = transferFragment;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        TransferFragment$bindState1$6 transferFragment$bindState1$6 = new TransferFragment$bindState1$6(this.this$0, continuation);
        transferFragment$bindState1$6.L$0 = obj;
        return transferFragment$bindState1$6;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(String str, Continuation<? super Unit> continuation) {
        return ((TransferFragment$bindState1$6) create(str, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        TransferAmountView transferAmountView;
        String str = (String) this.L$0;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        this.this$0.m64432o4();
        TransferLog transferLog = TransferLog.f52948a;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("coin: ");
        CoinInfoEntity coinInfo = TransferFragment.m64406Y3(this.this$0).getCoinInfo();
        sb2.append(coinInfo != null ? coinInfo.getCode() : null);
        sb2.append(" currency: ");
        sb2.append(TransferFragment.m64406Y3(this.this$0).getBaseCurrency());
        sb2.append(", ");
        sb2.append(TransferFragment.m64406Y3(this.this$0).getQuoteCurrency());
        transferLog.m64781c(sb2.toString());
        transferLog.m64781c("balance: " + str);
        C4850d c4850dM64464r4 = this.this$0.m64464r4();
        if (c4850dM64464r4 != null && (transferAmountView = c4850dM64464r4.f4954h) != null) {
            AccountInfos accountInfo = TransferFragment.m64406Y3(this.this$0).getAccountInfo();
            BalanceEntity contractBalance = TransferFragment.m64406Y3(this.this$0).getContractBalance();
            CoinInfoEntity coinInfo2 = TransferFragment.m64406Y3(this.this$0).getCoinInfo();
            transferAmountView.m64812n(str, accountInfo, contractBalance, coinInfo2 != null ? coinInfo2.getCurrency() : null, TransferFragment.m64406Y3(this.this$0).getIsMultiAccountMode(), !C27025c.m66566d(TransferFragment.m64406Y3(this.this$0).getIsShowCoinPairView()));
        }
        return Unit.INSTANCE;
    }
}
