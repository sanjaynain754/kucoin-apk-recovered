package com.kubi.payment.fasttradev2.buy.confirm;

import androidx.media3.extractor.p021ts.PsExtractor;
import com.kubi.payment.fast.data.entities.FiatCouponListInfo;
import com.kubi.payment.fast.data.source.IFastRepository;
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
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: BuyCommonConfirmVM.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.payment.fasttradev2.buy.confirm.BuyCommonConfirmVM$loadCouponListInfo$1", m90122f = "BuyCommonConfirmVM.kt", m90123i = {}, m90124l = {PsExtractor.PRIVATE_STREAM_1}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class BuyCommonConfirmVM$loadCouponListInfo$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ BuyCommonConfirmVM this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BuyCommonConfirmVM$loadCouponListInfo$1(BuyCommonConfirmVM buyCommonConfirmVM, Continuation<? super BuyCommonConfirmVM$loadCouponListInfo$1> continuation) {
        super(2, continuation);
        this.this$0 = buyCommonConfirmVM;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BuyCommonConfirmVM$loadCouponListInfo$1(this.this$0, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((BuyCommonConfirmVM$loadCouponListInfo$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String fiatCurrency;
        String cryptoCurrency;
        String paymentMethodCode;
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
            this.this$0.m45657p().setValue(Boxing.boxBoolean(true));
            IFastRepository iFastRepository = this.this$0.f39064Z;
            BuyCommonConfirmExtraParams buyCommonConfirmExtraParams = this.this$0.f39065a0;
            String fiatAmount = null;
            if (buyCommonConfirmExtraParams != null) {
                fiatCurrency = buyCommonConfirmExtraParams.getFiatCurrency();
            } else {
                fiatCurrency = null;
            }
            BuyCommonConfirmExtraParams buyCommonConfirmExtraParams2 = this.this$0.f39065a0;
            if (buyCommonConfirmExtraParams2 != null) {
                cryptoCurrency = buyCommonConfirmExtraParams2.getCryptoCurrency();
            } else {
                cryptoCurrency = null;
            }
            BuyCommonConfirmExtraParams buyCommonConfirmExtraParams3 = this.this$0.f39065a0;
            if (buyCommonConfirmExtraParams3 != null) {
                paymentMethodCode = buyCommonConfirmExtraParams3.getPaymentMethodCode();
            } else {
                paymentMethodCode = null;
            }
            BuyCommonConfirmExtraParams buyCommonConfirmExtraParams4 = this.this$0.f39065a0;
            if (buyCommonConfirmExtraParams4 != null) {
                fiatAmount = buyCommonConfirmExtraParams4.getFiatAmount();
            }
            FiatCouponListInfo.Request request = new FiatCouponListInfo.Request("FAST_BUY", "BUY", fiatCurrency, cryptoCurrency, paymentMethodCode, "FIAT", fiatAmount);
            this.label = 1;
            obj = iFastRepository.mo46413H(request, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        AbstractC42878k abstractC42878k = (AbstractC42878k) obj;
        this.this$0.m45657p().setValue(Boxing.boxBoolean(false));
        if (abstractC42878k instanceof AbstractC42878k.Success) {
            this.this$0.f39073i0.setValue(((AbstractC42878k.Success) abstractC42878k).m94040a());
        } else if (abstractC42878k instanceof AbstractC42878k.Error) {
            this.this$0.m45659r().setValue(((AbstractC42878k.Error) abstractC42878k).getException());
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return Unit.INSTANCE;
    }
}
