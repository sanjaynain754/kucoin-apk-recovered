package com.kubi.payment.fasttradev2.buy.confirm.bankcard;

import com.kubi.otc.R$string;
import com.kubi.payment.fast.data.entities.BankCard;
import com.kubi.payment.fast.data.source.IFastRepository;
import com.kubi.utils.ToastCompat;
import com.sensorsdata.analytics.android.sdk.data.adapter.DbParams;
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

/* JADX INFO: compiled from: BuyBankCardConfirmVM.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.payment.fasttradev2.buy.confirm.bankcard.BuyBankCardConfirmVM$submitCVV$1", m90122f = "BuyBankCardConfirmVM.kt", m90123i = {0, 1, 1, 1, 1}, m90124l = {91, 97}, m90125m = "invokeSuspend", m90126n = {"request", "request", DbParams.KEY_CHANNEL_RESULT, "data", "isSave"}, m90127s = {"L$0", "L$0", "L$1", "L$2", "I$0"})
public final class BuyBankCardConfirmVM$submitCVV$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $cvv;
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ BuyBankCardConfirmVM this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BuyBankCardConfirmVM$submitCVV$1(BuyBankCardConfirmVM buyBankCardConfirmVM, String str, Continuation<? super BuyBankCardConfirmVM$submitCVV$1> continuation) {
        super(2, continuation);
        this.this$0 = buyBankCardConfirmVM;
        this.$cvv = str;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BuyBankCardConfirmVM$submitCVV$1(this.this$0, this.$cvv, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((BuyBankCardConfirmVM$submitCVV$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0098, code lost:
    
        if (r6.m47596q0(r7) == r0) goto L24;
     */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        BankCard.SaveCvvRequest saveCvvRequest;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        int i12 = 1;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                saveCvvRequest = (BankCard.SaveCvvRequest) this.L$0;
                ResultKt.throwOnFailure(obj);
            }
            this.this$0.m45657p().setValue(Boxing.boxBoolean(false));
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(obj);
        this.this$0.m45657p().setValue(Boxing.boxBoolean(true));
        saveCvvRequest = new BankCard.SaveCvvRequest(this.this$0.m47592g0(), this.$cvv);
        IFastRepository f39100m0 = this.this$0.getF39100m0();
        this.L$0 = SpillingKt.nullOutSpilledVariable(saveCvvRequest);
        this.label = 1;
        obj = f39100m0.mo46433m0(saveCvvRequest, this);
        if (obj != coroutine_suspended) {
        }
        return coroutine_suspended;
        AbstractC42878k abstractC42878k = (AbstractC42878k) obj;
        if (abstractC42878k instanceof AbstractC42878k.Success) {
            Object objM94040a = ((AbstractC42878k.Success) abstractC42878k).m94040a();
            if (!(objM94040a instanceof Boolean) || !((Boolean) objM94040a).booleanValue()) {
                i12 = 0;
            }
            if (i12 != 0) {
                BuyBankCardConfirmVM buyBankCardConfirmVM = this.this$0;
                this.L$0 = SpillingKt.nullOutSpilledVariable(saveCvvRequest);
                this.L$1 = SpillingKt.nullOutSpilledVariable(abstractC42878k);
                this.L$2 = SpillingKt.nullOutSpilledVariable(objM94040a);
                this.I$0 = i12;
                this.label = 2;
            } else {
                ToastCompat.m66437C(R$string.system_error);
            }
        } else if (abstractC42878k instanceof AbstractC42878k.Error) {
            this.this$0.m45659r().setValue(((AbstractC42878k.Error) abstractC42878k).getException());
        } else {
            throw new NoWhenBranchMatchedException();
        }
        this.this$0.m45657p().setValue(Boxing.boxBoolean(false));
        return Unit.INSTANCE;
    }
}
