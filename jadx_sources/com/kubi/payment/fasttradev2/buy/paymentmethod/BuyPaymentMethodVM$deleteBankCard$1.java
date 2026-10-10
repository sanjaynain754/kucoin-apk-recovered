package com.kubi.payment.fasttradev2.buy.paymentmethod;

import com.kubi.network.retrofit.exception.ApiException;
import com.kubi.network.retrofit.utils.C19331c;
import com.kubi.payment.fast.data.entities.BankCard;
import com.kubi.payment.fast.data.source.IFastRepository;
import kotlinx.coroutines.InterfaceC41709m0;
import p477nt.AbstractC42878k;
import p477nt.C42875h;
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
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: BuyPaymentMethodVM.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.payment.fasttradev2.buy.paymentmethod.BuyPaymentMethodVM$deleteBankCard$1", m90122f = "BuyPaymentMethodVM.kt", m90123i = {}, m90124l = {68}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class BuyPaymentMethodVM$deleteBankCard$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $cardId;
    int label;
    final /* synthetic */ BuyPaymentMethodVM this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BuyPaymentMethodVM$deleteBankCard$1(BuyPaymentMethodVM buyPaymentMethodVM, String str, Continuation<? super BuyPaymentMethodVM$deleteBankCard$1> continuation) {
        super(2, continuation);
        this.this$0 = buyPaymentMethodVM;
        this.$cardId = str;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BuyPaymentMethodVM$deleteBankCard$1(this.this$0, this.$cardId, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((BuyPaymentMethodVM$deleteBankCard$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
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
            this.this$0.m45657p().setValue(Boxing.boxBoolean(true));
            IFastRepository iFastRepository = this.this$0.f39288Z;
            BankCard.DeleteRequest deleteRequest = new BankCard.DeleteRequest(this.$cardId, null, 2, null);
            this.label = 1;
            obj = iFastRepository.mo46414I(deleteRequest, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        AbstractC42878k abstractC42878k = (AbstractC42878k) obj;
        if (abstractC42878k instanceof AbstractC42878k.Success) {
            this.this$0.f39289a0.setValue(new C42875h(new BuyPaymentMethodVM.DeleteBankCard(this.$cardId, false, 2, null)));
        } else if (abstractC42878k instanceof AbstractC42878k.Error) {
            AbstractC42878k.Error error = (AbstractC42878k.Error) abstractC42878k;
            if ((error.getException() instanceof ApiException) && Intrinsics.areEqual(((ApiException) error.getException()).code, "1029")) {
                this.this$0.f39289a0.postValue(new C42875h(new BuyPaymentMethodVM.DeleteBankCard(this.$cardId, true)));
            } else {
                C19331c.m42836c(error.getException(), null, 2, null);
            }
        } else {
            throw new NoWhenBranchMatchedException();
        }
        this.this$0.m45657p().setValue(Boxing.boxBoolean(false));
        return Unit.INSTANCE;
    }
}
