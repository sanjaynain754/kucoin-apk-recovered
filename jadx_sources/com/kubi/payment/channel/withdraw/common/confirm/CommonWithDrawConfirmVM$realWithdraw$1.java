package com.kubi.payment.channel.withdraw.common.confirm;

import com.kubi.network.retrofit.exception.ApiException;
import com.kubi.payment.channel.data.entities.PreviewWithdrawOrder;
import com.kubi.payment.channel.data.entities.Withdraw;
import com.kubi.payment.channel.data.source.IChannelRepository;
import com.kubi.utils.extensions.C27041f;
import kotlinx.coroutines.InterfaceC41709m0;
import org.json.JSONException;
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

/* JADX INFO: compiled from: CommonWithDrawConfirmVM.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.payment.channel.withdraw.common.confirm.CommonWithDrawConfirmVM$realWithdraw$1", m90122f = "CommonWithDrawConfirmVM.kt", m90123i = {0, 0}, m90124l = {168}, m90125m = "invokeSuspend", m90126n = {"previewOrder", "request"}, m90127s = {"L$0", "L$1"})
public final class CommonWithDrawConfirmVM$realWithdraw$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $paymentMethodName;
    final /* synthetic */ String $url;
    final /* synthetic */ String $validationToken;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ CommonWithDrawConfirmVM this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommonWithDrawConfirmVM$realWithdraw$1(CommonWithDrawConfirmVM commonWithDrawConfirmVM, String str, String str2, String str3, Continuation<? super CommonWithDrawConfirmVM$realWithdraw$1> continuation) {
        super(2, continuation);
        this.this$0 = commonWithDrawConfirmVM;
        this.$paymentMethodName = str;
        this.$url = str2;
        this.$validationToken = str3;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CommonWithDrawConfirmVM$realWithdraw$1(this.this$0, this.$paymentMethodName, this.$url, this.$validationToken, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((CommonWithDrawConfirmVM$realWithdraw$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws JSONException {
        Object objMo45741N;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        if (i11 == 0) {
            ResultKt.throwOnFailure(obj);
            PreviewWithdrawOrder.Response response = (PreviewWithdrawOrder.Response) this.this$0.f38381a0.getValue();
            if (response == null) {
                return Unit.INSTANCE;
            }
            this.this$0.m45657p().postValue(Boxing.boxBoolean(true));
            Withdraw.Request request = new Withdraw.Request(response.getAmount(), response.getPaymentMethodCode(), response.getChannelId(), response.getFiatCurrency(), this.$paymentMethodName, response.getAccountId(), null, null, 192, null);
            IChannelRepository iChannelRepository = this.this$0.f38380Z;
            String str = this.$url;
            String str2 = this.$validationToken;
            this.L$0 = SpillingKt.nullOutSpilledVariable(response);
            this.L$1 = SpillingKt.nullOutSpilledVariable(request);
            this.label = 1;
            objMo45741N = iChannelRepository.mo45741N(str, request, str2, this);
            if (objMo45741N == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            objMo45741N = obj;
        }
        AbstractC42878k abstractC42878k = (AbstractC42878k) objMo45741N;
        if (abstractC42878k instanceof AbstractC42878k.Success) {
            this.this$0.f38382b0.postValue(C27041f.m66668h(((Withdraw.Response) ((AbstractC42878k.Success) abstractC42878k).m94040a()).getOrderId()));
            CommonWithDrawConfirmVM.m46005M(this.this$0, true, null, 2, null);
        } else {
            if (!(abstractC42878k instanceof AbstractC42878k.Error)) {
                throw new NoWhenBranchMatchedException();
            }
            AbstractC42878k.Error error = (AbstractC42878k.Error) abstractC42878k;
            this.this$0.m45659r().postValue(error.getException());
            if (error.getException() instanceof ApiException) {
                this.this$0.m46021L(false, ((ApiException) error.getException()).code + ':' + error.getException().getMessage());
            }
        }
        this.this$0.m45657p().postValue(Boxing.boxBoolean(false));
        return Unit.INSTANCE;
    }
}
