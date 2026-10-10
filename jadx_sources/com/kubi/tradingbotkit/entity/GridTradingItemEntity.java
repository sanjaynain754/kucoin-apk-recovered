package com.kubi.tradingbotkit.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.tencent.qcloud.tuicore.TUIConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: GridTradingItemEntity.kt */
/* JADX INFO: loaded from: classes12.dex */
@Keep
@Metadata(m90083d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0018\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bg\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\f\u0010\rJ\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010 \u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010\u0017Jn\u0010!\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0002\u0010\"J\u0006\u0010#\u001a\u00020$J\u0013\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010(HÖ\u0003J\t\u0010)\u001a\u00020$HÖ\u0001J\t\u0010*\u001a\u00020\u0003HÖ\u0001J\u0016\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u00020$R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000fR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000fR\u0015\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u0016\u0010\u0017¨\u00060"}, m90084d2 = {"Lcom/kubi/tradingbotkit/entity/GridTradingItemEntity;", "Landroid/os/Parcelable;", TUIConstants.TUIChat.INPUT_MORE_ICON, "", "labelIcon", "name", "path", "subTitle", "type", TUIConstants.TIMPush.NOTIFICATION.ACTION, "totalRunNumber", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)V", "getIcon", "()Ljava/lang/String;", "getLabelIcon", "getName", "getPath", "getSubTitle", "getType", "getAction", "getTotalRunNumber", "()Ljava/lang/Long;", "Ljava/lang/Long;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)Lcom/kubi/tradingbotkit/entity/GridTradingItemEntity;", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "TradingBotKitLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class GridTradingItemEntity implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<GridTradingItemEntity> CREATOR = new C26214a();

    @Nullable
    private final String action;

    @Nullable
    private final String icon;

    @Nullable
    private final String labelIcon;

    @Nullable
    private final String name;

    @Nullable
    private final String path;

    @Nullable
    private final String subTitle;

    @Nullable
    private final Long totalRunNumber;

    @Nullable
    private final String type;

    /* JADX INFO: renamed from: com.kubi.tradingbotkit.entity.GridTradingItemEntity$a */
    /* JADX INFO: compiled from: GridTradingItemEntity.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C26214a implements Parcelable.Creator<GridTradingItemEntity> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final GridTradingItemEntity createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new GridTradingItemEntity(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()));
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final GridTradingItemEntity[] newArray(int i11) {
            return new GridTradingItemEntity[i11];
        }
    }

    public GridTradingItemEntity() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GridTradingItemEntity)) {
            return false;
        }
        GridTradingItemEntity gridTradingItemEntity = (GridTradingItemEntity) other;
        return Intrinsics.areEqual(this.icon, gridTradingItemEntity.icon) && Intrinsics.areEqual(this.labelIcon, gridTradingItemEntity.labelIcon) && Intrinsics.areEqual(this.name, gridTradingItemEntity.name) && Intrinsics.areEqual(this.path, gridTradingItemEntity.path) && Intrinsics.areEqual(this.subTitle, gridTradingItemEntity.subTitle) && Intrinsics.areEqual(this.type, gridTradingItemEntity.type) && Intrinsics.areEqual(this.action, gridTradingItemEntity.action) && Intrinsics.areEqual(this.totalRunNumber, gridTradingItemEntity.totalRunNumber);
    }

    public GridTradingItemEntity(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable Long l11) {
        this.icon = str;
        this.labelIcon = str2;
        this.name = str3;
        this.path = str4;
        this.subTitle = str5;
        this.type = str6;
        this.action = str7;
        this.totalRunNumber = l11;
    }

    public static /* synthetic */ GridTradingItemEntity copy$default(GridTradingItemEntity gridTradingItemEntity, String str, String str2, String str3, String str4, String str5, String str6, String str7, Long l11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = gridTradingItemEntity.icon;
        }
        if ((i11 & 2) != 0) {
            str2 = gridTradingItemEntity.labelIcon;
        }
        if ((i11 & 4) != 0) {
            str3 = gridTradingItemEntity.name;
        }
        if ((i11 & 8) != 0) {
            str4 = gridTradingItemEntity.path;
        }
        if ((i11 & 16) != 0) {
            str5 = gridTradingItemEntity.subTitle;
        }
        if ((i11 & 32) != 0) {
            str6 = gridTradingItemEntity.type;
        }
        if ((i11 & 64) != 0) {
            str7 = gridTradingItemEntity.action;
        }
        if ((i11 & 128) != 0) {
            l11 = gridTradingItemEntity.totalRunNumber;
        }
        String str8 = str7;
        Long l12 = l11;
        String str9 = str5;
        String str10 = str6;
        return gridTradingItemEntity.copy(str, str2, str3, str4, str9, str10, str8, l12);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getIcon() {
        return this.icon;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getLabelIcon() {
        return this.labelIcon;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getPath() {
        return this.path;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getSubTitle() {
        return this.subTitle;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getType() {
        return this.type;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getAction() {
        return this.action;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Long getTotalRunNumber() {
        return this.totalRunNumber;
    }

    @NotNull
    public final GridTradingItemEntity copy(@Nullable String icon, @Nullable String labelIcon, @Nullable String name, @Nullable String path, @Nullable String subTitle, @Nullable String type, @Nullable String action, @Nullable Long totalRunNumber) {
        return new GridTradingItemEntity(icon, labelIcon, name, path, subTitle, type, action, totalRunNumber);
    }

    @Nullable
    public final String getAction() {
        return this.action;
    }

    @Nullable
    public final String getIcon() {
        return this.icon;
    }

    @Nullable
    public final String getLabelIcon() {
        return this.labelIcon;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    @Nullable
    public final String getPath() {
        return this.path;
    }

    @Nullable
    public final String getSubTitle() {
        return this.subTitle;
    }

    @Nullable
    public final Long getTotalRunNumber() {
        return this.totalRunNumber;
    }

    @Nullable
    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        String str = this.icon;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.labelIcon;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.name;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.path;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.subTitle;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.type;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.action;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Long l11 = this.totalRunNumber;
        return iHashCode7 + (l11 != null ? l11.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "GridTradingItemEntity(icon=" + this.icon + ", labelIcon=" + this.labelIcon + ", name=" + this.name + ", path=" + this.path + ", subTitle=" + this.subTitle + ", type=" + this.type + ", action=" + this.action + ", totalRunNumber=" + this.totalRunNumber + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.icon);
        dest.writeString(this.labelIcon);
        dest.writeString(this.name);
        dest.writeString(this.path);
        dest.writeString(this.subTitle);
        dest.writeString(this.type);
        dest.writeString(this.action);
        Long l11 = this.totalRunNumber;
        if (l11 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeLong(l11.longValue());
        }
    }

    public /* synthetic */ GridTradingItemEntity(String str, String str2, String str3, String str4, String str5, String str6, String str7, Long l11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : str3, (i11 & 8) != 0 ? null : str4, (i11 & 16) != 0 ? null : str5, (i11 & 32) != 0 ? null : str6, (i11 & 64) != 0 ? null : str7, (i11 & 128) != 0 ? null : l11);
    }
}
