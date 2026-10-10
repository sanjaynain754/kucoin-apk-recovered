package com.kubi.tradebase.orderbook;

import com.kubi.data.entity.OrderBookEntity;
import com.kubi.data.entity.OrderBookIndex;
import com.kubi.resources.widget.OrderBookType;
import com.kubi.utils.extensions.C27039d;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlinx.coroutines.AbstractC41697j0;
import kotlinx.coroutines.C41686h;
import kotlinx.coroutines.InterfaceC41709m0;
import o00.C42911a;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: OrderBookViewModel.kt */
/* JADX INFO: loaded from: classes48.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.tradebase.orderbook.OrderBookViewModel$calculateOrderBook$1", m90122f = "OrderBookViewModel.kt", m90123i = {0, 0, 0, 0}, m90124l = {72}, m90125m = "invokeSuspend", m90126n = {"symbol", "bidsList", "asksList", "delegationList"}, m90127s = {"L$0", "L$1", "L$2", "L$3"})
@SourceDebugExtension({"SMAP\nOrderBookViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OrderBookViewModel.kt\ncom/kubi/tradebase/orderbook/OrderBookViewModel$calculateOrderBook$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 4 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,109:1\n1563#2:110\n1634#2,2:111\n1636#2:121\n1563#2:122\n1634#2,2:123\n1636#2:133\n1563#2:134\n1634#2,3:135\n11288#3:113\n11623#3,3:114\n11288#3:125\n11623#3,3:126\n37#4:117\n36#4,3:118\n37#4:129\n36#4,3:130\n*S KotlinDebug\n*F\n+ 1 OrderBookViewModel.kt\ncom/kubi/tradebase/orderbook/OrderBookViewModel$calculateOrderBook$1\n*L\n63#1:110\n63#1:111,2\n63#1:121\n66#1:122\n66#1:123,2\n66#1:133\n69#1:134\n69#1:135,3\n64#1:113\n64#1:114,3\n67#1:125\n67#1:126,3\n64#1:117\n64#1:118,3\n67#1:129\n67#1:130,3\n*E\n"})
public final class OrderBookViewModel$calculateOrderBook$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ OrderBookEntity $ensureMutable;
    final /* synthetic */ int $maxSize;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ OrderBookViewModel this$0;

    /* JADX INFO: renamed from: com.kubi.tradebase.orderbook.OrderBookViewModel$calculateOrderBook$1$1 */
    /* JADX INFO: compiled from: OrderBookViewModel.kt */
    @Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.tradebase.orderbook.OrderBookViewModel$calculateOrderBook$1$1", m90122f = "OrderBookViewModel.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C259041 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        final /* synthetic */ List<BigDecimal[]> $asksList;
        final /* synthetic */ List<BigDecimal[]> $bidsList;
        final /* synthetic */ List<OrderBookDelegation> $delegationList;
        final /* synthetic */ int $maxSize;
        final /* synthetic */ String $symbol;
        int label;
        final /* synthetic */ OrderBookViewModel this$0;

        /* JADX INFO: renamed from: com.kubi.tradebase.orderbook.OrderBookViewModel$calculateOrderBook$1$1$a */
        /* JADX INFO: compiled from: OrderBookViewModel.kt */
        @Metadata(m90083d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u0014\u0010\u0002\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R \u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR \u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000b¨\u0006\u000e"}, m90084d2 = {"com/kubi/tradebase/orderbook/OrderBookViewModel$calculateOrderBook$1$1$1", "Lcom/kubi/tradebase/orderbook/IOrderBookData;", "symbol", "", "getSymbol", "()Ljava/lang/String;", "bids", "", "", "Ljava/math/BigDecimal;", "getBids", "()Ljava/util/List;", "asks", "getAsks", "TradeBaseLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
        public static final class a implements IOrderBookData {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ String f51598a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ List<BigDecimal[]> f51599b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ List<BigDecimal[]> f51600c;

            public a(String str, List<BigDecimal[]> list, List<BigDecimal[]> list2) {
                this.f51598a = str;
                this.f51599b = list;
                this.f51600c = list2;
            }

            @Override // com.kubi.tradebase.orderbook.IOrderBookData
            public List<BigDecimal[]> getAsks() {
                return this.f51600c;
            }

            @Override // com.kubi.tradebase.orderbook.IOrderBookData
            public List<BigDecimal[]> getBids() {
                return this.f51599b;
            }

            @Override // com.kubi.tradebase.orderbook.IOrderBookData
            /* JADX INFO: renamed from: getSymbol, reason: from getter */
            public String getF51598a() {
                return this.f51598a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C259041(OrderBookViewModel orderBookViewModel, List<OrderBookDelegation> list, int i11, String str, List<BigDecimal[]> list2, List<BigDecimal[]> list3, Continuation<? super C259041> continuation) {
            super(2, continuation);
            this.this$0 = orderBookViewModel;
            this.$delegationList = list;
            this.$maxSize = i11;
            this.$symbol = str;
            this.$bidsList = list2;
            this.$asksList = list3;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C259041(this.this$0, this.$delegationList, this.$maxSize, this.$symbol, this.$bidsList, this.$asksList, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
            return ((C259041) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Integer first;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                OrderBookDataHelper orderBookDataHelper = OrderBookDataHelper.f51601a;
                a aVar = new a(this.$symbol, this.$bidsList, this.$asksList);
                Pair<Integer, String> value = this.this$0.m63272v().getValue();
                if (value != null) {
                    first = value.getFirst();
                } else {
                    first = null;
                }
                int iM66651k = C27039d.m66651k(first, 8);
                int iM66651k2 = C27039d.m66651k(this.this$0.m63268r().getValue(), 8);
                OrderBookType value2 = this.this$0.m63270t().getValue();
                if (value2 == null) {
                    value2 = OrderBookType.C22935a.f43984b;
                }
                this.this$0.m63269s().postValue(orderBookDataHelper.m63276c(aVar, iM66651k, iM66651k2, value2, this.$delegationList, this.$maxSize));
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrderBookViewModel$calculateOrderBook$1(OrderBookEntity orderBookEntity, OrderBookViewModel orderBookViewModel, int i11, Continuation<? super OrderBookViewModel$calculateOrderBook$1> continuation) {
        super(2, continuation);
        this.$ensureMutable = orderBookEntity;
        this.this$0 = orderBookViewModel;
        this.$maxSize = i11;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OrderBookViewModel$calculateOrderBook$1(this.$ensureMutable, this.this$0, this.$maxSize, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((OrderBookViewModel$calculateOrderBook$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0085  */
    /* JADX WARN: Code duplicated, block: B:35:0x00dc  */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        List arrayList;
        List arrayList2;
        BigDecimal bigDecimal;
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
            String symbol = this.$ensureMutable.getSymbol();
            List<double[]> bids = this.$ensureMutable.getBids();
            if (bids != null) {
                ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(bids, 10));
                for (double[] dArr : bids) {
                    ArrayList arrayList4 = new ArrayList(dArr.length);
                    for (double d11 : dArr) {
                        arrayList4.add(new BigDecimal(String.valueOf(d11)));
                    }
                    arrayList3.add((BigDecimal[]) arrayList4.toArray(new BigDecimal[0]));
                }
                arrayList = CollectionsKt.toMutableList((Collection) arrayList3);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
            } else {
                arrayList = new ArrayList();
            }
            List list = arrayList;
            List<double[]> asks = this.$ensureMutable.getAsks();
            if (asks != null) {
                ArrayList arrayList5 = new ArrayList(CollectionsKt.collectionSizeOrDefault(asks, 10));
                for (double[] dArr2 : asks) {
                    ArrayList arrayList6 = new ArrayList(dArr2.length);
                    for (double d12 : dArr2) {
                        arrayList6.add(new BigDecimal(String.valueOf(d12)));
                    }
                    arrayList5.add((BigDecimal[]) arrayList6.toArray(new BigDecimal[0]));
                }
                arrayList2 = CollectionsKt.toMutableList((Collection) arrayList5);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                }
            } else {
                arrayList2 = new ArrayList();
            }
            List list2 = arrayList2;
            List<OrderBookIndex> value = this.this$0.m63266p().getValue();
            List listEmptyList = null;
            if (value != null) {
                ArrayList arrayList7 = new ArrayList(CollectionsKt.collectionSizeOrDefault(value, 10));
                for (OrderBookIndex orderBookIndex : value) {
                    boolean zIsBuy = orderBookIndex.isBuy();
                    Double price = orderBookIndex.getPrice();
                    if (price != null) {
                        bigDecimal = new BigDecimal(String.valueOf(price.doubleValue()));
                    } else {
                        bigDecimal = null;
                    }
                    arrayList7.add(new OrderBookDelegation(zIsBuy, bigDecimal, orderBookIndex.getDisplayPrice()));
                }
                listEmptyList = arrayList7;
            }
            if (listEmptyList == null) {
                listEmptyList = CollectionsKt.emptyList();
            }
            List list3 = listEmptyList;
            AbstractC41697j0 abstractC41697j0M94120b = C42911a.m94120b();
            C259041 c259041 = new C259041(this.this$0, list3, this.$maxSize, symbol, list, list2, null);
            this.L$0 = SpillingKt.nullOutSpilledVariable(symbol);
            this.L$1 = SpillingKt.nullOutSpilledVariable(list);
            this.L$2 = SpillingKt.nullOutSpilledVariable(list2);
            this.L$3 = SpillingKt.nullOutSpilledVariable(list3);
            this.label = 1;
            if (C41686h.m91049g(abstractC41697j0M94120b, c259041, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
