package com.kubi.payment.channel.paymentmethod.recharge.ivy;

import com.kubi.otc.service.OtcDepend;
import com.kubi.payment.base.BasePaymentVM;
import com.kubi.payment.channel.data.entities.CreateIvyOrderEntity;
import com.kubi.payment.channel.data.source.IChannelRepository;
import kotlinx.coroutines.InterfaceC41709m0;
import p477nt.AbstractC42878k;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: IvyConfirmVM.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.payment.channel.paymentmethod.recharge.ivy.IvyConfirmVM$createIvyOrder$1", m90122f = "IvyConfirmVM.kt", m90123i = {}, m90124l = {76}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class IvyConfirmVM$createIvyOrder$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ IvyConfirmVM this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IvyConfirmVM$createIvyOrder$1(IvyConfirmVM ivyConfirmVM, Continuation<? super IvyConfirmVM$createIvyOrder$1> continuation) {
        super(2, continuation);
        this.this$0 = ivyConfirmVM;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new IvyConfirmVM$createIvyOrder$1(this.this$0, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((IvyConfirmVM$createIvyOrder$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String str;
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
            IChannelRepository iChannelRepository = this.this$0.f38332Z;
            if (OtcDepend.f38138a.m45467p()) {
                str = "light";
            } else {
                str = "dark";
            }
            CreateIvyOrderEntity.Request request = new CreateIvyOrderEntity.Request(this.this$0.getF38333a0(), this.this$0.getF38334b0(), this.this$0.getF38335c0(), this.this$0.f38336d0, null, 16, null);
            this.label = 1;
            obj = iChannelRepository.mo45748q(str, request, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        this.this$0.m45658q().setValue(new BasePaymentVM.LoadingUIState(false, false, false, true, 6, null));
        this.this$0.f38338f0.setValue((AbstractC42878k) obj);
        return Unit.INSTANCE;
    }
}
