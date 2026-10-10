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
@Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b$\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u007f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0013J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0086\u0001\u0010'\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010(J\u0013\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010,\u001a\u00020-HÖ\u0001J\t\u0010.\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0011R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0011R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0011R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0011R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0011R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0011R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0011¨\u0006/"}, m90084d2 = {"Lcom/kubi/spot/business/discover/entity/MarketChangesItemEntity;", "", "id", "", "collectAt", "", "color", "item", "itemType", "template", "templateCode", "value", "valueType", "collectPrice", "<init>", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getCollectAt", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getColor", "getItem", "getItemType", "getTemplate", "getTemplateCode", "getValue", "getValueType", "getCollectPrice", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/kubi/spot/business/discover/entity/MarketChangesItemEntity;", "equals", "", "other", "hashCode", "", "toString", "SpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class MarketChangesItemEntity {

    @Nullable
    private final Long collectAt;

    @Nullable
    private final String collectPrice;

    @Nullable
    private final String color;

    @Nullable
    private final String id;

    @Nullable
    private final String item;

    @Nullable
    private final String itemType;

    @Nullable
    private final String template;

    @Nullable
    private final String templateCode;

    @Nullable
    private final String value;

    @Nullable
    private final String valueType;

    public MarketChangesItemEntity() {
        this(null, null, null, null, null, null, null, null, null, null, 1023, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MarketChangesItemEntity)) {
            return false;
        }
        MarketChangesItemEntity marketChangesItemEntity = (MarketChangesItemEntity) other;
        return Intrinsics.areEqual(this.id, marketChangesItemEntity.id) && Intrinsics.areEqual(this.collectAt, marketChangesItemEntity.collectAt) && Intrinsics.areEqual(this.color, marketChangesItemEntity.color) && Intrinsics.areEqual(this.item, marketChangesItemEntity.item) && Intrinsics.areEqual(this.itemType, marketChangesItemEntity.itemType) && Intrinsics.areEqual(this.template, marketChangesItemEntity.template) && Intrinsics.areEqual(this.templateCode, marketChangesItemEntity.templateCode) && Intrinsics.areEqual(this.value, marketChangesItemEntity.value) && Intrinsics.areEqual(this.valueType, marketChangesItemEntity.valueType) && Intrinsics.areEqual(this.collectPrice, marketChangesItemEntity.collectPrice);
    }

    public MarketChangesItemEntity(@Nullable String str, @Nullable Long l11, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9) {
        this.id = str;
        this.collectAt = l11;
        this.color = str2;
        this.item = str3;
        this.itemType = str4;
        this.template = str5;
        this.templateCode = str6;
        this.value = str7;
        this.valueType = str8;
        this.collectPrice = str9;
    }

    public static /* synthetic */ MarketChangesItemEntity copy$default(MarketChangesItemEntity marketChangesItemEntity, String str, Long l11, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = marketChangesItemEntity.id;
        }
        if ((i11 & 2) != 0) {
            l11 = marketChangesItemEntity.collectAt;
        }
        if ((i11 & 4) != 0) {
            str2 = marketChangesItemEntity.color;
        }
        if ((i11 & 8) != 0) {
            str3 = marketChangesItemEntity.item;
        }
        if ((i11 & 16) != 0) {
            str4 = marketChangesItemEntity.itemType;
        }
        if ((i11 & 32) != 0) {
            str5 = marketChangesItemEntity.template;
        }
        if ((i11 & 64) != 0) {
            str6 = marketChangesItemEntity.templateCode;
        }
        if ((i11 & 128) != 0) {
            str7 = marketChangesItemEntity.value;
        }
        if ((i11 & 256) != 0) {
            str8 = marketChangesItemEntity.valueType;
        }
        if ((i11 & 512) != 0) {
            str9 = marketChangesItemEntity.collectPrice;
        }
        String str10 = str8;
        String str11 = str9;
        String str12 = str6;
        String str13 = str7;
        String str14 = str4;
        String str15 = str5;
        return marketChangesItemEntity.copy(str, l11, str2, str3, str14, str15, str12, str13, str10, str11);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getCollectPrice() {
        return this.collectPrice;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Long getCollectAt() {
        return this.collectAt;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getColor() {
        return this.color;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getItem() {
        return this.item;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getItemType() {
        return this.itemType;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getTemplate() {
        return this.template;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getTemplateCode() {
        return this.templateCode;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getValueType() {
        return this.valueType;
    }

    @NotNull
    public final MarketChangesItemEntity copy(@Nullable String id2, @Nullable Long collectAt, @Nullable String color, @Nullable String item, @Nullable String itemType, @Nullable String template, @Nullable String templateCode, @Nullable String value, @Nullable String valueType, @Nullable String collectPrice) {
        return new MarketChangesItemEntity(id2, collectAt, color, item, itemType, template, templateCode, value, valueType, collectPrice);
    }

    @Nullable
    public final Long getCollectAt() {
        return this.collectAt;
    }

    @Nullable
    public final String getCollectPrice() {
        return this.collectPrice;
    }

    @Nullable
    public final String getColor() {
        return this.color;
    }

    @Nullable
    public final String getId() {
        return this.id;
    }

    @Nullable
    public final String getItem() {
        return this.item;
    }

    @Nullable
    public final String getItemType() {
        return this.itemType;
    }

    @Nullable
    public final String getTemplate() {
        return this.template;
    }

    @Nullable
    public final String getTemplateCode() {
        return this.templateCode;
    }

    @Nullable
    public final String getValue() {
        return this.value;
    }

    @Nullable
    public final String getValueType() {
        return this.valueType;
    }

    public int hashCode() {
        String str = this.id;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Long l11 = this.collectAt;
        int iHashCode2 = (iHashCode + (l11 == null ? 0 : l11.hashCode())) * 31;
        String str2 = this.color;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.item;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.itemType;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.template;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.templateCode;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.value;
        int iHashCode8 = (iHashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.valueType;
        int iHashCode9 = (iHashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.collectPrice;
        return iHashCode9 + (str9 != null ? str9.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "MarketChangesItemEntity(id=" + this.id + ", collectAt=" + this.collectAt + ", color=" + this.color + ", item=" + this.item + ", itemType=" + this.itemType + ", template=" + this.template + ", templateCode=" + this.templateCode + ", value=" + this.value + ", valueType=" + this.valueType + ", collectPrice=" + this.collectPrice + ')';
    }

    public /* synthetic */ MarketChangesItemEntity(String str, Long l11, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : l11, (i11 & 4) != 0 ? null : str2, (i11 & 8) != 0 ? null : str3, (i11 & 16) != 0 ? null : str4, (i11 & 32) != 0 ? null : str5, (i11 & 64) != 0 ? null : str6, (i11 & 128) != 0 ? null : str7, (i11 & 256) != 0 ? null : str8, (i11 & 512) != 0 ? null : str9);
    }
}
