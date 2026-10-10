package com.kubi.payment.fast.sell.p2p;

import com.kubi.network.retrofit.exception.ApiException;
import com.kubi.otc.entity.FastCommonOtcMode;
import com.kubi.otc.entity.FastQuoteModel;
import com.kubi.payment.fast.data.source.IFastRepository;
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
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: P2PSellConfirmVM.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.payment.fast.sell.p2p.P2PSellConfirmVM$placeOrder$1", m90122f = "P2PSellConfirmVM.kt", m90123i = {0}, m90124l = {102}, m90125m = "invokeSuspend", m90126n = {"previewOrder"}, m90127s = {"L$0"})
public final class P2PSellConfirmVM$placeOrder$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    Object L$0;
    int label;
    final /* synthetic */ P2PSellConfirmVM this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P2PSellConfirmVM$placeOrder$1(P2PSellConfirmVM p2PSellConfirmVM, Continuation<? super P2PSellConfirmVM$placeOrder$1> continuation) {
        super(2, continuation);
        this.this$0 = p2PSellConfirmVM;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new P2PSellConfirmVM$placeOrder$1(this.this$0, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((P2PSellConfirmVM$placeOrder$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String adId;
        P2PSellConfirmVM$placeOrder$1 p2PSellConfirmVM$placeOrder$1;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 == 1) {
                ResultKt.throwOnFailure(obj);
                p2PSellConfirmVM$placeOrder$1 = this;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            FastQuoteModel value = this.this$0.m46669N().getValue();
            if (value == null) {
                return Unit.INSTANCE;
            }
            this.this$0.m45657p().postValue(Boxing.boxBoolean(true));
            IFastRepository iFastRepository = this.this$0.f38685e0;
            FastCommonOtcMode commonOtcResponse = value.getCommonOtcResponse();
            String payTypeCode = null;
            if (commonOtcResponse != null) {
                adId = commonOtcResponse.getAdId();
            } else {
                adId = null;
            }
            String strM66668h = C27041f.m66668h(adId);
            String strM66668h2 = C27041f.m66668h(value.getCryptoAmount());
            String strM66668h3 = C27041f.m66668h(value.getFiatAmount());
            String strM66668h4 = C27041f.m66668h(value.getHighPrice());
            FastCommonOtcMode commonOtcResponse2 = value.getCommonOtcResponse();
            if (commonOtcResponse2 != null) {
                payTypeCode = commonOtcResponse2.getPayTypeCode();
            }
            String strM66668h5 = C27041f.m66668h(payTypeCode);
            this.L$0 = SpillingKt.nullOutSpilledVariable(value);
            this.label = 1;
            p2PSellConfirmVM$placeOrder$1 = this;
            obj = iFastRepository.mo46440x("", "", strM66668h, strM66668h2, strM66668h3, strM66668h4, strM66668h5, "", p2PSellConfirmVM$placeOrder$1);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        AbstractC42878k abstractC42878k = (AbstractC42878k) obj;
        if (abstractC42878k instanceof AbstractC42878k.Success) {
            p2PSellConfirmVM$placeOrder$1.this$0.m46367y().postValue((String) ((AbstractC42878k.Success) abstractC42878k).m94040a());
        } else if (abstractC42878k instanceof AbstractC42878k.Error) {
            AbstractC42878k.Error error = (AbstractC42878k.Error) abstractC42878k;
            if (error.getException() instanceof ApiException) {
                p2PSellConfirmVM$placeOrder$1.this$0.f38689i0 = Intrinsics.areEqual(((ApiException) error.getException()).code, "600000");
            }
            if (!p2PSellConfirmVM$placeOrder$1.this$0.getF38689i0()) {
                p2PSellConfirmVM$placeOrder$1.this$0.m46368z().setValue(error.getException());
            }
        } else {
            throw new NoWhenBranchMatchedException();
        }
        p2PSellConfirmVM$placeOrder$1.this$0.m45657p().postValue(Boxing.boxBoolean(false));
        return Unit.INSTANCE;
    }
}
