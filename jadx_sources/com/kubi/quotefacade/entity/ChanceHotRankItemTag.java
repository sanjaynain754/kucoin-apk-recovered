package com.kubi.quotefacade.entity;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: TradeChanceEntity.kt */
/* JADX INFO: loaded from: classes37.dex */
@Keep
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \"2\u00020\u0001:\u0001\"B/\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0013J>\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u001cJ\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020\u0007HÖ\u0001J\t\u0010!\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000b\"\u0004\b\u000f\u0010\rR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u000b\"\u0004\b\u0011\u0010\rR\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0016\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006#"}, m90084d2 = {"Lcom/kubi/quotefacade/entity/ChanceHotRankItemTag;", "", "subtitle", "", "tagId", "title", "type", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "getSubtitle", "()Ljava/lang/String;", "setSubtitle", "(Ljava/lang/String;)V", "getTagId", "setTagId", "getTitle", "setTitle", "getType", "()Ljava/lang/Integer;", "setType", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Lcom/kubi/quotefacade/entity/ChanceHotRankItemTag;", "equals", "", "other", "hashCode", "toString", "Companion", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class ChanceHotRankItemTag {
    public static final int TYPE_RANK = 2;

    @Nullable
    private String subtitle;

    @Nullable
    private String tagId;

    @Nullable
    private String title;

    @Nullable
    private Integer type;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChanceHotRankItemTag)) {
            return false;
        }
        ChanceHotRankItemTag chanceHotRankItemTag = (ChanceHotRankItemTag) other;
        return Intrinsics.areEqual(this.subtitle, chanceHotRankItemTag.subtitle) && Intrinsics.areEqual(this.tagId, chanceHotRankItemTag.tagId) && Intrinsics.areEqual(this.title, chanceHotRankItemTag.title) && Intrinsics.areEqual(this.type, chanceHotRankItemTag.type);
    }

    public static /* synthetic */ ChanceHotRankItemTag copy$default(ChanceHotRankItemTag chanceHotRankItemTag, String str, String str2, String str3, Integer num, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = chanceHotRankItemTag.subtitle;
        }
        if ((i11 & 2) != 0) {
            str2 = chanceHotRankItemTag.tagId;
        }
        if ((i11 & 4) != 0) {
            str3 = chanceHotRankItemTag.title;
        }
        if ((i11 & 8) != 0) {
            num = chanceHotRankItemTag.type;
        }
        return chanceHotRankItemTag.copy(str, str2, str3, num);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTagId() {
        return this.tagId;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Integer getType() {
        return this.type;
    }

    @NotNull
    public final ChanceHotRankItemTag copy(@Nullable String subtitle, @Nullable String tagId, @Nullable String title, @Nullable Integer type) {
        return new ChanceHotRankItemTag(subtitle, tagId, title, type);
    }

    @Nullable
    public final String getSubtitle() {
        return this.subtitle;
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
    public final Integer getType() {
        return this.type;
    }

    public int hashCode() {
        String str = this.subtitle;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.tagId;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.title;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.type;
        return iHashCode3 + (num != null ? num.hashCode() : 0);
    }

    public final void setSubtitle(@Nullable String str) {
        this.subtitle = str;
    }

    public final void setTagId(@Nullable String str) {
        this.tagId = str;
    }

    public final void setTitle(@Nullable String str) {
        this.title = str;
    }

    public final void setType(@Nullable Integer num) {
        this.type = num;
    }

    @NotNull
    public String toString() {
        return "ChanceHotRankItemTag(subtitle=" + this.subtitle + ", tagId=" + this.tagId + ", title=" + this.title + ", type=" + this.type + ')';
    }

    public ChanceHotRankItemTag(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable Integer num) {
        this.subtitle = str;
        this.tagId = str2;
        this.title = str3;
        this.type = num;
    }
}
