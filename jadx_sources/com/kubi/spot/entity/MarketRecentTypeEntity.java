package com.kubi.spot.entity;

import androidx.annotation.Keep;
import com.kubi.data.entity.TradeItemBean;
import com.kubi.utils.extensions.C27039d;
import io.chad.library.adapter.base.entity.MultiItemEntity;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: MarketRecentTypeEntity.kt */
/* JADX INFO: loaded from: classes47.dex */
@Keep
@Metadata(m90083d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u0000 #2\u00020\u0001:\u0001#B1\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u0016\u001a\u00020\u0003H\u0016J\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\fJ\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0011\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003J8\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u001bJ\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fHÖ\u0003J\t\u0010 \u001a\u00020\u0003HÖ\u0001J\t\u0010!\u001a\u00020\"HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\"\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006$"}, m90084d2 = {"Lcom/kubi/spot/entity/MarketRecentTypeEntity;", "Lio/chad/library/adapter/base/entity/MultiItemEntity;", "type", "", "tradeItemBean", "Lcom/kubi/data/entity/TradeItemBean;", "info", "", "Lcom/kubi/spot/entity/MarketRecentEntity;", "<init>", "(Ljava/lang/Integer;Lcom/kubi/data/entity/TradeItemBean;Ljava/util/List;)V", "getType", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getTradeItemBean", "()Lcom/kubi/data/entity/TradeItemBean;", "setTradeItemBean", "(Lcom/kubi/data/entity/TradeItemBean;)V", "getInfo", "()Ljava/util/List;", "setInfo", "(Ljava/util/List;)V", "getItemType", "component1", "component2", "component3", "copy", "(Ljava/lang/Integer;Lcom/kubi/data/entity/TradeItemBean;Ljava/util/List;)Lcom/kubi/spot/entity/MarketRecentTypeEntity;", "equals", "", "other", "", "hashCode", "toString", "", "Companion", "SpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class MarketRecentTypeEntity implements MultiItemEntity {
    public static final int TYPE_MARKET_CHANGE = 0;
    public static final int TYPE_MARKET_RECENT = 1;

    @Nullable
    private List<? extends MarketRecentEntity> info;

    @Nullable
    private TradeItemBean tradeItemBean;

    @Nullable
    private final Integer type;

    public MarketRecentTypeEntity() {
        this(null, null, null, 7, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MarketRecentTypeEntity)) {
            return false;
        }
        MarketRecentTypeEntity marketRecentTypeEntity = (MarketRecentTypeEntity) other;
        return Intrinsics.areEqual(this.type, marketRecentTypeEntity.type) && Intrinsics.areEqual(this.tradeItemBean, marketRecentTypeEntity.tradeItemBean) && Intrinsics.areEqual(this.info, marketRecentTypeEntity.info);
    }

    public MarketRecentTypeEntity(@Nullable Integer num, @Nullable TradeItemBean tradeItemBean, @Nullable List<? extends MarketRecentEntity> list) {
        this.type = num;
        this.tradeItemBean = tradeItemBean;
        this.info = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MarketRecentTypeEntity copy$default(MarketRecentTypeEntity marketRecentTypeEntity, Integer num, TradeItemBean tradeItemBean, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            num = marketRecentTypeEntity.type;
        }
        if ((i11 & 2) != 0) {
            tradeItemBean = marketRecentTypeEntity.tradeItemBean;
        }
        if ((i11 & 4) != 0) {
            list = marketRecentTypeEntity.info;
        }
        return marketRecentTypeEntity.copy(num, tradeItemBean, list);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Integer getType() {
        return this.type;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final TradeItemBean getTradeItemBean() {
        return this.tradeItemBean;
    }

    @Nullable
    public final List<MarketRecentEntity> component3() {
        return this.info;
    }

    @NotNull
    public final MarketRecentTypeEntity copy(@Nullable Integer type, @Nullable TradeItemBean tradeItemBean, @Nullable List<? extends MarketRecentEntity> info) {
        return new MarketRecentTypeEntity(type, tradeItemBean, info);
    }

    @Nullable
    public final List<MarketRecentEntity> getInfo() {
        return this.info;
    }

    @Override // io.chad.library.adapter.base.entity.MultiItemEntity
    /* JADX INFO: renamed from: getItemType */
    public int getF42794b() {
        return C27039d.m66650j(this.type);
    }

    @Nullable
    public final TradeItemBean getTradeItemBean() {
        return this.tradeItemBean;
    }

    @Nullable
    public final Integer getType() {
        return this.type;
    }

    public int hashCode() {
        Integer num = this.type;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        TradeItemBean tradeItemBean = this.tradeItemBean;
        int iHashCode2 = (iHashCode + (tradeItemBean == null ? 0 : tradeItemBean.hashCode())) * 31;
        List<? extends MarketRecentEntity> list = this.info;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    public final void setInfo(@Nullable List<? extends MarketRecentEntity> list) {
        this.info = list;
    }

    public final void setTradeItemBean(@Nullable TradeItemBean tradeItemBean) {
        this.tradeItemBean = tradeItemBean;
    }

    @NotNull
    public String toString() {
        return "MarketRecentTypeEntity(type=" + this.type + ", tradeItemBean=" + this.tradeItemBean + ", info=" + this.info + ')';
    }

    public /* synthetic */ MarketRecentTypeEntity(Integer num, TradeItemBean tradeItemBean, List list, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : num, (i11 & 2) != 0 ? null : tradeItemBean, (i11 & 4) != 0 ? null : list);
    }
}
