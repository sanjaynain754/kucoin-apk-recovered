package com.kubi.flutter.widget.kline;

import com.kubi.flutter.proto.kline.CandleList;
import com.kubi.flutter.proto.kline.OrderItem;
import com.kubi.flutter.proto.kline.OrderList;
import com.kubi.p110rn.Constants;
import java.util.Locale;
import kotlinx.coroutines.flow.InterfaceC41634e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.flutter.widget.kline.c, reason: from Kotlin metadata */
/* JADX INFO: compiled from: IKLineDataInteractor.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001:\u0002\u0011\u0012J\u0016\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\u001e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tH¦@¢\u0006\u0002\u0010\nJ\u0016\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\rH¦@¢\u0006\u0002\u0010\u000eJ\u001e\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\tH¦@¢\u0006\u0002\u0010\u0010ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0013À\u0006\u0001"}, m90084d2 = {"Lcom/kubi/flutter/widget/kline/IKLineDataInteractor;", "", "bindDataPushFlow", "Lkotlinx/coroutines/flow/Flow;", "Lcom/kubi/flutter/proto/kline/CandleList;", "param", "Lcom/kubi/flutter/widget/kline/IKLineDataInteractor$DataParam;", "loadCdnData", "previousTime", "", "(Lcom/kubi/flutter/widget/kline/IKLineDataInteractor$DataParam;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadActiveOrderData", "Lcom/kubi/flutter/proto/kline/OrderList;", "Lcom/kubi/flutter/widget/kline/IKLineDataInteractor$OrderParam;", "(Lcom/kubi/flutter/widget/kline/IKLineDataInteractor$OrderParam;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadHistoryOrderData", "(Lcom/kubi/flutter/widget/kline/IKLineDataInteractor$OrderParam;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "DataParam", "OrderParam", "LKLineWidget_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface IKLineDataInteractor {

    /* JADX INFO: renamed from: com.kubi.flutter.widget.kline.c$a, reason: from toString */
    /* JADX INFO: compiled from: IKLineDataInteractor.kt */
    @Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J1\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\f¨\u0006\u001c"}, m90084d2 = {"Lcom/kubi/flutter/widget/kline/IKLineDataInteractor$DataParam;", "", "symbol", "", "precision", "", "type", "Lcom/kubi/flutter/widget/kline/KLineType;", Constants.BIZ, "<init>", "(Ljava/lang/String;ILcom/kubi/flutter/widget/kline/KLineType;Ljava/lang/String;)V", "getSymbol", "()Ljava/lang/String;", "getPrecision", "()I", "getType", "()Lcom/kubi/flutter/widget/kline/KLineType;", "getBiz", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "LKLineWidget_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class DataParam {

        /* JADX INFO: renamed from: a, reason: from toString */
        @NotNull
        public final String symbol;

        /* JADX INFO: renamed from: b, reason: from toString */
        public final int precision;

        /* JADX INFO: renamed from: c, reason: from toString */
        @NotNull
        public final KLineType type;

        /* JADX INFO: renamed from: d, reason: from toString */
        @NotNull
        public final String biz;

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DataParam)) {
                return false;
            }
            DataParam dataParam = (DataParam) other;
            return Intrinsics.areEqual(this.symbol, dataParam.symbol) && this.precision == dataParam.precision && Intrinsics.areEqual(this.type, dataParam.type) && Intrinsics.areEqual(this.biz, dataParam.biz);
        }

        public DataParam(@NotNull String symbol, int i11, @NotNull KLineType type, @NotNull String biz) {
            Intrinsics.checkNotNullParameter(symbol, "symbol");
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(biz, "biz");
            this.symbol = symbol;
            this.precision = i11;
            this.type = type;
            this.biz = biz;
        }

        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getBiz() {
            return this.biz;
        }

        @NotNull
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getSymbol() {
            return this.symbol;
        }

        @NotNull
        /* JADX INFO: renamed from: c, reason: from getter */
        public final KLineType getType() {
            return this.type;
        }

        public int hashCode() {
            return (((((this.symbol.hashCode() * 31) + Integer.hashCode(this.precision)) * 31) + this.type.hashCode()) * 31) + this.biz.hashCode();
        }

        @NotNull
        public String toString() {
            return "DataParam(symbol=" + this.symbol + ", precision=" + this.precision + ", type=" + this.type + ", biz=" + this.biz + ')';
        }
    }

    /* JADX INFO: renamed from: com.kubi.flutter.widget.kline.c$b, reason: from toString */
    /* JADX INFO: compiled from: IKLineDataInteractor.kt */
    @Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\t¢\u0006\u0004\b\r\u0010\u000eJ\u0006\u0010\u001a\u001a\u00020\u001bJ\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\tHÆ\u0003J\t\u0010!\u001a\u00020\tHÆ\u0003J\t\u0010\"\u001a\u00020\tHÆ\u0003J\t\u0010#\u001a\u00020\tHÆ\u0003JY\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\tHÆ\u0001J\u0013\u0010%\u001a\u00020\t2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010'\u001a\u00020(HÖ\u0001J\t\u0010)\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\n\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0011\u0010\u000b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0016R\u0011\u0010\f\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0016¨\u0006*"}, m90084d2 = {"Lcom/kubi/flutter/widget/kline/IKLineDataInteractor$OrderParam;", "", "symbol", "", "type", "Lcom/kubi/flutter/widget/kline/KLineType;", Constants.BIZ, "tradeType", "showHistory", "", "showActive", "enableHistory", "enableActive", "<init>", "(Ljava/lang/String;Lcom/kubi/flutter/widget/kline/KLineType;Ljava/lang/String;Ljava/lang/String;ZZZZ)V", "getSymbol", "()Ljava/lang/String;", "getType", "()Lcom/kubi/flutter/widget/kline/KLineType;", "getBiz", "getTradeType", "getShowHistory", "()Z", "getShowActive", "getEnableHistory", "getEnableActive", "getBizType", "Lcom/kubi/flutter/proto/kline/OrderItem$BizType;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "hashCode", "", "toString", "LKLineWidget_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class OrderParam {

        /* JADX INFO: renamed from: a, reason: from toString */
        @NotNull
        public final String symbol;

        /* JADX INFO: renamed from: b, reason: from toString */
        @NotNull
        public final KLineType type;

        /* JADX INFO: renamed from: c, reason: from toString */
        @NotNull
        public final String biz;

        /* JADX INFO: renamed from: d, reason: from toString */
        @NotNull
        public final String tradeType;

        /* JADX INFO: renamed from: e, reason: from toString */
        public final boolean showHistory;

        /* JADX INFO: renamed from: f, reason: from toString */
        public final boolean showActive;

        /* JADX INFO: renamed from: g, reason: from toString */
        public final boolean enableHistory;

        /* JADX INFO: renamed from: h, reason: from toString */
        public final boolean enableActive;

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof OrderParam)) {
                return false;
            }
            OrderParam orderParam = (OrderParam) other;
            return Intrinsics.areEqual(this.symbol, orderParam.symbol) && Intrinsics.areEqual(this.type, orderParam.type) && Intrinsics.areEqual(this.biz, orderParam.biz) && Intrinsics.areEqual(this.tradeType, orderParam.tradeType) && this.showHistory == orderParam.showHistory && this.showActive == orderParam.showActive && this.enableHistory == orderParam.enableHistory && this.enableActive == orderParam.enableActive;
        }

        public OrderParam(@NotNull String symbol, @NotNull KLineType type, @NotNull String biz, @NotNull String tradeType, boolean z11, boolean z12, boolean z13, boolean z14) {
            Intrinsics.checkNotNullParameter(symbol, "symbol");
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(biz, "biz");
            Intrinsics.checkNotNullParameter(tradeType, "tradeType");
            this.symbol = symbol;
            this.type = type;
            this.biz = biz;
            this.tradeType = tradeType;
            this.showHistory = z11;
            this.showActive = z12;
            this.enableHistory = z13;
            this.enableActive = z14;
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final OrderItem.BizType m24277a() {
            String upperCase = this.tradeType.toUpperCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
            int iHashCode = upperCase.hashCode();
            if (iHashCode != -1011438257) {
                if (iHashCode != -515941517) {
                    if (iHashCode == 80083268 && upperCase.equals("TRADE")) {
                        return OrderItem.BizType.BIZ_SPOT;
                    }
                } else if (upperCase.equals("MARGIN_TRADE")) {
                    return OrderItem.BizType.BIZ_CROSS_MARGIN;
                }
            } else if (upperCase.equals("MARGIN_ISOLATED_TRADE")) {
                return OrderItem.BizType.BIZ_ISOLATED_MARGIN;
            }
            return OrderItem.BizType.UNRECOGNIZED;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final boolean getEnableActive() {
            return this.enableActive;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final boolean getEnableHistory() {
            return this.enableHistory;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final boolean getShowActive() {
            return this.showActive;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final boolean getShowHistory() {
            return this.showHistory;
        }

        @NotNull
        /* JADX INFO: renamed from: f, reason: from getter */
        public final String getSymbol() {
            return this.symbol;
        }

        @NotNull
        /* JADX INFO: renamed from: g, reason: from getter */
        public final String getTradeType() {
            return this.tradeType;
        }

        @NotNull
        /* JADX INFO: renamed from: h, reason: from getter */
        public final KLineType getType() {
            return this.type;
        }

        public int hashCode() {
            return (((((((((((((this.symbol.hashCode() * 31) + this.type.hashCode()) * 31) + this.biz.hashCode()) * 31) + this.tradeType.hashCode()) * 31) + Boolean.hashCode(this.showHistory)) * 31) + Boolean.hashCode(this.showActive)) * 31) + Boolean.hashCode(this.enableHistory)) * 31) + Boolean.hashCode(this.enableActive);
        }

        @NotNull
        public String toString() {
            return "OrderParam(symbol=" + this.symbol + ", type=" + this.type + ", biz=" + this.biz + ", tradeType=" + this.tradeType + ", showHistory=" + this.showHistory + ", showActive=" + this.showActive + ", enableHistory=" + this.enableHistory + ", enableActive=" + this.enableActive + ')';
        }
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    Object mo24270a(@NotNull DataParam dataParam, long j11, @NotNull Continuation<? super CandleList> continuation);

    @NotNull
    /* JADX INFO: renamed from: b */
    InterfaceC41634e<CandleList> mo24271b(@NotNull DataParam dataParam);

    @Nullable
    /* JADX INFO: renamed from: c */
    Object mo24272c(@NotNull OrderParam orderParam, @NotNull Continuation<? super OrderList> continuation);

    @Nullable
    /* JADX INFO: renamed from: d */
    Object mo24273d(@NotNull OrderParam orderParam, long j11, @NotNull Continuation<? super OrderList> continuation);
}
