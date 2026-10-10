package com.kubi.core.biz.bottomtab.order.child;

import com.kubi.core.biz.bottomtab.order.InterfaceC11746a;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.flow.C41636g;
import kotlinx.coroutines.flow.InterfaceC41634e;
import kotlinx.coroutines.flow.InterfaceC41635f;
import p852kotlin.Metadata;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import ro.C44128b;

/* JADX INFO: compiled from: BottomOrderListFragment.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.core.biz.bottomtab.order.child.BottomOrderListFragment$startCollectData$1", m90122f = "BottomOrderListFragment.kt", m90123i = {}, m90124l = {306}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class BottomOrderListFragment$startCollectData$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ BottomOrderListFragment this$0;

    /* JADX INFO: renamed from: com.kubi.core.biz.bottomtab.order.child.BottomOrderListFragment$startCollectData$1$a */
    /* JADX INFO: compiled from: BottomOrderListFragment.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C11749a<T> implements InterfaceC41635f {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ BottomOrderListFragment f20238b;

        public C11749a(BottomOrderListFragment bottomOrderListFragment) {
            this.f20238b = bottomOrderListFragment;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC41635f
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object emit(InterfaceC11746a interfaceC11746a, Continuation<? super Unit> continuation) {
            if (interfaceC11746a instanceof InterfaceC11746a.UpdateDepositEntrance) {
                InterfaceC11746a.UpdateDepositEntrance updateDepositEntrance = (InterfaceC11746a.UpdateDepositEntrance) interfaceC11746a;
                this.f20238b.m21469N4(updateDepositEntrance.getNeedGuideDeposit(), updateDepositEntrance.getQuoteBalanceDisplayStr(), updateDepositEntrance.getCurrency(), updateDepositEntrance.getQuoteBalance());
            } else {
                if (!(interfaceC11746a instanceof InterfaceC11746a.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                C44128b.m97258b("BottomOrderListFragment -> startCollectData -> " + this.f20238b.m21459m4() + ", " + this.f20238b);
                this.f20238b.mo15906F3();
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BottomOrderListFragment$startCollectData$1(BottomOrderListFragment bottomOrderListFragment, Continuation<? super BottomOrderListFragment$startCollectData$1> continuation) {
        super(2, continuation);
        this.this$0 = bottomOrderListFragment;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BottomOrderListFragment$startCollectData$1(this.this$0, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((BottomOrderListFragment$startCollectData$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
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
            InterfaceC41634e interfaceC41634eM90881E = C41636g.m90881E(this.this$0.m21474l4().m21413D());
            C11749a c11749a = new C11749a(this.this$0);
            this.label = 1;
            if (interfaceC41634eM90881E.collect(c11749a, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
