package com.kubi.payment.channel.paymentmethod.withdraw;

import com.kubi.payment.base.BasePaymentVM;
import com.kubi.payment.channel.data.source.IChannelRepository;
import com.kubi.utils.extensions.C27041f;
import kotlinx.coroutines.InterfaceC41709m0;
import p477nt.AbstractC42878k;
import p569qq.C43841b;
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

/* JADX INFO: compiled from: WithdrawPaymentMethodVM.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.payment.channel.paymentmethod.withdraw.WithdrawPaymentMethodVM$loadPaymentMethodList$1", m90122f = "WithdrawPaymentMethodVM.kt", m90123i = {}, m90124l = {109}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class WithdrawPaymentMethodVM$loadPaymentMethodList$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $fiatCurrency;
    int label;
    final /* synthetic */ WithdrawPaymentMethodVM this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WithdrawPaymentMethodVM$loadPaymentMethodList$1(WithdrawPaymentMethodVM withdrawPaymentMethodVM, String str, Continuation<? super WithdrawPaymentMethodVM$loadPaymentMethodList$1> continuation) {
        super(2, continuation);
        this.this$0 = withdrawPaymentMethodVM;
        this.$fiatCurrency = str;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new WithdrawPaymentMethodVM$loadPaymentMethodList$1(this.this$0, this.$fiatCurrency, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((WithdrawPaymentMethodVM$loadPaymentMethodList$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
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
            IChannelRepository iChannelRepository = this.this$0.f38362Z;
            String strM66668h = C27041f.m66668h(this.$fiatCurrency);
            this.label = 1;
            obj = iChannelRepository.mo45744c0(strM66668h, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        AbstractC42878k abstractC42878k = (AbstractC42878k) obj;
        if (abstractC42878k instanceof AbstractC42878k.Success) {
            this.this$0.f38366d0.setValue(((AbstractC42878k.Success) abstractC42878k).m94040a());
        } else if (abstractC42878k instanceof AbstractC42878k.Error) {
            this.this$0.m45658q().setValue(BasePaymentVM.LoadingUIState.copy$default(new BasePaymentVM.LoadingUIState(false, false, false, false, 15, null), false, false, true, false, 10, null));
            this.this$0.m45659r().setValue(((AbstractC42878k.Error) abstractC42878k).getException());
        } else {
            throw new NoWhenBranchMatchedException();
        }
        if (this.this$0.f38363a0) {
            this.this$0.f38363a0 = false;
            C43841b.m96557d("B7channel_withdraw", "data_load_finish", null, 4, null);
            C43841b.m96557d("B7channel_withdraw", "page_load_end", null, 4, null);
        } else {
            this.this$0.m45657p().setValue(Boxing.boxBoolean(false));
        }
        return Unit.INSTANCE;
    }
}
