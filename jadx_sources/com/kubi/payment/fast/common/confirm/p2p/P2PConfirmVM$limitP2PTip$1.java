package com.kubi.payment.fast.common.confirm.p2p;

import androidx.lifecycle.MutableLiveData;
import com.kubi.payment.fast.common.confirm.ConfirmExtraParams;
import com.kubi.payment.fast.common.helper.TradeLimitHelper;
import com.kubi.utils.extensions.C27041f;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: P2PConfirmVM.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.payment.fast.common.confirm.p2p.P2PConfirmVM$limitP2PTip$1", m90122f = "P2PConfirmVM.kt", m90123i = {0}, m90124l = {43}, m90125m = "invokeSuspend", m90126n = {"fiatCurrency"}, m90127s = {"L$0"})
public final class P2PConfirmVM$limitP2PTip$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ P2PConfirmVM this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P2PConfirmVM$limitP2PTip$1(P2PConfirmVM p2PConfirmVM, Continuation<? super P2PConfirmVM$limitP2PTip$1> continuation) {
        super(2, continuation);
        this.this$0 = p2PConfirmVM;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new P2PConfirmVM$limitP2PTip$1(this.this$0, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((P2PConfirmVM$limitP2PTip$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String fiatCurrency;
        String strM66668h;
        MutableLiveData mutableLiveData;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 == 1) {
                mutableLiveData = (MutableLiveData) this.L$1;
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            ConfirmExtraParams confirmExtraParams = this.this$0.f38563Z;
            String fiatCurrency2 = null;
            if (confirmExtraParams != null) {
                fiatCurrency = confirmExtraParams.getFiatCurrency();
            } else {
                fiatCurrency = null;
            }
            String strM66668h2 = C27041f.m66668h(fiatCurrency);
            MutableLiveData mutableLiveData2 = this.this$0.f38566c0;
            TradeLimitHelper tradeLimitHelper = new TradeLimitHelper();
            P2PConfirmVM p2PConfirmVM = this.this$0;
            if (strM66668h2.length() == 0) {
                P2PExtraParams p2PExtraParams = p2PConfirmVM.f38564a0;
                if (p2PExtraParams != null) {
                    fiatCurrency2 = p2PExtraParams.getFiatCurrency();
                }
                strM66668h = C27041f.m66668h(fiatCurrency2);
            } else {
                strM66668h = strM66668h2;
            }
            this.L$0 = SpillingKt.nullOutSpilledVariable(strM66668h2);
            this.L$1 = mutableLiveData2;
            this.label = 1;
            obj = tradeLimitHelper.m46374d(strM66668h, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            mutableLiveData = mutableLiveData2;
        }
        mutableLiveData.setValue(obj);
        return Unit.INSTANCE;
    }
}
