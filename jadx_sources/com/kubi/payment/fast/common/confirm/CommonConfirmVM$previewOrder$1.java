package com.kubi.payment.fast.common.confirm;

import androidx.media3.exoplayer.RendererCapabilities;
import com.kubi.payment.base.BasePaymentVM;
import com.kubi.payment.fast.buy.recurring.RecurringFrequency;
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
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: CommonConfirmVM.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.payment.fast.common.confirm.CommonConfirmVM$previewOrder$1", m90122f = "CommonConfirmVM.kt", m90123i = {0}, m90124l = {83}, m90125m = "invokeSuspend", m90126n = {"request"}, m90127s = {"L$0"})
public final class CommonConfirmVM$previewOrder$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ boolean $isFirstLoading;
    Object L$0;
    int label;
    final /* synthetic */ CommonConfirmVM this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommonConfirmVM$previewOrder$1(boolean z11, CommonConfirmVM commonConfirmVM, Continuation<? super CommonConfirmVM$previewOrder$1> continuation) {
        super(2, continuation);
        this.$isFirstLoading = z11;
        this.this$0 = commonConfirmVM;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CommonConfirmVM$previewOrder$1(this.$isFirstLoading, this.this$0, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((CommonConfirmVM$previewOrder$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objMo46422Z;
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
                this.this$0.m45658q().postValue(new BasePaymentVM.LoadingUIState(false, false, false, false, 15, null));
            } else {
                this.this$0.f38542c0.postValue(Boxing.boxBoolean(true));
            }
            ConfirmExtraParams confirmExtraParams = this.this$0.f38540a0;
            String dayOfMonth = null;
            String tradeType = confirmExtraParams != null ? confirmExtraParams.getTradeType() : null;
            ConfirmExtraParams confirmExtraParams2 = this.this$0.f38540a0;
            String fiatCurrency = confirmExtraParams2 != null ? confirmExtraParams2.getFiatCurrency() : null;
            ConfirmExtraParams confirmExtraParams3 = this.this$0.f38540a0;
            String fiatAmount = confirmExtraParams3 != null ? confirmExtraParams3.getFiatAmount() : null;
            ConfirmExtraParams confirmExtraParams4 = this.this$0.f38540a0;
            String cryptoCurrency = confirmExtraParams4 != null ? confirmExtraParams4.getCryptoCurrency() : null;
            ConfirmExtraParams confirmExtraParams5 = this.this$0.f38540a0;
            String cryptoAmount = confirmExtraParams5 != null ? confirmExtraParams5.getCryptoAmount() : null;
            ConfirmExtraParams confirmExtraParams6 = this.this$0.f38540a0;
            String paymentMethodCode = confirmExtraParams6 != null ? confirmExtraParams6.getPaymentMethodCode() : null;
            ConfirmExtraParams confirmExtraParams7 = this.this$0.f38540a0;
            String cardId = confirmExtraParams7 != null ? confirmExtraParams7.getCardId() : null;
            ConfirmExtraParams confirmExtraParams8 = this.this$0.f38540a0;
            Boolean boolBoxBoolean = Boxing.boxBoolean(C27025c.m66566d(confirmExtraParams8 != null ? Boxing.boxBoolean(confirmExtraParams8.isRecurringMode()) : null));
            ConfirmExtraParams confirmExtraParams9 = this.this$0.f38540a0;
            String mode = (confirmExtraParams9 == null || (recurringFrequency5 = confirmExtraParams9.getRecurringFrequency()) == null) ? null : recurringFrequency5.getMode();
            ConfirmExtraParams confirmExtraParams10 = this.this$0.f38540a0;
            String timeOfDay = (confirmExtraParams10 == null || (recurringFrequency4 = confirmExtraParams10.getRecurringFrequency()) == null) ? null : recurringFrequency4.getTimeOfDay();
            ConfirmExtraParams confirmExtraParams11 = this.this$0.f38540a0;
            String timeZone = (confirmExtraParams11 == null || (recurringFrequency3 = confirmExtraParams11.getRecurringFrequency()) == null) ? null : recurringFrequency3.getTimeZone();
            ConfirmExtraParams confirmExtraParams12 = this.this$0.f38540a0;
            String dayOfWeek = (confirmExtraParams12 == null || (recurringFrequency2 = confirmExtraParams12.getRecurringFrequency()) == null) ? null : recurringFrequency2.getDayOfWeek();
            ConfirmExtraParams confirmExtraParams13 = this.this$0.f38540a0;
            if (confirmExtraParams13 != null && (recurringFrequency = confirmExtraParams13.getRecurringFrequency()) != null) {
                dayOfMonth = recurringFrequency.getDayOfMonth();
            }
            PreviewOrder.Request request = new PreviewOrder.Request(tradeType, fiatCurrency, fiatAmount, cryptoCurrency, cryptoAmount, paymentMethodCode, cardId, null, null, boolBoxBoolean, new PreviewOrder.RecurringInfo.Request(mode, timeOfDay, timeZone, dayOfWeek, dayOfMonth), RendererCapabilities.DECODER_SUPPORT_MASK, null);
            IFastRepository iFastRepository = this.this$0.f38539Z;
            this.L$0 = SpillingKt.nullOutSpilledVariable(request);
            this.label = 1;
            objMo46422Z = iFastRepository.mo46422Z(request, this);
            if (objMo46422Z == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            objMo46422Z = obj;
        }
        AbstractC42878k abstractC42878k = (AbstractC42878k) objMo46422Z;
        if (abstractC42878k instanceof AbstractC42878k.Success) {
            if (this.$isFirstLoading) {
                this.this$0.m45658q().postValue(BasePaymentVM.LoadingUIState.copy$default(new BasePaymentVM.LoadingUIState(false, false, false, false, 15, null), false, false, false, true, 6, null));
            }
            PreviewOrder.Response response = (PreviewOrder.Response) ((AbstractC42878k.Success) abstractC42878k).m94040a();
            this.this$0.f38547h0 = false;
            this.this$0.f38546g0 = Intrinsics.areEqual(response.getPriceProtection(), "protect");
            this.this$0.f38541b0.setValue(response);
            this.this$0.m46332L(C27039d.m66653m(response.getExpireTime(), 15L) * 1000);
        } else {
            if (!(abstractC42878k instanceof AbstractC42878k.Error)) {
                throw new NoWhenBranchMatchedException();
            }
            this.this$0.m45659r().setValue(((AbstractC42878k.Error) abstractC42878k).getException());
            if (this.$isFirstLoading) {
                this.this$0.m45658q().postValue(BasePaymentVM.LoadingUIState.copy$default(new BasePaymentVM.LoadingUIState(false, false, false, false, 15, null), false, true, false, false, 12, null));
            }
        }
        if (!this.$isFirstLoading) {
            this.this$0.f38542c0.postValue(Boxing.boxBoolean(false));
        }
        return Unit.INSTANCE;
    }
}
