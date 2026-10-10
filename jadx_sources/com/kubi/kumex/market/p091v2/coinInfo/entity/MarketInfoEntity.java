package com.kubi.kumex.market.p091v2.coinInfo.entity;

import androidx.annotation.Keep;
import com.tencent.bugly.proguard.C33616e0;
import io.chad.library.adapter.base.entity.MultiItemEntity;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: MarketCoinInfoEntity.kt */
/* JADX INFO: loaded from: classes20.dex */
@Keep
@Metadata(m90083d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0087\b\u0018\u0000 +2\u00020\u0001:\u0002+,B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u001e\u001a\u00020\u0003H\u0016J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\tHÆ\u0003J\t\u0010#\u001a\u00020\u000bHÆ\u0003JA\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0013\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010(HÖ\u0003J\t\u0010)\u001a\u00020\u0003HÖ\u0001J\t\u0010*\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001c\u0010\b\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d¨\u0006-"}, m90084d2 = {"Lcom/kubi/kumex/market/v2/coinInfo/entity/MarketInfoEntity;", "Lio/chad/library/adapter/base/entity/MultiItemEntity;", "type", "", "baseCurrency", "", "info", "Lcom/kubi/kumex/market/v2/coinInfo/entity/MarketCoinInfo;", C33616e0.f69644s, "Lcom/kubi/kumex/market/v2/coinInfo/entity/TagEntity;", "community", "Lcom/kubi/kumex/market/v2/coinInfo/entity/ReaperWarpEntity;", "<init>", "(ILjava/lang/String;Lcom/kubi/kumex/market/v2/coinInfo/entity/MarketCoinInfo;Lcom/kubi/kumex/market/v2/coinInfo/entity/TagEntity;Lcom/kubi/kumex/market/v2/coinInfo/entity/ReaperWarpEntity;)V", "getType", "()I", "getBaseCurrency", "()Ljava/lang/String;", "getInfo", "()Lcom/kubi/kumex/market/v2/coinInfo/entity/MarketCoinInfo;", "setInfo", "(Lcom/kubi/kumex/market/v2/coinInfo/entity/MarketCoinInfo;)V", "getTags", "()Lcom/kubi/kumex/market/v2/coinInfo/entity/TagEntity;", "setTags", "(Lcom/kubi/kumex/market/v2/coinInfo/entity/TagEntity;)V", "getCommunity", "()Lcom/kubi/kumex/market/v2/coinInfo/entity/ReaperWarpEntity;", "setCommunity", "(Lcom/kubi/kumex/market/v2/coinInfo/entity/ReaperWarpEntity;)V", "getItemType", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "", "hashCode", "toString", "Companion", "CoinInfoType", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class MarketInfoEntity implements MultiItemEntity {
    public static final int TYPE_FAQ = 1;
    public static final int TYPE_INTRO = 0;
    public static final int TYPE_MORE = 3;

    @Nullable
    private final String baseCurrency;

    @NotNull
    private ReaperWarpEntity community;

    @Nullable
    private MarketCoinInfo info;

    @Nullable
    private TagEntity tags;
    private final int type;

    public MarketInfoEntity(int i11, @Nullable String str, @Nullable MarketCoinInfo marketCoinInfo, @Nullable TagEntity tagEntity, @NotNull ReaperWarpEntity community) {
        Intrinsics.checkNotNullParameter(community, "community");
        this.type = i11;
        this.baseCurrency = str;
        this.info = marketCoinInfo;
        this.tags = tagEntity;
        this.community = community;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MarketInfoEntity)) {
            return false;
        }
        MarketInfoEntity marketInfoEntity = (MarketInfoEntity) other;
        return this.type == marketInfoEntity.type && Intrinsics.areEqual(this.baseCurrency, marketInfoEntity.baseCurrency) && Intrinsics.areEqual(this.info, marketInfoEntity.info) && Intrinsics.areEqual(this.tags, marketInfoEntity.tags) && Intrinsics.areEqual(this.community, marketInfoEntity.community);
    }

    public static /* synthetic */ MarketInfoEntity copy$default(MarketInfoEntity marketInfoEntity, int i11, String str, MarketCoinInfo marketCoinInfo, TagEntity tagEntity, ReaperWarpEntity reaperWarpEntity, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = marketInfoEntity.type;
        }
        if ((i12 & 2) != 0) {
            str = marketInfoEntity.baseCurrency;
        }
        if ((i12 & 4) != 0) {
            marketCoinInfo = marketInfoEntity.info;
        }
        if ((i12 & 8) != 0) {
            tagEntity = marketInfoEntity.tags;
        }
        if ((i12 & 16) != 0) {
            reaperWarpEntity = marketInfoEntity.community;
        }
        ReaperWarpEntity reaperWarpEntity2 = reaperWarpEntity;
        MarketCoinInfo marketCoinInfo2 = marketCoinInfo;
        return marketInfoEntity.copy(i11, str, marketCoinInfo2, tagEntity, reaperWarpEntity2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getType() {
        return this.type;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getBaseCurrency() {
        return this.baseCurrency;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final MarketCoinInfo getInfo() {
        return this.info;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final TagEntity getTags() {
        return this.tags;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final ReaperWarpEntity getCommunity() {
        return this.community;
    }

    @NotNull
    public final MarketInfoEntity copy(int type, @Nullable String baseCurrency, @Nullable MarketCoinInfo info, @Nullable TagEntity tags, @NotNull ReaperWarpEntity community) {
        Intrinsics.checkNotNullParameter(community, "community");
        return new MarketInfoEntity(type, baseCurrency, info, tags, community);
    }

    @Nullable
    public final String getBaseCurrency() {
        return this.baseCurrency;
    }

    @NotNull
    public final ReaperWarpEntity getCommunity() {
        return this.community;
    }

    @Nullable
    public final MarketCoinInfo getInfo() {
        return this.info;
    }

    @Override // io.chad.library.adapter.base.entity.MultiItemEntity
    /* JADX INFO: renamed from: getItemType */
    public int getF42794b() {
        return this.type;
    }

    @Nullable
    public final TagEntity getTags() {
        return this.tags;
    }

    public final int getType() {
        return this.type;
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.type) * 31;
        String str = this.baseCurrency;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        MarketCoinInfo marketCoinInfo = this.info;
        int iHashCode3 = (iHashCode2 + (marketCoinInfo == null ? 0 : marketCoinInfo.hashCode())) * 31;
        TagEntity tagEntity = this.tags;
        return ((iHashCode3 + (tagEntity != null ? tagEntity.hashCode() : 0)) * 31) + this.community.hashCode();
    }

    public final void setCommunity(@NotNull ReaperWarpEntity reaperWarpEntity) {
        Intrinsics.checkNotNullParameter(reaperWarpEntity, "<set-?>");
        this.community = reaperWarpEntity;
    }

    public final void setInfo(@Nullable MarketCoinInfo marketCoinInfo) {
        this.info = marketCoinInfo;
    }

    public final void setTags(@Nullable TagEntity tagEntity) {
        this.tags = tagEntity;
    }

    @NotNull
    public String toString() {
        return "MarketInfoEntity(type=" + this.type + ", baseCurrency=" + this.baseCurrency + ", info=" + this.info + ", tags=" + this.tags + ", community=" + this.community + ')';
    }

    public /* synthetic */ MarketInfoEntity(int i11, String str, MarketCoinInfo marketCoinInfo, TagEntity tagEntity, ReaperWarpEntity reaperWarpEntity, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(i11, (i12 & 2) != 0 ? null : str, (i12 & 4) != 0 ? null : marketCoinInfo, (i12 & 8) != 0 ? null : tagEntity, (i12 & 16) != 0 ? new ReaperWarpEntity(null, null, 3, null) : reaperWarpEntity);
    }
}
