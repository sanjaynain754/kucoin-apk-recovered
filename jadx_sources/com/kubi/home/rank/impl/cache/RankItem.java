package com.kubi.home.rank.impl.cache;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import androidx.annotation.Keep;
import com.kubi.data.entity.SymbolInfoEntity;
import com.kubi.data.entity.TradeItemBean;
import com.kubi.home.api.RankNewCoin;
import com.kubi.home.rank.impl.C14768b;
import com.kubi.resources.C22890g;
import com.kubi.sdk.res.R$color;
import com.kubi.utils.C27017c;
import com.kubi.utils.C27096v0;
import com.kubi.utils.extensions.C27039d;
import dj.C36720e;
import gf.C37885i;
import gf.C37886j;
import io.chad.library.adapter.base.entity.MultiItemEntity;
import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p402kf.C41014a;
import p402kf.C41015b;
import p429lf.C42179a;
import p429lf.C42180b;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: RankItem.kt */
/* JADX INFO: loaded from: classes15.dex */
@Keep
@Metadata(m90083d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\r\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u001a\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u0017\u001a\u00020\u0003H\u0016J\b\u0010T\u001a\u00020UH\u0002J\b\u0010V\u001a\u00020UH\u0002J\b\u0010W\u001a\u00020UH\u0002J\b\u0010X\u001a\u00020:H\u0002J\u0006\u0010Y\u001a\u00020:J\t\u0010Z\u001a\u00020\u0003HÆ\u0003J\u000b\u0010[\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\\\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010]\u001a\u00020\u0003HÂ\u0003J5\u0010^\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010_\u001a\u00020:2\b\u0010`\u001a\u0004\u0018\u00010aHÖ\u0003J\t\u0010b\u001a\u00020\u0003HÖ\u0001J\t\u0010c\u001a\u00020\u0019HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u000e\u0010\b\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u001fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001a\u0010$\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\f\"\u0004\b&\u0010\u000eR\u001c\u0010'\u001a\u0004\u0018\u00010(X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u001c\u0010-\u001a\u0004\u0018\u00010(X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010*\"\u0004\b/\u0010,R\u001c\u00100\u001a\u0004\u0018\u00010\u0019X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u0010\u001b\"\u0004\b2\u0010\u001dR\u001c\u00103\u001a\u0004\u0018\u000104X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\u001a\u00109\u001a\u00020:X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R\u001c\u0010?\u001a\u0004\u0018\u00010\u0019X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b@\u0010\u001b\"\u0004\bA\u0010\u001dR\u001c\u0010B\u001a\u0004\u0018\u00010\u0019X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bC\u0010\u001b\"\u0004\bD\u0010\u001dR\u001c\u0010E\u001a\u0004\u0018\u00010\u0019X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bF\u0010\u001b\"\u0004\bG\u0010\u001dR\u001c\u0010H\u001a\u0004\u0018\u000104X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bI\u00106\"\u0004\bJ\u00108R\u001c\u0010K\u001a\u0004\u0018\u00010\u0019X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bL\u0010\u001b\"\u0004\bM\u0010\u001dR\u001c\u0010N\u001a\u0004\u0018\u00010\u0019X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bO\u0010\u001b\"\u0004\bP\u0010\u001dR\u001a\u0010Q\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bR\u0010\f\"\u0004\bS\u0010\u000e¨\u0006d"}, m90084d2 = {"Lcom/kubi/home/rank/impl/cache/RankItem;", "Lio/chad/library/adapter/base/entity/MultiItemEntity;", "rankType", "", "tradeItemBean", "Lcom/kubi/data/entity/TradeItemBean;", "rankNewCoin", "Lcom/kubi/home/api/RankNewCoin;", "itemType", "<init>", "(ILcom/kubi/data/entity/TradeItemBean;Lcom/kubi/home/api/RankNewCoin;I)V", "getRankType", "()I", "setRankType", "(I)V", "getTradeItemBean", "()Lcom/kubi/data/entity/TradeItemBean;", "setTradeItemBean", "(Lcom/kubi/data/entity/TradeItemBean;)V", "getRankNewCoin", "()Lcom/kubi/home/api/RankNewCoin;", "setRankNewCoin", "(Lcom/kubi/home/api/RankNewCoin;)V", "getItemType", "priceString", "", "getPriceString", "()Ljava/lang/String;", "setPriceString", "(Ljava/lang/String;)V", "moneyPriceString", "", "getMoneyPriceString", "()Ljava/lang/CharSequence;", "setMoneyPriceString", "(Ljava/lang/CharSequence;)V", "changeRateColor", "getChangeRateColor", "setChangeRateColor", "changeRateBgAlpha8", "Landroid/graphics/drawable/Drawable;", "getChangeRateBgAlpha8", "()Landroid/graphics/drawable/Drawable;", "setChangeRateBgAlpha8", "(Landroid/graphics/drawable/Drawable;)V", "changeRateBg", "getChangeRateBg", "setChangeRateBg", "changeRateString", "getChangeRateString", "setChangeRateString", "symbolString", "Lcom/kubi/utils/StyledText;", "getSymbolString", "()Lcom/kubi/utils/StyledText;", "setSymbolString", "(Lcom/kubi/utils/StyledText;)V", "valueTvShow", "", "getValueTvShow", "()Z", "setValueTvShow", "(Z)V", "iconUrl", "getIconUrl", "setIconUrl", "coinLabel", "getCoinLabel", "setCoinLabel", "valueString", "getValueString", "setValueString", "rankNewCoinString", "getRankNewCoinString", "setRankNewCoinString", "rankNewCoinChangeRateString", "getRankNewCoinChangeRateString", "setRankNewCoinChangeRateString", "rankNewCoinOpeningTime", "getRankNewCoinOpeningTime", "setRankNewCoinOpeningTime", "rankNewCoinTextColor", "getRankNewCoinTextColor", "setRankNewCoinTextColor", "buildCoinField", "", "buildNewCoinField", "buildCommonField", "isVol", "isNewCoin", "component1", "component2", "component3", "component4", "copy", "equals", "other", "", "hashCode", "toString", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class RankItem implements MultiItemEntity {

    @Nullable
    private Drawable changeRateBg;

    @Nullable
    private Drawable changeRateBgAlpha8;
    private int changeRateColor;

    @Nullable
    private String changeRateString;

    @Nullable
    private String coinLabel;

    @Nullable
    private String iconUrl;
    private int itemType;

    @Nullable
    private CharSequence moneyPriceString;

    @Nullable
    private String priceString;

    @Nullable
    private RankNewCoin rankNewCoin;

    @Nullable
    private String rankNewCoinChangeRateString;

    @Nullable
    private String rankNewCoinOpeningTime;

    @Nullable
    private C27096v0 rankNewCoinString;
    private int rankNewCoinTextColor;
    private int rankType;

    @Nullable
    private C27096v0 symbolString;

    @Nullable
    private TradeItemBean tradeItemBean;

    @Nullable
    private String valueString;
    private boolean valueTvShow;

    public RankItem(int i11, @Nullable TradeItemBean tradeItemBean, @Nullable RankNewCoin rankNewCoin, int i12) {
        this.rankType = i11;
        this.tradeItemBean = tradeItemBean;
        this.rankNewCoin = rankNewCoin;
        this.itemType = i12;
        int i13 = R$color.emphasis40;
        this.changeRateColor = i13;
        this.valueTvShow = isVol();
        this.rankNewCoinTextColor = i13;
        buildCoinField();
        buildCommonField();
        buildNewCoinField();
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RankItem)) {
            return false;
        }
        RankItem rankItem = (RankItem) other;
        return this.rankType == rankItem.rankType && Intrinsics.areEqual(this.tradeItemBean, rankItem.tradeItemBean) && Intrinsics.areEqual(this.rankNewCoin, rankItem.rankNewCoin) && this.itemType == rankItem.itemType;
    }

    /* JADX WARN: Code duplicated, block: B:45:0x00ce  */
    private final void buildCommonField() {
        String strM92642g;
        String strM85578b;
        SymbolInfoEntity symbolInfoEntity;
        BigDecimal bigDecimalM82286f;
        Double changeRate;
        BigDecimal bigDecimalM82286f2;
        TradeItemBean tradeItemBean = this.tradeItemBean;
        if (tradeItemBean == null || (changeRate = tradeItemBean.getChangeRate()) == null || (bigDecimalM82286f2 = C36720e.m82286f(changeRate.doubleValue())) == null || (strM92642g = C42180b.m92642g(bigDecimalM82286f2, null, null, C41014a.m89951y(bigDecimalM82286f2), true, false, false, 19, null)) == null) {
            strM92642g = "--";
        }
        this.changeRateString = strM92642g;
        TradeItemBean tradeItemBean2 = this.tradeItemBean;
        SpannableStringBuilder spannableStringBuilderM89960g = null;
        double dM66646f = C27039d.m66646f(tradeItemBean2 != null ? tradeItemBean2.getChangeRate() : null);
        C27017c c27017c = C27017c.f54310a;
        this.changeRateBg = C22890g.m54286k(dM66646f, c27017c.m66513b());
        Context contextM66513b = c27017c.m66513b();
        TradeItemBean tradeItemBean3 = this.tradeItemBean;
        this.changeRateColor = C22890g.m54279d(contextM66513b, C27039d.m66646f(tradeItemBean3 != null ? tradeItemBean3.getChangeRate() : null), 0, 2, null);
        TradeItemBean tradeItemBean4 = this.tradeItemBean;
        this.changeRateBgAlpha8 = C22890g.m54284i(C27039d.m66646f(tradeItemBean4 != null ? tradeItemBean4.getChangeRate() : null), c27017c.m66513b());
        TradeItemBean tradeItemBean5 = this.tradeItemBean;
        if ((tradeItemBean5 != null ? Double.valueOf(tradeItemBean5.getLastDealPrice()) : null) == null) {
            strM85578b = "- -";
        } else {
            TradeItemBean tradeItemBean6 = this.tradeItemBean;
            Double dValueOf = tradeItemBean6 != null ? Double.valueOf(tradeItemBean6.getLastDealPrice()) : null;
            Intrinsics.checkNotNull(dValueOf);
            if (dValueOf.doubleValue() < 0.0d) {
                strM85578b = "- -";
            } else {
                TradeItemBean tradeItemBean7 = this.tradeItemBean;
                if (tradeItemBean7 == null || (bigDecimalM82286f = C36720e.m82286f(tradeItemBean7.getLastDealPrice())) == null) {
                    strM85578b = null;
                } else {
                    TradeItemBean tradeItemBean8 = this.tradeItemBean;
                    strM85578b = C37886j.m85578b(bigDecimalM82286f, tradeItemBean8 != null ? tradeItemBean8.getSymbol() : null, null, false, false, false, 0, null, 0, 254, null);
                }
            }
        }
        this.priceString = strM85578b;
        TradeItemBean tradeItemBean9 = this.tradeItemBean;
        if (tradeItemBean9 != null) {
            double lastDealPrice = tradeItemBean9.getLastDealPrice();
            TradeItemBean tradeItemBean10 = this.tradeItemBean;
            BigDecimal bigDecimalM82286f3 = C36720e.m82286f(C41014a.m89939m(lastDealPrice, (tradeItemBean10 == null || (symbolInfoEntity = tradeItemBean10.getSymbolInfoEntity()) == null) ? null : symbolInfoEntity.getQuoteCurrency()));
            if (bigDecimalM82286f3 != null) {
                spannableStringBuilderM89960g = C41015b.m89960g(bigDecimalM82286f3, null, null, 0, 7, null);
            }
        }
        this.moneyPriceString = spannableStringBuilderM89960g;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    private final int getItemType() {
        return this.itemType;
    }

    public static /* synthetic */ RankItem copy$default(RankItem rankItem, int i11, TradeItemBean tradeItemBean, RankNewCoin rankNewCoin, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = rankItem.rankType;
        }
        if ((i13 & 2) != 0) {
            tradeItemBean = rankItem.tradeItemBean;
        }
        if ((i13 & 4) != 0) {
            rankNewCoin = rankItem.rankNewCoin;
        }
        if ((i13 & 8) != 0) {
            i12 = rankItem.itemType;
        }
        return rankItem.copy(i11, tradeItemBean, rankNewCoin, i12);
    }

    private final boolean isVol() {
        int i11 = this.rankType;
        return i11 == 4 || i11 == 5;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getRankType() {
        return this.rankType;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final TradeItemBean getTradeItemBean() {
        return this.tradeItemBean;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final RankNewCoin getRankNewCoin() {
        return this.rankNewCoin;
    }

    @NotNull
    public final RankItem copy(int rankType, @Nullable TradeItemBean tradeItemBean, @Nullable RankNewCoin rankNewCoin, int itemType) {
        return new RankItem(rankType, tradeItemBean, rankNewCoin, itemType);
    }

    @Nullable
    public final Drawable getChangeRateBg() {
        return this.changeRateBg;
    }

    @Nullable
    public final Drawable getChangeRateBgAlpha8() {
        return this.changeRateBgAlpha8;
    }

    public final int getChangeRateColor() {
        return this.changeRateColor;
    }

    @Nullable
    public final String getChangeRateString() {
        return this.changeRateString;
    }

    @Nullable
    public final String getCoinLabel() {
        return this.coinLabel;
    }

    @Nullable
    public final String getIconUrl() {
        return this.iconUrl;
    }

    @Override // io.chad.library.adapter.base.entity.MultiItemEntity
    /* JADX INFO: renamed from: getItemType */
    public int getF42794b() {
        return this.itemType;
    }

    @Nullable
    public final CharSequence getMoneyPriceString() {
        return this.moneyPriceString;
    }

    @Nullable
    public final String getPriceString() {
        return this.priceString;
    }

    @Nullable
    public final RankNewCoin getRankNewCoin() {
        return this.rankNewCoin;
    }

    @Nullable
    public final String getRankNewCoinChangeRateString() {
        return this.rankNewCoinChangeRateString;
    }

    @Nullable
    public final String getRankNewCoinOpeningTime() {
        return this.rankNewCoinOpeningTime;
    }

    @Nullable
    public final C27096v0 getRankNewCoinString() {
        return this.rankNewCoinString;
    }

    public final int getRankNewCoinTextColor() {
        return this.rankNewCoinTextColor;
    }

    public final int getRankType() {
        return this.rankType;
    }

    @Nullable
    public final C27096v0 getSymbolString() {
        return this.symbolString;
    }

    @Nullable
    public final TradeItemBean getTradeItemBean() {
        return this.tradeItemBean;
    }

    @Nullable
    public final String getValueString() {
        return this.valueString;
    }

    public final boolean getValueTvShow() {
        return this.valueTvShow;
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.rankType) * 31;
        TradeItemBean tradeItemBean = this.tradeItemBean;
        int iHashCode2 = (iHashCode + (tradeItemBean == null ? 0 : tradeItemBean.hashCode())) * 31;
        RankNewCoin rankNewCoin = this.rankNewCoin;
        return ((iHashCode2 + (rankNewCoin != null ? rankNewCoin.hashCode() : 0)) * 31) + Integer.hashCode(this.itemType);
    }

    public final void setChangeRateBg(@Nullable Drawable drawable) {
        this.changeRateBg = drawable;
    }

    public final void setChangeRateBgAlpha8(@Nullable Drawable drawable) {
        this.changeRateBgAlpha8 = drawable;
    }

    public final void setChangeRateColor(int i11) {
        this.changeRateColor = i11;
    }

    public final void setChangeRateString(@Nullable String str) {
        this.changeRateString = str;
    }

    public final void setCoinLabel(@Nullable String str) {
        this.coinLabel = str;
    }

    public final void setIconUrl(@Nullable String str) {
        this.iconUrl = str;
    }

    public final void setMoneyPriceString(@Nullable CharSequence charSequence) {
        this.moneyPriceString = charSequence;
    }

    public final void setPriceString(@Nullable String str) {
        this.priceString = str;
    }

    public final void setRankNewCoin(@Nullable RankNewCoin rankNewCoin) {
        this.rankNewCoin = rankNewCoin;
    }

    public final void setRankNewCoinChangeRateString(@Nullable String str) {
        this.rankNewCoinChangeRateString = str;
    }

    public final void setRankNewCoinOpeningTime(@Nullable String str) {
        this.rankNewCoinOpeningTime = str;
    }

    public final void setRankNewCoinString(@Nullable C27096v0 c27096v0) {
        this.rankNewCoinString = c27096v0;
    }

    public final void setRankNewCoinTextColor(int i11) {
        this.rankNewCoinTextColor = i11;
    }

    public final void setRankType(int i11) {
        this.rankType = i11;
    }

    public final void setSymbolString(@Nullable C27096v0 c27096v0) {
        this.symbolString = c27096v0;
    }

    public final void setTradeItemBean(@Nullable TradeItemBean tradeItemBean) {
        this.tradeItemBean = tradeItemBean;
    }

    public final void setValueString(@Nullable String str) {
        this.valueString = str;
    }

    public final void setValueTvShow(boolean z11) {
        this.valueTvShow = z11;
    }

    @NotNull
    public String toString() {
        return "RankItem(rankType=" + this.rankType + ", tradeItemBean=" + this.tradeItemBean + ", rankNewCoin=" + this.rankNewCoin + ", itemType=" + this.itemType + ')';
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0018  */
    private final void buildCoinField() {
        SymbolInfoEntity symbolInfoEntity;
        C27096v0 c27096v0M29931d;
        String strM85566e = null;
        if (!isNewCoin()) {
            if (isVol()) {
                TradeItemBean tradeItemBean = this.tradeItemBean;
                if (tradeItemBean != null) {
                    c27096v0M29931d = C14768b.m29932e(tradeItemBean, 14);
                } else {
                    c27096v0M29931d = null;
                }
            } else {
                TradeItemBean tradeItemBean2 = this.tradeItemBean;
                if (tradeItemBean2 == null) {
                    c27096v0M29931d = null;
                } else {
                    c27096v0M29931d = C14768b.m29931d(tradeItemBean2, 14);
                }
            }
            this.symbolString = c27096v0M29931d;
        }
        if (isVol()) {
            TradeItemBean tradeItemBean3 = this.tradeItemBean;
            if (tradeItemBean3 != null) {
                double value = tradeItemBean3.getValue();
                TradeItemBean tradeItemBean4 = this.tradeItemBean;
                if (tradeItemBean4 != null && (symbolInfoEntity = tradeItemBean4.getSymbolInfoEntity()) != null) {
                    strM85566e = symbolInfoEntity.getQuoteCurrency();
                }
                strM85566e = C37885i.m85566e(value, strM85566e);
            }
            this.valueString = strM85566e;
        }
    }

    private final void buildNewCoinField() {
        C27096v0 c27096v0M29931d;
        String strM92642g;
        String strM92629b;
        double d11;
        Double allItemAmount;
        String openingPrice;
        Double dValueOf;
        double d12;
        String openingPrice2;
        Long openingTime;
        Double changeRate;
        BigDecimal bigDecimalM82286f;
        if (isNewCoin()) {
            TradeItemBean tradeItemBean = this.tradeItemBean;
            Double dValueOf2 = null;
            if (tradeItemBean != null) {
                c27096v0M29931d = C14768b.m29931d(tradeItemBean, 14);
            } else {
                c27096v0M29931d = null;
            }
            this.rankNewCoinString = c27096v0M29931d;
            TradeItemBean tradeItemBean2 = this.tradeItemBean;
            if (tradeItemBean2 != null && (changeRate = tradeItemBean2.getChangeRate()) != null && (bigDecimalM82286f = C36720e.m82286f(changeRate.doubleValue())) != null) {
                strM92642g = C42180b.m92642g(bigDecimalM82286f, null, null, 0, true, false, false, 55, null);
            } else {
                strM92642g = null;
            }
            this.changeRateString = strM92642g;
            RankNewCoin rankNewCoin = this.rankNewCoin;
            if (rankNewCoin != null && (openingTime = rankNewCoin.getOpeningTime()) != null) {
                strM92629b = C42179a.m92629b(openingTime.longValue(), null, false, null, false, 15, null);
            } else {
                strM92629b = null;
            }
            this.rankNewCoinOpeningTime = strM92629b;
            RankNewCoin rankNewCoin2 = this.rankNewCoin;
            double dDoubleValue = 0.0d;
            if (rankNewCoin2 != null) {
                TradeItemBean tradeItemBean3 = this.tradeItemBean;
                if (tradeItemBean3 != null) {
                    dValueOf = Double.valueOf(tradeItemBean3.getLastDealPrice());
                } else {
                    dValueOf = null;
                }
                RankNewCoin rankNewCoin3 = this.rankNewCoin;
                if (rankNewCoin3 != null && (openingPrice2 = rankNewCoin3.getOpeningPrice()) != null) {
                    d12 = Double.parseDouble(openingPrice2);
                } else {
                    d12 = 0.0d;
                }
                rankNewCoin2.setAllItemAmount(Double.valueOf(C36720e.m82284d(dValueOf, Double.valueOf(d12))));
            }
            TradeItemBean tradeItemBean4 = this.tradeItemBean;
            if (tradeItemBean4 != null) {
                dValueOf2 = Double.valueOf(tradeItemBean4.getLastDealPrice());
            }
            RankNewCoin rankNewCoin4 = this.rankNewCoin;
            if (rankNewCoin4 != null && (openingPrice = rankNewCoin4.getOpeningPrice()) != null) {
                d11 = Double.parseDouble(openingPrice);
            } else {
                d11 = 0.0d;
            }
            this.rankNewCoinChangeRateString = C36720e.m82283c(dValueOf2, Double.valueOf(d11));
            Context contextM66513b = C27017c.f54310a.m66513b();
            RankNewCoin rankNewCoin5 = this.rankNewCoin;
            if (rankNewCoin5 != null && (allItemAmount = rankNewCoin5.getAllItemAmount()) != null) {
                dDoubleValue = allItemAmount.doubleValue();
            }
            this.rankNewCoinTextColor = C22890g.m54279d(contextM66513b, dDoubleValue, 0, 2, null);
        }
    }

    public final boolean isNewCoin() {
        if (getF42794b() == 2) {
            return true;
        }
        return false;
    }

    public /* synthetic */ RankItem(int i11, TradeItemBean tradeItemBean, RankNewCoin rankNewCoin, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? 1 : i11, tradeItemBean, rankNewCoin, i12);
    }
}
