package com.kubi.payment.chat.p105ui;

import com.kubi.network.retrofit.utils.C19331c;
import com.kubi.payment.p2p.P2PServiceLocator;
import com.kubi.payment.p2p.data.source.IP2PRepository;
import com.kubi.sdk.BaseApplication;
import kotlinx.coroutines.InterfaceC41709m0;
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

/* JADX INFO: compiled from: ChatViewModel.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.payment.chat.ui.ChatViewModel$loadBlockStatus$1", m90122f = "ChatViewModel.kt", m90123i = {0}, m90124l = {91}, m90125m = "invokeSuspend", m90126n = {"repository"}, m90127s = {"L$0"})
public final class ChatViewModel$loadBlockStatus$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $orderId;
    Object L$0;
    int label;
    final /* synthetic */ ChatViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatViewModel$loadBlockStatus$1(String str, ChatViewModel chatViewModel, Continuation<? super ChatViewModel$loadBlockStatus$1> continuation) {
        super(2, continuation);
        this.$orderId = str;
        this.this$0 = chatViewModel;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ChatViewModel$loadBlockStatus$1(this.$orderId, this.this$0, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((ChatViewModel$loadBlockStatus$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
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
            String str = this.$orderId;
            if (str != null && str.length() != 0) {
                IP2PRepository iP2PRepositoryM48466d = P2PServiceLocator.m48466d(BaseApplication.INSTANCE.get());
                String str2 = this.$orderId;
                this.L$0 = SpillingKt.nullOutSpilledVariable(iP2PRepositoryM48466d);
                this.label = 1;
                obj = iP2PRepositoryM48466d.mo48478R(str2, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                return Unit.INSTANCE;
            }
        }
        AbstractC42878k abstractC42878k = (AbstractC42878k) obj;
        if (abstractC42878k instanceof AbstractC42878k.Success) {
            this.this$0.f38456Z.postValue((String) ((AbstractC42878k.Success) abstractC42878k).m94040a());
        } else if (abstractC42878k instanceof AbstractC42878k.Error) {
            C19331c.m42836c(((AbstractC42878k.Error) abstractC42878k).getException(), null, 2, null);
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return Unit.INSTANCE;
    }
}
