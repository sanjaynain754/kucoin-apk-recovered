package com.kubi.spot.business.discover.entity;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: DiscoverEntity.kt */
/* JADX INFO: loaded from: classes47.dex */
@Keep
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J+\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, m90084d2 = {"Lcom/kubi/spot/business/discover/entity/MarketChangesRequestEntity;", "", "type", "", "itemType", "symbol", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getType", "()Ljava/lang/String;", "getItemType", "getSymbol", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "SpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class MarketChangesRequestEntity {

    @Nullable
    private final String itemType;

    @Nullable
    private final String symbol;

    @NotNull
    private final String type;

    public MarketChangesRequestEntity() {
        this(null, null, null, 7, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MarketChangesRequestEntity)) {
            return false;
        }
        MarketChangesRequestEntity marketChangesRequestEntity = (MarketChangesRequestEntity) other;
        return Intrinsics.areEqual(this.type, marketChangesRequestEntity.type) && Intrinsics.areEqual(this.itemType, marketChangesRequestEntity.itemType) && Intrinsics.areEqual(this.symbol, marketChangesRequestEntity.symbol);
    }

    public MarketChangesRequestEntity(@NotNull String type, @Nullable String str, @Nullable String str2) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.type = type;
        this.itemType = str;
        this.symbol = str2;
    }

    public static /* synthetic */ MarketChangesRequestEntity copy$default(MarketChangesRequestEntity marketChangesRequestEntity, String str, String str2, String str3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = marketChangesRequestEntity.type;
        }
        if ((i11 & 2) != 0) {
            str2 = marketChangesRequestEntity.itemType;
        }
        if ((i11 & 4) != 0) {
            str3 = marketChangesRequestEntity.symbol;
        }
        return marketChangesRequestEntity.copy(str, str2, str3);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getType() {
        return this.type;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getItemType() {
        return this.itemType;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getSymbol() {
        return this.symbol;
    }

    @NotNull
    public final MarketChangesRequestEntity copy(@NotNull String type, @Nullable String itemType, @Nullable String symbol) {
        Intrinsics.checkNotNullParameter(type, "type");
        return new MarketChangesRequestEntity(type, itemType, symbol);
    }

    @Nullable
    public final String getItemType() {
        return this.itemType;
    }

    @Nullable
    public final String getSymbol() {
        return this.symbol;
    }

    @NotNull
    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        int iHashCode = this.type.hashCode() * 31;
        String str = this.itemType;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.symbol;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "MarketChangesRequestEntity(type=" + this.type + ", itemType=" + this.itemType + ", symbol=" + this.symbol + ')';
    }

    public /* synthetic */ MarketChangesRequestEntity(String str, String str2, String str3, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? "ALL" : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : str3);
    }
}
