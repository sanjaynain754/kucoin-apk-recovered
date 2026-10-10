package com.kubi.quotefacade.market;

import com.kubi.data.entity.TradeItemBean;
import com.kubi.quotefacade.helper.CoinListSortHelper;
import io.reactivex.functions.Action;
import java.util.Collection;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.flow.C41636g;
import kotlinx.coroutines.flow.InterfaceC41634e;
import kotlinx.coroutines.flow.InterfaceC41635f;
import o00.C42911a;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.functions.Function3;
import ro.C44128b;

/* JADX INFO: compiled from: MarketListFragment.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.quotefacade.market.MarketListFragment$sortData$1", m90122f = "MarketListFragment.kt", m90123i = {}, m90124l = {651}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class MarketListFragment$sortData$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ Action $action;
    int label;
    final /* synthetic */ MarketListFragment this$0;

    /* JADX INFO: renamed from: com.kubi.quotefacade.market.MarketListFragment$sortData$1$1 */
    /* JADX INFO: compiled from: MarketListFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "", "Lcom/kubi/data/entity/TradeItemBean;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.quotefacade.market.MarketListFragment$sortData$1$1", m90122f = "MarketListFragment.kt", m90123i = {0}, m90124l = {647}, m90125m = "invokeSuspend", m90126n = {"$this$flow"}, m90127s = {"L$0"})
    public static final class C222811 extends SuspendLambda implements Function2<InterfaceC41635f<? super Collection<? extends TradeItemBean>>, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ MarketListFragment this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C222811(MarketListFragment marketListFragment, Continuation<? super C222811> continuation) {
            super(2, continuation);
            this.this$0 = marketListFragment;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C222811 c222811 = new C222811(this.this$0, continuation);
            c222811.L$0 = obj;
            return c222811;
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41635f<? super Collection<? extends TradeItemBean>> interfaceC41635f, Continuation<? super Unit> continuation) {
            return ((C222811) create(interfaceC41635f, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Collection collectionEmptyList;
            InterfaceC41635f interfaceC41635f = (InterfaceC41635f) this.L$0;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.label;
            if (i11 == 0) {
                ResultKt.throwOnFailure(obj);
                CoinListSortHelper coinListSortHelper = this.this$0.f42183Z;
                if (coinListSortHelper == null || (collectionEmptyList = CoinListSortHelper.m52010p0(coinListSortHelper, this.this$0.f42181X, false, 2, null)) == null) {
                    collectionEmptyList = CollectionsKt.emptyList();
                }
                this.L$0 = SpillingKt.nullOutSpilledVariable(interfaceC41635f);
                this.label = 1;
                if (interfaceC41635f.emit(collectionEmptyList, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.kubi.quotefacade.market.MarketListFragment$sortData$1$2 */
    /* JADX INFO: compiled from: MarketListFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\u0010\u0000\u001a\u00020\u0001*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "", "Lcom/kubi/data/entity/TradeItemBean;", "e", ""}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.quotefacade.market.MarketListFragment$sortData$1$2", m90122f = "MarketListFragment.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C222822 extends SuspendLambda implements Function3<InterfaceC41635f<? super Collection<? extends TradeItemBean>>, Throwable, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ MarketListFragment this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C222822(MarketListFragment marketListFragment, Continuation<? super C222822> continuation) {
            super(3, continuation);
            this.this$0 = marketListFragment;
        }

        @Override // p852kotlin.jvm.functions.Function3
        public final Object invoke(InterfaceC41635f<? super Collection<? extends TradeItemBean>> interfaceC41635f, Throwable th2, Continuation<? super Unit> continuation) {
            C222822 c222822 = new C222822(this.this$0, continuation);
            c222822.L$0 = th2;
            return c222822.invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Throwable th2 = (Throwable) this.L$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            C44128b.m97266j(this.this$0.getTAG(), "sortData error:" + th2.getMessage());
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.kubi.quotefacade.market.MarketListFragment$sortData$1$a */
    /* JADX INFO: compiled from: MarketListFragment.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C22283a<T> implements InterfaceC41635f {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ MarketListFragment f42193b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ Action f42194c;

        public C22283a(MarketListFragment marketListFragment, Action action) {
            this.f42193b = marketListFragment;
            this.f42194c = action;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC41635f
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object emit(Collection<? extends TradeItemBean> collection, Continuation<? super Unit> continuation) throws Exception {
            this.f42193b.m52326l4().replaceData(CollectionsKt.toList(collection));
            Action action = this.f42194c;
            if (action != null) {
                action.run();
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarketListFragment$sortData$1(MarketListFragment marketListFragment, Action action, Continuation<? super MarketListFragment$sortData$1> continuation) {
        super(2, continuation);
        this.this$0 = marketListFragment;
        this.$action = action;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MarketListFragment$sortData$1(this.this$0, this.$action, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((MarketListFragment$sortData$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
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
            InterfaceC41634e interfaceC41634eM90917h = C41636g.m90917h(C41636g.m90890N(C41636g.m90887K(new C222811(this.this$0, null)), C42911a.m94119a()), new C222822(this.this$0, null));
            C22283a c22283a = new C22283a(this.this$0, this.$action);
            this.label = 1;
            if (interfaceC41634eM90917h.collect(c22283a, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
