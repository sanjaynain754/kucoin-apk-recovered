package com.kubi.quotefacade.entity;

import androidx.annotation.Keep;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: TradeChanceEntity.kt */
/* JADX INFO: loaded from: classes37.dex */
@Keep
@Metadata(m90083d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b$\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0093\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\u0018\b\u0002\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\u000b\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010)\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0019J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010,\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\nHÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0019\u00100\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u000fHÆ\u0003J\u009a\u0001\u00101\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\u0018\b\u0002\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u000fHÆ\u0001¢\u0006\u0002\u00102J\u0013\u00103\u001a\u0002042\b\u00105\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00106\u001a\u000207HÖ\u0001J\t\u00108\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0013\"\u0004\b\u0017\u0010\u0015R\u001e\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001c\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0013\"\u0004\b\u001e\u0010\u0015R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0013R\u0019\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0013R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0013R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0013R!\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&¨\u00069"}, m90084d2 = {"Lcom/kubi/quotefacade/entity/ChanceWhaleEntity;", "", "item", "", "itemType", "collectAt", "", "name", "template", "templateParamList", "", "color", FirebaseAnalytics.Param.PRICE, "iconUrl", "context", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "getItem", "()Ljava/lang/String;", "setItem", "(Ljava/lang/String;)V", "getItemType", "setItemType", "getCollectAt", "()Ljava/lang/Long;", "setCollectAt", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "getName", "setName", "getTemplate", "getTemplateParamList", "()Ljava/util/List;", "getColor", "getPrice", "getIconUrl", "getContext", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Lcom/kubi/quotefacade/entity/ChanceWhaleEntity;", "equals", "", "other", "hashCode", "", "toString", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class ChanceWhaleEntity {

    @Nullable
    private Long collectAt;

    @Nullable
    private final String color;

    @Nullable
    private final Map<String, String> context;

    @Nullable
    private final String iconUrl;

    @Nullable
    private String item;

    @Nullable
    private String itemType;

    @Nullable
    private String name;

    @Nullable
    private final String price;

    @Nullable
    private final String template;

    @Nullable
    private final List<String> templateParamList;

    public ChanceWhaleEntity() {
        this(null, null, null, null, null, null, null, null, null, null, 1023, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChanceWhaleEntity)) {
            return false;
        }
        ChanceWhaleEntity chanceWhaleEntity = (ChanceWhaleEntity) other;
        return Intrinsics.areEqual(this.item, chanceWhaleEntity.item) && Intrinsics.areEqual(this.itemType, chanceWhaleEntity.itemType) && Intrinsics.areEqual(this.collectAt, chanceWhaleEntity.collectAt) && Intrinsics.areEqual(this.name, chanceWhaleEntity.name) && Intrinsics.areEqual(this.template, chanceWhaleEntity.template) && Intrinsics.areEqual(this.templateParamList, chanceWhaleEntity.templateParamList) && Intrinsics.areEqual(this.color, chanceWhaleEntity.color) && Intrinsics.areEqual(this.price, chanceWhaleEntity.price) && Intrinsics.areEqual(this.iconUrl, chanceWhaleEntity.iconUrl) && Intrinsics.areEqual(this.context, chanceWhaleEntity.context);
    }

    public ChanceWhaleEntity(@Nullable String str, @Nullable String str2, @Nullable Long l11, @Nullable String str3, @Nullable String str4, @Nullable List<String> list, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable Map<String, String> map) {
        this.item = str;
        this.itemType = str2;
        this.collectAt = l11;
        this.name = str3;
        this.template = str4;
        this.templateParamList = list;
        this.color = str5;
        this.price = str6;
        this.iconUrl = str7;
        this.context = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ChanceWhaleEntity copy$default(ChanceWhaleEntity chanceWhaleEntity, String str, String str2, Long l11, String str3, String str4, List list, String str5, String str6, String str7, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = chanceWhaleEntity.item;
        }
        if ((i11 & 2) != 0) {
            str2 = chanceWhaleEntity.itemType;
        }
        if ((i11 & 4) != 0) {
            l11 = chanceWhaleEntity.collectAt;
        }
        if ((i11 & 8) != 0) {
            str3 = chanceWhaleEntity.name;
        }
        if ((i11 & 16) != 0) {
            str4 = chanceWhaleEntity.template;
        }
        if ((i11 & 32) != 0) {
            list = chanceWhaleEntity.templateParamList;
        }
        if ((i11 & 64) != 0) {
            str5 = chanceWhaleEntity.color;
        }
        if ((i11 & 128) != 0) {
            str6 = chanceWhaleEntity.price;
        }
        if ((i11 & 256) != 0) {
            str7 = chanceWhaleEntity.iconUrl;
        }
        if ((i11 & 512) != 0) {
            map = chanceWhaleEntity.context;
        }
        String str8 = str7;
        Map map2 = map;
        String str9 = str5;
        String str10 = str6;
        String str11 = str4;
        List list2 = list;
        return chanceWhaleEntity.copy(str, str2, l11, str3, str11, list2, str9, str10, str8, map2);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getItem() {
        return this.item;
    }

    @Nullable
    public final Map<String, String> component10() {
        return this.context;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getItemType() {
        return this.itemType;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Long getCollectAt() {
        return this.collectAt;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getTemplate() {
        return this.template;
    }

    @Nullable
    public final List<String> component6() {
        return this.templateParamList;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getColor() {
        return this.color;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getPrice() {
        return this.price;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getIconUrl() {
        return this.iconUrl;
    }

    @NotNull
    public final ChanceWhaleEntity copy(@Nullable String item, @Nullable String itemType, @Nullable Long collectAt, @Nullable String name, @Nullable String template, @Nullable List<String> templateParamList, @Nullable String color, @Nullable String price, @Nullable String iconUrl, @Nullable Map<String, String> context) {
        return new ChanceWhaleEntity(item, itemType, collectAt, name, template, templateParamList, color, price, iconUrl, context);
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
    public final Map<String, String> getContext() {
        return this.context;
    }

    @Nullable
    public final String getIconUrl() {
        return this.iconUrl;
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
    public final String getName() {
        return this.name;
    }

    @Nullable
    public final String getPrice() {
        return this.price;
    }

    @Nullable
    public final String getTemplate() {
        return this.template;
    }

    @Nullable
    public final List<String> getTemplateParamList() {
        return this.templateParamList;
    }

    public int hashCode() {
        String str = this.item;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.itemType;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l11 = this.collectAt;
        int iHashCode3 = (iHashCode2 + (l11 == null ? 0 : l11.hashCode())) * 31;
        String str3 = this.name;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.template;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        List<String> list = this.templateParamList;
        int iHashCode6 = (iHashCode5 + (list == null ? 0 : list.hashCode())) * 31;
        String str5 = this.color;
        int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.price;
        int iHashCode8 = (iHashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.iconUrl;
        int iHashCode9 = (iHashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Map<String, String> map = this.context;
        return iHashCode9 + (map != null ? map.hashCode() : 0);
    }

    public final void setCollectAt(@Nullable Long l11) {
        this.collectAt = l11;
    }

    public final void setItem(@Nullable String str) {
        this.item = str;
    }

    public final void setItemType(@Nullable String str) {
        this.itemType = str;
    }

    public final void setName(@Nullable String str) {
        this.name = str;
    }

    @NotNull
    public String toString() {
        return "ChanceWhaleEntity(item=" + this.item + ", itemType=" + this.itemType + ", collectAt=" + this.collectAt + ", name=" + this.name + ", template=" + this.template + ", templateParamList=" + this.templateParamList + ", color=" + this.color + ", price=" + this.price + ", iconUrl=" + this.iconUrl + ", context=" + this.context + ')';
    }

    public /* synthetic */ ChanceWhaleEntity(String str, String str2, Long l11, String str3, String str4, List list, String str5, String str6, String str7, Map map, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : l11, (i11 & 8) != 0 ? null : str3, (i11 & 16) != 0 ? null : str4, (i11 & 32) != 0 ? null : list, (i11 & 64) != 0 ? null : str5, (i11 & 128) != 0 ? null : str6, (i11 & 256) != 0 ? null : str7, (i11 & 512) != 0 ? null : map);
    }
}
