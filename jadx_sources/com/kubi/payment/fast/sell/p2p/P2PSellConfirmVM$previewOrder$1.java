package com.kubi.payment.fast.sell.p2p;

import com.kubi.otc.entity.FastQuoteModel;
import com.kubi.otc.entity.FastQuotesModel;
import com.kubi.payment.base.BasePaymentVM;
import com.kubi.payment.fast.common.confirm.p2p.P2PExtraParams;
import com.kubi.payment.p2p.data.entities.TaxInfo;
import com.kubi.utils.extensions.C27041f;
import java.util.List;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.InterfaceC41729r0;
import p477nt.AbstractC42878k;
import p852kotlin.Metadata;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: P2PSellConfirmVM.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.payment.fast.sell.p2p.P2PSellConfirmVM$previewOrder$1", m90122f = "P2PSellConfirmVM.kt", m90123i = {0, 0, 0, 1, 1, 1}, m90124l = {56, 57}, m90125m = "invokeSuspend", m90126n = {"$this$launch", "taxResult", "rfqResult", "$this$launch", "taxResult", "rfqResult"}, m90127s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2"})
public final class P2PSellConfirmVM$previewOrder$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ P2PSellConfirmVM this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P2PSellConfirmVM$previewOrder$1(P2PSellConfirmVM p2PSellConfirmVM, Continuation<? super P2PSellConfirmVM$previewOrder$1> continuation) {
        super(2, continuation);
        this.this$0 = p2PSellConfirmVM;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        P2PSellConfirmVM$previewOrder$1 p2PSellConfirmVM$previewOrder$1 = new P2PSellConfirmVM$previewOrder$1(this.this$0, continuation);
        p2PSellConfirmVM$previewOrder$1.L$0 = obj;
        return p2PSellConfirmVM$previewOrder$1;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((P2PSellConfirmVM$previewOrder$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x00b2, code lost:
    
        if (r2 == r1) goto L15;
     */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        InterfaceC41729r0 interfaceC41729r0M91102b;
        InterfaceC41729r0 interfaceC41729r0M91102b2;
        P2PSellConfirmVM p2PSellConfirmVM;
        Object objMo91198h;
        Object objMo91198h2;
        InterfaceC41709m0 interfaceC41709m0 = (InterfaceC41709m0) this.L$0;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        Object obj2 = null;
        if (i11 == 0) {
            ResultKt.throwOnFailure(obj);
            this.this$0.f38689i0 = false;
            this.this$0.m45658q().postValue(new BasePaymentVM.LoadingUIState(false, false, false, false, 15, null));
            interfaceC41729r0M91102b = C41696j.m91102b(interfaceC41709m0, null, null, new P2PSellConfirmVM$previewOrder$1$taxResult$1(null), 3, null);
            interfaceC41729r0M91102b2 = C41696j.m91102b(interfaceC41709m0, null, null, new P2PSellConfirmVM$previewOrder$1$rfqResult$1(this.this$0, null), 3, null);
            p2PSellConfirmVM = this.this$0;
            this.L$0 = SpillingKt.nullOutSpilledVariable(interfaceC41709m0);
            this.L$1 = SpillingKt.nullOutSpilledVariable(interfaceC41729r0M91102b);
            this.L$2 = interfaceC41729r0M91102b2;
            this.L$3 = p2PSellConfirmVM;
            this.label = 1;
            objMo91198h = interfaceC41729r0M91102b.mo91198h(this);
            if (objMo91198h != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i11 == 1) {
            p2PSellConfirmVM = (P2PSellConfirmVM) this.L$3;
            interfaceC41729r0M91102b2 = (InterfaceC41729r0) this.L$2;
            InterfaceC41729r0 interfaceC41729r0 = (InterfaceC41729r0) this.L$1;
            ResultKt.throwOnFailure(obj);
            interfaceC41729r0M91102b = interfaceC41729r0;
            objMo91198h = obj;
        } else {
            if (i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            objMo91198h2 = obj;
        }
        AbstractC42878k abstractC42878k = (AbstractC42878k) objMo91198h2;
        if (abstractC42878k instanceof AbstractC42878k.Success) {
            List<FastQuoteModel> quotes = ((FastQuotesModel) ((AbstractC42878k.Success) abstractC42878k).m94040a()).getQuotes();
            if (quotes != null) {
                P2PSellConfirmVM p2PSellConfirmVM2 = this.this$0;
                for (Object obj3 : quotes) {
                    FastQuoteModel fastQuoteModel = (FastQuoteModel) obj3;
                    String paymentMethodCode = fastQuoteModel.getPaymentMethodCode();
                    P2PExtraParams p2PExtraParams = p2PSellConfirmVM2.f38686f0;
                    if (Intrinsics.areEqual(paymentMethodCode, C27041f.m66668h(p2PExtraParams != null ? p2PExtraParams.getPaymentMethodCode() : null)) && (Intrinsics.areEqual(fastQuoteModel.getPaymentType(), "P2P_EXPRESS") || Intrinsics.areEqual(fastQuoteModel.getPaymentType(), FastQuoteModel.PAY_P2P))) {
                        obj2 = obj3;
                        break;
                    }
                }
                obj2 = (FastQuoteModel) obj2;
            }
            if (obj2 == null) {
                this.this$0.m45658q().postValue(BasePaymentVM.LoadingUIState.copy$default(new BasePaymentVM.LoadingUIState(false, false, false, false, 15, null), false, true, false, false, 12, null));
            } else {
                this.this$0.f38687g0.postValue(obj2);
                this.this$0.m45658q().postValue(BasePaymentVM.LoadingUIState.copy$default(new BasePaymentVM.LoadingUIState(false, false, false, false, 15, null), false, false, false, true, 6, null));
            }
        } else {
            if (!(abstractC42878k instanceof AbstractC42878k.Error)) {
                throw new NoWhenBranchMatchedException();
            }
            this.this$0.m45659r().setValue(((AbstractC42878k.Error) abstractC42878k).getException());
            this.this$0.m45658q().postValue(BasePaymentVM.LoadingUIState.copy$default(new BasePaymentVM.LoadingUIState(false, false, false, false, 15, null), false, true, false, false, 12, null));
        }
        return Unit.INSTANCE;
        p2PSellConfirmVM.f38688h0 = (TaxInfo) objMo91198h;
        this.L$0 = SpillingKt.nullOutSpilledVariable(interfaceC41709m0);
        this.L$1 = SpillingKt.nullOutSpilledVariable(interfaceC41729r0M91102b);
        this.L$2 = SpillingKt.nullOutSpilledVariable(interfaceC41729r0M91102b2);
        this.L$3 = null;
        this.label = 2;
        objMo91198h2 = interfaceC41729r0M91102b2.mo91198h(this);
    }
}
