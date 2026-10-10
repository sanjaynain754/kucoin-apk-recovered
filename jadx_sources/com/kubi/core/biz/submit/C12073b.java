package com.kubi.core.biz.submit;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.core.base.order.data.MakeOrderData$Request;
import com.kubi.core.base.order.data.SegmentItem;
import com.kubi.core.base.order.data.TimeInForce;
import com.kubi.core.base.order.data.TriggerDirection;
import com.kubi.spot.entity.AdvancedLimitItemEntityKt;
import com.kubi.tradebase.tradetype.TradeType;
import com.tencent.bugly.proguard.C33844oi;
import com.tencent.bugly.proguard.InterfaceC33730j9;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: com.kubi.core.biz.submit.b */
/* JADX INFO: compiled from: MapRequestOrderExt.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m90083d1 = {"\u0000B\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a.\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0007H\u0000\u001a$\u0010\t\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u00052\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0007H\u0002\u001a\u001c\u0010\u000b\u001a\u00020\f2\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0007H\u0002\u001a$\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\u00052\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0007H\u0002\u001a$\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0004\u001a\u00020\u00052\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0007H\u0002\u001a\u001c\u0010\u0011\u001a\u00020\u00122\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0007H\u0002\u001a\u001c\u0010\u0013\u001a\u00020\u00142\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0007H\u0002¨\u0006\u0015"}, m90084d2 = {"mapRequestEntity", "Lcom/kubi/core/base/order/data/MakeOrderData$Request;", "tradeType", "Lcom/kubi/tradebase/tradetype/TradeType;", "isAllInOrder", "", "requestEntity", "", "", "getAdvancedLimitRequestEntity", "Lcom/kubi/core/base/order/data/MakeOrderData$Request$AdvancedLimit;", "getLimitStopRequestEntity", "Lcom/kubi/core/base/order/data/MakeOrderData$Request$LimitStop;", "getLimitRequestEntity", "Lcom/kubi/core/base/order/data/MakeOrderData$Request$Limit;", "getMarketRequestEntity", "Lcom/kubi/core/base/order/data/MakeOrderData$Request$Market;", "getMarketStopRequestEntity", "Lcom/kubi/core/base/order/data/MakeOrderData$Request$MarketStop;", "getSegmentRequestEntity", "Lcom/kubi/core/base/order/data/MakeOrderData$Request$Segment;", "TradeCoreBizLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nMapRequestOrderExt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MapRequestOrderExt.kt\ncom/kubi/core/biz/submit/MapRequestOrderExtKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,186:1\n1617#2,9:187\n1869#2:196\n1870#2:198\n1626#2:199\n1#3:197\n*S KotlinDebug\n*F\n+ 1 MapRequestOrderExt.kt\ncom/kubi/core/biz/submit/MapRequestOrderExtKt\n*L\n175#1:187,9\n175#1:196\n175#1:198\n175#1:199\n175#1:197\n*E\n"})
public final class C12073b {

    /* JADX INFO: renamed from: com.kubi.core.biz.submit.b$a */
    /* JADX INFO: compiled from: MapRequestOrderExt.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TradeType.values().length];
            try {
                iArr[TradeType.LIMIT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TradeType.LIMIT_STOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TradeType.ADVANCED_LIMIT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[TradeType.MARKET.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[TradeType.MARKET_STOP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[TradeType.SEGMENT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: renamed from: a */
    public static final MakeOrderData$Request.AdvancedLimit m22519a(boolean z11, Map<String, String> map) {
        TimeInForce timeInForce;
        String upperCase;
        boolean zAreEqual = Intrinsics.areEqual(map.get("postOnly"), "1");
        if (zAreEqual || !Intrinsics.areEqual(map.get("timeInForce"), AdvancedLimitItemEntityKt.TYPE_ADVANCED_LIMIT_IOC)) {
            timeInForce = (zAreEqual || !Intrinsics.areEqual(map.get("timeInForce"), AdvancedLimitItemEntityKt.TYPE_ADVANCED_LIMIT_FOK)) ? TimeInForce.GTC.INSTANCE : TimeInForce.FOK.INSTANCE;
        } else {
            timeInForce = TimeInForce.IOC.INSTANCE;
        }
        TimeInForce timeInForce2 = timeInForce;
        String str = map.get("symbol");
        String str2 = map.get("side");
        if (str2 != null) {
            upperCase = str2.toUpperCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        } else {
            upperCase = null;
        }
        return new MakeOrderData$Request.AdvancedLimit(str, upperCase, map.get("size"), map.get(FirebaseAnalytics.Param.PRICE), zAreEqual, timeInForce2, null, null, false, map.get("X-VALIDATION-TOKEN"), 192, null);
    }

    /* JADX INFO: renamed from: b */
    public static final MakeOrderData$Request.Limit m22520b(boolean z11, Map<String, String> map) {
        String upperCase;
        String str = map.get("symbol");
        String str2 = map.get("side");
        if (str2 != null) {
            upperCase = str2.toUpperCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        } else {
            upperCase = null;
        }
        return new MakeOrderData$Request.Limit(str, upperCase, map.get(FirebaseAnalytics.Param.PRICE), map.get("size"), null, null, null, false, map.get("X-VALIDATION-TOKEN"), 112, null);
    }

    /* JADX INFO: renamed from: c */
    public static final MakeOrderData$Request.LimitStop m22521c(Map<String, String> map) {
        String upperCase;
        TriggerDirection triggerDirection = Intrinsics.areEqual(map.get(InterfaceC33730j9.f70350a), "entry") ? TriggerDirection.C11622UP.INSTANCE : TriggerDirection.DOWN.INSTANCE;
        String str = map.get("symbol");
        String str2 = map.get("side");
        if (str2 != null) {
            upperCase = str2.toUpperCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        } else {
            upperCase = null;
        }
        return new MakeOrderData$Request.LimitStop(str, upperCase, map.get("size"), map.get(FirebaseAnalytics.Param.PRICE), map.get("stopPrice"), triggerDirection, null, null, map.get("X-VALIDATION-TOKEN"), 192, null);
    }

    /* JADX INFO: renamed from: d */
    public static final MakeOrderData$Request.Market m22522d(boolean z11, Map<String, String> map) {
        String upperCase = null;
        if (Intrinsics.areEqual(map.get("side"), "buy")) {
            String str = map.get("symbol");
            String str2 = map.get("side");
            if (str2 != null) {
                upperCase = str2.toUpperCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
            }
            return new MakeOrderData$Request.Market(str, upperCase, null, map.get("funds"), null, null, false, null, 180, null);
        }
        String str3 = map.get("symbol");
        String str4 = map.get("side");
        if (str4 != null) {
            upperCase = str4.toUpperCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        }
        return new MakeOrderData$Request.Market(str3, upperCase, map.get("size"), null, null, null, false, map.get("X-VALIDATION-TOKEN"), 56, null);
    }

    /* JADX INFO: renamed from: e */
    public static final MakeOrderData$Request.MarketStop m22523e(Map<String, String> map) {
        TriggerDirection triggerDirection = Intrinsics.areEqual(map.get(InterfaceC33730j9.f70350a), "entry") ? TriggerDirection.C11622UP.INSTANCE : TriggerDirection.DOWN.INSTANCE;
        String upperCase = null;
        if (Intrinsics.areEqual(map.get("side"), "buy")) {
            String str = map.get("symbol");
            String str2 = map.get("side");
            if (str2 != null) {
                upperCase = str2.toUpperCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
            }
            return new MakeOrderData$Request.MarketStop(str, upperCase, null, map.get("funds"), map.get("stopPrice"), triggerDirection, null, null, null, map.get("X-VALIDATION-TOKEN"), 452, null);
        }
        String str3 = map.get("symbol");
        String str4 = map.get("side");
        if (str4 != null) {
            upperCase = str4.toUpperCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        }
        return new MakeOrderData$Request.MarketStop(str3, upperCase, map.get("size"), null, map.get("stopPrice"), triggerDirection, null, null, null, map.get("X-VALIDATION-TOKEN"), 456, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: f */
    public static final MakeOrderData$Request.Segment m22524f(Map<String, String> map) {
        Object upperCase;
        String str = map.get(FirebaseAnalytics.Param.ITEMS);
        if (str == null) {
            str = "";
        }
        List listSplit$default = StringsKt.split$default((CharSequence) str, new String[]{","}, false, 0, 6, (Object) null);
        ArrayList arrayList = new ArrayList();
        Iterator it = listSplit$default.iterator();
        while (true) {
            upperCase = null;
            if (!it.hasNext()) {
                break;
            }
            List listSplit$default2 = StringsKt.split$default((CharSequence) it.next(), new String[]{C33844oi.f71346o}, false, 0, 6, (Object) null);
            upperCase = listSplit$default2.size() == 2 ? new SegmentItem((String) listSplit$default2.get(0), (String) listSplit$default2.get(1)) : null;
            if (upperCase != null) {
                arrayList.add(upperCase);
            }
        }
        String str2 = map.get("symbol");
        String str3 = map.get("side");
        if (str3 != null) {
            upperCase = str3.toUpperCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        }
        return new MakeOrderData$Request.Segment(str2, upperCase, arrayList, null, map.get("X-VALIDATION-TOKEN"), 8, null);
    }

    @Nullable
    /* JADX INFO: renamed from: g */
    public static final MakeOrderData$Request m22525g(@NotNull TradeType tradeType, boolean z11, @NotNull Map<String, String> requestEntity) {
        Intrinsics.checkNotNullParameter(tradeType, "tradeType");
        Intrinsics.checkNotNullParameter(requestEntity, "requestEntity");
        switch (a.$EnumSwitchMapping$0[tradeType.ordinal()]) {
            case 1:
                return m22520b(z11, requestEntity);
            case 2:
                return m22521c(requestEntity);
            case 3:
                return m22519a(z11, requestEntity);
            case 4:
                return m22522d(z11, requestEntity);
            case 5:
                return m22523e(requestEntity);
            case 6:
                return m22524f(requestEntity);
            default:
                return null;
        }
    }
}
