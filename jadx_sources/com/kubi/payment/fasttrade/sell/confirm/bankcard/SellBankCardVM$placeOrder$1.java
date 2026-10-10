package com.kubi.payment.fasttrade.sell.confirm.bankcard;

import com.kubi.payment.fast.data.entities.PlaceSellOrder;
import com.kubi.payment.fast.data.entities.SellPreviewOrder;
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
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: SellBankCardVM.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.payment.fasttrade.sell.confirm.bankcard.SellBankCardVM$placeOrder$1", m90122f = "SellBankCardVM.kt", m90123i = {0}, m90124l = {33}, m90125m = "invokeSuspend", m90126n = {"previewOrder"}, m90127s = {"L$0"})
public final class SellBankCardVM$placeOrder$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $validationToken;
    Object L$0;
    int label;
    final /* synthetic */ SellBankCardVM this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SellBankCardVM$placeOrder$1(SellBankCardVM sellBankCardVM, String str, Continuation<? super SellBankCardVM$placeOrder$1> continuation) {
        super(2, continuation);
        this.this$0 = sellBankCardVM;
        this.$validationToken = str;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SellBankCardVM$placeOrder$1(this.this$0, this.$validationToken, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((SellBankCardVM$placeOrder$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String quoteId;
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
            SellPreviewOrder.Response value = this.this$0.m46957G().getValue();
            IFastRepository f38863j0 = this.this$0.getF38863j0();
            String str = this.$validationToken;
            if (value != null) {
                quoteId = value.getQuoteId();
            } else {
                quoteId = null;
            }
            PlaceSellOrder.Request request = new PlaceSellOrder.Request(quoteId);
            this.L$0 = SpillingKt.nullOutSpilledVariable(value);
            this.label = 1;
            obj = f38863j0.mo46416L(str, request, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        AbstractC42878k abstractC42878k = (AbstractC42878k) obj;
        if (abstractC42878k instanceof AbstractC42878k.Success) {
            String orderId = ((PlaceSellOrder.Response) ((AbstractC42878k.Success) abstractC42878k).m94040a()).getOrderId();
            if (orderId != null) {
                this.this$0.f38865l0.setValue(orderId);
            }
        } else if (abstractC42878k instanceof AbstractC42878k.Error) {
            this.this$0.m46958H().setValue(((AbstractC42878k.Error) abstractC42878k).getException());
        } else {
            throw new NoWhenBranchMatchedException();
        }
        this.this$0.m45657p().setValue(Boxing.boxBoolean(false));
        return Unit.INSTANCE;
    }
}
