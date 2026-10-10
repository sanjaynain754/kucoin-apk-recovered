package com.kubi.flutter.widget.kline.interactor;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.kubi.flutter.proto.kline.CandleItem;
import com.kubi.flutter.proto.kline.CandleItemKt$Dsl;
import com.kubi.flutter.proto.kline.OrderItem;
import com.kubi.flutter.proto.kline.OrderItemKt$Dsl;
import com.kubi.flutter.widget.kline.ActiveOrderEntity;
import com.kubi.flutter.widget.kline.IKLineDataInteractor;
import com.kubi.flutter.widget.kline.KlineOrderEntity;
import com.kubi.p110rn.Constants;
import com.kubi.sdk.base.entity.BasePageEntity;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.DowngradeExKt;
import er.C37237b;
import er.InterfaceC37236a;
import java.util.Arrays;
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
import p852kotlin.coroutines.Continuation;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import retrofit2.http.GET;
import retrofit2.http.Query;

/* JADX INFO: compiled from: KumexKLineInteractor.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 /2\u00020\u0001:\u0003-./B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0014J \u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0016H\u0014J,\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0016H\u0094@¢\u0006\u0002\u0010\u001bJ\u001c\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00192\u0006\u0010\u0011\u001a\u00020\u001eH\u0094@¢\u0006\u0002\u0010\u001fJ$\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001d0\u00192\u0006\u0010\u0011\u001a\u00020\u001e2\u0006\u0010\u0015\u001a\u00020\u0016H\u0094@¢\u0006\u0002\u0010!J\u0014\u0010\"\u001a\u00020\u001d*\u00020#2\u0006\u0010$\u001a\u00020%H\u0014J\u0014\u0010&\u001a\u00020\u001d*\u00020#2\u0006\u0010$\u001a\u00020%H\u0014J!\u0010'\u001a\u00020\u001a*\b\u0012\u0004\u0012\u00020\u00100(2\b\b\u0001\u0010)\u001a\u00020\u0010H\u0014¢\u0006\u0002\u0010*J\b\u0010+\u001a\u00020,H\u0014R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\t\u001a\u0004\b\f\u0010\r¨\u00060"}, m90084d2 = {"Lcom/kubi/flutter/widget/kline/interactor/KumexKLineInteractor;", "Lcom/kubi/flutter/widget/kline/interactor/KLineBaseDataInteractor;", "<init>", "()V", "marketSocket", "Lcom/kubi/flutter/widget/kline/interactor/KumexKLineInteractor$IMarketSocket;", "getMarketSocket", "()Lcom/kubi/flutter/widget/kline/interactor/KumexKLineInteractor$IMarketSocket;", "marketSocket$delegate", "Lkotlin/Lazy;", "marketApi", "Lcom/kubi/flutter/widget/kline/interactor/KumexKLineInteractor$IMarketApi;", "getMarketApi", "()Lcom/kubi/flutter/widget/kline/interactor/KumexKLineInteractor$IMarketApi;", "marketApi$delegate", "getTopic", "", "param", "Lcom/kubi/flutter/widget/kline/IKLineDataInteractor$DataParam;", "buildKlineRequest", "Lokhttp3/Request;", "begin", "", "end", "fetchCdnKlineList", "", "Lcom/kubi/flutter/proto/kline/CandleItem;", "(Lcom/kubi/flutter/widget/kline/IKLineDataInteractor$DataParam;JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchActiveOrderList", "Lcom/kubi/flutter/proto/kline/OrderItem;", "Lcom/kubi/flutter/widget/kline/IKLineDataInteractor$OrderParam;", "(Lcom/kubi/flutter/widget/kline/IKLineDataInteractor$OrderParam;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchHistoryOrderList", "(Lcom/kubi/flutter/widget/kline/IKLineDataInteractor$OrderParam;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "toActiveOrderItem", "Lcom/kubi/flutter/widget/kline/KlineOrderEntity;", Constants.BIZ, "Lcom/kubi/flutter/proto/kline/OrderItem$BizType;", "toHistoryOrderItem", "toCandleItem", "", "source", "([Ljava/lang/String;Ljava/lang/String;)Lcom/kubi/flutter/proto/kline/CandleItem;", "getSocketClient", "Lcom/kubi/network/api/IWebSocketClient;", "IMarketSocket", "IMarketApi", "Companion", "LKLineWidget_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nKumexKLineInteractor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KumexKLineInteractor.kt\ncom/kubi/flutter/widget/kline/interactor/KumexKLineInteractor\n+ 2 OrderItemKt.kt\ncom/kubi/flutter/proto/kline/OrderItemKtKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 CandleItemKt.kt\ncom/kubi/flutter/proto/kline/CandleItemKtKt\n*L\n1#1,190:1\n8#2:191\n8#2:193\n1#3:192\n1#3:194\n1#3:196\n8#4:195\n*S KotlinDebug\n*F\n+ 1 KumexKLineInteractor.kt\ncom/kubi/flutter/widget/kline/interactor/KumexKLineInteractor\n*L\n154#1:191\n159#1:193\n154#1:192\n159#1:194\n174#1:196\n174#1:195\n*E\n"})
public final class KumexKLineInteractor extends KLineBaseDataInteractor {

    /* JADX INFO: renamed from: d */
    @NotNull
    public static final Companion f22461d = new Companion(null);

    /* JADX INFO: renamed from: b */
    @NotNull
    public final Lazy f22462b = LazyKt.lazy(new Function0() { // from class: com.kubi.flutter.widget.kline.interactor.n
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return KumexKLineInteractor.m24334I();
        }
    });

    /* JADX INFO: renamed from: c */
    @NotNull
    public final Lazy f22463c = LazyKt.lazy(new Function0() { // from class: com.kubi.flutter.widget.kline.interactor.o
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return KumexKLineInteractor.m24333H();
        }
    });

    /* JADX INFO: compiled from: KumexKLineInteractor.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/flutter/widget/kline/interactor/KumexKLineInteractor$Companion;", "", "<init>", "()V", "KLINE_SNAPSHOT", "", "LKLineWidget_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: com.kubi.flutter.widget.kline.interactor.KumexKLineInteractor$a */
    /* JADX INFO: compiled from: KumexKLineInteractor.kt */
    @Metadata(m90083d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J@\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u00052\b\b\u0001\u0010\b\u001a\u00020\t2\b\b\u0001\u0010\n\u001a\u00020\tH'J.\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u00052\b\b\u0001\u0010\r\u001a\u00020\u00052\b\b\u0001\u0010\u000e\u001a\u00020\tH'JB\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0003\u0010\u0012\u001a\u00020\u00052\b\b\u0003\u0010\u0013\u001a\u00020\u00052\b\b\u0003\u0010\u0014\u001a\u00020\u00052\b\b\u0003\u0010\u0015\u001a\u00020\u0005H'ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0016À\u0006\u0001"}, m90084d2 = {"Lcom/kubi/flutter/widget/kline/interactor/KumexKLineInteractor$IMarketApi;", "", "fetchKlineData", "", "", "", "symbol", "resolution", "from", "", TypedValues.TransitionType.S_TO, "fetchKumexBSData", "Lcom/kubi/flutter/widget/kline/KlineOrderEntity;", "type", "begin", "getMarginActiveOrder", "Lcom/kubi/sdk/base/entity/BasePageEntity;", "Lcom/kubi/flutter/widget/kline/ActiveOrderEntity;", "status", "fundsType", "pageSize", "currentPage", "LKLineWidget_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public interface InterfaceC12778a {
        @GET("v1/kumex-trade/orders")
        @NotNull
        /* JADX INFO: renamed from: a */
        BasePageEntity<ActiveOrderEntity> m24339a(@Nullable @Query("symbol") String str, @NotNull @Query("status") String str2, @NotNull @Query("fundsType") String str3, @NotNull @Query("pageSize") String str4, @NotNull @Query("currentPage") String str5);

        @GET("v1/kumex-kline/history")
        @NotNull
        /* JADX INFO: renamed from: c */
        List<String[]> m24340c(@Nullable @Query("symbol") String str, @Nullable @Query("resolution") String str2, @Query("from") long j11, @Query(TypedValues.TransitionType.S_TO) long j12) throws Throwable;

        @GET("v2/km/orders/bs/data")
        @Nullable
        /* JADX INFO: renamed from: d */
        List<KlineOrderEntity> m24341d(@NotNull @Query("symbol") String str, @NotNull @Query("type") String str2, @Query("begin") long j11);

        /* JADX INFO: renamed from: b */
        static /* synthetic */ BasePageEntity m24338b(InterfaceC12778a interfaceC12778a, String str, String str2, String str3, String str4, String str5, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getMarginActiveOrder");
            }
            if ((i11 & 1) != 0) {
                str = null;
            }
            if ((i11 & 2) != 0) {
                str2 = "active";
            }
            if ((i11 & 4) != 0) {
                str3 = "";
            }
            if ((i11 & 8) != 0) {
                str4 = "20";
            }
            if ((i11 & 16) != 0) {
                str5 = "1";
            }
            String str6 = str5;
            String str7 = str3;
            return interfaceC12778a.m24339a(str, str2, str7, str4, str6);
        }
    }

    /* JADX INFO: renamed from: com.kubi.flutter.widget.kline.interactor.KumexKLineInteractor$b */
    /* JADX INFO: compiled from: KumexKLineInteractor.kt */
    @Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J0\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u00052\b\b\u0001\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\t\u001a\u00020\bH'ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\nÀ\u0006\u0001"}, m90084d2 = {"Lcom/kubi/flutter/widget/kline/interactor/KumexKLineInteractor$IMarketSocket;", "", "getKline", "Lokhttp3/Request;", "symbol", "", "resolution", "from", "", TypedValues.TransitionType.S_TO, "LKLineWidget_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public interface InterfaceC12779b {
        @GET("v1/kumex-kline/history")
        @NotNull
        /* JADX INFO: renamed from: a */
        Request m24342a(@NotNull @Query("symbol") String str, @NotNull @Query("resolution") String str2, @Query("from") long j11, @Query(TypedValues.TransitionType.S_TO) long j12);
    }

    /* JADX INFO: renamed from: F */
    public final InterfaceC12778a m24335F() {
        Object value = this.f22463c.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (InterfaceC12778a) value;
    }

    /* JADX INFO: renamed from: G */
    public final InterfaceC12779b m24336G() {
        Object value = this.f22462b.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (InterfaceC12779b) value;
    }

    @NotNull
    /* JADX INFO: renamed from: J */
    public OrderItem m24337J(@NotNull KlineOrderEntity klineOrderEntity, @NotNull OrderItem.BizType biz) {
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
        orderItemKt$Dsl_create.m23977d(true);
        return orderItemKt$Dsl_create.m23974a();
    }

    @Override // com.kubi.flutter.widget.kline.interactor.KLineBaseDataInteractor
    @NotNull
    /* JADX INFO: renamed from: q */
    public Request mo24306q(@NotNull IKLineDataInteractor.DataParam param, long j11, long j12) {
        Intrinsics.checkNotNullParameter(param, "param");
        return m24336G().m24342a(param.getSymbol(), String.valueOf(param.getType().getPeriod() / 60), j11, j12);
    }

    @Override // com.kubi.flutter.widget.kline.interactor.KLineBaseDataInteractor
    @NotNull
    /* JADX INFO: renamed from: v */
    public String mo24311v(@NotNull IKLineDataInteractor.DataParam param) {
        Intrinsics.checkNotNullParameter(param, "param");
        String str = String.format("/contractMarket/app-candle:%s", Arrays.copyOf(new Object[]{param.getSymbol() + '_' + (param.getType().getPeriod() / 60)}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }

    @Override // com.kubi.flutter.widget.kline.interactor.KLineBaseDataInteractor
    @NotNull
    /* JADX INFO: renamed from: z */
    public CandleItem mo24312z(@NotNull String[] strArr, @NotNull String source) {
        Intrinsics.checkNotNullParameter(strArr, "<this>");
        Intrinsics.checkNotNullParameter(source, "source");
        CandleItemKt$Dsl.Companion companion = CandleItemKt$Dsl.f22073b;
        CandleItem.C12640b c12640bNewBuilder = CandleItem.newBuilder();
        Intrinsics.checkNotNullExpressionValue(c12640bNewBuilder, "newBuilder(...)");
        CandleItemKt$Dsl candleItemKt$Dsl_create = companion._create(c12640bNewBuilder);
        candleItemKt$Dsl_create.m23908f(Intrinsics.areEqual(source, "socket") ? DowngradeExKt.m66546p(strArr[0], 0L, 1, null) / ((long) 1000) : DowngradeExKt.m66546p(strArr[0], 0L, 1, null));
        candleItemKt$Dsl_create.m23907e(DowngradeExKt.m66538h(strArr[1], 0.0d, 1, null));
        candleItemKt$Dsl_create.m23904b(DowngradeExKt.m66538h(strArr[2], 0.0d, 1, null));
        candleItemKt$Dsl_create.m23905c(DowngradeExKt.m66538h(strArr[3], 0.0d, 1, null));
        candleItemKt$Dsl_create.m23906d(DowngradeExKt.m66538h(strArr[4], 0.0d, 1, null));
        if (strArr.length >= 7) {
            candleItemKt$Dsl_create.m23909g(DowngradeExKt.m66538h(strArr[6], 0.0d, 1, null));
        }
        return candleItemKt$Dsl_create.m23903a();
    }

    /* JADX INFO: renamed from: H */
    public static final InterfaceC12778a m24333H() {
        return (InterfaceC12778a) C42597a.m93391g().create(InterfaceC12778a.class);
    }

    /* JADX INFO: renamed from: I */
    public static final InterfaceC12779b m24334I() {
        return (InterfaceC12779b) C42597a.m93390f().create(InterfaceC12779b.class);
    }

    @Override // com.kubi.flutter.widget.kline.interactor.KLineBaseDataInteractor
    @Nullable
    /* JADX INFO: renamed from: r */
    public Object mo24307r(@NotNull IKLineDataInteractor.OrderParam orderParam, @NotNull Continuation<? super List<OrderItem>> continuation) {
        return C41686h.m91049g(C42911a.m94120b(), new KumexKLineInteractor$fetchActiveOrderList$2(orderParam, this, null), continuation);
    }

    @Override // com.kubi.flutter.widget.kline.interactor.KLineBaseDataInteractor
    @Nullable
    /* JADX INFO: renamed from: s */
    public Object mo24308s(@NotNull IKLineDataInteractor.DataParam dataParam, long j11, long j12, @NotNull Continuation<? super List<CandleItem>> continuation) {
        return C41686h.m91049g(C42911a.m94120b(), new KumexKLineInteractor$fetchCdnKlineList$2(this, dataParam, j11, j12, null), continuation);
    }

    @Override // com.kubi.flutter.widget.kline.interactor.KLineBaseDataInteractor
    @Nullable
    /* JADX INFO: renamed from: t */
    public Object mo24309t(@NotNull IKLineDataInteractor.OrderParam orderParam, long j11, @NotNull Continuation<? super List<OrderItem>> continuation) {
        return C41686h.m91049g(C42911a.m94120b(), new KumexKLineInteractor$fetchHistoryOrderList$2(orderParam, this, j11, null), continuation);
    }

    @Override // com.kubi.flutter.widget.kline.interactor.KLineBaseDataInteractor
    @NotNull
    /* JADX INFO: renamed from: u */
    public InterfaceC37236a mo24310u() {
        return C37237b.m83279b();
    }
}
