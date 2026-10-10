package com.kubi.payment.fasttrade.sell.confirm.p2p;

import com.kubi.network.retrofit.exception.ApiException;
import com.kubi.payment.fast.data.entities.SellPreviewOrder;
import com.kubi.payment.fast.data.source.IFastRepository;
import com.kubi.payment.fasttrade.sell.confirm.SellCommonConfirmExtraParams;
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
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: SellP2PConfirmVM.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.payment.fasttrade.sell.confirm.p2p.SellP2PConfirmVM$placeOrder$1", m90122f = "SellP2PConfirmVM.kt", m90123i = {0}, m90124l = {51}, m90125m = "invokeSuspend", m90126n = {"previewOrder"}, m90127s = {"L$0"})
public final class SellP2PConfirmVM$placeOrder$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $url;
    final /* synthetic */ String $validationToken;
    Object L$0;
    int label;
    final /* synthetic */ SellP2PConfirmVM this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SellP2PConfirmVM$placeOrder$1(SellP2PConfirmVM sellP2PConfirmVM, String str, String str2, Continuation<? super SellP2PConfirmVM$placeOrder$1> continuation) {
        super(2, continuation);
        this.this$0 = sellP2PConfirmVM;
        this.$url = str;
        this.$validationToken = str2;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SellP2PConfirmVM$placeOrder$1(this.this$0, this.$url, this.$validationToken, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((SellP2PConfirmVM$placeOrder$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String adId;
        String cryptoAmount;
        String fiatAmount;
        String price;
        String payTypeCode;
        SellP2PConfirmVM$placeOrder$1 sellP2PConfirmVM$placeOrder$1;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 == 1) {
                ResultKt.throwOnFailure(obj);
                sellP2PConfirmVM$placeOrder$1 = this;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            this.this$0.m45657p().setValue(Boxing.boxBoolean(true));
            SellPreviewOrder.Response value = this.this$0.m46957G().getValue();
            IFastRepository f38890j0 = this.this$0.getF38890j0();
            String str = this.$url;
            String str2 = this.$validationToken;
            SellCommonConfirmExtraParams f38891k0 = this.this$0.getF38891k0();
            String p2pBusinessType = null;
            if (f38891k0 != null) {
                adId = f38891k0.getAdId();
            } else {
                adId = null;
            }
            String strM66668h = C27041f.m66668h(adId);
            if (value != null) {
                cryptoAmount = value.getCryptoAmount();
            } else {
                cryptoAmount = null;
            }
            String strM66668h2 = C27041f.m66668h(cryptoAmount);
            if (value != null) {
                fiatAmount = value.getFiatAmount();
            } else {
                fiatAmount = null;
            }
            String strM66668h3 = C27041f.m66668h(fiatAmount);
            if (value != null) {
                price = value.getPrice();
            } else {
                price = null;
            }
            String strM66668h4 = C27041f.m66668h(price);
            SellCommonConfirmExtraParams f38891k1 = this.this$0.getF38891k0();
            if (f38891k1 != null) {
                payTypeCode = f38891k1.getPayTypeCode();
            } else {
                payTypeCode = null;
            }
            String strM66668h5 = C27041f.m66668h(payTypeCode);
            SellCommonConfirmExtraParams f38891k2 = this.this$0.getF38891k0();
            if (f38891k2 != null) {
                p2pBusinessType = f38891k2.getP2pBusinessType();
            }
            String strM66668h6 = C27041f.m66668h(p2pBusinessType);
            this.L$0 = SpillingKt.nullOutSpilledVariable(value);
            this.label = 1;
            sellP2PConfirmVM$placeOrder$1 = this;
            obj = f38890j0.mo46440x(str, str2, strM66668h, strM66668h2, strM66668h3, strM66668h4, strM66668h5, strM66668h6, sellP2PConfirmVM$placeOrder$1);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        AbstractC42878k abstractC42878k = (AbstractC42878k) obj;
        if (abstractC42878k instanceof AbstractC42878k.Success) {
            sellP2PConfirmVM$placeOrder$1.this$0.f38892l0.postValue((String) ((AbstractC42878k.Success) abstractC42878k).m94040a());
        } else if (abstractC42878k instanceof AbstractC42878k.Error) {
            AbstractC42878k.Error error = (AbstractC42878k.Error) abstractC42878k;
            if (error.getException() instanceof ApiException) {
                sellP2PConfirmVM$placeOrder$1.this$0.f38894n0 = Intrinsics.areEqual(((ApiException) error.getException()).code, "600000");
            }
            if (!sellP2PConfirmVM$placeOrder$1.this$0.getF38894n0()) {
                sellP2PConfirmVM$placeOrder$1.this$0.f38893m0.setValue(error.getException());
            }
        } else {
            throw new NoWhenBranchMatchedException();
        }
        sellP2PConfirmVM$placeOrder$1.this$0.m45657p().setValue(Boxing.boxBoolean(false));
        return Unit.INSTANCE;
    }
}
