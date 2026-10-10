package com.kubi.payment.fasttradev2.buy.confirm.bankcard;

import com.kubi.payment.fast.data.source.IFastRepository;
import com.kubi.utils.extensions.C27025c;
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
@DebugMetadata(m90121c = "com.kubi.payment.fasttradev2.buy.confirm.bankcard.BuyBankCardConfirmVM$placeOrder$1", m90122f = "BuyBankCardConfirmVM.kt", m90123i = {1}, m90124l = {66, 71}, m90125m = "invokeSuspend", m90126n = {DbParams.KEY_CHANNEL_RESULT}, m90127s = {"L$0"})
public final class BuyBankCardConfirmVM$placeOrder$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    Object L$0;
    int label;
    final /* synthetic */ BuyBankCardConfirmVM this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BuyBankCardConfirmVM$placeOrder$1(BuyBankCardConfirmVM buyBankCardConfirmVM, Continuation<? super BuyBankCardConfirmVM$placeOrder$1> continuation) {
        super(2, continuation);
        this.this$0 = buyBankCardConfirmVM;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BuyBankCardConfirmVM$placeOrder$1(this.this$0, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((BuyBankCardConfirmVM$placeOrder$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x007f, code lost:
    
        if (r1.m47596q0(r5) == r0) goto L24;
     */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Boolean bool;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
            }
            this.this$0.m45657p().setValue(Boxing.boxBoolean(false));
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(obj);
        this.this$0.m45657p().setValue(Boxing.boxBoolean(true));
        IFastRepository f39100m0 = this.this$0.getF39100m0();
        String strM47592g0 = this.this$0.m47592g0();
        this.label = 1;
        obj = f39100m0.mo46437t0(strM47592g0, this);
        if (obj != coroutine_suspended) {
        }
        return coroutine_suspended;
        AbstractC42878k abstractC42878k = (AbstractC42878k) obj;
        if (abstractC42878k instanceof AbstractC42878k.Success) {
            Object objM94040a = ((AbstractC42878k.Success) abstractC42878k).m94040a();
            if (objM94040a instanceof Boolean) {
                bool = (Boolean) objM94040a;
            } else {
                bool = null;
            }
            if (C27025c.m66566d(bool)) {
                this.this$0.f39102o0.postValue(Boxing.boxBoolean(true));
            } else {
                BuyBankCardConfirmVM buyBankCardConfirmVM = this.this$0;
                this.L$0 = SpillingKt.nullOutSpilledVariable(abstractC42878k);
                this.label = 2;
            }
        } else if (abstractC42878k instanceof AbstractC42878k.Error) {
            this.this$0.f39102o0.postValue(Boxing.boxBoolean(true));
        } else {
            throw new NoWhenBranchMatchedException();
        }
        this.this$0.m45657p().setValue(Boxing.boxBoolean(false));
        return Unit.INSTANCE;
    }
}
