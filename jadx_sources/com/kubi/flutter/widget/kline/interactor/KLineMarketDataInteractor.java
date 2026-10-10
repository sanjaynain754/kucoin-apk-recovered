package com.kubi.flutter.widget.kline.interactor;

import com.kubi.flutter.proto.kline.CandleItem;
import com.kubi.flutter.proto.kline.OrderItem;
import com.kubi.flutter.proto.kline.OrderItemKt$Dsl;
import com.kubi.flutter.widget.kline.C12802p;
import com.kubi.flutter.widget.kline.IKLineDataInteractor;
import com.kubi.flutter.widget.kline.KLineCdnRange;
import com.kubi.flutter.widget.kline.KlineOrderEntity;
import com.kubi.p110rn.Constants;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.DowngradeExKt;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlinx.coroutines.C41686h;
import mr.C42597a;
import o00.C42911a;
import okhttp3.Request;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.comparisons.ComparisonsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: KLineCommonDataInteractors.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\u000f\u001a\u00020\u0010*\b\u0012\u0004\u0012\u00020\u00120\u00112\b\b\u0001\u0010\u0013\u001a\u00020\u0012H\u0014¢\u0006\u0002\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0017H\u0014J\b\u0010\u0018\u001a\u00020\u0019H\u0014J \u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001dH\u0014J,\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00100 2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001dH\u0094@¢\u0006\u0002\u0010!J\u001c\u0010\"\u001a\b\u0012\u0004\u0012\u00020#0 2\u0006\u0010\u0016\u001a\u00020$H\u0094@¢\u0006\u0002\u0010%J$\u0010&\u001a\b\u0012\u0004\u0012\u00020#0 2\u0006\u0010\u0016\u001a\u00020$2\u0006\u0010\u001c\u001a\u00020\u001dH\u0094@¢\u0006\u0002\u0010'J*\u0010(\u001a\b\u0012\u0004\u0012\u00020)0 2\f\u0010*\u001a\b\u0012\u0004\u0012\u00020)0 2\f\u0010+\u001a\b\u0012\u0004\u0012\u00020)0,H\u0002J\u0014\u0010-\u001a\u00020#*\u00020)2\u0006\u0010.\u001a\u00020/H\u0014J\u0014\u00100\u001a\u00020#*\u00020)2\u0006\u0010.\u001a\u00020/H\u0014R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\t\u001a\u0004\b\f\u0010\r¨\u00061"}, m90084d2 = {"Lcom/kubi/flutter/widget/kline/interactor/KLineMarketDataInteractor;", "Lcom/kubi/flutter/widget/kline/interactor/KLineBaseDataInteractor;", "<init>", "()V", "marketSocket", "Lcom/kubi/flutter/widget/kline/interactor/IMarketSocket;", "getMarketSocket", "()Lcom/kubi/flutter/widget/kline/interactor/IMarketSocket;", "marketSocket$delegate", "Lkotlin/Lazy;", "marketApi", "Lcom/kubi/flutter/widget/kline/interactor/IMarketApi;", "getMarketApi", "()Lcom/kubi/flutter/widget/kline/interactor/IMarketApi;", "marketApi$delegate", "toCandleItem", "Lcom/kubi/flutter/proto/kline/CandleItem;", "", "", "source", "([Ljava/lang/String;Ljava/lang/String;)Lcom/kubi/flutter/proto/kline/CandleItem;", "getTopic", "param", "Lcom/kubi/flutter/widget/kline/IKLineDataInteractor$DataParam;", "useSpotMarketCandleAdapter", "", "buildKlineRequest", "Lokhttp3/Request;", "begin", "", "end", "fetchCdnKlineList", "", "(Lcom/kubi/flutter/widget/kline/IKLineDataInteractor$DataParam;JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchActiveOrderList", "Lcom/kubi/flutter/proto/kline/OrderItem;", "Lcom/kubi/flutter/widget/kline/IKLineDataInteractor$OrderParam;", "(Lcom/kubi/flutter/widget/kline/IKLineDataInteractor$OrderParam;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchHistoryOrderList", "(Lcom/kubi/flutter/widget/kline/IKLineDataInteractor$OrderParam;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "mergeBsData", "Lcom/kubi/flutter/widget/kline/KlineOrderEntity;", "marginData", "normalData", "", "toActiveOrderItem", Constants.BIZ, "Lcom/kubi/flutter/proto/kline/OrderItem$BizType;", "toHistoryOrderItem", "LKLineWidget_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nKLineCommonDataInteractors.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KLineCommonDataInteractors.kt\ncom/kubi/flutter/widget/kline/interactor/KLineMarketDataInteractor\n+ 2 KLineContract.kt\ncom/kubi/flutter/widget/kline/KLineContractKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 OrderItemKt.kt\ncom/kubi/flutter/proto/kline/OrderItemKtKt\n*L\n1#1,345:1\n8#2:346\n1869#3:347\n1870#3:349\n1056#3:350\n1#4:348\n1#4:352\n1#4:354\n8#5:351\n8#5:353\n*S KotlinDebug\n*F\n+ 1 KLineCommonDataInteractors.kt\ncom/kubi/flutter/widget/kline/interactor/KLineMarketDataInteractor\n*L\n222#1:346\n314#1:347\n314#1:349\n319#1:350\n323#1:352\n328#1:354\n323#1:351\n328#1:353\n*E\n"})
public final class KLineMarketDataInteractor extends KLineBaseDataInteractor {

    /* JADX INFO: renamed from: b */
    @NotNull
    public final Lazy f22459b = LazyKt.lazy(new Function0() { // from class: com.kubi.flutter.widget.kline.interactor.l
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return KLineMarketDataInteractor.m24327J();
        }
    });

    /* JADX INFO: renamed from: c */
    @NotNull
    public final Lazy f22460c = LazyKt.lazy(new Function0() { // from class: com.kubi.flutter.widget.kline.interactor.m
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return KLineMarketDataInteractor.m24326I();
        }
    });

    /* JADX INFO: renamed from: com.kubi.flutter.widget.kline.interactor.KLineMarketDataInteractor$a */
    /* JADX INFO: compiled from: Comparisons.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 KLineCommonDataInteractors.kt\ncom/kubi/flutter/widget/kline/interactor/KLineMarketDataInteractor\n*L\n1#1,328:1\n319#2:329\n*E\n"})
    public static final class C12777a<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t11, T t12) {
            return ComparisonsKt.compareValues(((KlineOrderEntity) t11).getDate(), ((KlineOrderEntity) t12).getDate());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public final IMarketApi m24324G() {
        Object value = this.f22460c.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (IMarketApi) value;
    }

    /* JADX INFO: renamed from: H */
    private final IMarketSocket m24325H() {
        Object value = this.f22459b.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (IMarketSocket) value;
    }

    @NotNull
    /* JADX INFO: renamed from: L */
    public OrderItem m24329L(@NotNull KlineOrderEntity klineOrderEntity, @NotNull OrderItem.BizType biz) {
        OrderItem.OrderSide orderSide;
        Intrinsics.checkNotNullParameter(klineOrderEntity, "<this>");
        Intrinsics.checkNotNullParameter(biz, "biz");
        OrderItemKt$Dsl.Companion companion = OrderItemKt$Dsl.f22148b;
        OrderItem.C12687b c12687bNewBuilder = OrderItem.newBuilder();
        Intrinsics.checkNotNullExpressionValue(c12687bNewBuilder, "newBuilder(...)");
        OrderItemKt$Dsl orderItemKt$Dsl_create = companion._create(c12687bNewBuilder);
        orderItemKt$Dsl_create.m23981h(C27039d.m66652l(klineOrderEntity.getDate()));
        orderItemKt$Dsl_create.m23975b(DowngradeExKt.m66538h(klineOrderEntity.getLatestDealSize(), 0.0d, 1, null));
        orderItemKt$Dsl_create.m23978e(DowngradeExKt.m66538h(klineOrderEntity.getLatestDealPrice(), 0.0d, 1, null));
        orderItemKt$Dsl_create.m23980g(C27041f.m66668h(klineOrderEntity.getSymbol()));
        String lowerCase = C27041f.m66668h(klineOrderEntity.getSide()).toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        if (Intrinsics.areEqual(lowerCase, "buy")) {
            orderSide = OrderItem.OrderSide.BUY_LONG;
        } else {
            orderSide = Intrinsics.areEqual(lowerCase, "sell") ? OrderItem.OrderSide.SELL_SHORT : OrderItem.OrderSide.UNRECOGNIZED;
        }
        orderItemKt$Dsl_create.m23979f(orderSide);
        orderItemKt$Dsl_create.m23976c(biz);
        orderItemKt$Dsl_create.m23977d(!Intrinsics.areEqual(klineOrderEntity.getTradeType(), "ISOLATED_ONE_CLICK_LIQUIDATION"));
        return orderItemKt$Dsl_create.m23974a();
    }

    @Override // com.kubi.flutter.widget.kline.interactor.KLineBaseDataInteractor
    @NotNull
    /* JADX INFO: renamed from: q */
    public Request mo24306q(@NotNull IKLineDataInteractor.DataParam param, long j11, long j12) {
        Intrinsics.checkNotNullParameter(param, "param");
        KLineCdnRange kLineCdnRangeM24368c = C12802p.m24368c(param.getType(), System.currentTimeMillis() / ((long) 1000));
        return m24325H().m24349a(param.getSymbol(), param.getType().getType(), kLineCdnRangeM24368c.getBegin(), kLineCdnRangeM24368c.getEnd());
    }

    @Override // com.kubi.flutter.widget.kline.interactor.KLineBaseDataInteractor
    @NotNull
    /* JADX INFO: renamed from: v */
    public String mo24311v(@NotNull IKLineDataInteractor.DataParam param) {
        Intrinsics.checkNotNullParameter(param, "param");
        String str = String.format("/market/candlesFrequency1000:%s", Arrays.copyOf(new Object[]{param.getSymbol() + '_' + param.getType().getType()}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }

    @Override // com.kubi.flutter.widget.kline.interactor.KLineBaseDataInteractor
    @NotNull
    /* JADX INFO: renamed from: z */
    public CandleItem mo24312z(@NotNull String[] strArr, @NotNull String source) {
        Intrinsics.checkNotNullParameter(strArr, "<this>");
        Intrinsics.checkNotNullParameter(source, "source");
        return C12789i.m24352b(strArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public static final IMarketApi m24326I() {
        return (IMarketApi) C42597a.m93391g().create(IMarketApi.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public static final IMarketSocket m24327J() {
        return (IMarketSocket) C42597a.m93390f().create(IMarketSocket.class);
    }

    /* JADX INFO: renamed from: K */
    public final List<KlineOrderEntity> m24328K(List<KlineOrderEntity> list, List<KlineOrderEntity> list2) {
        Object next;
        if (list.isEmpty()) {
            return list2;
        }
        if (list2.isEmpty()) {
            return list;
        }
        for (KlineOrderEntity klineOrderEntity : list) {
            Iterator<T> it = list2.iterator();
            while (true) {
                if (it.hasNext()) {
                    next = it.next();
                    KlineOrderEntity klineOrderEntity2 = (KlineOrderEntity) next;
                    if (Intrinsics.areEqual(klineOrderEntity.getSymbol(), klineOrderEntity2.getSymbol()) && Intrinsics.areEqual(klineOrderEntity.getSide(), klineOrderEntity2.getSide()) && Intrinsics.areEqual(klineOrderEntity.getDate(), klineOrderEntity2.getDate())) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            if (next == null) {
                list2.add(klineOrderEntity);
            }
        }
        return CollectionsKt.sortedWith(list2, new C12777a());
    }

    @Override // com.kubi.flutter.widget.kline.interactor.KLineBaseDataInteractor
    @Nullable
    /* JADX INFO: renamed from: r */
    public Object mo24307r(@NotNull IKLineDataInteractor.OrderParam orderParam, @NotNull Continuation<? super List<OrderItem>> continuation) {
        return C41686h.m91049g(C42911a.m94120b(), new KLineMarketDataInteractor$fetchActiveOrderList$2(orderParam, this, null), continuation);
    }

    @Override // com.kubi.flutter.widget.kline.interactor.KLineBaseDataInteractor
    @Nullable
    /* JADX INFO: renamed from: s */
    public Object mo24308s(@NotNull IKLineDataInteractor.DataParam dataParam, long j11, long j12, @NotNull Continuation<? super List<CandleItem>> continuation) {
        return C41686h.m91049g(C42911a.m94120b(), new KLineMarketDataInteractor$fetchCdnKlineList$2(this, dataParam, j11, j12, null), continuation);
    }

    @Override // com.kubi.flutter.widget.kline.interactor.KLineBaseDataInteractor
    @Nullable
    /* JADX INFO: renamed from: t */
    public Object mo24309t(@NotNull IKLineDataInteractor.OrderParam orderParam, long j11, @NotNull Continuation<? super List<OrderItem>> continuation) {
        return C41686h.m91049g(C42911a.m94120b(), new KLineMarketDataInteractor$fetchHistoryOrderList$2(orderParam, this, j11, null), continuation);
    }
}
