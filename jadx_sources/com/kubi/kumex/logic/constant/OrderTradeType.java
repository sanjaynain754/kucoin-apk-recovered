package com.kubi.kumex.logic.constant;

import android.content.Context;
import com.facebook.react.uimanager.ViewProps;
import com.kubi.kumex.api.R$string;
import com.kubi.kumex.logic.constant.OrderTradeType;
import com.kubi.tradebase.tradetype.TradeType;
import com.tencent.qcloud.tuicore.TUIConstants;
import jm.C40446k;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.enums.EnumEntries;
import p852kotlin.enums.EnumEntriesKt;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: OrderTradeType.kt */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001BD\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012!\u0010\u0007\u001a\u001d\u0012\u0013\u0012\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\u00030\b¢\u0006\u0004\b\r\u0010\u000eJ\u0006\u0010 \u001a\u00020!J\u0006\u0010\"\u001a\u00020!R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R,\u0010\u0007\u001a\u001d\u0012\u0013\u0012\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\u00030\b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001f¨\u0006#"}, m90084d2 = {"Lcom/kubi/kumex/logic/constant/OrderTradeType;", "", "typeSymbol", "", "trackTypeStr", "trackTypeEnum", "Lcom/kubi/tradebase/tradetype/TradeType;", "multiLanguageDescGetter", "Lkotlin/Function1;", "Landroid/content/Context;", "Lkotlin/ParameterName;", "name", "context", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Lcom/kubi/tradebase/tradetype/TradeType;Lkotlin/jvm/functions/Function1;)V", "getTypeSymbol", "()Ljava/lang/String;", "getTrackTypeStr", "getTrackTypeEnum", "()Lcom/kubi/tradebase/tradetype/TradeType;", "getMultiLanguageDescGetter", "()Lkotlin/jvm/functions/Function1;", "Limit", "Market", "AdvancedLimit", "Conditional", "TriggerLimit", "TriggerMarket", "Tso", "Segment", "Hidden", "Twap", "isLimit", "", "isMarket", "KumexApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public enum OrderTradeType {
    Limit(TUIConstants.TUIContact.LIMIT, TUIConstants.TUIContact.LIMIT, TradeType.LIMIT, new Function1() { // from class: jm.a
        @Override // p852kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return OrderTradeType.m34284l((Context) obj);
        }
    }),
    Market("market", "market", TradeType.MARKET, new Function1() { // from class: jm.b
        @Override // p852kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return OrderTradeType.m34285m((Context) obj);
        }
    }),
    AdvancedLimit("advanced_limit", "advancedLimit", TradeType.ADVANCED_LIMIT, new Function1() { // from class: jm.c
        @Override // p852kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return OrderTradeType.m34286n((Context) obj);
        }
    }),
    Conditional("conditional", "conditional", TradeType.CONDITIONAL, new Function1() { // from class: jm.d
        @Override // p852kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return OrderTradeType.m34287o((Context) obj);
        }
    }),
    TriggerLimit("stop_limit", "limitStop", TradeType.LIMIT_STOP, new Function1() { // from class: jm.e
        @Override // p852kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return OrderTradeType.m34288p((Context) obj);
        }
    }),
    TriggerMarket("stop_market", "limitMarket", TradeType.MARKET_STOP, new Function1() { // from class: jm.f
        @Override // p852kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return OrderTradeType.m34289q((Context) obj);
        }
    }),
    Tso("trailing_stop", "trailingStop", TradeType.TSO, new Function1() { // from class: jm.g
        @Override // p852kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return OrderTradeType.m34290r((Context) obj);
        }
    }),
    Segment("segment", "segment", TradeType.SEGMENT, new Function1() { // from class: jm.h
        @Override // p852kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return OrderTradeType.m34291s((Context) obj);
        }
    }),
    Hidden(ViewProps.HIDDEN, ViewProps.HIDDEN, TradeType.HIDDEN, new Function1() { // from class: jm.i
        @Override // p852kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return OrderTradeType.m34292t((Context) obj);
        }
    }),
    Twap(C40446k.m89081a(), "twap", TradeType.TWAP, new Function1() { // from class: jm.j
        @Override // p852kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return OrderTradeType.m34293u((Context) obj);
        }
    });


    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ EnumEntries f29395c = EnumEntriesKt.enumEntries(m34283k());

    @NotNull
    private final Function1<Context, String> multiLanguageDescGetter;

    @NotNull
    private final TradeType trackTypeEnum;

    @NotNull
    private final String trackTypeStr;

    @NotNull
    private final String typeSymbol;

    @NotNull
    public static EnumEntries<OrderTradeType> getEntries() {
        return f29395c;
    }

    /* JADX INFO: renamed from: l */
    public static final String m34284l(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        String string = context.getString(R$string.limit_price_order);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return string;
    }

    /* JADX INFO: renamed from: m */
    public static final String m34285m(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        String string = context.getString(R$string.market_price_order);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return string;
    }

    /* JADX INFO: renamed from: n */
    public static final String m34286n(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        String string = context.getString(R$string.kc_advanced_limit_order);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return string;
    }

    /* JADX INFO: renamed from: o */
    public static final String m34287o(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        String string = context.getString(R$string.kumex_order_conditional);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return string;
    }

    /* JADX INFO: renamed from: p */
    public static final String m34288p(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        String string = context.getString(R$string.condition_limit_price_order);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return string;
    }

    /* JADX INFO: renamed from: q */
    public static final String m34289q(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        String string = context.getString(R$string.condition_market_price_order);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return string;
    }

    /* JADX INFO: renamed from: r */
    public static final String m34290r(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        String string = context.getString(R$string.kumex_tso_order);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return string;
    }

    /* JADX INFO: renamed from: s */
    public static final String m34291s(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        String string = context.getString(R$string.kemex_segment_delegation);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return string;
    }

    /* JADX INFO: renamed from: t */
    public static final String m34292t(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        String string = context.getString(R$string.hide_order);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return string;
    }

    /* JADX INFO: renamed from: u */
    public static final String m34293u(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        String string = context.getString(R$string.kumex_order_twap);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return string;
    }

    @NotNull
    public final Function1<Context, String> getMultiLanguageDescGetter() {
        return this.multiLanguageDescGetter;
    }

    @NotNull
    public final TradeType getTrackTypeEnum() {
        return this.trackTypeEnum;
    }

    @NotNull
    public final String getTrackTypeStr() {
        return this.trackTypeStr;
    }

    @NotNull
    public final String getTypeSymbol() {
        return this.typeSymbol;
    }

    public final boolean isLimit() {
        return this == Limit || this == TriggerLimit || this == Hidden || this == AdvancedLimit || this == Tso || this == Segment;
    }

    public final boolean isMarket() {
        return this == Market || this == TriggerMarket;
    }

    OrderTradeType(String str, String str2, TradeType tradeType, Function1 function1) {
        this.typeSymbol = str;
        this.trackTypeStr = str2;
        this.trackTypeEnum = tradeType;
        this.multiLanguageDescGetter = function1;
    }
}
