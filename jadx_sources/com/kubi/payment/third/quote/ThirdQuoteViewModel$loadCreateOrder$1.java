package com.kubi.payment.third.quote;

import com.kubi.payment.third.data.entities.PayChannelSelect;
import com.kubi.payment.third.data.entities.ThirdOrder;
import com.kubi.payment.third.data.entities.ThirdOrderRequest;
import com.kubi.payment.third.data.source.IThirdRepository;
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
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: ThirdQuoteViewModel.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.payment.third.quote.ThirdQuoteViewModel$loadCreateOrder$1", m90122f = "ThirdQuoteViewModel.kt", m90123i = {}, m90124l = {217}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class ThirdQuoteViewModel$loadCreateOrder$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ ThirdQuoteViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ThirdQuoteViewModel$loadCreateOrder$1(ThirdQuoteViewModel thirdQuoteViewModel, Continuation<? super ThirdQuoteViewModel$loadCreateOrder$1> continuation) {
        super(2, continuation);
        this.this$0 = thirdQuoteViewModel;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ThirdQuoteViewModel$loadCreateOrder$1(this.this$0, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((ThirdQuoteViewModel$loadCreateOrder$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objMo49544e;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        if (i11 == 0) {
            ResultKt.throwOnFailure(obj);
            IThirdRepository iThirdRepository = this.this$0.f40279X;
            PayChannelSelect f40285d0 = this.this$0.getF40285d0();
            String strM66668h = C27041f.m66668h(f40285d0 != null ? f40285d0.getChannel() : null);
            String f40281z = this.this$0.getF40281Z();
            PayChannelSelect f40285d1 = this.this$0.getF40285d0();
            ThirdOrderRequest thirdOrderRequest = new ThirdOrderRequest(strM66668h, f40281z, C27041f.m66668h(f40285d1 != null ? f40285d1.getCurrencyAmount() : null), this.this$0.getF40280Y(), this.this$0.getF40283b0(), this.this$0.getF40282a0(), true, null, 128, null);
            this.label = 1;
            objMo49544e = iThirdRepository.mo49544e(thirdOrderRequest, this);
            if (objMo49544e == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            objMo49544e = obj;
        }
        AbstractC42878k abstractC42878k = (AbstractC42878k) objMo49544e;
        if (abstractC42878k instanceof AbstractC42878k.Success) {
            this.this$0.f40289h0.setValue((ThirdOrder) ((AbstractC42878k.Success) abstractC42878k).m94040a());
            this.this$0.m49791x0();
        } else {
            if (!(abstractC42878k instanceof AbstractC42878k.Error)) {
                throw new NoWhenBranchMatchedException();
            }
            ThirdQuoteViewModel thirdQuoteViewModel = this.this$0;
            AbstractC42878k.Error error = (AbstractC42878k.Error) abstractC42878k;
            PayChannelSelect f40285d2 = thirdQuoteViewModel.getF40285d0();
            thirdQuoteViewModel.m49772W(error, C27041f.m66668h(f40285d2 != null ? f40285d2.getChannel() : null));
        }
        this.this$0.m94034o().setValue(Boxing.boxBoolean(false));
        return Unit.INSTANCE;
    }
}
