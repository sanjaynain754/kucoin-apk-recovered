package com.kubi.quotefacade.chain.market;

import com.kubi.mvi.common.MviExKt;
import kotlinx.coroutines.C41713n0;
import kotlinx.coroutines.DelayKt;
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

/* JADX INFO: compiled from: ChainMarketListFragment.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.quotefacade.chain.market.ChainMarketListFragment$startLoopFetchData$1$1", m90122f = "ChainMarketListFragment.kt", m90123i = {0}, m90124l = {561}, m90125m = "invokeSuspend", m90126n = {"$this$launch"}, m90127s = {"L$0"})
public final class ChainMarketListFragment$startLoopFetchData$1$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ChainMarketListFragment this$0;

    /* JADX INFO: renamed from: com.kubi.quotefacade.chain.market.ChainMarketListFragment$startLoopFetchData$1$1$1 */
    /* JADX INFO: compiled from: ChainMarketListFragment.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", ""}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.quotefacade.chain.market.ChainMarketListFragment$startLoopFetchData$1$1$1", m90122f = "ChainMarketListFragment.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C217941 extends SuspendLambda implements Function2<Integer, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ ChainMarketListFragment this$0;

        public final Object invoke(int i11, Continuation<? super Unit> continuation) {
            return ((C217941) create(Integer.valueOf(i11), continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C217941(ChainMarketListFragment chainMarketListFragment, Continuation<? super C217941> continuation) {
            super(2, continuation);
            this.this$0 = chainMarketListFragment;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C217941(this.this$0, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Integer num, Continuation<? super Unit> continuation) {
            return invoke(num.intValue(), continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                this.this$0.m50953T3();
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChainMarketListFragment$startLoopFetchData$1$1(ChainMarketListFragment chainMarketListFragment, Continuation<? super ChainMarketListFragment$startLoopFetchData$1$1> continuation) {
        super(2, continuation);
        this.this$0 = chainMarketListFragment;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ChainMarketListFragment$startLoopFetchData$1$1 chainMarketListFragment$startLoopFetchData$1$1 = new ChainMarketListFragment$startLoopFetchData$1$1(this.this$0, continuation);
        chainMarketListFragment$startLoopFetchData$1$1.L$0 = obj;
        return chainMarketListFragment$startLoopFetchData$1$1;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((ChainMarketListFragment$startLoopFetchData$1$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        InterfaceC41709m0 interfaceC41709m0 = (InterfaceC41709m0) this.L$0;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        if (i11 == 0) {
            ResultKt.throwOnFailure(obj);
            C44128b.m97266j(this.this$0.getTAG(), "startLoopLoadData delay => " + interfaceC41709m0);
            this.L$0 = interfaceC41709m0;
            this.label = 1;
            if (DelayKt.m90350b(60000L, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        if (!C41713n0.m91132h(interfaceC41709m0)) {
            return Unit.INSTANCE;
        }
        C44128b.m97266j(this.this$0.getTAG(), "startLoopLoadData delay really => " + interfaceC41709m0);
        ChainMarketListFragment chainMarketListFragment = this.this$0;
        chainMarketListFragment.f41569e0 = MviExKt.m42522r(interfaceC41709m0, Integer.MAX_VALUE, 60000L, null, null, null, new C217941(chainMarketListFragment, null), 28, null);
        return Unit.INSTANCE;
    }
}
