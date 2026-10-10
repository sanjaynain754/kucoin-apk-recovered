package com.kubi.payment.fasttradev2.buy.confirm.p2p;

import com.kubi.payment.fast.data.entities.BuyPreviewOrder;
import com.kubi.payment.fast.data.entities.Request;
import com.kubi.payment.fast.data.entities.Response;
import com.kubi.payment.fast.data.source.IFastRepository;
import com.kubi.payment.fasttradev2.buy.confirm.BuyCommonConfirmExtraParams;
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

/* JADX INFO: compiled from: BuyP2PConfirmVM.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.payment.fasttradev2.buy.confirm.p2p.BuyP2PConfirmVM$placeOrder$1", m90122f = "BuyP2PConfirmVM.kt", m90123i = {0, 0}, m90124l = {63}, m90125m = "invokeSuspend", m90126n = {"previewOrder", "request"}, m90127s = {"L$0", "L$1"})
public final class BuyP2PConfirmVM$placeOrder$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ BuyP2PConfirmVM this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BuyP2PConfirmVM$placeOrder$1(BuyP2PConfirmVM buyP2PConfirmVM, Continuation<? super BuyP2PConfirmVM$placeOrder$1> continuation) {
        super(2, continuation);
        this.this$0 = buyP2PConfirmVM;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BuyP2PConfirmVM$placeOrder$1(this.this$0, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((BuyP2PConfirmVM$placeOrder$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String p2pBusinessType;
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
            BuyPreviewOrder.Response value = this.this$0.m47534M().getValue();
            if (value == null) {
                return Unit.INSTANCE;
            }
            this.this$0.m45657p().setValue(Boxing.boxBoolean(true));
            String quoteId = value.getQuoteId();
            BuyCommonConfirmExtraParams f39175n0 = this.this$0.getF39175n0();
            if (f39175n0 != null) {
                p2pBusinessType = f39175n0.getP2pBusinessType();
            } else {
                p2pBusinessType = null;
            }
            Request request = new Request(quoteId, C27041f.m66668h(p2pBusinessType));
            IFastRepository f39174m0 = this.this$0.getF39174m0();
            this.L$0 = SpillingKt.nullOutSpilledVariable(value);
            this.L$1 = SpillingKt.nullOutSpilledVariable(request);
            this.label = 1;
            obj = f39174m0.mo46435p(request, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        AbstractC42878k abstractC42878k = (AbstractC42878k) obj;
        if (abstractC42878k instanceof AbstractC42878k.Success) {
            this.this$0.f39177p0.postValue(C27041f.m66668h(((Response) ((AbstractC42878k.Success) abstractC42878k).m94040a()).getOrderId()));
        } else if (abstractC42878k instanceof AbstractC42878k.Error) {
            this.this$0.f39178q0.postValue(((AbstractC42878k.Error) abstractC42878k).getException());
        } else {
            throw new NoWhenBranchMatchedException();
        }
        this.this$0.m45657p().setValue(Boxing.boxBoolean(false));
        return Unit.INSTANCE;
    }
}
