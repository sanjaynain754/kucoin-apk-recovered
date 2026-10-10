package com.kubi.kumex.market.p091v2.coinInfo.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.tencent.qcloud.tuicore.TUIConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: MarketCoinInfoEntity.kt */
/* JADX INFO: loaded from: classes20.dex */
@Keep
@Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b#\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 32\u00020\u0001:\u00013BW\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u000b\u0010 \u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000fJn\u0010%\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010&J\u0006\u0010'\u001a\u00020\u0003J\u0013\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010+HÖ\u0003J\t\u0010,\u001a\u00020\u0003HÖ\u0001J\t\u0010-\u001a\u00020\u0005HÖ\u0001J\u0016\u0010.\u001a\u00020/2\u0006\u00100\u001a\u0002012\u0006\u00102\u001a\u00020\u0003R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0010\u001a\u0004\b\u0015\u0010\u000f\"\u0004\b\u0016\u0010\u0017R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0012R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0012R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0012R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0012R\u0015\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u001c\u0010\u000f¨\u00064"}, m90084d2 = {"Lcom/kubi/kumex/market/v2/coinInfo/entity/Tag;", "Landroid/os/Parcelable;", "algorithm", "", TUIConstants.TUIPlugin.PLUGIN_DESCRIPTION, "", "displayType", "gemBoxDescription", "subtitle", "tagId", "title", "type", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "getAlgorithm", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getDescription", "()Ljava/lang/String;", "setDescription", "(Ljava/lang/String;)V", "getDisplayType", "setDisplayType", "(Ljava/lang/Integer;)V", "getGemBoxDescription", "getSubtitle", "getTagId", "getTitle", "getType", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Lcom/kubi/kumex/market/v2/coinInfo/entity/Tag;", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "Companion", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class Tag implements Parcelable {
    public static final int TYPE_BLOCK = 3;
    public static final int TYPE_GOLD = 2;
    public static final int TYPE_GRAY = 1;
    public static final int TYPE_GREEN = 0;
    public static final int TYPE_MARKET = 1;
    public static final int TYPE_RANK = 2;

    @Nullable
    private final Integer algorithm;

    @Nullable
    private String description;

    @Nullable
    private Integer displayType;

    @Nullable
    private final String gemBoxDescription;

    @Nullable
    private final String subtitle;

    @Nullable
    private final String tagId;

    @Nullable
    private final String title;

    @Nullable
    private final Integer type;

    @NotNull
    public static final Parcelable.Creator<Tag> CREATOR = new C16402a();

    /* JADX INFO: renamed from: com.kubi.kumex.market.v2.coinInfo.entity.Tag$a */
    /* JADX INFO: compiled from: MarketCoinInfoEntity.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C16402a implements Parcelable.Creator<Tag> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Tag createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new Tag(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Tag[] newArray(int i11) {
            return new Tag[i11];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Tag)) {
            return false;
        }
        Tag tag = (Tag) other;
        return Intrinsics.areEqual(this.algorithm, tag.algorithm) && Intrinsics.areEqual(this.description, tag.description) && Intrinsics.areEqual(this.displayType, tag.displayType) && Intrinsics.areEqual(this.gemBoxDescription, tag.gemBoxDescription) && Intrinsics.areEqual(this.subtitle, tag.subtitle) && Intrinsics.areEqual(this.tagId, tag.tagId) && Intrinsics.areEqual(this.title, tag.title) && Intrinsics.areEqual(this.type, tag.type);
    }

    public static /* synthetic */ Tag copy$default(Tag tag, Integer num, String str, Integer num2, String str2, String str3, String str4, String str5, Integer num3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            num = tag.algorithm;
        }
        if ((i11 & 2) != 0) {
            str = tag.description;
        }
        if ((i11 & 4) != 0) {
            num2 = tag.displayType;
        }
        if ((i11 & 8) != 0) {
            str2 = tag.gemBoxDescription;
        }
        if ((i11 & 16) != 0) {
            str3 = tag.subtitle;
        }
        if ((i11 & 32) != 0) {
            str4 = tag.tagId;
        }
        if ((i11 & 64) != 0) {
            str5 = tag.title;
        }
        if ((i11 & 128) != 0) {
            num3 = tag.type;
        }
        String str6 = str5;
        Integer num4 = num3;
        String str7 = str3;
        String str8 = str4;
        return tag.copy(num, str, num2, str2, str7, str8, str6, num4);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Integer getAlgorithm() {
        return this.algorithm;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Integer getDisplayType() {
        return this.displayType;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getGemBoxDescription() {
        return this.gemBoxDescription;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getTagId() {
        return this.tagId;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Integer getType() {
        return this.type;
    }

    @NotNull
    public final Tag copy(@Nullable Integer algorithm, @Nullable String description, @Nullable Integer displayType, @Nullable String gemBoxDescription, @Nullable String subtitle, @Nullable String tagId, @Nullable String title, @Nullable Integer type) {
        return new Tag(algorithm, description, displayType, gemBoxDescription, subtitle, tagId, title, type);
    }

    @Nullable
    public final Integer getAlgorithm() {
        return this.algorithm;
    }

    @Nullable
    public final String getDescription() {
        return this.description;
    }

    @Nullable
    public final Integer getDisplayType() {
        return this.displayType;
    }

    @Nullable
    public final String getGemBoxDescription() {
        return this.gemBoxDescription;
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
        Integer num = this.algorithm;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.description;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num2 = this.displayType;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str2 = this.gemBoxDescription;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.subtitle;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.tagId;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.title;
        int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Integer num3 = this.type;
        return iHashCode7 + (num3 != null ? num3.hashCode() : 0);
    }

    public final void setDescription(@Nullable String str) {
        this.description = str;
    }

    public final void setDisplayType(@Nullable Integer num) {
        this.displayType = num;
    }

    @NotNull
    public String toString() {
        return "Tag(algorithm=" + this.algorithm + ", description=" + this.description + ", displayType=" + this.displayType + ", gemBoxDescription=" + this.gemBoxDescription + ", subtitle=" + this.subtitle + ", tagId=" + this.tagId + ", title=" + this.title + ", type=" + this.type + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Integer num = this.algorithm;
        if (num == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num.intValue());
        }
        dest.writeString(this.description);
        Integer num2 = this.displayType;
        if (num2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num2.intValue());
        }
        dest.writeString(this.gemBoxDescription);
        dest.writeString(this.subtitle);
        dest.writeString(this.tagId);
        dest.writeString(this.title);
        Integer num3 = this.type;
        if (num3 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num3.intValue());
        }
    }

    public Tag(@Nullable Integer num, @Nullable String str, @Nullable Integer num2, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable Integer num3) {
        this.algorithm = num;
        this.description = str;
        this.displayType = num2;
        this.gemBoxDescription = str2;
        this.subtitle = str3;
        this.tagId = str4;
        this.title = str5;
        this.type = num3;
    }
}
