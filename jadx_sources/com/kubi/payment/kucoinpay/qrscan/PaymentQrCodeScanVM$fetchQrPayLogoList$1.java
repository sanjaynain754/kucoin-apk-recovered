package com.kubi.payment.kucoinpay.qrscan;

import com.kubi.payment.kucoinpay.KuCoinPayServiceLocator;
import com.kubi.payment.kucoinpay.data.source.IKuCoinPayRepository;
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

/* JADX INFO: compiled from: PaymentQrCodeScanVM.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.payment.kucoinpay.qrscan.PaymentQrCodeScanVM$fetchQrPayLogoList$1", m90122f = "PaymentQrCodeScanVM.kt", m90123i = {}, m90124l = {21}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class PaymentQrCodeScanVM$fetchQrPayLogoList$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ PaymentQrCodeScanVM this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentQrCodeScanVM$fetchQrPayLogoList$1(PaymentQrCodeScanVM paymentQrCodeScanVM, Continuation<? super PaymentQrCodeScanVM$fetchQrPayLogoList$1> continuation) {
        super(2, continuation);
        this.this$0 = paymentQrCodeScanVM;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PaymentQrCodeScanVM$fetchQrPayLogoList$1(this.this$0, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((PaymentQrCodeScanVM$fetchQrPayLogoList$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
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
            IKuCoinPayRepository iKuCoinPayRepositoryM48308c = KuCoinPayServiceLocator.f39583a.m48308c();
            this.label = 1;
            obj = iKuCoinPayRepositoryM48308c.mo48310G(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        AbstractC42878k abstractC42878k = (AbstractC42878k) obj;
        if (abstractC42878k instanceof AbstractC42878k.Success) {
            this.this$0.f39623V.setValue(((QrCodeLogoEntity) ((AbstractC42878k.Success) abstractC42878k).m94040a()).getQrcodeInfoList());
        }
        return Unit.INSTANCE;
    }
}
