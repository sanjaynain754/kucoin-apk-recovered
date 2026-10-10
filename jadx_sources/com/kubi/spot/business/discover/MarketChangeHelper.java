package com.kubi.spot.business.discover;

import com.blankj.utilcode.util.C5281l0;
import com.kubi.futures.dialog.twap.OrderPriceType;
import com.kubi.host.HostManager;
import com.kubi.utils.extensions.DowngradeExKt;
import com.tencent.bugly.proguard.C33556b3;
import f00.C37304a;
import g00.InterfaceC37766r;
import java.math.BigDecimal;
import java.math.RoundingMode;
import org.jetbrains.annotations.NotNull;
import p402kf.C41014a;
import p402kf.C41016c;
import p429lf.C42179a;
import p429lf.C42180b;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.spot.business.discover.a, reason: from Kotlin metadata */
/* JADX INFO: compiled from: MarketChangeHelper.kt */
/* JADX INFO: loaded from: classes47.dex */
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u0005J\u0018\u0010\u000f\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u0005H\u0002J\u000e\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0012J8\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u00052\b\b\u0002\u0010\u0016\u001a\u00020\u00052\b\b\u0002\u0010\u0017\u001a\u00020\u00052\b\b\u0002\u0010\u0018\u001a\u00020\u00052\b\b\u0002\u0010\u0019\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m90084d2 = {"Lcom/kubi/spot/business/discover/MarketChangeHelper;", "", "<init>", "()V", "MARKET_CHANGE_TYPE_ALL", "", "MARKET_CHANGE_ITEM_TYPE_POSITION", "MARKET_CHANGE_ITEM_TYPE_ALL", "VALUE_TYPE_NUMBER", "VALUE_TYPE_PERCENT", "VALUE_TYPE_PRICE", "formatMarketChangeValue", "value", "type", "quoteCurrency", "formatMarketChangePrice", "formatMarketChangeTime", "timeStamp", "", "jumpToH5", "", "tab", "activeItem", "activeItemType", "id", "itemType", "SpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class MarketChangeHelper {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final MarketChangeHelper f50139a = new MarketChangeHelper();

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m61014e(MarketChangeHelper marketChangeHelper, String str, String str2, String str3, String str4, String str5, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = "ALL";
        }
        if ((i11 & 2) != 0) {
            str2 = "";
        }
        if ((i11 & 4) != 0) {
            str3 = "";
        }
        if ((i11 & 8) != 0) {
            str4 = "";
        }
        marketChangeHelper.m61018d(str, str2, str3, str4, (i11 & 16) != 0 ? "" : str5);
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final String m61017c(@NotNull String value, @NotNull String type, @NotNull String quoteCurrency) {
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(quoteCurrency, "quoteCurrency");
        int iHashCode = type.hashCode();
        if (iHashCode != -1981034679) {
            if (iHashCode != 39055397) {
                if (iHashCode == 76396841 && type.equals("PRICE")) {
                    return m61015a(value, quoteCurrency);
                }
            } else if (type.equals(OrderPriceType.TYPE_PERCENT)) {
                BigDecimal bigDecimalDivide = DowngradeExKt.m66535e(value, null, 1, null).divide(new BigDecimal(C33556b3.f68995S), 4, RoundingMode.DOWN);
                Intrinsics.checkNotNullExpressionValue(bigDecimalDivide, "divide(...)");
                return C42180b.m92649n(C42180b.m92642g(bigDecimalDivide, null, null, 0, true, false, false, 55, null));
            }
        } else if (type.equals("NUMBER")) {
            return m61015a(value, "USDT");
        }
        return value;
    }

    /* JADX INFO: renamed from: d */
    public final void m61018d(@NotNull String tab, @NotNull String activeItem, @NotNull String activeItemType, @NotNull String id2, @NotNull String itemType) {
        Intrinsics.checkNotNullParameter(tab, "tab");
        Intrinsics.checkNotNullParameter(activeItem, "activeItem");
        Intrinsics.checkNotNullParameter(activeItemType, "activeItemType");
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(itemType, "itemType");
        String str = HostManager.a.m() + "/platform/market-movement?loading=2&appNeedLang=true";
        if (tab.length() > 0) {
            str = str + "&tab=" + tab;
        }
        if (id2.length() > 0) {
            str = str + "&id=" + id2;
        }
        if (activeItem.length() > 0) {
            str = str + "&activeItem=" + activeItem;
        }
        if (activeItemType.length() > 0) {
            str = str + "&activeItemType=" + activeItemType;
        }
        if (itemType.length() > 0) {
            str = str + "&itemType=" + itemType;
        }
        InterfaceC37766r.a.m85190a(C37304a.f82764a, str, null, null, null, null, null, null, 126, null);
    }

    /* JADX INFO: renamed from: a */
    public final String m61015a(String str, String str2) {
        Double dM89969g = C41016c.m89969g(str2);
        if (dM89969g != null) {
            double d11 = Double.parseDouble(str) * dM89969g.doubleValue();
            if (d11 < 1.0d) {
                return C41014a.m89950x(d11, null, null, 0, false, false, false, false, 127, null);
            }
            return C41016c.m89966d() + C41014a.m89931e(new BigDecimal(String.valueOf(d11)), false, 1, null);
        }
        return "--";
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final String m61016b(long j11) {
        if (C5281l0.m6267b(j11)) {
            return C42179a.m92635h(j11, null, true, null, 5, null);
        }
        return C42179a.m92633f(j11, null, true, true, null, 9, null);
    }
}
