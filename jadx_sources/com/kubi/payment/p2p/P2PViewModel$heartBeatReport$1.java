package com.kubi.payment.p2p;

import com.kubi.otc.service.OtcDepend;
import com.kubi.payment.p2p.data.source.IP2PRepository;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import ro.C44128b;

/* JADX INFO: compiled from: P2PViewModel.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.payment.p2p.P2PViewModel$heartBeatReport$1", m90122f = "P2PViewModel.kt", m90123i = {}, m90124l = {64}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class P2PViewModel$heartBeatReport$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ P2PViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P2PViewModel$heartBeatReport$1(P2PViewModel p2PViewModel, Continuation<? super P2PViewModel$heartBeatReport$1> continuation) {
        super(2, continuation);
        this.this$0 = p2PViewModel;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new P2PViewModel$heartBeatReport$1(this.this$0, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((P2PViewModel$heartBeatReport$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
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
                if (!OtcDepend.f38138a.m45466o()) {
                    return Unit.INSTANCE;
                }
                if (!this.this$0.f39694c0) {
                    this.this$0.f39694c0 = true;
                    IP2PRepository iP2PRepository = this.this$0.f39691Z;
                    this.label = 1;
                    if (iP2PRepository.mo48477O(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    return Unit.INSTANCE;
                }
            }
        } catch (Exception e11) {
            C44128b.m97260d("P2PViewModel heartBeatReport exception: " + e11.getMessage());
        } finally {
            this.this$0.f39694c0 = false;
        }
        return Unit.INSTANCE;
    }
}
