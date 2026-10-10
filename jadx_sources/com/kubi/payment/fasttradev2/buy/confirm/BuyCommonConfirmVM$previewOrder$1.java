package com.kubi.payment.fasttradev2.buy.confirm;

import com.kubi.payment.base.BasePaymentVM;
import com.kubi.payment.fast.buy.recurring.RecurringFrequency;
import com.kubi.payment.fast.data.entities.BuyPreviewOrder;
import com.kubi.payment.fast.data.entities.PreviewOrder;
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

/* JADX INFO: compiled from: BuyCommonConfirmVM.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.payment.fasttradev2.buy.confirm.BuyCommonConfirmVM$previewOrder$1", m90122f = "BuyCommonConfirmVM.kt", m90123i = {0}, m90124l = {117}, m90125m = "invokeSuspend", m90126n = {"request"}, m90127s = {"L$0"})
public final class BuyCommonConfirmVM$previewOrder$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ boolean $isFirstLoading;
    final /* synthetic */ boolean $needLoading;
    Object L$0;
    int label;
    final /* synthetic */ BuyCommonConfirmVM this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BuyCommonConfirmVM$previewOrder$1(boolean z11, BuyCommonConfirmVM buyCommonConfirmVM, boolean z12, Continuation<? super BuyCommonConfirmVM$previewOrder$1> continuation) {
        super(2, continuation);
        this.$isFirstLoading = z11;
        this.this$0 = buyCommonConfirmVM;
        this.$needLoading = z12;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BuyCommonConfirmVM$previewOrder$1(this.$isFirstLoading, this.this$0, this.$needLoading, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((BuyCommonConfirmVM$previewOrder$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objMo46421X;
        RecurringFrequency recurringFrequency;
        RecurringFrequency recurringFrequency2;
        RecurringFrequency recurringFrequency3;
        RecurringFrequency recurringFrequency4;
        RecurringFrequency recurringFrequency5;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        if (i11 == 0) {
            ResultKt.throwOnFailure(obj);
            if (this.$isFirstLoading) {
                this.this$0.m45658q().setValue(new BasePaymentVM.LoadingUIState(false, false, false, false, 15, null));
            } else {
                this.this$0.f39067c0.setValue(Boxing.boxBoolean(true));
                if (this.$needLoading) {
                    this.this$0.m45657p().setValue(Boxing.boxBoolean(true));
                }
            }
            BuyCommonConfirmExtraParams buyCommonConfirmExtraParams = this.this$0.f39065a0;
            String paymentMethodCode = buyCommonConfirmExtraParams != null ? buyCommonConfirmExtraParams.getPaymentMethodCode() : null;
            BuyCommonConfirmExtraParams buyCommonConfirmExtraParams2 = this.this$0.f39065a0;
            String channelId = buyCommonConfirmExtraParams2 != null ? buyCommonConfirmExtraParams2.getChannelId() : null;
            BuyCommonConfirmExtraParams buyCommonConfirmExtraParams3 = this.this$0.f39065a0;
            String fiatCurrency = buyCommonConfirmExtraParams3 != null ? buyCommonConfirmExtraParams3.getFiatCurrency() : null;
            BuyCommonConfirmExtraParams buyCommonConfirmExtraParams4 = this.this$0.f39065a0;
            String cryptoCurrency = buyCommonConfirmExtraParams4 != null ? buyCommonConfirmExtraParams4.getCryptoCurrency() : null;
            BuyCommonConfirmExtraParams buyCommonConfirmExtraParams5 = this.this$0.f39065a0;
            String fiatAmount = buyCommonConfirmExtraParams5 != null ? buyCommonConfirmExtraParams5.getFiatAmount() : null;
            BuyCommonConfirmExtraParams buyCommonConfirmExtraParams6 = this.this$0.f39065a0;
            String paymentMethodName = buyCommonConfirmExtraParams6 != null ? buyCommonConfirmExtraParams6.getPaymentMethodName() : null;
            BuyCommonConfirmExtraParams buyCommonConfirmExtraParams7 = this.this$0.f39065a0;
            boolean zM66566d = C27025c.m66566d(buyCommonConfirmExtraParams7 != null ? Boxing.boxBoolean(buyCommonConfirmExtraParams7.isRecurring()) : null);
            BuyCommonConfirmExtraParams buyCommonConfirmExtraParams8 = this.this$0.f39065a0;
            String mode = (buyCommonConfirmExtraParams8 == null || (recurringFrequency5 = buyCommonConfirmExtraParams8.getRecurringFrequency()) == null) ? null : recurringFrequency5.getMode();
            BuyCommonConfirmExtraParams buyCommonConfirmExtraParams9 = this.this$0.f39065a0;
            String timeOfDay = (buyCommonConfirmExtraParams9 == null || (recurringFrequency4 = buyCommonConfirmExtraParams9.getRecurringFrequency()) == null) ? null : recurringFrequency4.getTimeOfDay();
            BuyCommonConfirmExtraParams buyCommonConfirmExtraParams10 = this.this$0.f39065a0;
            String timeZone = (buyCommonConfirmExtraParams10 == null || (recurringFrequency3 = buyCommonConfirmExtraParams10.getRecurringFrequency()) == null) ? null : recurringFrequency3.getTimeZone();
            BuyCommonConfirmExtraParams buyCommonConfirmExtraParams11 = this.this$0.f39065a0;
            String dayOfWeek = (buyCommonConfirmExtraParams11 == null || (recurringFrequency2 = buyCommonConfirmExtraParams11.getRecurringFrequency()) == null) ? null : recurringFrequency2.getDayOfWeek();
            BuyCommonConfirmExtraParams buyCommonConfirmExtraParams12 = this.this$0.f39065a0;
            PreviewOrder.RecurringInfo.Request request = new PreviewOrder.RecurringInfo.Request(mode, timeOfDay, timeZone, dayOfWeek, (buyCommonConfirmExtraParams12 == null || (recurringFrequency = buyCommonConfirmExtraParams12.getRecurringFrequency()) == null) ? null : recurringFrequency.getDayOfMonth());
            BuyCommonConfirmExtraParams buyCommonConfirmExtraParams13 = this.this$0.f39065a0;
            BuyPreviewOrder.Request.CardInfoRequest cardInfoRequest = new BuyPreviewOrder.Request.CardInfoRequest(buyCommonConfirmExtraParams13 != null ? buyCommonConfirmExtraParams13.getCardId() : null);
            BuyCommonConfirmExtraParams buyCommonConfirmExtraParams14 = this.this$0.f39065a0;
            String adId = buyCommonConfirmExtraParams14 != null ? buyCommonConfirmExtraParams14.getAdId() : null;
            BuyCommonConfirmExtraParams buyCommonConfirmExtraParams15 = this.this$0.f39065a0;
            BuyPreviewOrder.Request request2 = new BuyPreviewOrder.Request(paymentMethodCode, channelId, fiatCurrency, cryptoCurrency, fiatAmount, paymentMethodName, cardInfoRequest, new BuyPreviewOrder.Request.P2PInfoRequest(adId, buyCommonConfirmExtraParams15 != null ? buyCommonConfirmExtraParams15.getPayTypeCode() : null), Boxing.boxBoolean(zM66566d), request, (String) this.this$0.f39075k0.getValue());
            IFastRepository iFastRepository = this.this$0.f39064Z;
            this.L$0 = SpillingKt.nullOutSpilledVariable(request2);
            this.label = 1;
            objMo46421X = iFastRepository.mo46421X(request2, this);
            if (objMo46421X == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            objMo46421X = obj;
        }
        AbstractC42878k abstractC42878k = (AbstractC42878k) objMo46421X;
        if (abstractC42878k instanceof AbstractC42878k.Success) {
            if (this.$isFirstLoading) {
                this.this$0.m45658q().setValue(BasePaymentVM.LoadingUIState.copy$default(new BasePaymentVM.LoadingUIState(false, false, false, false, 15, null), false, false, false, true, 6, null));
            }
            BuyPreviewOrder.Response response = (BuyPreviewOrder.Response) ((AbstractC42878k.Success) abstractC42878k).m94040a();
            this.this$0.f39071g0 = false;
            this.this$0.f39070f0 = C27025c.m66566d(response.isProtected());
            this.this$0.f39066b0.setValue(response);
            if (response.isProtected() != null && response.getExpireTime() != null) {
                this.this$0.m47520W(C27039d.m66653m(response.getExpireTime(), 15L) * 1000);
            }
        } else {
            if (!(abstractC42878k instanceof AbstractC42878k.Error)) {
                throw new NoWhenBranchMatchedException();
            }
            this.this$0.m45659r().setValue(((AbstractC42878k.Error) abstractC42878k).getException());
            if (this.$isFirstLoading) {
                this.this$0.m45658q().setValue(BasePaymentVM.LoadingUIState.copy$default(new BasePaymentVM.LoadingUIState(false, false, false, false, 15, null), false, true, false, false, 12, null));
            }
        }
        if (!this.$isFirstLoading) {
            this.this$0.f39067c0.setValue(Boxing.boxBoolean(false));
            if (this.$needLoading) {
                this.this$0.m45657p().setValue(Boxing.boxBoolean(false));
            }
        }
        return Unit.INSTANCE;
    }
}
