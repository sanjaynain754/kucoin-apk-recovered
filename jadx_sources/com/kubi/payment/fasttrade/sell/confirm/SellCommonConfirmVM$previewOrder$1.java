package com.kubi.payment.fasttrade.sell.confirm;

import com.kubi.payment.base.BasePaymentVM;
import com.kubi.payment.fast.data.entities.SellPreviewOrder;
import com.kubi.payment.fast.data.source.IFastRepository;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27039d;
import kotlinx.coroutines.InterfaceC41709m0;
import p477nt.AbstractC42878k;
import p852kotlin.Metadata;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: SellCommonConfirmVM.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.payment.fasttrade.sell.confirm.SellCommonConfirmVM$previewOrder$1", m90122f = "SellCommonConfirmVM.kt", m90123i = {0}, m90124l = {76}, m90125m = "invokeSuspend", m90126n = {"request"}, m90127s = {"L$0"})
public final class SellCommonConfirmVM$previewOrder$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ boolean $isFirstLoading;
    Object L$0;
    int label;
    final /* synthetic */ SellCommonConfirmVM this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SellCommonConfirmVM$previewOrder$1(boolean z11, SellCommonConfirmVM sellCommonConfirmVM, Continuation<? super SellCommonConfirmVM$previewOrder$1> continuation) {
        super(2, continuation);
        this.$isFirstLoading = z11;
        this.this$0 = sellCommonConfirmVM;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SellCommonConfirmVM$previewOrder$1(this.$isFirstLoading, this.this$0, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((SellCommonConfirmVM$previewOrder$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String paymentMethodCode;
        String channelId;
        String fiatCurrency;
        String cryptoCurrency;
        String cryptoAmount;
        String paymentMethodName;
        String cardId;
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
            if (this.$isFirstLoading) {
                this.this$0.m45658q().postValue(new BasePaymentVM.LoadingUIState(false, false, false, false, 15, null));
            } else {
                this.this$0.f38833c0.postValue(Boxing.boxBoolean(true));
            }
            SellCommonConfirmExtraParams sellCommonConfirmExtraParams = this.this$0.f38831a0;
            String adId = null;
            if (sellCommonConfirmExtraParams != null) {
                paymentMethodCode = sellCommonConfirmExtraParams.getPaymentMethodCode();
            } else {
                paymentMethodCode = null;
            }
            SellCommonConfirmExtraParams sellCommonConfirmExtraParams2 = this.this$0.f38831a0;
            if (sellCommonConfirmExtraParams2 != null) {
                channelId = sellCommonConfirmExtraParams2.getChannelId();
            } else {
                channelId = null;
            }
            SellCommonConfirmExtraParams sellCommonConfirmExtraParams3 = this.this$0.f38831a0;
            if (sellCommonConfirmExtraParams3 != null) {
                fiatCurrency = sellCommonConfirmExtraParams3.getFiatCurrency();
            } else {
                fiatCurrency = null;
            }
            SellCommonConfirmExtraParams sellCommonConfirmExtraParams4 = this.this$0.f38831a0;
            if (sellCommonConfirmExtraParams4 != null) {
                cryptoCurrency = sellCommonConfirmExtraParams4.getCryptoCurrency();
            } else {
                cryptoCurrency = null;
            }
            SellCommonConfirmExtraParams sellCommonConfirmExtraParams5 = this.this$0.f38831a0;
            if (sellCommonConfirmExtraParams5 != null) {
                cryptoAmount = sellCommonConfirmExtraParams5.getCryptoAmount();
            } else {
                cryptoAmount = null;
            }
            SellCommonConfirmExtraParams sellCommonConfirmExtraParams6 = this.this$0.f38831a0;
            if (sellCommonConfirmExtraParams6 != null) {
                paymentMethodName = sellCommonConfirmExtraParams6.getPaymentMethodName();
            } else {
                paymentMethodName = null;
            }
            SellCommonConfirmExtraParams sellCommonConfirmExtraParams7 = this.this$0.f38831a0;
            if (sellCommonConfirmExtraParams7 != null) {
                cardId = sellCommonConfirmExtraParams7.getCardId();
            } else {
                cardId = null;
            }
            SellCommonConfirmExtraParams sellCommonConfirmExtraParams8 = this.this$0.f38831a0;
            if (sellCommonConfirmExtraParams8 != null) {
                adId = sellCommonConfirmExtraParams8.getAdId();
            }
            SellPreviewOrder.Request request = new SellPreviewOrder.Request(paymentMethodCode, channelId, fiatCurrency, cryptoCurrency, cryptoAmount, paymentMethodName, cardId, adId);
            IFastRepository iFastRepository = this.this$0.f38830Z;
            this.L$0 = SpillingKt.nullOutSpilledVariable(request);
            this.label = 1;
            obj = iFastRepository.mo46426d(request, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        AbstractC42878k abstractC42878k = (AbstractC42878k) obj;
        if (abstractC42878k instanceof AbstractC42878k.Success) {
            if (this.$isFirstLoading) {
                this.this$0.m45658q().postValue(BasePaymentVM.LoadingUIState.copy$default(new BasePaymentVM.LoadingUIState(false, false, false, false, 15, null), false, false, false, true, 6, null));
            }
            SellPreviewOrder.Response response = (SellPreviewOrder.Response) ((AbstractC42878k.Success) abstractC42878k).m94040a();
            this.this$0.f38837g0 = false;
            this.this$0.f38836f0 = C27025c.m66566d(response.isProtected());
            this.this$0.f38832b0.setValue(response);
            if (this.this$0.mo46961K()) {
                this.this$0.m46945N(C27039d.m66653m(response.getExpireTime(), 15L) * 1000);
            }
        } else if (abstractC42878k instanceof AbstractC42878k.Error) {
            this.this$0.m45659r().setValue(((AbstractC42878k.Error) abstractC42878k).getException());
            if (this.$isFirstLoading) {
                this.this$0.m45658q().postValue(BasePaymentVM.LoadingUIState.copy$default(new BasePaymentVM.LoadingUIState(false, false, false, false, 15, null), false, true, false, false, 12, null));
            }
        } else {
            throw new NoWhenBranchMatchedException();
        }
        if (!this.$isFirstLoading) {
            this.this$0.f38833c0.postValue(Boxing.boxBoolean(false));
        }
        return Unit.INSTANCE;
    }
}
