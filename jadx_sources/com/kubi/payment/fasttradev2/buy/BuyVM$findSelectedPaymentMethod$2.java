package com.kubi.payment.fasttradev2.buy;

import com.kubi.payment.fast.data.entities.BuyPaymentMethod;
import com.kubi.payment.fasttradev2.buy.paymentmethod.BuyItemPaymentMethod;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: BuyVM.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "Lcom/kubi/payment/fasttradev2/buy/paymentmethod/BuyItemPaymentMethod$ItemNormalPaymentMethod;", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.payment.fasttradev2.buy.BuyVM$findSelectedPaymentMethod$2", m90122f = "BuyVM.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class BuyVM$findSelectedPaymentMethod$2 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super BuyItemPaymentMethod.ItemNormalPaymentMethod>, Object> {
    final /* synthetic */ List<BuyItemPaymentMethod> $paymentMethods;
    final /* synthetic */ BuyPaymentMethod.Response.PaymentMethod $tempSelectedPaymentMethod;
    int label;
    final /* synthetic */ BuyVM this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public BuyVM$findSelectedPaymentMethod$2(List<? extends BuyItemPaymentMethod> list, BuyVM buyVM, BuyPaymentMethod.Response.PaymentMethod paymentMethod, Continuation<? super BuyVM$findSelectedPaymentMethod$2> continuation) {
        super(2, continuation);
        this.$paymentMethods = list;
        this.this$0 = buyVM;
        this.$tempSelectedPaymentMethod = paymentMethod;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BuyVM$findSelectedPaymentMethod$2(this.$paymentMethods, this.this$0, this.$tempSelectedPaymentMethod, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super BuyItemPaymentMethod.ItemNormalPaymentMethod> continuation) {
        return ((BuyVM$findSelectedPaymentMethod$2) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object next;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            List<BuyItemPaymentMethod> list = this.$paymentMethods;
            BuyVM buyVM = this.this$0;
            BuyPaymentMethod.Response.PaymentMethod paymentMethod = this.$tempSelectedPaymentMethod;
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                next = it.next();
                if (buyVM.m47450a0((BuyItemPaymentMethod) next, paymentMethod)) {
                    return (BuyItemPaymentMethod.ItemNormalPaymentMethod) next;
                }
            }
            next = null;
            return (BuyItemPaymentMethod.ItemNormalPaymentMethod) next;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
