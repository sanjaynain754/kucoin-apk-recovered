package com.kubi.payment.fast.sell.p2p;

import com.kubi.otc.entity.FastQuotesModel;
import com.kubi.payment.fast.common.confirm.p2p.P2PExtraParams;
import com.kubi.payment.fast.data.source.IFastRepository;
import com.kubi.utils.extensions.C27041f;
import kotlinx.coroutines.InterfaceC41709m0;
import p477nt.AbstractC42878k;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: P2PSellConfirmVM.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, m90084d2 = {"<anonymous>", "Lcom/kubi/payment/base/Result;", "Lcom/kubi/otc/entity/FastQuotesModel;", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.payment.fast.sell.p2p.P2PSellConfirmVM$previewOrder$1$rfqResult$1", m90122f = "P2PSellConfirmVM.kt", m90123i = {}, m90124l = {48}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class P2PSellConfirmVM$previewOrder$1$rfqResult$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super AbstractC42878k<? extends FastQuotesModel>>, Object> {
    int label;
    final /* synthetic */ P2PSellConfirmVM this$0;

    @Override // p852kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super AbstractC42878k<? extends FastQuotesModel>> continuation) {
        return invoke2(interfaceC41709m0, (Continuation<? super AbstractC42878k<FastQuotesModel>>) continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P2PSellConfirmVM$previewOrder$1$rfqResult$1(P2PSellConfirmVM p2PSellConfirmVM, Continuation<? super P2PSellConfirmVM$previewOrder$1$rfqResult$1> continuation) {
        super(2, continuation);
        this.this$0 = p2PSellConfirmVM;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new P2PSellConfirmVM$previewOrder$1$rfqResult$1(this.this$0, continuation);
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(InterfaceC41709m0 interfaceC41709m0, Continuation<? super AbstractC42878k<FastQuotesModel>> continuation) {
        return ((P2PSellConfirmVM$previewOrder$1$rfqResult$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String inputAmount;
        String fiatCurrency;
        String cryptoCurrency;
        String quoteType;
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
        IFastRepository iFastRepository = this.this$0.f38685e0;
        P2PExtraParams p2PExtraParams = this.this$0.f38686f0;
        String tradeType = null;
        if (p2PExtraParams != null) {
            inputAmount = p2PExtraParams.getInputAmount();
        } else {
            inputAmount = null;
        }
        String strM66668h = C27041f.m66668h(inputAmount);
        P2PExtraParams p2PExtraParams2 = this.this$0.f38686f0;
        if (p2PExtraParams2 != null) {
            fiatCurrency = p2PExtraParams2.getFiatCurrency();
        } else {
            fiatCurrency = null;
        }
        String strM66668h2 = C27041f.m66668h(fiatCurrency);
        P2PExtraParams p2PExtraParams3 = this.this$0.f38686f0;
        if (p2PExtraParams3 != null) {
            cryptoCurrency = p2PExtraParams3.getCryptoCurrency();
        } else {
            cryptoCurrency = null;
        }
        String strM66668h3 = C27041f.m66668h(cryptoCurrency);
        P2PExtraParams p2PExtraParams4 = this.this$0.f38686f0;
        if (p2PExtraParams4 != null) {
            quoteType = p2PExtraParams4.getQuoteType();
        } else {
            quoteType = null;
        }
        String strM66668h4 = C27041f.m66668h(quoteType);
        P2PExtraParams p2PExtraParams5 = this.this$0.f38686f0;
        if (p2PExtraParams5 != null) {
            tradeType = p2PExtraParams5.getTradeType();
        }
        String strM66668h5 = C27041f.m66668h(tradeType);
        this.label = 1;
        Object objMo46442z0 = iFastRepository.mo46442z0(strM66668h, strM66668h2, strM66668h3, strM66668h4, strM66668h5, this);
        if (objMo46442z0 == coroutine_suspended) {
            return coroutine_suspended;
        }
        return objMo46442z0;
    }
}
