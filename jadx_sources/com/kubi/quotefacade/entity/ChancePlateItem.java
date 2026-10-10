package com.kubi.quotefacade.entity;

import androidx.annotation.Keep;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: TradeChanceEntity.kt */
/* JADX INFO: loaded from: classes12.dex */
@Keep
@Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010!\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u0019JP\u0010\"\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0002\u0010#J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010'\u001a\u00020\tHÖ\u0001J\t\u0010(\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\"\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\r\"\u0004\b\u0015\u0010\u000fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\r\"\u0004\b\u0017\u0010\u000fR\u001e\u0010\b\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001c\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u0006)"}, m90084d2 = {"Lcom/kubi/quotefacade/entity/ChancePlateItem;", "", "avgChangeRate", "", "hotCurrencyNameList", "", "tagId", "title", "weight", "", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "getAvgChangeRate", "()Ljava/lang/String;", "setAvgChangeRate", "(Ljava/lang/String;)V", "getHotCurrencyNameList", "()Ljava/util/List;", "setHotCurrencyNameList", "(Ljava/util/List;)V", "getTagId", "setTagId", "getTitle", "setTitle", "getWeight", "()Ljava/lang/Integer;", "setWeight", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Lcom/kubi/quotefacade/entity/ChancePlateItem;", "equals", "", "other", "hashCode", "toString", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class ChancePlateItem {

    @Nullable
    private String avgChangeRate;

    @Nullable
    private List<String> hotCurrencyNameList;

    @Nullable
    private String tagId;

    @Nullable
    private String title;

    @Nullable
    private Integer weight;

    public ChancePlateItem() {
        this(null, null, null, null, null, 31, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChancePlateItem)) {
            return false;
        }
        ChancePlateItem chancePlateItem = (ChancePlateItem) other;
        return Intrinsics.areEqual(this.avgChangeRate, chancePlateItem.avgChangeRate) && Intrinsics.areEqual(this.hotCurrencyNameList, chancePlateItem.hotCurrencyNameList) && Intrinsics.areEqual(this.tagId, chancePlateItem.tagId) && Intrinsics.areEqual(this.title, chancePlateItem.title) && Intrinsics.areEqual(this.weight, chancePlateItem.weight);
    }

    public ChancePlateItem(@Nullable String str, @Nullable List<String> list, @Nullable String str2, @Nullable String str3, @Nullable Integer num) {
        this.avgChangeRate = str;
        this.hotCurrencyNameList = list;
        this.tagId = str2;
        this.title = str3;
        this.weight = num;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ChancePlateItem copy$default(ChancePlateItem chancePlateItem, String str, List list, String str2, String str3, Integer num, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = chancePlateItem.avgChangeRate;
        }
        if ((i11 & 2) != 0) {
            list = chancePlateItem.hotCurrencyNameList;
        }
        if ((i11 & 4) != 0) {
            str2 = chancePlateItem.tagId;
        }
        if ((i11 & 8) != 0) {
            str3 = chancePlateItem.title;
        }
        if ((i11 & 16) != 0) {
            num = chancePlateItem.weight;
        }
        Integer num2 = num;
        String str4 = str2;
        return chancePlateItem.copy(str, list, str4, str3, num2);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAvgChangeRate() {
        return this.avgChangeRate;
    }

    @Nullable
    public final List<String> component2() {
        return this.hotCurrencyNameList;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getTagId() {
        return this.tagId;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Integer getWeight() {
        return this.weight;
    }

    @NotNull
    public final ChancePlateItem copy(@Nullable String avgChangeRate, @Nullable List<String> hotCurrencyNameList, @Nullable String tagId, @Nullable String title, @Nullable Integer weight) {
        return new ChancePlateItem(avgChangeRate, hotCurrencyNameList, tagId, title, weight);
    }

    @Nullable
    public final String getAvgChangeRate() {
        return this.avgChangeRate;
    }

    @Nullable
    public final List<String> getHotCurrencyNameList() {
        return this.hotCurrencyNameList;
    }

    @Nullable
    public final String getTagId() {
        return this.tagId;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    @Nullable
    public final Integer getWeight() {
        return this.weight;
    }

    public int hashCode() {
        String str = this.avgChangeRate;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<String> list = this.hotCurrencyNameList;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str2 = this.tagId;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.title;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.weight;
        return iHashCode4 + (num != null ? num.hashCode() : 0);
    }

    public final void setAvgChangeRate(@Nullable String str) {
        this.avgChangeRate = str;
    }

    public final void setHotCurrencyNameList(@Nullable List<String> list) {
        this.hotCurrencyNameList = list;
    }

    public final void setTagId(@Nullable String str) {
        this.tagId = str;
    }

    public final void setTitle(@Nullable String str) {
        this.title = str;
    }

    public final void setWeight(@Nullable Integer num) {
        this.weight = num;
    }

    @NotNull
    public String toString() {
        return "ChancePlateItem(avgChangeRate=" + this.avgChangeRate + ", hotCurrencyNameList=" + this.hotCurrencyNameList + ", tagId=" + this.tagId + ", title=" + this.title + ", weight=" + this.weight + ')';
    }

    public /* synthetic */ ChancePlateItem(String str, List list, String str2, String str3, Integer num, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : list, (i11 & 4) != 0 ? null : str2, (i11 & 8) != 0 ? null : str3, (i11 & 16) != 0 ? null : num);
    }
}
