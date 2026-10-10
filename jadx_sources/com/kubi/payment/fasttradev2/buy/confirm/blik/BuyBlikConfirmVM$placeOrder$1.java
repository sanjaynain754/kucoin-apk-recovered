package com.kubi.payment.fasttradev2.buy.confirm.blik;

import android.os.Build;
import androidx.core.view.InputDeviceCompat;
import com.kubi.payment.fast.data.entities.BuyPreviewOrder;
import com.kubi.payment.fast.data.entities.PlaceOrder;
import com.kubi.payment.fast.data.source.IFastRepository;
import com.kubi.payment.fasttradev2.buy.confirm.BuyCommonConfirmExtraParams;
import com.kubi.payment.util.ForterUtils;
import com.kubi.sdk.BaseApplication;
import com.kubi.utils.extensions.C27041f;
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

/* JADX INFO: compiled from: BuyBlikConfirmVM.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.payment.fasttradev2.buy.confirm.blik.BuyBlikConfirmVM$placeOrder$1", m90122f = "BuyBlikConfirmVM.kt", m90123i = {0, 0}, m90124l = {49}, m90125m = "invokeSuspend", m90126n = {"previewOrder", "request"}, m90127s = {"L$0", "L$1"})
public final class BuyBlikConfirmVM$placeOrder$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $blikCode;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ BuyBlikConfirmVM this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BuyBlikConfirmVM$placeOrder$1(BuyBlikConfirmVM buyBlikConfirmVM, String str, Continuation<? super BuyBlikConfirmVM$placeOrder$1> continuation) {
        super(2, continuation);
        this.this$0 = buyBlikConfirmVM;
        this.$blikCode = str;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BuyBlikConfirmVM$placeOrder$1(this.this$0, this.$blikCode, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((BuyBlikConfirmVM$placeOrder$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objMo46424a0;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        if (i11 == 0) {
            ResultKt.throwOnFailure(obj);
            BuyPreviewOrder.Response value = this.this$0.m47534M().getValue();
            if (value == null) {
                return Unit.INSTANCE;
            }
            this.this$0.m45657p().setValue(Boxing.boxBoolean(true));
            BuyCommonConfirmExtraParams f39116n0 = this.this$0.getF39116n0();
            PlaceOrder.PlaceOrderRequest placeOrderRequest = new PlaceOrder.PlaceOrderRequest(null, f39116n0 != null ? f39116n0.getPaymentMethodCode() : null, C27041f.m66668h(value.getFiatCurrency()), C27041f.m66668h(value.getFiatAmount()), C27041f.m66668h(value.getCryptoCurrency()), C27041f.m66668h(value.getQuoteId()), ForterUtils.a.c(BaseApplication.INSTANCE.get()), Build.BRAND, new PlaceOrder.Zen(this.$blikCode), null, this.this$0.m47535N().getValue(), InputDeviceCompat.SOURCE_DPAD, null);
            IFastRepository f39115m0 = this.this$0.getF39115m0();
            this.L$0 = SpillingKt.nullOutSpilledVariable(value);
            this.L$1 = SpillingKt.nullOutSpilledVariable(placeOrderRequest);
            this.label = 1;
            objMo46424a0 = f39115m0.mo46424a0(placeOrderRequest, this);
            if (objMo46424a0 == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            objMo46424a0 = obj;
        }
        AbstractC42878k abstractC42878k = (AbstractC42878k) objMo46424a0;
        if (abstractC42878k instanceof AbstractC42878k.Success) {
            this.this$0.f39117o0.postValue(C27041f.m66668h(((PlaceOrder.PlaceOrderResponse) ((AbstractC42878k.Success) abstractC42878k).m94040a()).getOrderId()));
        } else {
            if (!(abstractC42878k instanceof AbstractC42878k.Error)) {
                throw new NoWhenBranchMatchedException();
            }
            this.this$0.m47536O().setValue(((AbstractC42878k.Error) abstractC42878k).getException());
        }
        this.this$0.m45657p().setValue(Boxing.boxBoolean(false));
        return Unit.INSTANCE;
    }
}
