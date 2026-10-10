package com.kubi.utaspotlib.biz.delegation.history;

import com.kubi.core.biz.order.record.history.DelegationTradeAccount;
import com.kubi.core.biz.order.record.history.UiState;
import com.kubi.utaspotlib.R$id;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.flow.C41636g;
import kotlinx.coroutines.flow.InterfaceC41634e;
import p852kotlin.Metadata;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: UtaDelegationHistoryContainerFragment.kt */
/* JADX INFO: loaded from: classes54.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.utaspotlib.biz.delegation.history.UtaDelegationHistoryContainerFragment$collectData$1", m90122f = "UtaDelegationHistoryContainerFragment.kt", m90123i = {}, m90124l = {62}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class UtaDelegationHistoryContainerFragment$collectData$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ UtaDelegationHistoryContainerFragment this$0;

    /* JADX INFO: renamed from: com.kubi.utaspotlib.biz.delegation.history.UtaDelegationHistoryContainerFragment$collectData$1$2 */
    /* JADX INFO: compiled from: UtaDelegationHistoryContainerFragment.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", "Lcom/kubi/core/biz/order/record/history/HistoryDelegationContract$UiState;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.utaspotlib.biz.delegation.history.UtaDelegationHistoryContainerFragment$collectData$1$2", m90122f = "UtaDelegationHistoryContainerFragment.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C268712 extends SuspendLambda implements Function2<UiState, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ UtaDelegationHistoryContainerFragment this$0;

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(UiState uiState, Continuation<? super Unit> continuation) {
            return ((C268712) create(uiState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C268712(UtaDelegationHistoryContainerFragment utaDelegationHistoryContainerFragment, Continuation<? super C268712> continuation) {
            super(2, continuation);
            this.this$0 = utaDelegationHistoryContainerFragment;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C268712 c268712 = new C268712(this.this$0, continuation);
            c268712.L$0 = obj;
            return c268712;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            UiState uiState = (UiState) this.L$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            DelegationTradeAccount account = uiState.getAccount();
            if (account instanceof DelegationTradeAccount.b) {
                this.this$0.getChildFragmentManager().beginTransaction().replace(R$id.fragmentContainer, this.this$0.m66053t3()).commitNowAllowingStateLoss();
            } else {
                if (!(account instanceof DelegationTradeAccount.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                this.this$0.getChildFragmentManager().beginTransaction().replace(R$id.fragmentContainer, this.this$0.m66052r3()).commitNowAllowingStateLoss();
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UtaDelegationHistoryContainerFragment$collectData$1(UtaDelegationHistoryContainerFragment utaDelegationHistoryContainerFragment, Continuation<? super UtaDelegationHistoryContainerFragment$collectData$1> continuation) {
        super(2, continuation);
        this.this$0 = utaDelegationHistoryContainerFragment;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new UtaDelegationHistoryContainerFragment$collectData$1(this.this$0, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((UtaDelegationHistoryContainerFragment$collectData$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: f */
    public static final DelegationTradeAccount m66057f(UiState uiState) {
        return uiState.getAccount();
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
            InterfaceC41634e interfaceC41634eM90941x = C41636g.m90941x(this.this$0.m66048q3().m22241o(), new Function1() { // from class: com.kubi.utaspotlib.biz.delegation.history.c
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return UtaDelegationHistoryContainerFragment$collectData$1.m66057f((UiState) obj2);
                }
            });
            C268712 c268712 = new C268712(this.this$0, null);
            this.label = 1;
            if (C41636g.m90925l(interfaceC41634eM90941x, c268712, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
