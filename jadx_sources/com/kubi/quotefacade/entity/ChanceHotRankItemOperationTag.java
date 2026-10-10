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
@Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\rJ&\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0014J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0010\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, m90084d2 = {"Lcom/kubi/quotefacade/entity/ChanceHotRankItemOperationTag;", "", "title", "", "displayType", "", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;)V", "getTitle", "()Ljava/lang/String;", "setTitle", "(Ljava/lang/String;)V", "getDisplayType", "()Ljava/lang/Integer;", "setDisplayType", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "component1", "component2", "copy", "(Ljava/lang/String;Ljava/lang/Integer;)Lcom/kubi/quotefacade/entity/ChanceHotRankItemOperationTag;", "equals", "", "other", "hashCode", "toString", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class ChanceHotRankItemOperationTag {

    @Nullable
    private Integer displayType;

    @Nullable
    private String title;

    /* JADX WARN: Multi-variable type inference failed */
    public ChanceHotRankItemOperationTag() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChanceHotRankItemOperationTag)) {
            return false;
        }
        ChanceHotRankItemOperationTag chanceHotRankItemOperationTag = (ChanceHotRankItemOperationTag) other;
        return Intrinsics.areEqual(this.title, chanceHotRankItemOperationTag.title) && Intrinsics.areEqual(this.displayType, chanceHotRankItemOperationTag.displayType);
    }

    public ChanceHotRankItemOperationTag(@Nullable String str, @Nullable Integer num) {
        this.title = str;
        this.displayType = num;
    }

    public static /* synthetic */ ChanceHotRankItemOperationTag copy$default(ChanceHotRankItemOperationTag chanceHotRankItemOperationTag, String str, Integer num, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = chanceHotRankItemOperationTag.title;
        }
        if ((i11 & 2) != 0) {
            num = chanceHotRankItemOperationTag.displayType;
        }
        return chanceHotRankItemOperationTag.copy(str, num);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Integer getDisplayType() {
        return this.displayType;
    }

    @NotNull
    public final ChanceHotRankItemOperationTag copy(@Nullable String title, @Nullable Integer displayType) {
        return new ChanceHotRankItemOperationTag(title, displayType);
    }

    @Nullable
    public final Integer getDisplayType() {
        return this.displayType;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        String str = this.title;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.displayType;
        return iHashCode + (num != null ? num.hashCode() : 0);
    }

    public final void setDisplayType(@Nullable Integer num) {
        this.displayType = num;
    }

    public final void setTitle(@Nullable String str) {
        this.title = str;
    }

    @NotNull
    public String toString() {
        return "ChanceHotRankItemOperationTag(title=" + this.title + ", displayType=" + this.displayType + ')';
    }

    public /* synthetic */ ChanceHotRankItemOperationTag(String str, Integer num, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : num);
    }
}
