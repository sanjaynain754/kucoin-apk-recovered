package com.kubi.payment.chat.p105ui;

import com.kubi.payment.p2p.P2PServiceLocator;
import com.kubi.payment.p2p.data.source.IP2PRepository;
import com.kubi.sdk.BaseApplication;
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
import ro.C44128b;

/* JADX INFO: compiled from: ChatViewModel.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.payment.chat.ui.ChatViewModel$heartBeatReport$1", m90122f = "ChatViewModel.kt", m90123i = {0}, m90124l = {158}, m90125m = "invokeSuspend", m90126n = {"repository"}, m90127s = {"L$0"})
public final class ChatViewModel$heartBeatReport$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    Object L$0;
    int label;

    public ChatViewModel$heartBeatReport$1(Continuation<? super ChatViewModel$heartBeatReport$1> continuation) {
        super(2, continuation);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ChatViewModel$heartBeatReport$1(continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((ChatViewModel$heartBeatReport$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        try {
            if (i11 != 0) {
                if (i11 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                IP2PRepository iP2PRepositoryM48466d = P2PServiceLocator.m48466d(BaseApplication.INSTANCE.get());
                this.L$0 = SpillingKt.nullOutSpilledVariable(iP2PRepositoryM48466d);
                this.label = 1;
                if (iP2PRepositoryM48466d.mo48477O(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } catch (Exception e11) {
            C44128b.m97260d("ChatViewModel heartBeatReport exception: " + e11.getMessage());
        }
        return Unit.INSTANCE;
    }
}
