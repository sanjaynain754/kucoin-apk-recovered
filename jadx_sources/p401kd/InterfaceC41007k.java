package p401kd;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.core.base.order.data.OrderLevelType;
import com.kubi.core.base.order.data.TradeSide;
import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: kd.k */
/* JADX INFO: compiled from: OrderItemData.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m90083d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u00040123R\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0012\u0010\n\u001a\u00020\u000bX¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0005R\u0014\u0010\u0010\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0005R\u0014\u0010\u0012\u001a\u0004\u0018\u00010\u0013X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u0004\u0018\u00010\u0017X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001a\u001a\u0004\u0018\u00010\u0017X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0019R\u0012\u0010\u001c\u001a\u00020\u001dX¦\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001eR\u0012\u0010\u001f\u001a\u00020\u001dX¦\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u001eR\u0014\u0010 \u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\u0005R\u0014\u0010\"\u001a\u0004\u0018\u00010\u0017X¦\u0004¢\u0006\u0006\u001a\u0004\b#\u0010\u0019R\u0014\u0010$\u001a\u0004\u0018\u00010\u0017X¦\u0004¢\u0006\u0006\u001a\u0004\b%\u0010\u0019R\u0014\u0010&\u001a\u0004\u0018\u00010\u0017X¦\u0004¢\u0006\u0006\u001a\u0004\b'\u0010\u0019R\u0014\u0010(\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b)\u0010\u0005R\u0014\u0010*\u001a\u0004\u0018\u00010+X¦\u0004¢\u0006\u0006\u001a\u0004\b,\u0010-R\u0014\u0010.\u001a\u0004\u0018\u00010+X¦\u0004¢\u0006\u0006\u001a\u0004\b/\u0010-\u0082\u0001\u00044567ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u00068À\u0006\u0001"}, m90084d2 = {"Lcom/kubi/core/biz/bottomtab/order/child/item/OrderItemData;", "", "orderId", "", "getOrderId", "()Ljava/lang/String;", "orderTime", "", "getOrderTime", "()Ljava/lang/Long;", "levelType", "Lcom/kubi/core/base/order/data/OrderLevelType;", "getLevelType", "()Lcom/kubi/core/base/order/data/OrderLevelType;", "orderDisplayType", "getOrderDisplayType", "symbol", "getSymbol", "side", "Lcom/kubi/core/base/order/data/TradeSide;", "getSide", "()Lcom/kubi/core/base/order/data/TradeSide;", "size", "Ljava/math/BigDecimal;", "getSize", "()Ljava/math/BigDecimal;", "funds", "getFunds", "isHidden", "", "()Z", "isIceberg", "amountUnit", "getAmountUnit", "filledFunds", "getFilledFunds", "filledSize", "getFilledSize", "avgPrice", "getAvgPrice", "showSymbol", "getShowSymbol", "quoteIncrementPrecision", "", "getQuoteIncrementPrecision", "()Ljava/lang/Integer;", "baseIncrementPrecision", "getBaseIncrementPrecision", "Limit", "Market", "ConditionalLimit", "ConditionalMarket", "Lcom/kubi/core/biz/bottomtab/order/child/item/OrderItemData$ConditionalLimit;", "Lcom/kubi/core/biz/bottomtab/order/child/item/OrderItemData$ConditionalMarket;", "Lcom/kubi/core/biz/bottomtab/order/child/item/OrderItemData$Limit;", "Lcom/kubi/core/biz/bottomtab/order/child/item/OrderItemData$Market;", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface InterfaceC41007k {

    /* JADX INFO: renamed from: kd.k$a, reason: from toString */
    /* JADX INFO: compiled from: OrderItemData.kt */
    @Metadata(m90083d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001BÁ\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u000b\u0010:\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010;\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010 J\u000b\u0010<\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010@\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\t\u0010A\u001a\u00020\u000eHÆ\u0003J\t\u0010B\u001a\u00020\u000eHÆ\u0003J\u000b\u0010C\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010D\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010E\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010F\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010G\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010H\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010I\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010J\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010K\u001a\u0004\u0018\u00010\u0019HÆ\u0003¢\u0006\u0002\u00103J\u0010\u0010L\u001a\u0004\u0018\u00010\u0019HÆ\u0003¢\u0006\u0002\u00103Jî\u0001\u0010M\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÆ\u0001¢\u0006\u0002\u0010NJ\u0013\u0010O\u001a\u00020\u000e2\b\u0010P\u001a\u0004\u0018\u00010QHÖ\u0003J\t\u0010R\u001a\u00020\u0019HÖ\u0001J\t\u0010S\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\n\n\u0002\u0010!\u001a\u0004\b\u001f\u0010 R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001eR\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001eR\u0016\u0010\b\u001a\u0004\u0018\u00010\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0016\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0016\u0010\f\u001a\u0004\u0018\u00010\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010'R\u0014\u0010\r\u001a\u00020\u000eX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010)R\u0014\u0010\u000f\u001a\u00020\u000eX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010)R\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001eR\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010'R\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010'R\u0016\u0010\u0013\u001a\u0004\u0018\u00010\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010'R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b.\u0010'R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b/\u0010'R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b0\u0010\u001eR\u0016\u0010\u0017\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b1\u0010\u001eR\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0096\u0004¢\u0006\n\n\u0002\u00104\u001a\u0004\b2\u00103R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u0019X\u0096\u0004¢\u0006\n\n\u0002\u00104\u001a\u0004\b5\u00103R\u0014\u00106\u001a\u000207X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b8\u00109¨\u0006T"}, m90084d2 = {"Lcom/kubi/core/biz/bottomtab/order/child/item/OrderItemData$ConditionalLimit;", "Lcom/kubi/core/biz/bottomtab/order/child/item/OrderItemData;", "orderId", "", "orderTime", "", "orderDisplayType", "symbol", "side", "Lcom/kubi/core/base/order/data/TradeSide;", "size", "Ljava/math/BigDecimal;", "funds", "isHidden", "", "isIceberg", "amountUnit", "filledFunds", "filledSize", "avgPrice", FirebaseAnalytics.Param.PRICE, "triggerPrice", "triggerDirection", "showSymbol", "quoteIncrementPrecision", "", "baseIncrementPrecision", "<init>", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Lcom/kubi/core/base/order/data/TradeSide;Ljava/math/BigDecimal;Ljava/math/BigDecimal;ZZLjava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)V", "getOrderId", "()Ljava/lang/String;", "getOrderTime", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getOrderDisplayType", "getSymbol", "getSide", "()Lcom/kubi/core/base/order/data/TradeSide;", "getSize", "()Ljava/math/BigDecimal;", "getFunds", "()Z", "getAmountUnit", "getFilledFunds", "getFilledSize", "getAvgPrice", "getPrice", "getTriggerPrice", "getTriggerDirection", "getShowSymbol", "getQuoteIncrementPrecision", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getBaseIncrementPrecision", "levelType", "Lcom/kubi/core/base/order/data/OrderLevelType$Advanced;", "getLevelType", "()Lcom/kubi/core/base/order/data/OrderLevelType$Advanced;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "copy", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Lcom/kubi/core/base/order/data/TradeSide;Ljava/math/BigDecimal;Ljava/math/BigDecimal;ZZLjava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/kubi/core/biz/bottomtab/order/child/item/OrderItemData$ConditionalLimit;", "equals", "other", "", "hashCode", "toString", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class ConditionalLimit implements InterfaceC41007k {

        /* JADX INFO: renamed from: a, reason: from toString */
        @Nullable
        public final String orderId;

        /* JADX INFO: renamed from: b, reason: from toString */
        @Nullable
        public final Long orderTime;

        /* JADX INFO: renamed from: c, reason: from toString */
        @Nullable
        public final String orderDisplayType;

        /* JADX INFO: renamed from: d, reason: from toString */
        @Nullable
        public final String symbol;

        /* JADX INFO: renamed from: e, reason: from toString */
        @Nullable
        public final TradeSide side;

        /* JADX INFO: renamed from: f, reason: from toString */
        @Nullable
        public final BigDecimal size;

        /* JADX INFO: renamed from: g, reason: from toString */
        @Nullable
        public final BigDecimal funds;

        /* JADX INFO: renamed from: h, reason: from toString */
        public final boolean isHidden;

        /* JADX INFO: renamed from: i, reason: from toString */
        public final boolean isIceberg;

        /* JADX INFO: renamed from: j, reason: from toString */
        @Nullable
        public final String amountUnit;

        /* JADX INFO: renamed from: k, reason: from toString */
        @Nullable
        public final BigDecimal filledFunds;

        /* JADX INFO: renamed from: l, reason: from toString */
        @Nullable
        public final BigDecimal filledSize;

        /* JADX INFO: renamed from: m, reason: from toString */
        @Nullable
        public final BigDecimal avgPrice;

        /* JADX INFO: renamed from: n, reason: from toString */
        @Nullable
        public final BigDecimal price;

        /* JADX INFO: renamed from: o, reason: from toString */
        @Nullable
        public final BigDecimal triggerPrice;

        /* JADX INFO: renamed from: p, reason: from toString */
        @Nullable
        public final String triggerDirection;

        /* JADX INFO: renamed from: q, reason: from toString */
        @Nullable
        public final String showSymbol;

        /* JADX INFO: renamed from: r, reason: from toString */
        @Nullable
        public final Integer quoteIncrementPrecision;

        /* JADX INFO: renamed from: s, reason: from toString */
        @Nullable
        public final Integer baseIncrementPrecision;

        /* JADX INFO: renamed from: t */
        @NotNull
        public final OrderLevelType.Advanced f91164t = OrderLevelType.Advanced.INSTANCE;

        public ConditionalLimit(@Nullable String str, @Nullable Long l11, @Nullable String str2, @Nullable String str3, @Nullable TradeSide tradeSide, @Nullable BigDecimal bigDecimal, @Nullable BigDecimal bigDecimal2, boolean z11, boolean z12, @Nullable String str4, @Nullable BigDecimal bigDecimal3, @Nullable BigDecimal bigDecimal4, @Nullable BigDecimal bigDecimal5, @Nullable BigDecimal bigDecimal6, @Nullable BigDecimal bigDecimal7, @Nullable String str5, @Nullable String str6, @Nullable Integer num, @Nullable Integer num2) {
            this.orderId = str;
            this.orderTime = l11;
            this.orderDisplayType = str2;
            this.symbol = str3;
            this.side = tradeSide;
            this.size = bigDecimal;
            this.funds = bigDecimal2;
            this.isHidden = z11;
            this.isIceberg = z12;
            this.amountUnit = str4;
            this.filledFunds = bigDecimal3;
            this.filledSize = bigDecimal4;
            this.avgPrice = bigDecimal5;
            this.price = bigDecimal6;
            this.triggerPrice = bigDecimal7;
            this.triggerDirection = str5;
            this.showSymbol = str6;
            this.quoteIncrementPrecision = num;
            this.baseIncrementPrecision = num2;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ConditionalLimit)) {
                return false;
            }
            ConditionalLimit conditionalLimit = (ConditionalLimit) other;
            return Intrinsics.areEqual(this.orderId, conditionalLimit.orderId) && Intrinsics.areEqual(this.orderTime, conditionalLimit.orderTime) && Intrinsics.areEqual(this.orderDisplayType, conditionalLimit.orderDisplayType) && Intrinsics.areEqual(this.symbol, conditionalLimit.symbol) && Intrinsics.areEqual(this.side, conditionalLimit.side) && Intrinsics.areEqual(this.size, conditionalLimit.size) && Intrinsics.areEqual(this.funds, conditionalLimit.funds) && this.isHidden == conditionalLimit.isHidden && this.isIceberg == conditionalLimit.isIceberg && Intrinsics.areEqual(this.amountUnit, conditionalLimit.amountUnit) && Intrinsics.areEqual(this.filledFunds, conditionalLimit.filledFunds) && Intrinsics.areEqual(this.filledSize, conditionalLimit.filledSize) && Intrinsics.areEqual(this.avgPrice, conditionalLimit.avgPrice) && Intrinsics.areEqual(this.price, conditionalLimit.price) && Intrinsics.areEqual(this.triggerPrice, conditionalLimit.triggerPrice) && Intrinsics.areEqual(this.triggerDirection, conditionalLimit.triggerDirection) && Intrinsics.areEqual(this.showSymbol, conditionalLimit.showSymbol) && Intrinsics.areEqual(this.quoteIncrementPrecision, conditionalLimit.quoteIncrementPrecision) && Intrinsics.areEqual(this.baseIncrementPrecision, conditionalLimit.baseIncrementPrecision);
        }

        @Override // p401kd.InterfaceC41007k
        @Nullable
        /* JADX INFO: renamed from: a, reason: from getter */
        public String getShowSymbol() {
            return this.showSymbol;
        }

        @Override // p401kd.InterfaceC41007k
        @Nullable
        /* JADX INFO: renamed from: b, reason: from getter */
        public Integer getBaseIncrementPrecision() {
            return this.baseIncrementPrecision;
        }

        @Override // p401kd.InterfaceC41007k
        @Nullable
        /* JADX INFO: renamed from: c, reason: from getter */
        public String getOrderDisplayType() {
            return this.orderDisplayType;
        }

        @Override // p401kd.InterfaceC41007k
        @Nullable
        /* JADX INFO: renamed from: d, reason: from getter */
        public Integer getQuoteIncrementPrecision() {
            return this.quoteIncrementPrecision;
        }

        @Override // p401kd.InterfaceC41007k
        /* JADX INFO: renamed from: e, reason: from getter */
        public boolean getIsHidden() {
            return this.isHidden;
        }

        @Override // p401kd.InterfaceC41007k
        @Nullable
        /* JADX INFO: renamed from: f, reason: from getter */
        public BigDecimal getFilledSize() {
            return this.filledSize;
        }

        @Override // p401kd.InterfaceC41007k
        /* JADX INFO: renamed from: g, reason: from getter */
        public boolean getIsIceberg() {
            return this.isIceberg;
        }

        @Override // p401kd.InterfaceC41007k
        @Nullable
        public BigDecimal getFilledFunds() {
            return this.filledFunds;
        }

        @Override // p401kd.InterfaceC41007k
        @Nullable
        public BigDecimal getFunds() {
            return this.funds;
        }

        @Override // p401kd.InterfaceC41007k
        @Nullable
        public String getOrderId() {
            return this.orderId;
        }

        @Override // p401kd.InterfaceC41007k
        @Nullable
        public BigDecimal getSize() {
            return this.size;
        }

        @Override // p401kd.InterfaceC41007k
        @Nullable
        public String getSymbol() {
            return this.symbol;
        }

        @Nullable
        /* JADX INFO: renamed from: h, reason: from getter */
        public String getAmountUnit() {
            return this.amountUnit;
        }

        public int hashCode() {
            String str = this.orderId;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            Long l11 = this.orderTime;
            int iHashCode2 = (iHashCode + (l11 == null ? 0 : l11.hashCode())) * 31;
            String str2 = this.orderDisplayType;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.symbol;
            int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            TradeSide tradeSide = this.side;
            int iHashCode5 = (iHashCode4 + (tradeSide == null ? 0 : tradeSide.hashCode())) * 31;
            BigDecimal bigDecimal = this.size;
            int iHashCode6 = (iHashCode5 + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
            BigDecimal bigDecimal2 = this.funds;
            int iHashCode7 = (((((iHashCode6 + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31) + Boolean.hashCode(this.isHidden)) * 31) + Boolean.hashCode(this.isIceberg)) * 31;
            String str4 = this.amountUnit;
            int iHashCode8 = (iHashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
            BigDecimal bigDecimal3 = this.filledFunds;
            int iHashCode9 = (iHashCode8 + (bigDecimal3 == null ? 0 : bigDecimal3.hashCode())) * 31;
            BigDecimal bigDecimal4 = this.filledSize;
            int iHashCode10 = (iHashCode9 + (bigDecimal4 == null ? 0 : bigDecimal4.hashCode())) * 31;
            BigDecimal bigDecimal5 = this.avgPrice;
            int iHashCode11 = (iHashCode10 + (bigDecimal5 == null ? 0 : bigDecimal5.hashCode())) * 31;
            BigDecimal bigDecimal6 = this.price;
            int iHashCode12 = (iHashCode11 + (bigDecimal6 == null ? 0 : bigDecimal6.hashCode())) * 31;
            BigDecimal bigDecimal7 = this.triggerPrice;
            int iHashCode13 = (iHashCode12 + (bigDecimal7 == null ? 0 : bigDecimal7.hashCode())) * 31;
            String str5 = this.triggerDirection;
            int iHashCode14 = (iHashCode13 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.showSymbol;
            int iHashCode15 = (iHashCode14 + (str6 == null ? 0 : str6.hashCode())) * 31;
            Integer num = this.quoteIncrementPrecision;
            int iHashCode16 = (iHashCode15 + (num == null ? 0 : num.hashCode())) * 31;
            Integer num2 = this.baseIncrementPrecision;
            return iHashCode16 + (num2 != null ? num2.hashCode() : 0);
        }

        @Nullable
        /* JADX INFO: renamed from: i, reason: from getter */
        public Long getOrderTime() {
            return this.orderTime;
        }

        @Nullable
        /* JADX INFO: renamed from: j, reason: from getter */
        public final BigDecimal getPrice() {
            return this.price;
        }

        @Nullable
        /* JADX INFO: renamed from: k, reason: from getter */
        public TradeSide getSide() {
            return this.side;
        }

        @Nullable
        /* JADX INFO: renamed from: l, reason: from getter */
        public final String getTriggerDirection() {
            return this.triggerDirection;
        }

        @Nullable
        /* JADX INFO: renamed from: m, reason: from getter */
        public final BigDecimal getTriggerPrice() {
            return this.triggerPrice;
        }

        @NotNull
        public String toString() {
            return "ConditionalLimit(orderId=" + this.orderId + ", orderTime=" + this.orderTime + ", orderDisplayType=" + this.orderDisplayType + ", symbol=" + this.symbol + ", side=" + this.side + ", size=" + this.size + ", funds=" + this.funds + ", isHidden=" + this.isHidden + ", isIceberg=" + this.isIceberg + ", amountUnit=" + this.amountUnit + ", filledFunds=" + this.filledFunds + ", filledSize=" + this.filledSize + ", avgPrice=" + this.avgPrice + ", price=" + this.price + ", triggerPrice=" + this.triggerPrice + ", triggerDirection=" + this.triggerDirection + ", showSymbol=" + this.showSymbol + ", quoteIncrementPrecision=" + this.quoteIncrementPrecision + ", baseIncrementPrecision=" + this.baseIncrementPrecision + ')';
        }
    }

    /* JADX INFO: renamed from: kd.k$b, reason: from toString */
    /* JADX INFO: compiled from: OrderItemData.kt */
    @Metadata(m90083d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B·\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u000b\u00108\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u00109\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u001fJ\u000b\u0010:\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\t\u0010?\u001a\u00020\u000eHÆ\u0003J\t\u0010@\u001a\u00020\u000eHÆ\u0003J\u000b\u0010A\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010B\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010C\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010D\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010E\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010F\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010G\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010H\u001a\u0004\u0018\u00010\u0018HÆ\u0003¢\u0006\u0002\u00101J\u0010\u0010I\u001a\u0004\u0018\u00010\u0018HÆ\u0003¢\u0006\u0002\u00101Jâ\u0001\u0010J\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÆ\u0001¢\u0006\u0002\u0010KJ\u0013\u0010L\u001a\u00020\u000e2\b\u0010M\u001a\u0004\u0018\u00010NHÖ\u0003J\t\u0010O\u001a\u00020\u0018HÖ\u0001J\t\u0010P\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\n\n\u0002\u0010 \u001a\u0004\b\u001e\u0010\u001fR\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001dR\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001dR\u0016\u0010\b\u001a\u0004\u0018\u00010\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0016\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0016\u0010\f\u001a\u0004\u0018\u00010\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010&R\u0014\u0010\r\u001a\u00020\u000eX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010(R\u0014\u0010\u000f\u001a\u00020\u000eX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010(R\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001dR\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010&R\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010&R\u0016\u0010\u0013\u001a\u0004\u0018\u00010\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010&R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b-\u0010&R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b.\u0010\u001dR\u0016\u0010\u0016\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b/\u0010\u001dR\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0096\u0004¢\u0006\n\n\u0002\u00102\u001a\u0004\b0\u00101R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u0018X\u0096\u0004¢\u0006\n\n\u0002\u00102\u001a\u0004\b3\u00101R\u0014\u00104\u001a\u000205X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b6\u00107¨\u0006Q"}, m90084d2 = {"Lcom/kubi/core/biz/bottomtab/order/child/item/OrderItemData$ConditionalMarket;", "Lcom/kubi/core/biz/bottomtab/order/child/item/OrderItemData;", "orderId", "", "orderTime", "", "orderDisplayType", "symbol", "side", "Lcom/kubi/core/base/order/data/TradeSide;", "size", "Ljava/math/BigDecimal;", "funds", "isHidden", "", "isIceberg", "amountUnit", "filledFunds", "filledSize", "avgPrice", "triggerPrice", "triggerDirection", "showSymbol", "quoteIncrementPrecision", "", "baseIncrementPrecision", "<init>", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Lcom/kubi/core/base/order/data/TradeSide;Ljava/math/BigDecimal;Ljava/math/BigDecimal;ZZLjava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)V", "getOrderId", "()Ljava/lang/String;", "getOrderTime", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getOrderDisplayType", "getSymbol", "getSide", "()Lcom/kubi/core/base/order/data/TradeSide;", "getSize", "()Ljava/math/BigDecimal;", "getFunds", "()Z", "getAmountUnit", "getFilledFunds", "getFilledSize", "getAvgPrice", "getTriggerPrice", "getTriggerDirection", "getShowSymbol", "getQuoteIncrementPrecision", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getBaseIncrementPrecision", "levelType", "Lcom/kubi/core/base/order/data/OrderLevelType$Advanced;", "getLevelType", "()Lcom/kubi/core/base/order/data/OrderLevelType$Advanced;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "copy", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Lcom/kubi/core/base/order/data/TradeSide;Ljava/math/BigDecimal;Ljava/math/BigDecimal;ZZLjava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/kubi/core/biz/bottomtab/order/child/item/OrderItemData$ConditionalMarket;", "equals", "other", "", "hashCode", "toString", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class ConditionalMarket implements InterfaceC41007k {

        /* JADX INFO: renamed from: a, reason: from toString */
        @Nullable
        public final String orderId;

        /* JADX INFO: renamed from: b, reason: from toString */
        @Nullable
        public final Long orderTime;

        /* JADX INFO: renamed from: c, reason: from toString */
        @Nullable
        public final String orderDisplayType;

        /* JADX INFO: renamed from: d, reason: from toString */
        @Nullable
        public final String symbol;

        /* JADX INFO: renamed from: e, reason: from toString */
        @Nullable
        public final TradeSide side;

        /* JADX INFO: renamed from: f, reason: from toString */
        @Nullable
        public final BigDecimal size;

        /* JADX INFO: renamed from: g, reason: from toString */
        @Nullable
        public final BigDecimal funds;

        /* JADX INFO: renamed from: h, reason: from toString */
        public final boolean isHidden;

        /* JADX INFO: renamed from: i, reason: from toString */
        public final boolean isIceberg;

        /* JADX INFO: renamed from: j, reason: from toString */
        @Nullable
        public final String amountUnit;

        /* JADX INFO: renamed from: k, reason: from toString */
        @Nullable
        public final BigDecimal filledFunds;

        /* JADX INFO: renamed from: l, reason: from toString */
        @Nullable
        public final BigDecimal filledSize;

        /* JADX INFO: renamed from: m, reason: from toString */
        @Nullable
        public final BigDecimal avgPrice;

        /* JADX INFO: renamed from: n, reason: from toString */
        @Nullable
        public final BigDecimal triggerPrice;

        /* JADX INFO: renamed from: o, reason: from toString */
        @Nullable
        public final String triggerDirection;

        /* JADX INFO: renamed from: p, reason: from toString */
        @Nullable
        public final String showSymbol;

        /* JADX INFO: renamed from: q, reason: from toString */
        @Nullable
        public final Integer quoteIncrementPrecision;

        /* JADX INFO: renamed from: r, reason: from toString */
        @Nullable
        public final Integer baseIncrementPrecision;

        /* JADX INFO: renamed from: s */
        @NotNull
        public final OrderLevelType.Advanced f91183s = OrderLevelType.Advanced.INSTANCE;

        public ConditionalMarket(@Nullable String str, @Nullable Long l11, @Nullable String str2, @Nullable String str3, @Nullable TradeSide tradeSide, @Nullable BigDecimal bigDecimal, @Nullable BigDecimal bigDecimal2, boolean z11, boolean z12, @Nullable String str4, @Nullable BigDecimal bigDecimal3, @Nullable BigDecimal bigDecimal4, @Nullable BigDecimal bigDecimal5, @Nullable BigDecimal bigDecimal6, @Nullable String str5, @Nullable String str6, @Nullable Integer num, @Nullable Integer num2) {
            this.orderId = str;
            this.orderTime = l11;
            this.orderDisplayType = str2;
            this.symbol = str3;
            this.side = tradeSide;
            this.size = bigDecimal;
            this.funds = bigDecimal2;
            this.isHidden = z11;
            this.isIceberg = z12;
            this.amountUnit = str4;
            this.filledFunds = bigDecimal3;
            this.filledSize = bigDecimal4;
            this.avgPrice = bigDecimal5;
            this.triggerPrice = bigDecimal6;
            this.triggerDirection = str5;
            this.showSymbol = str6;
            this.quoteIncrementPrecision = num;
            this.baseIncrementPrecision = num2;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ConditionalMarket)) {
                return false;
            }
            ConditionalMarket conditionalMarket = (ConditionalMarket) other;
            return Intrinsics.areEqual(this.orderId, conditionalMarket.orderId) && Intrinsics.areEqual(this.orderTime, conditionalMarket.orderTime) && Intrinsics.areEqual(this.orderDisplayType, conditionalMarket.orderDisplayType) && Intrinsics.areEqual(this.symbol, conditionalMarket.symbol) && Intrinsics.areEqual(this.side, conditionalMarket.side) && Intrinsics.areEqual(this.size, conditionalMarket.size) && Intrinsics.areEqual(this.funds, conditionalMarket.funds) && this.isHidden == conditionalMarket.isHidden && this.isIceberg == conditionalMarket.isIceberg && Intrinsics.areEqual(this.amountUnit, conditionalMarket.amountUnit) && Intrinsics.areEqual(this.filledFunds, conditionalMarket.filledFunds) && Intrinsics.areEqual(this.filledSize, conditionalMarket.filledSize) && Intrinsics.areEqual(this.avgPrice, conditionalMarket.avgPrice) && Intrinsics.areEqual(this.triggerPrice, conditionalMarket.triggerPrice) && Intrinsics.areEqual(this.triggerDirection, conditionalMarket.triggerDirection) && Intrinsics.areEqual(this.showSymbol, conditionalMarket.showSymbol) && Intrinsics.areEqual(this.quoteIncrementPrecision, conditionalMarket.quoteIncrementPrecision) && Intrinsics.areEqual(this.baseIncrementPrecision, conditionalMarket.baseIncrementPrecision);
        }

        @Override // p401kd.InterfaceC41007k
        @Nullable
        /* JADX INFO: renamed from: a, reason: from getter */
        public String getShowSymbol() {
            return this.showSymbol;
        }

        @Override // p401kd.InterfaceC41007k
        @Nullable
        /* JADX INFO: renamed from: b, reason: from getter */
        public Integer getBaseIncrementPrecision() {
            return this.baseIncrementPrecision;
        }

        @Override // p401kd.InterfaceC41007k
        @Nullable
        /* JADX INFO: renamed from: c, reason: from getter */
        public String getOrderDisplayType() {
            return this.orderDisplayType;
        }

        @Override // p401kd.InterfaceC41007k
        @Nullable
        /* JADX INFO: renamed from: d, reason: from getter */
        public Integer getQuoteIncrementPrecision() {
            return this.quoteIncrementPrecision;
        }

        @Override // p401kd.InterfaceC41007k
        /* JADX INFO: renamed from: e, reason: from getter */
        public boolean getIsHidden() {
            return this.isHidden;
        }

        @Override // p401kd.InterfaceC41007k
        @Nullable
        /* JADX INFO: renamed from: f, reason: from getter */
        public BigDecimal getFilledSize() {
            return this.filledSize;
        }

        @Override // p401kd.InterfaceC41007k
        /* JADX INFO: renamed from: g, reason: from getter */
        public boolean getIsIceberg() {
            return this.isIceberg;
        }

        @Override // p401kd.InterfaceC41007k
        @Nullable
        public BigDecimal getFilledFunds() {
            return this.filledFunds;
        }

        @Override // p401kd.InterfaceC41007k
        @Nullable
        public BigDecimal getFunds() {
            return this.funds;
        }

        @Override // p401kd.InterfaceC41007k
        @Nullable
        public String getOrderId() {
            return this.orderId;
        }

        @Override // p401kd.InterfaceC41007k
        @Nullable
        public BigDecimal getSize() {
            return this.size;
        }

        @Override // p401kd.InterfaceC41007k
        @Nullable
        public String getSymbol() {
            return this.symbol;
        }

        @Nullable
        /* JADX INFO: renamed from: h, reason: from getter */
        public String getAmountUnit() {
            return this.amountUnit;
        }

        public int hashCode() {
            String str = this.orderId;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            Long l11 = this.orderTime;
            int iHashCode2 = (iHashCode + (l11 == null ? 0 : l11.hashCode())) * 31;
            String str2 = this.orderDisplayType;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.symbol;
            int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            TradeSide tradeSide = this.side;
            int iHashCode5 = (iHashCode4 + (tradeSide == null ? 0 : tradeSide.hashCode())) * 31;
            BigDecimal bigDecimal = this.size;
            int iHashCode6 = (iHashCode5 + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
            BigDecimal bigDecimal2 = this.funds;
            int iHashCode7 = (((((iHashCode6 + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31) + Boolean.hashCode(this.isHidden)) * 31) + Boolean.hashCode(this.isIceberg)) * 31;
            String str4 = this.amountUnit;
            int iHashCode8 = (iHashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
            BigDecimal bigDecimal3 = this.filledFunds;
            int iHashCode9 = (iHashCode8 + (bigDecimal3 == null ? 0 : bigDecimal3.hashCode())) * 31;
            BigDecimal bigDecimal4 = this.filledSize;
            int iHashCode10 = (iHashCode9 + (bigDecimal4 == null ? 0 : bigDecimal4.hashCode())) * 31;
            BigDecimal bigDecimal5 = this.avgPrice;
            int iHashCode11 = (iHashCode10 + (bigDecimal5 == null ? 0 : bigDecimal5.hashCode())) * 31;
            BigDecimal bigDecimal6 = this.triggerPrice;
            int iHashCode12 = (iHashCode11 + (bigDecimal6 == null ? 0 : bigDecimal6.hashCode())) * 31;
            String str5 = this.triggerDirection;
            int iHashCode13 = (iHashCode12 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.showSymbol;
            int iHashCode14 = (iHashCode13 + (str6 == null ? 0 : str6.hashCode())) * 31;
            Integer num = this.quoteIncrementPrecision;
            int iHashCode15 = (iHashCode14 + (num == null ? 0 : num.hashCode())) * 31;
            Integer num2 = this.baseIncrementPrecision;
            return iHashCode15 + (num2 != null ? num2.hashCode() : 0);
        }

        @Nullable
        /* JADX INFO: renamed from: i, reason: from getter */
        public Long getOrderTime() {
            return this.orderTime;
        }

        @Nullable
        /* JADX INFO: renamed from: j, reason: from getter */
        public TradeSide getSide() {
            return this.side;
        }

        @Nullable
        /* JADX INFO: renamed from: k, reason: from getter */
        public final String getTriggerDirection() {
            return this.triggerDirection;
        }

        @Nullable
        /* JADX INFO: renamed from: l, reason: from getter */
        public final BigDecimal getTriggerPrice() {
            return this.triggerPrice;
        }

        @NotNull
        public String toString() {
            return "ConditionalMarket(orderId=" + this.orderId + ", orderTime=" + this.orderTime + ", orderDisplayType=" + this.orderDisplayType + ", symbol=" + this.symbol + ", side=" + this.side + ", size=" + this.size + ", funds=" + this.funds + ", isHidden=" + this.isHidden + ", isIceberg=" + this.isIceberg + ", amountUnit=" + this.amountUnit + ", filledFunds=" + this.filledFunds + ", filledSize=" + this.filledSize + ", avgPrice=" + this.avgPrice + ", triggerPrice=" + this.triggerPrice + ", triggerDirection=" + this.triggerDirection + ", showSymbol=" + this.showSymbol + ", quoteIncrementPrecision=" + this.quoteIncrementPrecision + ", baseIncrementPrecision=" + this.baseIncrementPrecision + ')';
        }
    }

    /* JADX INFO: renamed from: kd.k$c, reason: from toString */
    /* JADX INFO: compiled from: OrderItemData.kt */
    @Metadata(m90083d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B\u00ad\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0019\u0010\u001aJ\u000b\u00106\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u00107\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u001eJ\u000b\u00108\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\t\u0010=\u001a\u00020\u000eHÆ\u0003J\t\u0010>\u001a\u00020\u000eHÆ\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010@\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010A\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010B\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010C\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010D\u001a\u0004\u0018\u00010\u0016HÆ\u0003¢\u0006\u0002\u0010.J\u0010\u0010E\u001a\u0004\u0018\u00010\u0016HÆ\u0003¢\u0006\u0002\u0010.J\u000b\u0010F\u001a\u0004\u0018\u00010\u000bHÆ\u0003JÖ\u0001\u0010G\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0002\u0010HJ\u0013\u0010I\u001a\u00020\u000e2\b\u0010J\u001a\u0004\u0018\u00010KHÖ\u0003J\t\u0010L\u001a\u00020\u0016HÖ\u0001J\t\u0010M\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\n\n\u0002\u0010\u001f\u001a\u0004\b\u001d\u0010\u001eR\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001cR\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001cR\u0016\u0010\b\u001a\u0004\u0018\u00010\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0016\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0016\u0010\f\u001a\u0004\u0018\u00010\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010%R\u0014\u0010\r\u001a\u00020\u000eX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010'R\u0014\u0010\u000f\u001a\u00020\u000eX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010'R\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001cR\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010%R\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010%R\u0016\u0010\u0013\u001a\u0004\u0018\u00010\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010%R\u0016\u0010\u0014\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\u001cR\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0096\u0004¢\u0006\n\n\u0002\u0010/\u001a\u0004\b-\u0010.R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u0016X\u0096\u0004¢\u0006\n\n\u0002\u0010/\u001a\u0004\b0\u0010.R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b1\u0010%R\u0014\u00102\u001a\u000203X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b4\u00105¨\u0006N"}, m90084d2 = {"Lcom/kubi/core/biz/bottomtab/order/child/item/OrderItemData$Limit;", "Lcom/kubi/core/biz/bottomtab/order/child/item/OrderItemData;", "orderId", "", "orderTime", "", "orderDisplayType", "symbol", "side", "Lcom/kubi/core/base/order/data/TradeSide;", "size", "Ljava/math/BigDecimal;", "funds", "isHidden", "", "isIceberg", "amountUnit", "filledFunds", "filledSize", "avgPrice", "showSymbol", "quoteIncrementPrecision", "", "baseIncrementPrecision", FirebaseAnalytics.Param.PRICE, "<init>", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Lcom/kubi/core/base/order/data/TradeSide;Ljava/math/BigDecimal;Ljava/math/BigDecimal;ZZLjava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/math/BigDecimal;)V", "getOrderId", "()Ljava/lang/String;", "getOrderTime", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getOrderDisplayType", "getSymbol", "getSide", "()Lcom/kubi/core/base/order/data/TradeSide;", "getSize", "()Ljava/math/BigDecimal;", "getFunds", "()Z", "getAmountUnit", "getFilledFunds", "getFilledSize", "getAvgPrice", "getShowSymbol", "getQuoteIncrementPrecision", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getBaseIncrementPrecision", "getPrice", "levelType", "Lcom/kubi/core/base/order/data/OrderLevelType$Normal;", "getLevelType", "()Lcom/kubi/core/base/order/data/OrderLevelType$Normal;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "copy", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Lcom/kubi/core/base/order/data/TradeSide;Ljava/math/BigDecimal;Ljava/math/BigDecimal;ZZLjava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/math/BigDecimal;)Lcom/kubi/core/biz/bottomtab/order/child/item/OrderItemData$Limit;", "equals", "other", "", "hashCode", "toString", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class Limit implements InterfaceC41007k {

        /* JADX INFO: renamed from: a, reason: from toString */
        @Nullable
        public final String orderId;

        /* JADX INFO: renamed from: b, reason: from toString */
        @Nullable
        public final Long orderTime;

        /* JADX INFO: renamed from: c, reason: from toString */
        @Nullable
        public final String orderDisplayType;

        /* JADX INFO: renamed from: d, reason: from toString */
        @Nullable
        public final String symbol;

        /* JADX INFO: renamed from: e, reason: from toString */
        @Nullable
        public final TradeSide side;

        /* JADX INFO: renamed from: f, reason: from toString */
        @Nullable
        public final BigDecimal size;

        /* JADX INFO: renamed from: g, reason: from toString */
        @Nullable
        public final BigDecimal funds;

        /* JADX INFO: renamed from: h, reason: from toString */
        public final boolean isHidden;

        /* JADX INFO: renamed from: i, reason: from toString */
        public final boolean isIceberg;

        /* JADX INFO: renamed from: j, reason: from toString */
        @Nullable
        public final String amountUnit;

        /* JADX INFO: renamed from: k, reason: from toString */
        @Nullable
        public final BigDecimal filledFunds;

        /* JADX INFO: renamed from: l, reason: from toString */
        @Nullable
        public final BigDecimal filledSize;

        /* JADX INFO: renamed from: m, reason: from toString */
        @Nullable
        public final BigDecimal avgPrice;

        /* JADX INFO: renamed from: n, reason: from toString */
        @Nullable
        public final String showSymbol;

        /* JADX INFO: renamed from: o, reason: from toString */
        @Nullable
        public final Integer quoteIncrementPrecision;

        /* JADX INFO: renamed from: p, reason: from toString */
        @Nullable
        public final Integer baseIncrementPrecision;

        /* JADX INFO: renamed from: q, reason: from toString */
        @Nullable
        public final BigDecimal price;

        /* JADX INFO: renamed from: r */
        @NotNull
        public final OrderLevelType.Normal f91201r = OrderLevelType.Normal.INSTANCE;

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Limit)) {
                return false;
            }
            Limit limit = (Limit) other;
            return Intrinsics.areEqual(this.orderId, limit.orderId) && Intrinsics.areEqual(this.orderTime, limit.orderTime) && Intrinsics.areEqual(this.orderDisplayType, limit.orderDisplayType) && Intrinsics.areEqual(this.symbol, limit.symbol) && Intrinsics.areEqual(this.side, limit.side) && Intrinsics.areEqual(this.size, limit.size) && Intrinsics.areEqual(this.funds, limit.funds) && this.isHidden == limit.isHidden && this.isIceberg == limit.isIceberg && Intrinsics.areEqual(this.amountUnit, limit.amountUnit) && Intrinsics.areEqual(this.filledFunds, limit.filledFunds) && Intrinsics.areEqual(this.filledSize, limit.filledSize) && Intrinsics.areEqual(this.avgPrice, limit.avgPrice) && Intrinsics.areEqual(this.showSymbol, limit.showSymbol) && Intrinsics.areEqual(this.quoteIncrementPrecision, limit.quoteIncrementPrecision) && Intrinsics.areEqual(this.baseIncrementPrecision, limit.baseIncrementPrecision) && Intrinsics.areEqual(this.price, limit.price);
        }

        @Override // p401kd.InterfaceC41007k
        @Nullable
        /* JADX INFO: renamed from: a, reason: from getter */
        public String getShowSymbol() {
            return this.showSymbol;
        }

        @Override // p401kd.InterfaceC41007k
        @Nullable
        /* JADX INFO: renamed from: b, reason: from getter */
        public Integer getBaseIncrementPrecision() {
            return this.baseIncrementPrecision;
        }

        @Override // p401kd.InterfaceC41007k
        @Nullable
        /* JADX INFO: renamed from: c, reason: from getter */
        public String getOrderDisplayType() {
            return this.orderDisplayType;
        }

        @Override // p401kd.InterfaceC41007k
        @Nullable
        /* JADX INFO: renamed from: d, reason: from getter */
        public Integer getQuoteIncrementPrecision() {
            return this.quoteIncrementPrecision;
        }

        @Override // p401kd.InterfaceC41007k
        /* JADX INFO: renamed from: e, reason: from getter */
        public boolean getIsHidden() {
            return this.isHidden;
        }

        @Override // p401kd.InterfaceC41007k
        @Nullable
        /* JADX INFO: renamed from: f, reason: from getter */
        public BigDecimal getFilledSize() {
            return this.filledSize;
        }

        @Override // p401kd.InterfaceC41007k
        /* JADX INFO: renamed from: g, reason: from getter */
        public boolean getIsIceberg() {
            return this.isIceberg;
        }

        @Override // p401kd.InterfaceC41007k
        @Nullable
        public BigDecimal getFilledFunds() {
            return this.filledFunds;
        }

        @Override // p401kd.InterfaceC41007k
        @Nullable
        public BigDecimal getFunds() {
            return this.funds;
        }

        @Override // p401kd.InterfaceC41007k
        @Nullable
        public String getOrderId() {
            return this.orderId;
        }

        @Override // p401kd.InterfaceC41007k
        @Nullable
        public BigDecimal getSize() {
            return this.size;
        }

        @Override // p401kd.InterfaceC41007k
        @Nullable
        public String getSymbol() {
            return this.symbol;
        }

        @Nullable
        /* JADX INFO: renamed from: h, reason: from getter */
        public String getAmountUnit() {
            return this.amountUnit;
        }

        public int hashCode() {
            String str = this.orderId;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            Long l11 = this.orderTime;
            int iHashCode2 = (iHashCode + (l11 == null ? 0 : l11.hashCode())) * 31;
            String str2 = this.orderDisplayType;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.symbol;
            int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            TradeSide tradeSide = this.side;
            int iHashCode5 = (iHashCode4 + (tradeSide == null ? 0 : tradeSide.hashCode())) * 31;
            BigDecimal bigDecimal = this.size;
            int iHashCode6 = (iHashCode5 + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
            BigDecimal bigDecimal2 = this.funds;
            int iHashCode7 = (((((iHashCode6 + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31) + Boolean.hashCode(this.isHidden)) * 31) + Boolean.hashCode(this.isIceberg)) * 31;
            String str4 = this.amountUnit;
            int iHashCode8 = (iHashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
            BigDecimal bigDecimal3 = this.filledFunds;
            int iHashCode9 = (iHashCode8 + (bigDecimal3 == null ? 0 : bigDecimal3.hashCode())) * 31;
            BigDecimal bigDecimal4 = this.filledSize;
            int iHashCode10 = (iHashCode9 + (bigDecimal4 == null ? 0 : bigDecimal4.hashCode())) * 31;
            BigDecimal bigDecimal5 = this.avgPrice;
            int iHashCode11 = (iHashCode10 + (bigDecimal5 == null ? 0 : bigDecimal5.hashCode())) * 31;
            String str5 = this.showSymbol;
            int iHashCode12 = (iHashCode11 + (str5 == null ? 0 : str5.hashCode())) * 31;
            Integer num = this.quoteIncrementPrecision;
            int iHashCode13 = (iHashCode12 + (num == null ? 0 : num.hashCode())) * 31;
            Integer num2 = this.baseIncrementPrecision;
            int iHashCode14 = (iHashCode13 + (num2 == null ? 0 : num2.hashCode())) * 31;
            BigDecimal bigDecimal6 = this.price;
            return iHashCode14 + (bigDecimal6 != null ? bigDecimal6.hashCode() : 0);
        }

        @Nullable
        /* JADX INFO: renamed from: i, reason: from getter */
        public Long getOrderTime() {
            return this.orderTime;
        }

        @Nullable
        /* JADX INFO: renamed from: j, reason: from getter */
        public final BigDecimal getPrice() {
            return this.price;
        }

        @Nullable
        /* JADX INFO: renamed from: k, reason: from getter */
        public TradeSide getSide() {
            return this.side;
        }

        @NotNull
        public String toString() {
            return "Limit(orderId=" + this.orderId + ", orderTime=" + this.orderTime + ", orderDisplayType=" + this.orderDisplayType + ", symbol=" + this.symbol + ", side=" + this.side + ", size=" + this.size + ", funds=" + this.funds + ", isHidden=" + this.isHidden + ", isIceberg=" + this.isIceberg + ", amountUnit=" + this.amountUnit + ", filledFunds=" + this.filledFunds + ", filledSize=" + this.filledSize + ", avgPrice=" + this.avgPrice + ", showSymbol=" + this.showSymbol + ", quoteIncrementPrecision=" + this.quoteIncrementPrecision + ", baseIncrementPrecision=" + this.baseIncrementPrecision + ", price=" + this.price + ')';
        }

        public Limit(@Nullable String str, @Nullable Long l11, @Nullable String str2, @Nullable String str3, @Nullable TradeSide tradeSide, @Nullable BigDecimal bigDecimal, @Nullable BigDecimal bigDecimal2, boolean z11, boolean z12, @Nullable String str4, @Nullable BigDecimal bigDecimal3, @Nullable BigDecimal bigDecimal4, @Nullable BigDecimal bigDecimal5, @Nullable String str5, @Nullable Integer num, @Nullable Integer num2, @Nullable BigDecimal bigDecimal6) {
            this.orderId = str;
            this.orderTime = l11;
            this.orderDisplayType = str2;
            this.symbol = str3;
            this.side = tradeSide;
            this.size = bigDecimal;
            this.funds = bigDecimal2;
            this.isHidden = z11;
            this.isIceberg = z12;
            this.amountUnit = str4;
            this.filledFunds = bigDecimal3;
            this.filledSize = bigDecimal4;
            this.avgPrice = bigDecimal5;
            this.showSymbol = str5;
            this.quoteIncrementPrecision = num;
            this.baseIncrementPrecision = num2;
            this.price = bigDecimal6;
        }
    }

    /* JADX INFO: renamed from: kd.k$d, reason: from toString */
    /* JADX INFO: compiled from: OrderItemData.kt */
    @Metadata(m90083d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B£\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000b\u00104\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u00105\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u001dJ\u000b\u00106\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\t\u0010;\u001a\u00020\u000eHÆ\u0003J\t\u0010<\u001a\u00020\u000eHÆ\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010@\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010A\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010B\u001a\u0004\u0018\u00010\u0016HÆ\u0003¢\u0006\u0002\u0010-J\u0010\u0010C\u001a\u0004\u0018\u00010\u0016HÆ\u0003¢\u0006\u0002\u0010-JÊ\u0001\u0010D\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÆ\u0001¢\u0006\u0002\u0010EJ\u0013\u0010F\u001a\u00020\u000e2\b\u0010G\u001a\u0004\u0018\u00010HHÖ\u0003J\t\u0010I\u001a\u00020\u0016HÖ\u0001J\t\u0010J\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\n\n\u0002\u0010\u001e\u001a\u0004\b\u001c\u0010\u001dR\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001bR\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001bR\u0016\u0010\b\u001a\u0004\u0018\u00010\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0016\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0016\u0010\f\u001a\u0004\u0018\u00010\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010$R\u0014\u0010\r\u001a\u00020\u000eX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010&R\u0014\u0010\u000f\u001a\u00020\u000eX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010&R\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001bR\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010$R\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010$R\u0016\u0010\u0013\u001a\u0004\u0018\u00010\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010$R\u0016\u0010\u0014\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001bR\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0096\u0004¢\u0006\n\n\u0002\u0010.\u001a\u0004\b,\u0010-R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u0016X\u0096\u0004¢\u0006\n\n\u0002\u0010.\u001a\u0004\b/\u0010-R\u0014\u00100\u001a\u000201X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b2\u00103¨\u0006K"}, m90084d2 = {"Lcom/kubi/core/biz/bottomtab/order/child/item/OrderItemData$Market;", "Lcom/kubi/core/biz/bottomtab/order/child/item/OrderItemData;", "orderId", "", "orderTime", "", "orderDisplayType", "symbol", "side", "Lcom/kubi/core/base/order/data/TradeSide;", "size", "Ljava/math/BigDecimal;", "funds", "isHidden", "", "isIceberg", "amountUnit", "filledFunds", "filledSize", "avgPrice", "showSymbol", "quoteIncrementPrecision", "", "baseIncrementPrecision", "<init>", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Lcom/kubi/core/base/order/data/TradeSide;Ljava/math/BigDecimal;Ljava/math/BigDecimal;ZZLjava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)V", "getOrderId", "()Ljava/lang/String;", "getOrderTime", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getOrderDisplayType", "getSymbol", "getSide", "()Lcom/kubi/core/base/order/data/TradeSide;", "getSize", "()Ljava/math/BigDecimal;", "getFunds", "()Z", "getAmountUnit", "getFilledFunds", "getFilledSize", "getAvgPrice", "getShowSymbol", "getQuoteIncrementPrecision", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getBaseIncrementPrecision", "levelType", "Lcom/kubi/core/base/order/data/OrderLevelType$Normal;", "getLevelType", "()Lcom/kubi/core/base/order/data/OrderLevelType$Normal;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "copy", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Lcom/kubi/core/base/order/data/TradeSide;Ljava/math/BigDecimal;Ljava/math/BigDecimal;ZZLjava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/kubi/core/biz/bottomtab/order/child/item/OrderItemData$Market;", "equals", "other", "", "hashCode", "toString", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class Market implements InterfaceC41007k {

        /* JADX INFO: renamed from: a, reason: from toString */
        @Nullable
        public final String orderId;

        /* JADX INFO: renamed from: b, reason: from toString */
        @Nullable
        public final Long orderTime;

        /* JADX INFO: renamed from: c, reason: from toString */
        @Nullable
        public final String orderDisplayType;

        /* JADX INFO: renamed from: d, reason: from toString */
        @Nullable
        public final String symbol;

        /* JADX INFO: renamed from: e, reason: from toString */
        @Nullable
        public final TradeSide side;

        /* JADX INFO: renamed from: f, reason: from toString */
        @Nullable
        public final BigDecimal size;

        /* JADX INFO: renamed from: g, reason: from toString */
        @Nullable
        public final BigDecimal funds;

        /* JADX INFO: renamed from: h, reason: from toString */
        public final boolean isHidden;

        /* JADX INFO: renamed from: i, reason: from toString */
        public final boolean isIceberg;

        /* JADX INFO: renamed from: j, reason: from toString */
        @Nullable
        public final String amountUnit;

        /* JADX INFO: renamed from: k, reason: from toString */
        @Nullable
        public final BigDecimal filledFunds;

        /* JADX INFO: renamed from: l, reason: from toString */
        @Nullable
        public final BigDecimal filledSize;

        /* JADX INFO: renamed from: m, reason: from toString */
        @Nullable
        public final BigDecimal avgPrice;

        /* JADX INFO: renamed from: n, reason: from toString */
        @Nullable
        public final String showSymbol;

        /* JADX INFO: renamed from: o, reason: from toString */
        @Nullable
        public final Integer quoteIncrementPrecision;

        /* JADX INFO: renamed from: p, reason: from toString */
        @Nullable
        public final Integer baseIncrementPrecision;

        /* JADX INFO: renamed from: q */
        @NotNull
        public final OrderLevelType.Normal f91218q = OrderLevelType.Normal.INSTANCE;

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Market)) {
                return false;
            }
            Market market = (Market) other;
            return Intrinsics.areEqual(this.orderId, market.orderId) && Intrinsics.areEqual(this.orderTime, market.orderTime) && Intrinsics.areEqual(this.orderDisplayType, market.orderDisplayType) && Intrinsics.areEqual(this.symbol, market.symbol) && Intrinsics.areEqual(this.side, market.side) && Intrinsics.areEqual(this.size, market.size) && Intrinsics.areEqual(this.funds, market.funds) && this.isHidden == market.isHidden && this.isIceberg == market.isIceberg && Intrinsics.areEqual(this.amountUnit, market.amountUnit) && Intrinsics.areEqual(this.filledFunds, market.filledFunds) && Intrinsics.areEqual(this.filledSize, market.filledSize) && Intrinsics.areEqual(this.avgPrice, market.avgPrice) && Intrinsics.areEqual(this.showSymbol, market.showSymbol) && Intrinsics.areEqual(this.quoteIncrementPrecision, market.quoteIncrementPrecision) && Intrinsics.areEqual(this.baseIncrementPrecision, market.baseIncrementPrecision);
        }

        @Override // p401kd.InterfaceC41007k
        @Nullable
        /* JADX INFO: renamed from: a, reason: from getter */
        public String getShowSymbol() {
            return this.showSymbol;
        }

        @Override // p401kd.InterfaceC41007k
        @Nullable
        /* JADX INFO: renamed from: b, reason: from getter */
        public Integer getBaseIncrementPrecision() {
            return this.baseIncrementPrecision;
        }

        @Override // p401kd.InterfaceC41007k
        @Nullable
        /* JADX INFO: renamed from: c, reason: from getter */
        public String getOrderDisplayType() {
            return this.orderDisplayType;
        }

        @Override // p401kd.InterfaceC41007k
        @Nullable
        /* JADX INFO: renamed from: d, reason: from getter */
        public Integer getQuoteIncrementPrecision() {
            return this.quoteIncrementPrecision;
        }

        @Override // p401kd.InterfaceC41007k
        /* JADX INFO: renamed from: e, reason: from getter */
        public boolean getIsHidden() {
            return this.isHidden;
        }

        @Override // p401kd.InterfaceC41007k
        @Nullable
        /* JADX INFO: renamed from: f, reason: from getter */
        public BigDecimal getFilledSize() {
            return this.filledSize;
        }

        @Override // p401kd.InterfaceC41007k
        /* JADX INFO: renamed from: g, reason: from getter */
        public boolean getIsIceberg() {
            return this.isIceberg;
        }

        @Override // p401kd.InterfaceC41007k
        @Nullable
        public BigDecimal getFilledFunds() {
            return this.filledFunds;
        }

        @Override // p401kd.InterfaceC41007k
        @Nullable
        public BigDecimal getFunds() {
            return this.funds;
        }

        @Override // p401kd.InterfaceC41007k
        @Nullable
        public String getOrderId() {
            return this.orderId;
        }

        @Override // p401kd.InterfaceC41007k
        @Nullable
        public BigDecimal getSize() {
            return this.size;
        }

        @Override // p401kd.InterfaceC41007k
        @Nullable
        public String getSymbol() {
            return this.symbol;
        }

        @Nullable
        /* JADX INFO: renamed from: h, reason: from getter */
        public String getAmountUnit() {
            return this.amountUnit;
        }

        public int hashCode() {
            String str = this.orderId;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            Long l11 = this.orderTime;
            int iHashCode2 = (iHashCode + (l11 == null ? 0 : l11.hashCode())) * 31;
            String str2 = this.orderDisplayType;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.symbol;
            int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            TradeSide tradeSide = this.side;
            int iHashCode5 = (iHashCode4 + (tradeSide == null ? 0 : tradeSide.hashCode())) * 31;
            BigDecimal bigDecimal = this.size;
            int iHashCode6 = (iHashCode5 + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
            BigDecimal bigDecimal2 = this.funds;
            int iHashCode7 = (((((iHashCode6 + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31) + Boolean.hashCode(this.isHidden)) * 31) + Boolean.hashCode(this.isIceberg)) * 31;
            String str4 = this.amountUnit;
            int iHashCode8 = (iHashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
            BigDecimal bigDecimal3 = this.filledFunds;
            int iHashCode9 = (iHashCode8 + (bigDecimal3 == null ? 0 : bigDecimal3.hashCode())) * 31;
            BigDecimal bigDecimal4 = this.filledSize;
            int iHashCode10 = (iHashCode9 + (bigDecimal4 == null ? 0 : bigDecimal4.hashCode())) * 31;
            BigDecimal bigDecimal5 = this.avgPrice;
            int iHashCode11 = (iHashCode10 + (bigDecimal5 == null ? 0 : bigDecimal5.hashCode())) * 31;
            String str5 = this.showSymbol;
            int iHashCode12 = (iHashCode11 + (str5 == null ? 0 : str5.hashCode())) * 31;
            Integer num = this.quoteIncrementPrecision;
            int iHashCode13 = (iHashCode12 + (num == null ? 0 : num.hashCode())) * 31;
            Integer num2 = this.baseIncrementPrecision;
            return iHashCode13 + (num2 != null ? num2.hashCode() : 0);
        }

        @Nullable
        /* JADX INFO: renamed from: i, reason: from getter */
        public Long getOrderTime() {
            return this.orderTime;
        }

        @Nullable
        /* JADX INFO: renamed from: j, reason: from getter */
        public TradeSide getSide() {
            return this.side;
        }

        @NotNull
        public String toString() {
            return "Market(orderId=" + this.orderId + ", orderTime=" + this.orderTime + ", orderDisplayType=" + this.orderDisplayType + ", symbol=" + this.symbol + ", side=" + this.side + ", size=" + this.size + ", funds=" + this.funds + ", isHidden=" + this.isHidden + ", isIceberg=" + this.isIceberg + ", amountUnit=" + this.amountUnit + ", filledFunds=" + this.filledFunds + ", filledSize=" + this.filledSize + ", avgPrice=" + this.avgPrice + ", showSymbol=" + this.showSymbol + ", quoteIncrementPrecision=" + this.quoteIncrementPrecision + ", baseIncrementPrecision=" + this.baseIncrementPrecision + ')';
        }

        public Market(@Nullable String str, @Nullable Long l11, @Nullable String str2, @Nullable String str3, @Nullable TradeSide tradeSide, @Nullable BigDecimal bigDecimal, @Nullable BigDecimal bigDecimal2, boolean z11, boolean z12, @Nullable String str4, @Nullable BigDecimal bigDecimal3, @Nullable BigDecimal bigDecimal4, @Nullable BigDecimal bigDecimal5, @Nullable String str5, @Nullable Integer num, @Nullable Integer num2) {
            this.orderId = str;
            this.orderTime = l11;
            this.orderDisplayType = str2;
            this.symbol = str3;
            this.side = tradeSide;
            this.size = bigDecimal;
            this.funds = bigDecimal2;
            this.isHidden = z11;
            this.isIceberg = z12;
            this.amountUnit = str4;
            this.filledFunds = bigDecimal3;
            this.filledSize = bigDecimal4;
            this.avgPrice = bigDecimal5;
            this.showSymbol = str5;
            this.quoteIncrementPrecision = num;
            this.baseIncrementPrecision = num2;
        }
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    String getShowSymbol();

    @Nullable
    /* JADX INFO: renamed from: b */
    Integer getBaseIncrementPrecision();

    @Nullable
    /* JADX INFO: renamed from: c */
    String getOrderDisplayType();

    @Nullable
    /* JADX INFO: renamed from: d */
    Integer getQuoteIncrementPrecision();

    /* JADX INFO: renamed from: e */
    boolean getIsHidden();

    @Nullable
    /* JADX INFO: renamed from: f */
    BigDecimal getFilledSize();

    /* JADX INFO: renamed from: g */
    boolean getIsIceberg();

    @Nullable
    BigDecimal getFilledFunds();

    @Nullable
    BigDecimal getFunds();

    @Nullable
    String getOrderId();

    @Nullable
    BigDecimal getSize();

    @Nullable
    String getSymbol();
}
