package com.kubi.payment.fasttradev2.buy.confirm.p2p;

import androidx.lifecycle.MutableLiveData;
import com.kubi.payment.fast.common.helper.TradeLimitHelper;
import com.kubi.payment.fasttradev2.buy.confirm.BuyCommonConfirmExtraParams;
import com.kubi.utils.extensions.C27041f;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: BuyP2PConfirmVM.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.payment.fasttradev2.buy.confirm.p2p.BuyP2PConfirmVM$loadLimitTip$1", m90122f = "BuyP2PConfirmVM.kt", m90123i = {0}, m90124l = {46}, m90125m = "invokeSuspend", m90126n = {"fiatCurrency"}, m90127s = {"L$0"})
public final class BuyP2PConfirmVM$loadLimitTip$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ BuyP2PConfirmVM this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BuyP2PConfirmVM$loadLimitTip$1(BuyP2PConfirmVM buyP2PConfirmVM, Continuation<? super BuyP2PConfirmVM$loadLimitTip$1> continuation) {
        super(2, continuation);
        this.this$0 = buyP2PConfirmVM;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BuyP2PConfirmVM$loadLimitTip$1(this.this$0, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((BuyP2PConfirmVM$loadLimitTip$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String fiatCurrency;
        MutableLiveData mutableLiveData;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 == 1) {
                mutableLiveData = (MutableLiveData) this.L$1;
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            BuyCommonConfirmExtraParams f39175n0 = this.this$0.getF39175n0();
            if (f39175n0 != null) {
                fiatCurrency = f39175n0.getFiatCurrency();
            } else {
                fiatCurrency = null;
            }
            String strM66668h = C27041f.m66668h(fiatCurrency);
            MutableLiveData mutableLiveData2 = this.this$0.f39176o0;
            TradeLimitHelper tradeLimitHelper = new TradeLimitHelper();
            this.L$0 = SpillingKt.nullOutSpilledVariable(strM66668h);
            this.L$1 = mutableLiveData2;
            this.label = 1;
            obj = tradeLimitHelper.m46374d(strM66668h, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            mutableLiveData = mutableLiveData2;
        }
        mutableLiveData.setValue(obj);
        return Unit.INSTANCE;
    }
}
