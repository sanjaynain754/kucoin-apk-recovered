package com.kubi.kucoin.manager;

import cn.jiguang.privates.push.constants.JPushConstants;
import com.kubi.data.entity.OrderBookEntity;
import com.kubi.network.restful.C19321b;
import com.kucoin.spot.call.auction.core.model.proto.CallAuctionLevel2Proto;
import com.spot.market.protobuf.Level2AggregationPb;
import com.spot.market.protobuf.Level2Entry;
import com.spot.market.protobuf.MatchWsMsgPb;
import er.C37237b;
import gr.C38000b;
import gr.C38003e;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.flow.C41636g;
import kotlinx.coroutines.flow.InterfaceC41634e;
import kotlinx.coroutines.flow.InterfaceC41635f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.comparisons.ComparisonsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;

/* JADX INFO: compiled from: SpotMarketPbWsApi.kt */
/* JADX INFO: loaded from: classes18.dex */
@Metadata(m90083d1 = {"\u0000j\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0010\u0013\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0006\u0010\u0005\u001a\u00020\u0006\u001a\b\u0010\u0007\u001a\u00020\bH\u0000\u001a\u000e\u0010\t\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u0001\u001a\u001e\u0010\u000b\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\b\u001a\u000e\u0010\u000f\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u0001\u001a\u001c\u0010\u0010\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0018\u00010\u0011*\u00020\u00062\u0006\u0010\n\u001a\u00020\u0001\u001a*\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0011*\u00020\u00062\u0006\u0010\n\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\b\u001a\u001a\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0011*\u00020\u00062\u0006\u0010\n\u001a\u00020\u0001\u001a\n\u0010\u0016\u001a\u00020\u0012*\u00020\u0017\u001a\n\u0010\u0018\u001a\u00020\u0019*\u00020\u001a\u001a\u0012\u0010\u001b\u001a\u00020\u0014*\u00020\u001c2\u0006\u0010\n\u001a\u00020\u0001\u001a\u001c\u0010\u001b\u001a\u00020\u0014*\u00020\u001d2\u0006\u0010\n\u001a\u00020\u00012\b\b\u0002\u0010\u001e\u001a\u00020\u001f\u001a\u0012\u0010\u001b\u001a\u00020\u0014*\u00020 2\u0006\u0010\n\u001a\u00020\u0001\u001a\u0018\u0010!\u001a\b\u0012\u0004\u0012\u00020#0\"*\b\u0012\u0004\u0012\u00020%0$H\u0002\u001a\u0018\u0010&\u001a\b\u0012\u0004\u0012\u00020#0\"*\b\u0012\u0004\u0012\u00020\u00010$H\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000¨\u0006'"}, m90084d2 = {"SPOT_MATCH_PB_PREFIX", "", "SPOT_LEVEL2_DEPTH50_PB_PREFIX", "SPOT_LEVEL2_DEPTH50_1S_PB_PREFIX", "SPOT_CALL_AUCTION_LEVEL2_PB_PREFIX", "buildSpotMarketPbWsApi", "Lcom/kubi/kucoin/manager/ISpotMarketPbWsApi;", "tradePbV1Enable", "", "buildSpotMatchTopic", "symbol", "buildSpotLevel2Topic", "precision", "", "lowDevice", "buildSpotCallAuctionLevel2Topic", "matchEntityFlow", "Lkotlinx/coroutines/flow/Flow;", "Lcom/kubi/kucoin/manager/SpotMatchPushEntity;", "level2EntityFlow", "Lcom/kubi/data/entity/OrderBookEntity;", "callAuctionLevel2EntityFlow", "toSpotMatchPushEntity", "Lcom/spot/market/protobuf/MatchWsMsgPb;", "toSpotCandlePushEntity", "Lcom/kubi/kucoin/manager/SpotCandlePushEntity;", "Lcom/spot/kline/core/model/proto/CandleProtoApp;", "toOrderBookEntity", "Lcom/spot/market/protobuf/Level2AggregationPb;", "Lcom/spot/market/protobuf/Level2Pb;", JPushConstants.Operation.KEY_SEQUENCE, "", "Lcom/kucoin/spot/call/auction/core/model/proto/CallAuctionLevel2Proto;", "toOrderBookLevels", "", "", "", "Lcom/spot/market/protobuf/Level2Entry;", "toCallAuctionOrderBookLevels", "LDataProvider_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSpotMarketPbWsApi.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SpotMarketPbWsApi.kt\ncom/kubi/kucoin/manager/SpotMarketPbWsApiKt\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,203:1\n49#2:204\n51#2:208\n49#2:209\n51#2:213\n49#2:214\n51#2:218\n46#3:205\n51#3:207\n46#3:210\n51#3:212\n46#3:215\n51#3:217\n105#4:206\n105#4:211\n105#4:216\n1563#5:219\n1634#5,3:220\n1068#5:223\n1617#5,9:224\n1869#5:233\n774#5:234\n865#5,2:235\n1870#5:238\n1626#5:239\n1068#5:240\n1617#5,9:241\n1869#5:250\n1870#5:252\n1626#5:253\n1068#5:254\n1#6:237\n1#6:251\n*S KotlinDebug\n*F\n+ 1 SpotMarketPbWsApi.kt\ncom/kubi/kucoin/manager/SpotMarketPbWsApiKt\n*L\n85#1:204\n85#1:208\n96#1:209\n96#1:213\n102#1:214\n102#1:218\n85#1:205\n85#1:207\n96#1:210\n96#1:212\n102#1:215\n102#1:217\n85#1:206\n96#1:211\n102#1:216\n171#1:219\n171#1:220,3\n173#1:223\n178#1:224,9\n178#1:233\n183#1:234\n183#1:235,2\n178#1:238\n178#1:239\n191#1:240\n195#1:241,9\n195#1:250\n195#1:252\n195#1:253\n200#1:254\n178#1:237\n195#1:251\n*E\n"})
public final class SpotMarketPbWsApiKt {

    /* JADX INFO: renamed from: com.kubi.kucoin.manager.SpotMarketPbWsApiKt$a */
    /* JADX INFO: compiled from: Comparisons.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareByDescending$1\n+ 2 SpotMarketPbWsApi.kt\ncom/kubi/kucoin/manager/SpotMarketPbWsApiKt\n*L\n1#1,328:1\n191#2:329\n*E\n"})
    public static final class C15477a<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t11, T t12) {
            return ComparisonsKt.compareValues(Double.valueOf(((double[]) t12)[0]), Double.valueOf(((double[]) t11)[0]));
        }
    }

    /* JADX INFO: renamed from: com.kubi.kucoin.manager.SpotMarketPbWsApiKt$b */
    /* JADX INFO: compiled from: Comparisons.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareByDescending$1\n+ 2 SpotMarketPbWsApi.kt\ncom/kubi/kucoin/manager/SpotMarketPbWsApiKt\n*L\n1#1,328:1\n200#2:329\n*E\n"})
    public static final class C15478b<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t11, T t12) {
            return ComparisonsKt.compareValues(Double.valueOf(((double[]) t12)[0]), Double.valueOf(((double[]) t11)[0]));
        }
    }

    /* JADX INFO: renamed from: com.kubi.kucoin.manager.SpotMarketPbWsApiKt$c */
    /* JADX INFO: compiled from: Comparisons.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareByDescending$1\n+ 2 SpotMarketPbWsApi.kt\ncom/kubi/kucoin/manager/SpotMarketPbWsApiKt\n*L\n1#1,328:1\n173#2:329\n*E\n"})
    public static final class C15479c<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t11, T t12) {
            return ComparisonsKt.compareValues(Double.valueOf(((double[]) t12)[0]), Double.valueOf(((double[]) t11)[0]));
        }
    }

    /* JADX INFO: renamed from: h */
    public static final List<double[]> m32557h(List<String> list) {
        String str;
        double[] dArr;
        if (list.isEmpty()) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (true) {
            double[] dArr2 = null;
            if (!it.hasNext()) {
                break;
            }
            List listSplit$default = StringsKt.split$default((CharSequence) StringsKt.removeSuffix(StringsKt.removePrefix(StringsKt.trim((CharSequence) it.next()).toString(), (CharSequence) "["), (CharSequence) "]"), new char[]{',', '|', ';', ':', ' ', '\t'}, false, 0, 6, (Object) null);
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : listSplit$default) {
                if (!StringsKt.isBlank((String) obj)) {
                    arrayList2.add(obj);
                }
            }
            if (arrayList2.size() >= 2) {
                Double doubleOrNull = StringsKt.toDoubleOrNull((String) arrayList2.get(0));
                double dDoubleValue = doubleOrNull != null ? doubleOrNull.doubleValue() : 0.0d;
                Double doubleOrNull2 = StringsKt.toDoubleOrNull((String) arrayList2.get(1));
                dArr2 = new double[]{dDoubleValue, doubleOrNull2 != null ? doubleOrNull2.doubleValue() : 0.0d};
            }
            if (dArr2 != null) {
                arrayList.add(dArr2);
            }
        }
        if (!arrayList.isEmpty()) {
            return CollectionsKt.toMutableList((Collection) CollectionsKt.sortedWith(arrayList, new C15477a()));
        }
        List<List> listChunked = CollectionsKt.chunked(list, 2);
        ArrayList arrayList3 = new ArrayList();
        for (List list2 : listChunked) {
            String str2 = (String) CollectionsKt.getOrNull(list2, 0);
            if (str2 == null || (str = (String) CollectionsKt.getOrNull(list2, 1)) == null) {
                dArr = null;
            } else {
                Double doubleOrNull3 = StringsKt.toDoubleOrNull(str2);
                double dDoubleValue2 = doubleOrNull3 != null ? doubleOrNull3.doubleValue() : 0.0d;
                Double doubleOrNull4 = StringsKt.toDoubleOrNull(str);
                dArr = new double[]{dDoubleValue2, doubleOrNull4 != null ? doubleOrNull4.doubleValue() : 0.0d};
            }
            if (dArr != null) {
                arrayList3.add(dArr);
            }
        }
        return CollectionsKt.toMutableList((Collection) CollectionsKt.sortedWith(arrayList3, new C15478b()));
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public static final String m32550a(@NotNull String symbol) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        return "/spotCallAuctionProto/level2:" + symbol;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public static final String m32551b(@NotNull String symbol, int i11, boolean z11) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        if (z11) {
            return "/spotMarket/level2Depth50_1sPB:" + symbol;
        }
        return "/spotMarket/level2Depth50PB:" + symbol + '_' + i11;
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public static final ISpotMarketPbWsApi m32552c() {
        return (ISpotMarketPbWsApi) new C19321b.a().m42777b(new C38000b(C37237b.m83278a())).m42778c(new C38003e()).m42776a().m42772b(ISpotMarketPbWsApi.class);
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public static final String m32553d(@NotNull String symbol) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        return "/market/matchPB:" + symbol;
    }

    @Nullable
    /* JADX INFO: renamed from: e */
    public static final InterfaceC41634e<OrderBookEntity> m32554e(@NotNull ISpotMarketPbWsApi iSpotMarketPbWsApi, @NotNull final String symbol) {
        final InterfaceC41634e interfaceC41634eM90881E;
        Intrinsics.checkNotNullParameter(iSpotMarketPbWsApi, "<this>");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        InterfaceC41634e<CallAuctionLevel2Proto> interfaceC41634eM32596a = iSpotMarketPbWsApi.m32596a(m32550a(symbol));
        if (interfaceC41634eM32596a == null || (interfaceC41634eM90881E = C41636g.m90881E(interfaceC41634eM32596a)) == null) {
            return null;
        }
        return new InterfaceC41634e<OrderBookEntity>() { // from class: com.kubi.kucoin.manager.SpotMarketPbWsApiKt$callAuctionLevel2EntityFlow$$inlined$map$1

            /* JADX INFO: renamed from: com.kubi.kucoin.manager.SpotMarketPbWsApiKt$callAuctionLevel2EntityFlow$$inlined$map$1$2 */
            /* JADX INFO: compiled from: Emitters.kt */
            @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
            @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 SpotMarketPbWsApi.kt\ncom/kubi/kucoin/manager/SpotMarketPbWsApiKt\n*L\n1#1,49:1\n50#2:50\n102#3:51\n*E\n"})
            public static final class C154802<T> implements InterfaceC41635f {

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ InterfaceC41635f f28095b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ String f28096c;

                /* JADX INFO: renamed from: com.kubi.kucoin.manager.SpotMarketPbWsApiKt$callAuctionLevel2EntityFlow$$inlined$map$1$2$1, reason: invalid class name */
                @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
                @DebugMetadata(m90121c = "com.kubi.kucoin.manager.SpotMarketPbWsApiKt$callAuctionLevel2EntityFlow$$inlined$map$1$2", m90122f = "SpotMarketPbWsApi.kt", m90123i = {0, 0, 0, 0, 0}, m90124l = {50}, m90125m = "emit", m90126n = {"value", "$completion", "value", "$this$map_u24lambda_u245", "$i$a$-unsafeTransform-FlowKt__TransformKt$map$1"}, m90127s = {"L$0", "L$1", "L$2", "L$3", "I$0"})
                public static final class AnonymousClass1 extends ContinuationImpl {
                    int I$0;
                    Object L$0;
                    Object L$1;
                    Object L$2;
                    Object L$3;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return C154802.this.emit(null, this);
                    }
                }

                public C154802(InterfaceC41635f interfaceC41635f, String str) {
                    this.f28095b = interfaceC41635f;
                    this.f28096c = str;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.InterfaceC41635f
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i11 = anonymousClass1.label;
                        if ((i11 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i11 - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(continuation);
                    }
                    Object obj2 = anonymousClass1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = anonymousClass1.label;
                    if (i12 == 0) {
                        ResultKt.throwOnFailure(obj2);
                        InterfaceC41635f interfaceC41635f = this.f28095b;
                        OrderBookEntity orderBookEntityM32558i = SpotMarketPbWsApiKt.m32558i((CallAuctionLevel2Proto) obj, this.f28096c);
                        anonymousClass1.L$0 = SpillingKt.nullOutSpilledVariable(obj);
                        anonymousClass1.L$1 = SpillingKt.nullOutSpilledVariable(anonymousClass1);
                        anonymousClass1.L$2 = SpillingKt.nullOutSpilledVariable(obj);
                        anonymousClass1.L$3 = SpillingKt.nullOutSpilledVariable(interfaceC41635f);
                        anonymousClass1.I$0 = 0;
                        anonymousClass1.label = 1;
                        if (interfaceC41635f.emit(orderBookEntityM32558i, anonymousClass1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i12 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj2);
                    }
                    return Unit.INSTANCE;
                }
            }

            @Override // kotlinx.coroutines.flow.InterfaceC41634e
            public Object collect(InterfaceC41635f<? super OrderBookEntity> interfaceC41635f, Continuation continuation) {
                Object objCollect = interfaceC41634eM90881E.collect(new C154802(interfaceC41635f, symbol), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        };
    }

    @Nullable
    /* JADX INFO: renamed from: f */
    public static final InterfaceC41634e<OrderBookEntity> m32555f(@NotNull ISpotMarketPbWsApi iSpotMarketPbWsApi, @NotNull final String symbol, int i11, boolean z11) {
        final InterfaceC41634e interfaceC41634eM90881E;
        Intrinsics.checkNotNullParameter(iSpotMarketPbWsApi, "<this>");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        String strM32551b = m32551b(symbol, i11, z11);
        InterfaceC41634e<Level2AggregationPb> interfaceC41634eM32598c = z11 ? iSpotMarketPbWsApi.m32598c(strM32551b) : iSpotMarketPbWsApi.m32597b(strM32551b);
        if (interfaceC41634eM32598c == null || (interfaceC41634eM90881E = C41636g.m90881E(interfaceC41634eM32598c)) == null) {
            return null;
        }
        return new InterfaceC41634e<OrderBookEntity>() { // from class: com.kubi.kucoin.manager.SpotMarketPbWsApiKt$level2EntityFlow$$inlined$map$1

            /* JADX INFO: renamed from: com.kubi.kucoin.manager.SpotMarketPbWsApiKt$level2EntityFlow$$inlined$map$1$2 */
            /* JADX INFO: compiled from: Emitters.kt */
            @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
            @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 SpotMarketPbWsApi.kt\ncom/kubi/kucoin/manager/SpotMarketPbWsApiKt\n*L\n1#1,49:1\n50#2:50\n96#3:51\n*E\n"})
            public static final class C154812<T> implements InterfaceC41635f {

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ InterfaceC41635f f28099b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ String f28100c;

                /* JADX INFO: renamed from: com.kubi.kucoin.manager.SpotMarketPbWsApiKt$level2EntityFlow$$inlined$map$1$2$1, reason: invalid class name */
                @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
                @DebugMetadata(m90121c = "com.kubi.kucoin.manager.SpotMarketPbWsApiKt$level2EntityFlow$$inlined$map$1$2", m90122f = "SpotMarketPbWsApi.kt", m90123i = {0, 0, 0, 0, 0}, m90124l = {50}, m90125m = "emit", m90126n = {"value", "$completion", "value", "$this$map_u24lambda_u245", "$i$a$-unsafeTransform-FlowKt__TransformKt$map$1"}, m90127s = {"L$0", "L$1", "L$2", "L$3", "I$0"})
                public static final class AnonymousClass1 extends ContinuationImpl {
                    int I$0;
                    Object L$0;
                    Object L$1;
                    Object L$2;
                    Object L$3;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return C154812.this.emit(null, this);
                    }
                }

                public C154812(InterfaceC41635f interfaceC41635f, String str) {
                    this.f28099b = interfaceC41635f;
                    this.f28100c = str;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.InterfaceC41635f
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i11 = anonymousClass1.label;
                        if ((i11 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i11 - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(continuation);
                    }
                    Object obj2 = anonymousClass1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = anonymousClass1.label;
                    if (i12 == 0) {
                        ResultKt.throwOnFailure(obj2);
                        InterfaceC41635f interfaceC41635f = this.f28099b;
                        OrderBookEntity orderBookEntityM32559j = SpotMarketPbWsApiKt.m32559j((Level2AggregationPb) obj, this.f28100c);
                        anonymousClass1.L$0 = SpillingKt.nullOutSpilledVariable(obj);
                        anonymousClass1.L$1 = SpillingKt.nullOutSpilledVariable(anonymousClass1);
                        anonymousClass1.L$2 = SpillingKt.nullOutSpilledVariable(obj);
                        anonymousClass1.L$3 = SpillingKt.nullOutSpilledVariable(interfaceC41635f);
                        anonymousClass1.I$0 = 0;
                        anonymousClass1.label = 1;
                        if (interfaceC41635f.emit(orderBookEntityM32559j, anonymousClass1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i12 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj2);
                    }
                    return Unit.INSTANCE;
                }
            }

            @Override // kotlinx.coroutines.flow.InterfaceC41634e
            public Object collect(InterfaceC41635f<? super OrderBookEntity> interfaceC41635f, Continuation continuation) {
                Object objCollect = interfaceC41634eM90881E.collect(new C154812(interfaceC41635f, symbol), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        };
    }

    @Nullable
    /* JADX INFO: renamed from: g */
    public static final InterfaceC41634e<SpotMatchPushEntity> m32556g(@NotNull ISpotMarketPbWsApi iSpotMarketPbWsApi, @NotNull String symbol) {
        Intrinsics.checkNotNullParameter(iSpotMarketPbWsApi, "<this>");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        final InterfaceC41634e<MatchWsMsgPb> interfaceC41634eM32599d = iSpotMarketPbWsApi.m32599d(m32553d(symbol));
        if (interfaceC41634eM32599d != null) {
            return new InterfaceC41634e<SpotMatchPushEntity>() { // from class: com.kubi.kucoin.manager.SpotMarketPbWsApiKt$matchEntityFlow$$inlined$map$1

                /* JADX INFO: renamed from: com.kubi.kucoin.manager.SpotMarketPbWsApiKt$matchEntityFlow$$inlined$map$1$2 */
                /* JADX INFO: compiled from: Emitters.kt */
                @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
                @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 SpotMarketPbWsApi.kt\ncom/kubi/kucoin/manager/SpotMarketPbWsApiKt\n*L\n1#1,49:1\n50#2:50\n85#3:51\n*E\n"})
                public static final class C154822<T> implements InterfaceC41635f {

                    /* JADX INFO: renamed from: b */
                    public final /* synthetic */ InterfaceC41635f f28102b;

                    /* JADX INFO: renamed from: com.kubi.kucoin.manager.SpotMarketPbWsApiKt$matchEntityFlow$$inlined$map$1$2$1, reason: invalid class name */
                    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
                    @DebugMetadata(m90121c = "com.kubi.kucoin.manager.SpotMarketPbWsApiKt$matchEntityFlow$$inlined$map$1$2", m90122f = "SpotMarketPbWsApi.kt", m90123i = {0, 0, 0, 0, 0}, m90124l = {50}, m90125m = "emit", m90126n = {"value", "$completion", "value", "$this$map_u24lambda_u245", "$i$a$-unsafeTransform-FlowKt__TransformKt$map$1"}, m90127s = {"L$0", "L$1", "L$2", "L$3", "I$0"})
                    public static final class AnonymousClass1 extends ContinuationImpl {
                        int I$0;
                        Object L$0;
                        Object L$1;
                        Object L$2;
                        Object L$3;
                        int label;
                        /* synthetic */ Object result;

                        public AnonymousClass1(Continuation continuation) {
                            super(continuation);
                        }

                        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Object invokeSuspend(Object obj) {
                            this.result = obj;
                            this.label |= Integer.MIN_VALUE;
                            return C154822.this.emit(null, this);
                        }
                    }

                    public C154822(InterfaceC41635f interfaceC41635f) {
                        this.f28102b = interfaceC41635f;
                    }

                    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                    @Override // kotlinx.coroutines.flow.InterfaceC41635f
                    public final Object emit(Object obj, Continuation continuation) {
                        AnonymousClass1 anonymousClass1;
                        if (continuation instanceof AnonymousClass1) {
                            anonymousClass1 = (AnonymousClass1) continuation;
                            int i11 = anonymousClass1.label;
                            if ((i11 & Integer.MIN_VALUE) != 0) {
                                anonymousClass1.label = i11 - Integer.MIN_VALUE;
                            } else {
                                anonymousClass1 = new AnonymousClass1(continuation);
                            }
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                        Object obj2 = anonymousClass1.result;
                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        int i12 = anonymousClass1.label;
                        if (i12 == 0) {
                            ResultKt.throwOnFailure(obj2);
                            InterfaceC41635f interfaceC41635f = this.f28102b;
                            MatchWsMsgPb matchWsMsgPb = (MatchWsMsgPb) obj;
                            SpotMatchPushEntity spotMatchPushEntityM32561l = matchWsMsgPb != null ? SpotMarketPbWsApiKt.m32561l(matchWsMsgPb) : null;
                            anonymousClass1.L$0 = SpillingKt.nullOutSpilledVariable(obj);
                            anonymousClass1.L$1 = SpillingKt.nullOutSpilledVariable(anonymousClass1);
                            anonymousClass1.L$2 = SpillingKt.nullOutSpilledVariable(obj);
                            anonymousClass1.L$3 = SpillingKt.nullOutSpilledVariable(interfaceC41635f);
                            anonymousClass1.I$0 = 0;
                            anonymousClass1.label = 1;
                            if (interfaceC41635f.emit(spotMatchPushEntityM32561l, anonymousClass1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        } else {
                            if (i12 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj2);
                        }
                        return Unit.INSTANCE;
                    }
                }

                @Override // kotlinx.coroutines.flow.InterfaceC41634e
                public Object collect(InterfaceC41635f<? super SpotMatchPushEntity> interfaceC41635f, Continuation continuation) {
                    Object objCollect = interfaceC41634eM32599d.collect(new C154822(interfaceC41635f), continuation);
                    return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                }
            };
        }
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: i */
    public static final OrderBookEntity m32558i(@NotNull CallAuctionLevel2Proto callAuctionLevel2Proto, @NotNull String symbol) {
        Intrinsics.checkNotNullParameter(callAuctionLevel2Proto, "<this>");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        long sequence = callAuctionLevel2Proto.getSequence();
        List<String> asksList = callAuctionLevel2Proto.getAsksList();
        Intrinsics.checkNotNullExpressionValue(asksList, "getAsksList(...)");
        List<double[]> listM32557h = m32557h(asksList);
        List<String> bidsList = callAuctionLevel2Proto.getBidsList();
        Intrinsics.checkNotNullExpressionValue(bidsList, "getBidsList(...)");
        return new OrderBookEntity(symbol, sequence, m32557h(bidsList), listM32557h, callAuctionLevel2Proto.getTime());
    }

    @NotNull
    /* JADX INFO: renamed from: j */
    public static final OrderBookEntity m32559j(@NotNull Level2AggregationPb level2AggregationPb, @NotNull String symbol) {
        Intrinsics.checkNotNullParameter(level2AggregationPb, "<this>");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        String sequence = level2AggregationPb.getSequence();
        Intrinsics.checkNotNullExpressionValue(sequence, "getSequence(...)");
        Long longOrNull = StringsKt.toLongOrNull(sequence);
        long jLongValue = longOrNull != null ? longOrNull.longValue() : 0L;
        List<Level2Entry> asksList = level2AggregationPb.getAsksList();
        Intrinsics.checkNotNullExpressionValue(asksList, "getAsksList(...)");
        List<double[]> listM32560k = m32560k(asksList);
        List<Level2Entry> bidsList = level2AggregationPb.getBidsList();
        Intrinsics.checkNotNullExpressionValue(bidsList, "getBidsList(...)");
        return new OrderBookEntity(symbol, jLongValue, m32560k(bidsList), listM32560k, level2AggregationPb.getTimestamp());
    }

    /* JADX INFO: renamed from: k */
    public static final List<double[]> m32560k(List<Level2Entry> list) {
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        for (Level2Entry level2Entry : list) {
            String price = level2Entry.getPrice();
            Intrinsics.checkNotNullExpressionValue(price, "getPrice(...)");
            Double doubleOrNull = StringsKt.toDoubleOrNull(price);
            double dDoubleValue = 0.0d;
            double dDoubleValue2 = doubleOrNull != null ? doubleOrNull.doubleValue() : 0.0d;
            String size = level2Entry.getSize();
            Intrinsics.checkNotNullExpressionValue(size, "getSize(...)");
            Double doubleOrNull2 = StringsKt.toDoubleOrNull(size);
            if (doubleOrNull2 != null) {
                dDoubleValue = doubleOrNull2.doubleValue();
            }
            arrayList.add(new double[]{dDoubleValue2, dDoubleValue});
        }
        return CollectionsKt.toMutableList((Collection) CollectionsKt.sortedWith(arrayList, new C15479c()));
    }

    @NotNull
    /* JADX INFO: renamed from: l */
    public static final SpotMatchPushEntity m32561l(@NotNull MatchWsMsgPb matchWsMsgPb) {
        Intrinsics.checkNotNullParameter(matchWsMsgPb, "<this>");
        String sequence = matchWsMsgPb.getSequence();
        Intrinsics.checkNotNullExpressionValue(sequence, "getSequence(...)");
        Long longOrNull = StringsKt.toLongOrNull(sequence);
        long jLongValue = longOrNull != null ? longOrNull.longValue() : 0L;
        String type = matchWsMsgPb.getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        long j11 = jLongValue;
        String symbol = matchWsMsgPb.getSymbol();
        Intrinsics.checkNotNullExpressionValue(symbol, "getSymbol(...)");
        String side = matchWsMsgPb.getSide();
        Intrinsics.checkNotNullExpressionValue(side, "getSide(...)");
        String price = matchWsMsgPb.getPrice();
        Intrinsics.checkNotNullExpressionValue(price, "getPrice(...)");
        String size = matchWsMsgPb.getSize();
        Intrinsics.checkNotNullExpressionValue(size, "getSize(...)");
        String tradeId = matchWsMsgPb.getTradeId();
        Intrinsics.checkNotNullExpressionValue(tradeId, "getTradeId(...)");
        String takerOrderId = matchWsMsgPb.getTakerOrderId();
        Intrinsics.checkNotNullExpressionValue(takerOrderId, "getTakerOrderId(...)");
        long jLongValue2 = 0;
        String makerOrderId = matchWsMsgPb.getMakerOrderId();
        Intrinsics.checkNotNullExpressionValue(makerOrderId, "getMakerOrderId(...)");
        String time = matchWsMsgPb.getTime();
        Intrinsics.checkNotNullExpressionValue(time, "getTime(...)");
        Long longOrNull2 = StringsKt.toLongOrNull(time);
        if (longOrNull2 != null) {
            jLongValue2 = longOrNull2.longValue();
        }
        return new SpotMatchPushEntity(j11, type, symbol, side, price, size, tradeId, takerOrderId, makerOrderId, jLongValue2);
    }

    /* JADX INFO: renamed from: m */
    public static final boolean m32562m() {
        return ContractTradeSocketConfig.f28114a.m32566a();
    }
}
