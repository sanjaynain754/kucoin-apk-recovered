package com.kubi.payment.fast.sell.balance;

import com.kubi.payment.fast.data.entities.BalanceOrder;
import com.kubi.payment.fast.data.entities.PreviewOrder;
import com.kubi.payment.fast.data.source.IFastRepository;
import com.kubi.utils.extensions.C27041f;
import kotlinx.coroutines.InterfaceC41709m0;
import org.json.JSONException;
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

/* JADX INFO: compiled from: BalanceSellConfirmVM.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.payment.fast.sell.balance.BalanceSellConfirmVM$placeOrder$1", m90122f = "BalanceSellConfirmVM.kt", m90123i = {0, 0}, m90124l = {49}, m90125m = "invokeSuspend", m90126n = {"previewOrder", "request"}, m90127s = {"L$0", "L$1"})
public final class BalanceSellConfirmVM$placeOrder$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ BalanceSellConfirmVM this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BalanceSellConfirmVM$placeOrder$1(BalanceSellConfirmVM balanceSellConfirmVM, Continuation<? super BalanceSellConfirmVM$placeOrder$1> continuation) {
        super(2, continuation);
        this.this$0 = balanceSellConfirmVM;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BalanceSellConfirmVM$placeOrder$1(this.this$0, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((BalanceSellConfirmVM$placeOrder$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws JSONException {
        BalanceSellConfirmVM$placeOrder$1 balanceSellConfirmVM$placeOrder$1;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 == 1) {
                ResultKt.throwOnFailure(obj);
                balanceSellConfirmVM$placeOrder$1 = this;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            PreviewOrder.Response value = this.this$0.m46327G().getValue();
            if (value == null) {
                return Unit.INSTANCE;
            }
            String quoteId = value.getQuoteId();
            if (quoteId != null && quoteId.length() != 0) {
                this.this$0.m45657p().postValue(Boxing.boxBoolean(true));
                BalanceOrder.SellRequest sellRequest = new BalanceOrder.SellRequest(value.getFiatCurrency(), value.getCryptoCurrency(), value.getCryptoAmount(), value.getQuoteId(), null, 16, null);
                IFastRepository iFastRepository = this.this$0.f38671j0;
                this.L$0 = SpillingKt.nullOutSpilledVariable(value);
                this.L$1 = SpillingKt.nullOutSpilledVariable(sellRequest);
                this.label = 1;
                balanceSellConfirmVM$placeOrder$1 = this;
                obj = IFastRepository.m46444p0(iFastRepository, sellRequest, null, null, balanceSellConfirmVM$placeOrder$1, 6, null);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                return Unit.INSTANCE;
            }
        }
        AbstractC42878k abstractC42878k = (AbstractC42878k) obj;
        if (abstractC42878k instanceof AbstractC42878k.Success) {
            balanceSellConfirmVM$placeOrder$1.this$0.f38673l0.postValue(C27041f.m66668h(((BalanceOrder.Response) ((AbstractC42878k.Success) abstractC42878k).m94040a()).getOrderId()));
            balanceSellConfirmVM$placeOrder$1.this$0.m46630U();
        } else if (abstractC42878k instanceof AbstractC42878k.Error) {
            balanceSellConfirmVM$placeOrder$1.this$0.m46328H().setValue(((AbstractC42878k.Error) abstractC42878k).getException());
        } else {
            throw new NoWhenBranchMatchedException();
        }
        balanceSellConfirmVM$placeOrder$1.this$0.m45657p().postValue(Boxing.boxBoolean(false));
        return Unit.INSTANCE;
    }
}
