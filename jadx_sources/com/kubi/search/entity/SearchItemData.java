package com.kubi.search.entity;

import androidx.annotation.Keep;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.search.searchresult.SearchCategory$Companion;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ISearchResultData.kt */
/* JADX INFO: loaded from: classes44.dex */
@Keep
@Metadata(m90083d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b'\n\u0002\u0010\b\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B¡\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u0003\u0012\u0006\u0010\u0011\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0019\u0010\u001aJ\b\u0010>\u001a\u00020?H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001cR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001cR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001cR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010 R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001cR\u001a\u0010\n\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010 \"\u0004\b\"\u0010#R\u001a\u0010\u000b\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u001c\"\u0004\b%\u0010&R\u001a\u0010\f\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010\u001c\"\u0004\b(\u0010&R\u001a\u0010\r\u001a\u00020\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u0011\u0010\u000f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b-\u0010\u001cR\u0011\u0010\u0010\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b.\u0010\u001cR\u0011\u0010\u0011\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b/\u0010\u001cR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u0015X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b<\u00105\"\u0004\b=\u00107R\u0011\u0010@\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b@\u0010 R\u0011\u0010A\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\bA\u0010 R\u0011\u0010B\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\bB\u0010 R\u0011\u0010C\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\bC\u0010 R\u0011\u0010D\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\bD\u0010 ¨\u0006E"}, m90084d2 = {"Lcom/kubi/search/entity/SearchItemData;", "Lcom/kubi/search/entity/ISearchResultData;", "category", "", "iconUrl", "baseCurrencyName", "quoteCurrencyName", "isShowMarginLeverLabel", "", "marginMaxLeverString", "isPreviewEnableShow", FirebaseAnalytics.Param.PRICE, "formatChangeRate", "changeRate", "", "symbol", "showSymbol", "coinLabel", "beanContract", "Lcom/kubi/search/entity/ContractTradeItemBean;", "beanEarn", "Lcom/kubi/search/entity/ExtendEntity;", "beanRemoteEntity", "Lcom/kubi/search/entity/SearchEntity;", "beanWeb3", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;ZLjava/lang/String;Ljava/lang/String;DLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/kubi/search/entity/ContractTradeItemBean;Lcom/kubi/search/entity/ExtendEntity;Lcom/kubi/search/entity/SearchEntity;Lcom/kubi/search/entity/ExtendEntity;)V", "getCategory", "()Ljava/lang/String;", "getIconUrl", "getBaseCurrencyName", "getQuoteCurrencyName", "()Z", "getMarginMaxLeverString", "setPreviewEnableShow", "(Z)V", "getPrice", "setPrice", "(Ljava/lang/String;)V", "getFormatChangeRate", "setFormatChangeRate", "getChangeRate", "()D", "setChangeRate", "(D)V", "getSymbol", "getShowSymbol", "getCoinLabel", "getBeanContract", "()Lcom/kubi/search/entity/ContractTradeItemBean;", "setBeanContract", "(Lcom/kubi/search/entity/ContractTradeItemBean;)V", "getBeanEarn", "()Lcom/kubi/search/entity/ExtendEntity;", "setBeanEarn", "(Lcom/kubi/search/entity/ExtendEntity;)V", "getBeanRemoteEntity", "()Lcom/kubi/search/entity/SearchEntity;", "setBeanRemoteEntity", "(Lcom/kubi/search/entity/SearchEntity;)V", "getBeanWeb3", "setBeanWeb3", "getItemType", "", "isSpot", "isFuture", "isEarn", "isWeb3", "isAlpha", "SearchLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class SearchItemData implements ISearchResultData {

    @NotNull
    private final String baseCurrencyName;

    @Nullable
    private ContractTradeItemBean beanContract;

    @Nullable
    private ExtendEntity beanEarn;

    @Nullable
    private SearchEntity beanRemoteEntity;

    @Nullable
    private ExtendEntity beanWeb3;

    @NotNull
    private final String category;
    private double changeRate;

    @NotNull
    private final String coinLabel;

    @NotNull
    private String formatChangeRate;

    @Nullable
    private final String iconUrl;
    private final boolean isAlpha;
    private final boolean isEarn;
    private final boolean isFuture;
    private boolean isPreviewEnableShow;
    private final boolean isShowMarginLeverLabel;
    private final boolean isSpot;
    private final boolean isWeb3;

    @NotNull
    private final String marginMaxLeverString;

    @NotNull
    private String price;

    @NotNull
    private final String quoteCurrencyName;

    @NotNull
    private final String showSymbol;

    @NotNull
    private final String symbol;

    public SearchItemData(@NotNull String category, @Nullable String str, @NotNull String baseCurrencyName, @NotNull String quoteCurrencyName, boolean z11, @NotNull String marginMaxLeverString, boolean z12, @NotNull String price, @NotNull String formatChangeRate, double d11, @NotNull String symbol, @NotNull String showSymbol, @NotNull String coinLabel, @Nullable ContractTradeItemBean contractTradeItemBean, @Nullable ExtendEntity extendEntity, @Nullable SearchEntity searchEntity, @Nullable ExtendEntity extendEntity2) {
        Intrinsics.checkNotNullParameter(category, "category");
        Intrinsics.checkNotNullParameter(baseCurrencyName, "baseCurrencyName");
        Intrinsics.checkNotNullParameter(quoteCurrencyName, "quoteCurrencyName");
        Intrinsics.checkNotNullParameter(marginMaxLeverString, "marginMaxLeverString");
        Intrinsics.checkNotNullParameter(price, "price");
        Intrinsics.checkNotNullParameter(formatChangeRate, "formatChangeRate");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(showSymbol, "showSymbol");
        Intrinsics.checkNotNullParameter(coinLabel, "coinLabel");
        this.category = category;
        this.iconUrl = str;
        this.baseCurrencyName = baseCurrencyName;
        this.quoteCurrencyName = quoteCurrencyName;
        this.isShowMarginLeverLabel = z11;
        this.marginMaxLeverString = marginMaxLeverString;
        this.isPreviewEnableShow = z12;
        this.price = price;
        this.formatChangeRate = formatChangeRate;
        this.changeRate = d11;
        this.symbol = symbol;
        this.showSymbol = showSymbol;
        this.coinLabel = coinLabel;
        this.beanContract = contractTradeItemBean;
        this.beanEarn = extendEntity;
        this.beanRemoteEntity = searchEntity;
        this.beanWeb3 = extendEntity2;
        this.isSpot = Intrinsics.areEqual(category, SearchCategory$Companion.SPOT);
        this.isFuture = Intrinsics.areEqual(category, SearchCategory$Companion.FUTURES);
        this.isEarn = Intrinsics.areEqual(category, SearchCategory$Companion.EARN);
        this.isWeb3 = Intrinsics.areEqual(category, SearchCategory$Companion.WEB3);
        this.isAlpha = Intrinsics.areEqual(category, "alpha");
    }

    @NotNull
    public final String getBaseCurrencyName() {
        return this.baseCurrencyName;
    }

    @Nullable
    public final ContractTradeItemBean getBeanContract() {
        return this.beanContract;
    }

    @Nullable
    public final ExtendEntity getBeanEarn() {
        return this.beanEarn;
    }

    @Nullable
    public final SearchEntity getBeanRemoteEntity() {
        return this.beanRemoteEntity;
    }

    @Nullable
    public final ExtendEntity getBeanWeb3() {
        return this.beanWeb3;
    }

    @NotNull
    public final String getCategory() {
        return this.category;
    }

    public final double getChangeRate() {
        return this.changeRate;
    }

    @NotNull
    public final String getCoinLabel() {
        return this.coinLabel;
    }

    @NotNull
    public final String getFormatChangeRate() {
        return this.formatChangeRate;
    }

    @Nullable
    public final String getIconUrl() {
        return this.iconUrl;
    }

    @Override // io.chad.library.adapter.base.entity.MultiItemEntity
    /* JADX INFO: renamed from: getItemType */
    public int getF42794b() {
        if (this.isEarn) {
            return 3;
        }
        if (this.isWeb3) {
            return 7;
        }
        return this.isAlpha ? 9 : 2;
    }

    @NotNull
    public final String getMarginMaxLeverString() {
        return this.marginMaxLeverString;
    }

    @NotNull
    public final String getPrice() {
        return this.price;
    }

    @NotNull
    public final String getQuoteCurrencyName() {
        return this.quoteCurrencyName;
    }

    @NotNull
    public final String getShowSymbol() {
        return this.showSymbol;
    }

    @NotNull
    public final String getSymbol() {
        return this.symbol;
    }

    /* JADX INFO: renamed from: isAlpha, reason: from getter */
    public final boolean getIsAlpha() {
        return this.isAlpha;
    }

    /* JADX INFO: renamed from: isEarn, reason: from getter */
    public final boolean getIsEarn() {
        return this.isEarn;
    }

    /* JADX INFO: renamed from: isFuture, reason: from getter */
    public final boolean getIsFuture() {
        return this.isFuture;
    }

    /* JADX INFO: renamed from: isPreviewEnableShow, reason: from getter */
    public final boolean getIsPreviewEnableShow() {
        return this.isPreviewEnableShow;
    }

    /* JADX INFO: renamed from: isShowMarginLeverLabel, reason: from getter */
    public final boolean getIsShowMarginLeverLabel() {
        return this.isShowMarginLeverLabel;
    }

    /* JADX INFO: renamed from: isSpot, reason: from getter */
    public final boolean getIsSpot() {
        return this.isSpot;
    }

    /* JADX INFO: renamed from: isWeb3, reason: from getter */
    public final boolean getIsWeb3() {
        return this.isWeb3;
    }

    public final void setBeanContract(@Nullable ContractTradeItemBean contractTradeItemBean) {
        this.beanContract = contractTradeItemBean;
    }

    public final void setBeanEarn(@Nullable ExtendEntity extendEntity) {
        this.beanEarn = extendEntity;
    }

    public final void setBeanRemoteEntity(@Nullable SearchEntity searchEntity) {
        this.beanRemoteEntity = searchEntity;
    }

    public final void setBeanWeb3(@Nullable ExtendEntity extendEntity) {
        this.beanWeb3 = extendEntity;
    }

    public final void setChangeRate(double d11) {
        this.changeRate = d11;
    }

    public final void setFormatChangeRate(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.formatChangeRate = str;
    }

    public final void setPreviewEnableShow(boolean z11) {
        this.isPreviewEnableShow = z11;
    }

    public final void setPrice(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.price = str;
    }

    public /* synthetic */ SearchItemData(String str, String str2, String str3, String str4, boolean z11, String str5, boolean z12, String str6, String str7, double d11, String str8, String str9, String str10, ContractTradeItemBean contractTradeItemBean, ExtendEntity extendEntity, SearchEntity searchEntity, ExtendEntity extendEntity2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, z11, str5, z12, str6, str7, d11, str8, str9, str10, (i11 & 8192) != 0 ? null : contractTradeItemBean, (i11 & 16384) != 0 ? null : extendEntity, (32768 & i11) != 0 ? null : searchEntity, (i11 & 65536) != 0 ? null : extendEntity2);
    }
}
