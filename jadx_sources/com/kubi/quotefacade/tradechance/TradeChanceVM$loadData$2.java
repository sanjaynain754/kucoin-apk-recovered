package com.kubi.quotefacade.tradechance;

import com.kubi.quotefacade.entity.ChanceDiscoverConfig;
import com.kubi.quotefacade.entity.ChancePlateEntity;
import com.kubi.quotefacade.helper.QuoteBusinessConfigHelp;
import java.util.ArrayList;
import java.util.List;
import kotlinx.coroutines.AwaitKt;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: TradeChanceVM.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001*\u00020\u0003H\n"}, m90084d2 = {"<anonymous>", "", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.quotefacade.tradechance.TradeChanceVM$loadData$2", m90122f = "TradeChanceVM.kt", m90123i = {0, 0, 0}, m90124l = {133}, m90125m = "invokeSuspend", m90126n = {"$this$withContext", "list", "includeMarket"}, m90127s = {"L$0", "L$1", "L$2"})
public final class TradeChanceVM$loadData$2 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super List<? extends Object>>, Object> {
    final /* synthetic */ List<ITradeChanceDataItem> $dataList;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ TradeChanceVM this$0;

    /* JADX INFO: renamed from: com.kubi.quotefacade.tradechance.TradeChanceVM$loadData$2$1 */
    /* JADX INFO: compiled from: TradeChanceVM.kt */
    @Metadata(m90083d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m90084d2 = {"<anonymous>", ""}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.quotefacade.tradechance.TradeChanceVM$loadData$2$1", m90122f = "TradeChanceVM.kt", m90123i = {}, m90124l = {91}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C225401 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
        Object L$0;
        int label;
        final /* synthetic */ TradeChanceVM this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C225401(TradeChanceVM tradeChanceVM, Continuation<? super C225401> continuation) {
            super(1, continuation);
            this.this$0 = tradeChanceVM;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return new C225401(this.this$0, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super Unit> continuation) {
            return ((C225401) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            TradeChanceVM tradeChanceVM;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.label;
            if (i11 != 0) {
                if (i11 == 1) {
                    tradeChanceVM = (TradeChanceVM) this.L$0;
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                TradeChanceVM tradeChanceVM2 = this.this$0;
                this.L$0 = tradeChanceVM2;
                this.label = 1;
                Object objM53086J = tradeChanceVM2.m53086J(this);
                if (objM53086J == coroutine_suspended) {
                    return coroutine_suspended;
                }
                tradeChanceVM = tradeChanceVM2;
                obj = objM53086J;
            }
            tradeChanceVM.f42616h0 = (ChanceDiscoverConfig) obj;
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.kubi.quotefacade.tradechance.TradeChanceVM$loadData$2$2 */
    /* JADX INFO: compiled from: TradeChanceVM.kt */
    @Metadata(m90083d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m90084d2 = {"<anonymous>", ""}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.quotefacade.tradechance.TradeChanceVM$loadData$2$2", m90122f = "TradeChanceVM.kt", m90123i = {}, m90124l = {94}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C225412 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
        final /* synthetic */ List<ITradeChanceDataItem> $dataList;
        int label;
        final /* synthetic */ TradeChanceVM this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C225412(TradeChanceVM tradeChanceVM, List<ITradeChanceDataItem> list, Continuation<? super C225412> continuation) {
            super(1, continuation);
            this.this$0 = tradeChanceVM;
            this.$dataList = list;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return new C225412(this.this$0, this.$dataList, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super Unit> continuation) {
            return ((C225412) create(continuation)).invokeSuspend(Unit.INSTANCE);
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
                TradeChanceVM tradeChanceVM = this.this$0;
                this.label = 1;
                obj = tradeChanceVM.m53097c0(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            ChancePlateEntity chancePlateEntity = (ChancePlateEntity) obj;
            if (this.this$0.f42615g0.get() || chancePlateEntity != null) {
                this.$dataList.add(new ChanceDataPlate(chancePlateEntity));
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.kubi.quotefacade.tradechance.TradeChanceVM$loadData$2$3 */
    /* JADX INFO: compiled from: TradeChanceVM.kt */
    @Metadata(m90083d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m90084d2 = {"<anonymous>", ""}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.quotefacade.tradechance.TradeChanceVM$loadData$2$3", m90122f = "TradeChanceVM.kt", m90123i = {}, m90124l = {112}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C225423 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
        final /* synthetic */ List<ITradeChanceDataItem> $dataList;
        final /* synthetic */ String $includeMarket;
        int label;
        final /* synthetic */ TradeChanceVM this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C225423(TradeChanceVM tradeChanceVM, String str, List<ITradeChanceDataItem> list, Continuation<? super C225423> continuation) {
            super(1, continuation);
            this.this$0 = tradeChanceVM;
            this.$includeMarket = str;
            this.$dataList = list;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return new C225423(this.this$0, this.$includeMarket, this.$dataList, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super Unit> continuation) {
            return ((C225423) create(continuation)).invokeSuspend(Unit.INSTANCE);
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
                TradeChanceVM tradeChanceVM = this.this$0;
                String str = this.$includeMarket;
                this.label = 1;
                obj = tradeChanceVM.m53095Y(str, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            List list = (List) obj;
            if (this.this$0.f42615g0.get() || list != null) {
                this.$dataList.add(new ChanceDataMarketChange(list));
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.kubi.quotefacade.tradechance.TradeChanceVM$loadData$2$4 */
    /* JADX INFO: compiled from: TradeChanceVM.kt */
    @Metadata(m90083d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m90084d2 = {"<anonymous>", ""}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.quotefacade.tradechance.TradeChanceVM$loadData$2$4", m90122f = "TradeChanceVM.kt", m90123i = {}, m90124l = {121}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C225434 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
        final /* synthetic */ List<ITradeChanceDataItem> $dataList;
        final /* synthetic */ String $includeMarket;
        int label;
        final /* synthetic */ TradeChanceVM this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C225434(TradeChanceVM tradeChanceVM, String str, List<ITradeChanceDataItem> list, Continuation<? super C225434> continuation) {
            super(1, continuation);
            this.this$0 = tradeChanceVM;
            this.$includeMarket = str;
            this.$dataList = list;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return new C225434(this.this$0, this.$includeMarket, this.$dataList, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super Unit> continuation) {
            return ((C225434) create(continuation)).invokeSuspend(Unit.INSTANCE);
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
                TradeChanceVM tradeChanceVM = this.this$0;
                String str = this.$includeMarket;
                this.label = 1;
                obj = tradeChanceVM.m53099f0(str, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            List list = (List) obj;
            if (this.this$0.f42615g0.get() || list != null) {
                this.$dataList.add(new ChanceDataWhale(list));
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TradeChanceVM$loadData$2(TradeChanceVM tradeChanceVM, List<ITradeChanceDataItem> list, Continuation<? super TradeChanceVM$loadData$2> continuation) {
        super(2, continuation);
        this.this$0 = tradeChanceVM;
        this.$dataList = list;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        TradeChanceVM$loadData$2 tradeChanceVM$loadData$2 = new TradeChanceVM$loadData$2(this.this$0, this.$dataList, continuation);
        tradeChanceVM$loadData$2.L$0 = obj;
        return tradeChanceVM$loadData$2;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super List<? extends Object>> continuation) {
        return ((TradeChanceVM$loadData$2) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        InterfaceC41709m0 interfaceC41709m0 = (InterfaceC41709m0) this.L$0;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return obj;
        }
        ResultKt.throwOnFailure(obj);
        ArrayList arrayList = new ArrayList();
        TradeChanceVM tradeChanceVM = this.this$0;
        tradeChanceVM.m53085I(interfaceC41709m0, true, arrayList, new C225401(tradeChanceVM, null));
        TradeChanceVM tradeChanceVM2 = this.this$0;
        tradeChanceVM2.m53085I(interfaceC41709m0, tradeChanceVM2.m53090S(), arrayList, new C225412(this.this$0, this.$dataList, null));
        String strM51845i = QuoteBusinessConfigHelp.f41933a.m51845i();
        TradeChanceVM tradeChanceVM3 = this.this$0;
        tradeChanceVM3.m53085I(interfaceC41709m0, tradeChanceVM3.m53089R(), arrayList, new C225423(this.this$0, strM51845i, this.$dataList, null));
        TradeChanceVM tradeChanceVM4 = this.this$0;
        tradeChanceVM4.m53085I(interfaceC41709m0, tradeChanceVM4.m53091T(), arrayList, new C225434(this.this$0, strM51845i, this.$dataList, null));
        this.L$0 = SpillingKt.nullOutSpilledVariable(interfaceC41709m0);
        this.L$1 = SpillingKt.nullOutSpilledVariable(arrayList);
        this.L$2 = SpillingKt.nullOutSpilledVariable(strM51845i);
        this.label = 1;
        Object objM90345a = AwaitKt.m90345a(arrayList, this);
        return objM90345a == coroutine_suspended ? coroutine_suspended : objM90345a;
    }
}
