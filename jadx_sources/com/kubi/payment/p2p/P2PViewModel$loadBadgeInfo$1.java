package com.kubi.payment.p2p;

import com.kubi.payment.p2p.data.source.IP2PRepository;
import kotlinx.coroutines.InterfaceC41709m0;
import p477nt.AbstractC42878k;
import p852kotlin.Metadata;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: P2PViewModel.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.payment.p2p.P2PViewModel$loadBadgeInfo$1", m90122f = "P2PViewModel.kt", m90123i = {}, m90124l = {37}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class P2PViewModel$loadBadgeInfo$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ P2PViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P2PViewModel$loadBadgeInfo$1(P2PViewModel p2PViewModel, Continuation<? super P2PViewModel$loadBadgeInfo$1> continuation) {
        super(2, continuation);
        this.this$0 = p2PViewModel;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new P2PViewModel$loadBadgeInfo$1(this.this$0, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((P2PViewModel$loadBadgeInfo$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
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
            if (!this.this$0.f39693b0) {
                this.this$0.f39693b0 = true;
                IP2PRepository iP2PRepository = this.this$0.f39691Z;
                this.label = 1;
                obj = iP2PRepository.mo48495t(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                return Unit.INSTANCE;
            }
        }
        AbstractC42878k abstractC42878k = (AbstractC42878k) obj;
        if (abstractC42878k instanceof AbstractC42878k.Success) {
            this.this$0.m48462A().setValue(((AbstractC42878k.Success) abstractC42878k).m94040a());
        } else if (abstractC42878k instanceof AbstractC42878k.Error) {
            this.this$0.m45659r().setValue(((AbstractC42878k.Error) abstractC42878k).getException());
        } else {
            throw new NoWhenBranchMatchedException();
        }
        this.this$0.f39693b0 = false;
        return Unit.INSTANCE;
    }
}
