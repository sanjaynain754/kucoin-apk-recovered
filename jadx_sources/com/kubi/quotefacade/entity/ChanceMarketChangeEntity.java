package com.kubi.quotefacade.entity;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: TradeChanceEntity.kt */
/* JADX INFO: loaded from: classes37.dex */
@Keep
@Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b(\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bg\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\f\u0010\rJ\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010$\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0013J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003Jn\u0010+\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010,J\u0013\u0010-\u001a\u00020.2\b\u0010/\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00100\u001a\u000201HÖ\u0001J\t\u00102\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0016\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u000f\"\u0004\b\u0018\u0010\u0011R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u000f\"\u0004\b\u001a\u0010\u0011R\u001c\u0010\b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u000f\"\u0004\b\u001c\u0010\u0011R\u001c\u0010\t\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u000f\"\u0004\b\u001e\u0010\u0011R\u001c\u0010\n\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u000f\"\u0004\b \u0010\u0011R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u000f\"\u0004\b\"\u0010\u0011¨\u00063"}, m90084d2 = {"Lcom/kubi/quotefacade/entity/ChanceMarketChangeEntity;", "", "id", "", "collectAt", "", "color", "item", "itemType", "template", "value", "valueType", "<init>", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "setId", "(Ljava/lang/String;)V", "getCollectAt", "()Ljava/lang/Long;", "setCollectAt", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "getColor", "setColor", "getItem", "setItem", "getItemType", "setItemType", "getTemplate", "setTemplate", "getValue", "setValue", "getValueType", "setValueType", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/kubi/quotefacade/entity/ChanceMarketChangeEntity;", "equals", "", "other", "hashCode", "", "toString", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class ChanceMarketChangeEntity {

    @Nullable
    private Long collectAt;

    @Nullable
    private String color;

    @Nullable
    private String id;

    @Nullable
    private String item;

    @Nullable
    private String itemType;

    @Nullable
    private String template;

    @Nullable
    private String value;

    @Nullable
    private String valueType;

    public ChanceMarketChangeEntity() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }

    public static /* synthetic */ ChanceMarketChangeEntity copy$default(ChanceMarketChangeEntity chanceMarketChangeEntity, String str, Long l11, String str2, String str3, String str4, String str5, String str6, String str7, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = chanceMarketChangeEntity.id;
        }
        if ((i11 & 2) != 0) {
            l11 = chanceMarketChangeEntity.collectAt;
        }
        if ((i11 & 4) != 0) {
            str2 = chanceMarketChangeEntity.color;
        }
        if ((i11 & 8) != 0) {
            str3 = chanceMarketChangeEntity.item;
        }
        if ((i11 & 16) != 0) {
            str4 = chanceMarketChangeEntity.itemType;
        }
        if ((i11 & 32) != 0) {
            str5 = chanceMarketChangeEntity.template;
        }
        if ((i11 & 64) != 0) {
            str6 = chanceMarketChangeEntity.value;
        }
        if ((i11 & 128) != 0) {
            str7 = chanceMarketChangeEntity.valueType;
        }
        String str8 = str6;
        String str9 = str7;
        String str10 = str4;
        String str11 = str5;
        return chanceMarketChangeEntity.copy(str, l11, str2, str3, str10, str11, str8, str9);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChanceMarketChangeEntity)) {
            return false;
        }
        ChanceMarketChangeEntity chanceMarketChangeEntity = (ChanceMarketChangeEntity) other;
        return Intrinsics.areEqual(this.id, chanceMarketChangeEntity.id) && Intrinsics.areEqual(this.collectAt, chanceMarketChangeEntity.collectAt) && Intrinsics.areEqual(this.color, chanceMarketChangeEntity.color) && Intrinsics.areEqual(this.item, chanceMarketChangeEntity.item) && Intrinsics.areEqual(this.itemType, chanceMarketChangeEntity.itemType) && Intrinsics.areEqual(this.template, chanceMarketChangeEntity.template) && Intrinsics.areEqual(this.value, chanceMarketChangeEntity.value) && Intrinsics.areEqual(this.valueType, chanceMarketChangeEntity.valueType);
    }

    public ChanceMarketChangeEntity(@Nullable String str, @Nullable Long l11, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7) {
        this.id = str;
        this.collectAt = l11;
        this.color = str2;
        this.item = str3;
        this.itemType = str4;
        this.template = str5;
        this.value = str6;
        this.valueType = str7;
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
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
    public final String getValue() {
        return this.value;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getValueType() {
        return this.valueType;
    }

    @NotNull
    public final ChanceMarketChangeEntity copy(@Nullable String id2, @Nullable Long collectAt, @Nullable String color, @Nullable String item, @Nullable String itemType, @Nullable String template, @Nullable String value, @Nullable String valueType) {
        return new ChanceMarketChangeEntity(id2, collectAt, color, item, itemType, template, value, valueType);
    }

    @Nullable
    public final Long getCollectAt() {
        return this.collectAt;
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
        String str6 = this.value;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.valueType;
        return iHashCode7 + (str7 != null ? str7.hashCode() : 0);
    }

    public final void setCollectAt(@Nullable Long l11) {
        this.collectAt = l11;
    }

    public final void setColor(@Nullable String str) {
        this.color = str;
    }

    public final void setId(@Nullable String str) {
        this.id = str;
    }

    public final void setItem(@Nullable String str) {
        this.item = str;
    }

    public final void setItemType(@Nullable String str) {
        this.itemType = str;
    }

    public final void setTemplate(@Nullable String str) {
        this.template = str;
    }

    public final void setValue(@Nullable String str) {
        this.value = str;
    }

    public final void setValueType(@Nullable String str) {
        this.valueType = str;
    }

    @NotNull
    public String toString() {
        return "ChanceMarketChangeEntity(id=" + this.id + ", collectAt=" + this.collectAt + ", color=" + this.color + ", item=" + this.item + ", itemType=" + this.itemType + ", template=" + this.template + ", value=" + this.value + ", valueType=" + this.valueType + ')';
    }

    public /* synthetic */ ChanceMarketChangeEntity(String str, Long l11, String str2, String str3, String str4, String str5, String str6, String str7, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : l11, (i11 & 4) != 0 ? null : str2, (i11 & 8) != 0 ? null : str3, (i11 & 16) != 0 ? null : str4, (i11 & 32) != 0 ? null : str5, (i11 & 64) != 0 ? null : str6, (i11 & 128) != 0 ? null : str7);
    }
}
