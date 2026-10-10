package com.kubi.search.entity;

import androidx.annotation.Keep;
import com.kubi.data.entity.TradeItemBean;
import com.kubi.otc.entity.OtcAd;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import com.tencent.bugly.proguard.C33820nf;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;
import java.util.Locale;
import nf.C42828b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p429lf.C42180b;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.text.StringsKt;

/* JADX INFO: compiled from: SearchRealtimeEntity.kt */
/* JADX INFO: loaded from: classes44.dex */
@Keep
@Metadata(m90083d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u0006\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001BY\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u0006\u0010&\u001a\u00020\u0005J\u0006\u0010'\u001a\u00020\u0005J\u0017\u0010(\u001a\u00020)2\n\b\u0002\u0010*\u001a\u0004\u0018\u00010)¢\u0006\u0002\u0010+J\u0017\u0010,\u001a\u00020\u00052\n\b\u0002\u0010*\u001a\u0004\u0018\u00010)¢\u0006\u0002\u0010-J\u0006\u0010.\u001a\u00020)J\u0006\u0010/\u001a\u00020\u0005J\r\u00100\u001a\u0004\u0018\u000101¢\u0006\u0002\u00102J\u000b\u00103\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u00105\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0016J\u0010\u00106\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u001bJ\u0010\u00107\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0016J\u000b\u00108\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u000eHÆ\u0003Jn\u0010;\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000eHÆ\u0001¢\u0006\u0002\u0010<J\u0013\u0010=\u001a\u00020\t2\b\u0010>\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010?\u001a\u000201HÖ\u0001J\t\u0010@\u001a\u00020\u0005HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0019\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u0015\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b\u001a\u0010\u001bR\u0015\u0010\n\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u001d\u0010\u0016R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0014\"\u0004\b\u001f\u0010 R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0014R\u001c\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%¨\u0006A"}, m90084d2 = {"Lcom/kubi/search/entity/SearchRealtimeEntity;", "", "openingPrice", "Ljava/math/BigDecimal;", "openingTime", "", "countdownTime", "", "previewEnableShow", "", "searchCount", "spotTag", "symbol", "tradeItem", "Lcom/kubi/data/entity/TradeItemBean;", "<init>", "(Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Boolean;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Lcom/kubi/data/entity/TradeItemBean;)V", "getOpeningPrice", "()Ljava/math/BigDecimal;", "getOpeningTime", "()Ljava/lang/String;", "getCountdownTime", "()Ljava/lang/Long;", "setCountdownTime", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "getPreviewEnableShow", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getSearchCount", "getSpotTag", "setSpotTag", "(Ljava/lang/String;)V", "getSymbol", "getTradeItem", "()Lcom/kubi/data/entity/TradeItemBean;", "setTradeItem", "(Lcom/kubi/data/entity/TradeItemBean;)V", "baseCurrencyName", "quoteCurrencyName", "changeRateSinceList", "", "lastDealPrice", "(Ljava/lang/Double;)D", "changeRateSinceListStr", "(Ljava/lang/Double;)Ljava/lang/String;", "changeRate24h", "changeRate24hStr", "realtimeType", "", "()Ljava/lang/Integer;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Boolean;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Lcom/kubi/data/entity/TradeItemBean;)Lcom/kubi/search/entity/SearchRealtimeEntity;", "equals", "other", "hashCode", "toString", "SearchLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class SearchRealtimeEntity {

    @Nullable
    private Long countdownTime;

    @Nullable
    private final BigDecimal openingPrice;

    @Nullable
    private final String openingTime;

    @Nullable
    private final Boolean previewEnableShow;

    @Nullable
    private final Long searchCount;

    @Nullable
    private String spotTag;

    @Nullable
    private final String symbol;

    @Nullable
    private TradeItemBean tradeItem;

    public SearchRealtimeEntity(@Nullable BigDecimal bigDecimal, @Nullable String str, @Nullable Long l11, @Nullable Boolean bool, @Nullable Long l12, @Nullable String str2, @Nullable String str3, @Nullable TradeItemBean tradeItemBean) {
        this.openingPrice = bigDecimal;
        this.openingTime = str;
        this.countdownTime = l11;
        this.previewEnableShow = bool;
        this.searchCount = l12;
        this.spotTag = str2;
        this.symbol = str3;
        this.tradeItem = tradeItemBean;
    }

    public static /* synthetic */ SearchRealtimeEntity copy$default(SearchRealtimeEntity searchRealtimeEntity, BigDecimal bigDecimal, String str, Long l11, Boolean bool, Long l12, String str2, String str3, TradeItemBean tradeItemBean, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            bigDecimal = searchRealtimeEntity.openingPrice;
        }
        if ((i11 & 2) != 0) {
            str = searchRealtimeEntity.openingTime;
        }
        if ((i11 & 4) != 0) {
            l11 = searchRealtimeEntity.countdownTime;
        }
        if ((i11 & 8) != 0) {
            bool = searchRealtimeEntity.previewEnableShow;
        }
        if ((i11 & 16) != 0) {
            l12 = searchRealtimeEntity.searchCount;
        }
        if ((i11 & 32) != 0) {
            str2 = searchRealtimeEntity.spotTag;
        }
        if ((i11 & 64) != 0) {
            str3 = searchRealtimeEntity.symbol;
        }
        if ((i11 & 128) != 0) {
            tradeItemBean = searchRealtimeEntity.tradeItem;
        }
        String str4 = str3;
        TradeItemBean tradeItemBean2 = tradeItemBean;
        Long l13 = l12;
        String str5 = str2;
        return searchRealtimeEntity.copy(bigDecimal, str, l11, bool, l13, str5, str4, tradeItemBean2);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SearchRealtimeEntity)) {
            return false;
        }
        SearchRealtimeEntity searchRealtimeEntity = (SearchRealtimeEntity) other;
        return Intrinsics.areEqual(this.openingPrice, searchRealtimeEntity.openingPrice) && Intrinsics.areEqual(this.openingTime, searchRealtimeEntity.openingTime) && Intrinsics.areEqual(this.countdownTime, searchRealtimeEntity.countdownTime) && Intrinsics.areEqual(this.previewEnableShow, searchRealtimeEntity.previewEnableShow) && Intrinsics.areEqual(this.searchCount, searchRealtimeEntity.searchCount) && Intrinsics.areEqual(this.spotTag, searchRealtimeEntity.spotTag) && Intrinsics.areEqual(this.symbol, searchRealtimeEntity.symbol) && Intrinsics.areEqual(this.tradeItem, searchRealtimeEntity.tradeItem);
    }

    public static /* synthetic */ double changeRateSinceList$default(SearchRealtimeEntity searchRealtimeEntity, Double d11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            d11 = null;
        }
        return searchRealtimeEntity.changeRateSinceList(d11);
    }

    public static /* synthetic */ String changeRateSinceListStr$default(SearchRealtimeEntity searchRealtimeEntity, Double d11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            d11 = null;
        }
        return searchRealtimeEntity.changeRateSinceListStr(d11);
    }

    @NotNull
    public final String baseCurrencyName() {
        List listSplit$default;
        String str = this.symbol;
        return C27041f.m66668h((str == null || (listSplit$default = StringsKt.split$default((CharSequence) str, new String[]{C33820nf.f71144W}, false, 0, 6, (Object) null)) == null) ? null : (String) CollectionsKt.firstOrNull(listSplit$default));
    }

    public final double changeRate24h() {
        Double changeRate;
        TradeItemBean tradeItemBean = this.tradeItem;
        if (tradeItemBean == null || (changeRate = tradeItemBean.getChangeRate()) == null) {
            return 0.0d;
        }
        return changeRate.doubleValue();
    }

    @NotNull
    public final String changeRate24hStr() {
        TradeItemBean tradeItemBean = this.tradeItem;
        if ((tradeItemBean != null ? tradeItemBean.getChangeRate() : null) == null) {
            return "--";
        }
        String strM93911l = C42828b.m93911l(C42180b.m92642g(new BigDecimal(String.valueOf(changeRate24h())), null, null, 0, true, false, false, 55, null));
        return C27041f.m66668h(strM93911l != null ? C42828b.m93915p(strM93911l) : null);
    }

    public final double changeRateSinceList(@Nullable Double lastDealPrice) {
        BigDecimal bigDecimal;
        BigDecimal bigDecimal2;
        if (lastDealPrice != null) {
            bigDecimal = new BigDecimal(String.valueOf(lastDealPrice.doubleValue()));
        } else {
            TradeItemBean tradeItemBean = this.tradeItem;
            bigDecimal = null;
            if ((tradeItemBean != null ? Double.valueOf(tradeItemBean.getLastDealPrice()) : null) != null) {
                TradeItemBean tradeItemBean2 = this.tradeItem;
                bigDecimal = tradeItemBean2 != null ? new BigDecimal(String.valueOf(tradeItemBean2.getLastDealPrice())) : BigDecimal.ZERO;
            }
        }
        if (bigDecimal == null || (bigDecimal2 = this.openingPrice) == null || bigDecimal2.compareTo(BigDecimal.ZERO) == 0) {
            return 0.0d;
        }
        return bigDecimal.subtract(this.openingPrice).divide(this.openingPrice, RoundingMode.HALF_UP).doubleValue();
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final BigDecimal getOpeningPrice() {
        return this.openingPrice;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getOpeningTime() {
        return this.openingTime;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Long getCountdownTime() {
        return this.countdownTime;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Boolean getPreviewEnableShow() {
        return this.previewEnableShow;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Long getSearchCount() {
        return this.searchCount;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getSpotTag() {
        return this.spotTag;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getSymbol() {
        return this.symbol;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final TradeItemBean getTradeItem() {
        return this.tradeItem;
    }

    @NotNull
    public final SearchRealtimeEntity copy(@Nullable BigDecimal openingPrice, @Nullable String openingTime, @Nullable Long countdownTime, @Nullable Boolean previewEnableShow, @Nullable Long searchCount, @Nullable String spotTag, @Nullable String symbol, @Nullable TradeItemBean tradeItem) {
        return new SearchRealtimeEntity(openingPrice, openingTime, countdownTime, previewEnableShow, searchCount, spotTag, symbol, tradeItem);
    }

    @Nullable
    public final Long getCountdownTime() {
        return this.countdownTime;
    }

    @Nullable
    public final BigDecimal getOpeningPrice() {
        return this.openingPrice;
    }

    @Nullable
    public final String getOpeningTime() {
        return this.openingTime;
    }

    @Nullable
    public final Boolean getPreviewEnableShow() {
        return this.previewEnableShow;
    }

    @Nullable
    public final Long getSearchCount() {
        return this.searchCount;
    }

    @Nullable
    public final String getSpotTag() {
        return this.spotTag;
    }

    @Nullable
    public final String getSymbol() {
        return this.symbol;
    }

    @Nullable
    public final TradeItemBean getTradeItem() {
        return this.tradeItem;
    }

    public int hashCode() {
        BigDecimal bigDecimal = this.openingPrice;
        int iHashCode = (bigDecimal == null ? 0 : bigDecimal.hashCode()) * 31;
        String str = this.openingTime;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Long l11 = this.countdownTime;
        int iHashCode3 = (iHashCode2 + (l11 == null ? 0 : l11.hashCode())) * 31;
        Boolean bool = this.previewEnableShow;
        int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        Long l12 = this.searchCount;
        int iHashCode5 = (iHashCode4 + (l12 == null ? 0 : l12.hashCode())) * 31;
        String str2 = this.spotTag;
        int iHashCode6 = (iHashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.symbol;
        int iHashCode7 = (iHashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        TradeItemBean tradeItemBean = this.tradeItem;
        return iHashCode7 + (tradeItemBean != null ? tradeItemBean.hashCode() : 0);
    }

    @NotNull
    public final String quoteCurrencyName() {
        List listSplit$default;
        String str = this.symbol;
        return C27041f.m66668h((str == null || (listSplit$default = StringsKt.split$default((CharSequence) str, new String[]{C33820nf.f71144W}, false, 0, 6, (Object) null)) == null) ? null : (String) CollectionsKt.lastOrNull(listSplit$default));
    }

    @Nullable
    public final Integer realtimeType() {
        String strM66668h = C27041f.m66668h(this.spotTag);
        Locale ENGLISH = Locale.ENGLISH;
        Intrinsics.checkNotNullExpressionValue(ENGLISH, "ENGLISH");
        String upperCase = strM66668h.toUpperCase(ENGLISH);
        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        int iHashCode = upperCase.hashCode();
        if (iHashCode == -1986416409) {
            return !upperCase.equals(OtcAd.STATUS_NORMAL) ? null : 3;
        }
        if (iHashCode != -322403607) {
            return (iHashCode == 1525652133 && upperCase.equals("NEW_LISTING")) ? 2 : null;
        }
        if (upperCase.equals("PRE_NEW_LISTING")) {
            return Integer.valueOf(C27039d.m66653m(this.countdownTime, 0L) <= 0 ? 0 : 1);
        }
        return null;
    }

    public final void setCountdownTime(@Nullable Long l11) {
        this.countdownTime = l11;
    }

    public final void setSpotTag(@Nullable String str) {
        this.spotTag = str;
    }

    public final void setTradeItem(@Nullable TradeItemBean tradeItemBean) {
        this.tradeItem = tradeItemBean;
    }

    @NotNull
    public String toString() {
        return "SearchRealtimeEntity(openingPrice=" + this.openingPrice + ", openingTime=" + this.openingTime + ", countdownTime=" + this.countdownTime + ", previewEnableShow=" + this.previewEnableShow + ", searchCount=" + this.searchCount + ", spotTag=" + this.spotTag + ", symbol=" + this.symbol + ", tradeItem=" + this.tradeItem + ')';
    }

    @NotNull
    public final String changeRateSinceListStr(@Nullable Double lastDealPrice) {
        return C42180b.m92642g(new BigDecimal(String.valueOf(changeRateSinceList(lastDealPrice))), null, null, 0, true, false, false, 55, null);
    }

    public /* synthetic */ SearchRealtimeEntity(BigDecimal bigDecimal, String str, Long l11, Boolean bool, Long l12, String str2, String str3, TradeItemBean tradeItemBean, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(bigDecimal, str, l11, bool, l12, str2, str3, (i11 & 128) != 0 ? null : tradeItemBean);
    }
}
