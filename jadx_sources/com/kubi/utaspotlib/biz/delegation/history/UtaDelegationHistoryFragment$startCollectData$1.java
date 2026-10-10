package com.kubi.utaspotlib.biz.delegation.history;

import com.kubi.core.biz.order.record.history.DelegationTradeAccount;
import com.kubi.core.biz.order.record.history.UiState;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.flow.C41636g;
import kotlinx.coroutines.flow.InterfaceC41634e;
import p660ud.FilterData;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: UtaDelegationHistoryFragment.kt */
/* JADX INFO: loaded from: classes54.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.utaspotlib.biz.delegation.history.UtaDelegationHistoryFragment$startCollectData$1", m90122f = "UtaDelegationHistoryFragment.kt", m90123i = {}, m90124l = {275, 283}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class UtaDelegationHistoryFragment$startCollectData$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ UtaDelegationHistoryFragment this$0;

    /* JADX INFO: renamed from: com.kubi.utaspotlib.biz.delegation.history.UtaDelegationHistoryFragment$startCollectData$1$2 */
    /* JADX INFO: compiled from: UtaDelegationHistoryFragment.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", "Lcom/kubi/core/biz/order/record/history/HistoryDelegationContract$UiState;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.utaspotlib.biz.delegation.history.UtaDelegationHistoryFragment$startCollectData$1$2", m90122f = "UtaDelegationHistoryFragment.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C268822 extends SuspendLambda implements Function2<UiState, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ UtaDelegationHistoryFragment this$0;

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(UiState uiState, Continuation<? super Unit> continuation) {
            return ((C268822) create(uiState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C268822(UtaDelegationHistoryFragment utaDelegationHistoryFragment, Continuation<? super C268822> continuation) {
            super(2, continuation);
            this.this$0 = utaDelegationHistoryFragment;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C268822(this.this$0, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                this.this$0.mo15906F3();
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: renamed from: com.kubi.utaspotlib.biz.delegation.history.UtaDelegationHistoryFragment$startCollectData$1$4 */
    /* JADX INFO: compiled from: UtaDelegationHistoryFragment.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", "Lcom/kubi/core/biz/order/record/history/HistoryDelegationContract$UiState;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.utaspotlib.biz.delegation.history.UtaDelegationHistoryFragment$startCollectData$1$4", m90122f = "UtaDelegationHistoryFragment.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C268834 extends SuspendLambda implements Function2<UiState, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ UtaDelegationHistoryFragment this$0;

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(UiState uiState, Continuation<? super Unit> continuation) {
            return ((C268834) create(uiState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C268834(UtaDelegationHistoryFragment utaDelegationHistoryFragment, Continuation<? super C268834> continuation) {
            super(2, continuation);
            this.this$0 = utaDelegationHistoryFragment;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C268834 c268834 = new C268834(this.this$0, continuation);
            c268834.L$0 = obj;
            return c268834;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            UiState uiState = (UiState) this.L$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            this.this$0.m66112K4(uiState.getAccount());
            this.this$0.mo15906F3();
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UtaDelegationHistoryFragment$startCollectData$1(UtaDelegationHistoryFragment utaDelegationHistoryFragment, Continuation<? super UtaDelegationHistoryFragment$startCollectData$1> continuation) {
        super(2, continuation);
        this.this$0 = utaDelegationHistoryFragment;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new UtaDelegationHistoryFragment$startCollectData$1(this.this$0, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((UtaDelegationHistoryFragment$startCollectData$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: g */
    public static final FilterData m66119g(UiState uiState) {
        return uiState.getFilterData();
    }

    /* JADX INFO: renamed from: h */
    public static final DelegationTradeAccount m66120h(UiState uiState) {
        return uiState.getAccount();
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0065, code lost:
    
        if (kotlinx.coroutines.flow.C41636g.m90925l(r7, r1, r6) == r0) goto L15;
     */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(obj);
        InterfaceC41634e interfaceC41634eM90941x = C41636g.m90941x(this.this$0.m66115k4().m22241o(), new Function1() { // from class: com.kubi.utaspotlib.biz.delegation.history.s
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return UtaDelegationHistoryFragment$startCollectData$1.m66119g((UiState) obj2);
            }
        });
        C268822 c268822 = new C268822(this.this$0, null);
        this.label = 1;
        if (C41636g.m90925l(interfaceC41634eM90941x, c268822, this) != coroutine_suspended) {
        }
        return coroutine_suspended;
        InterfaceC41634e interfaceC41634eM90941x2 = C41636g.m90941x(this.this$0.m66115k4().m22241o(), new Function1() { // from class: com.kubi.utaspotlib.biz.delegation.history.t
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return UtaDelegationHistoryFragment$startCollectData$1.m66120h((UiState) obj2);
            }
        });
        C268834 c268834 = new C268834(this.this$0, null);
        this.label = 2;
    }
}
