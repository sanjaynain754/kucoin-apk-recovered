package com.kubi.mine.lib.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.kubi.user.protocol.entity.SignTermItem;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AppUpgradeEntityV2.kt */
/* JADX INFO: loaded from: classes12.dex */
@Keep
@Metadata(m90083d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fJ\u0006\u0010\u001a\u001a\u00020\u001bJ\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003J\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0014J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\nHÆ\u0003JF\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0002\u0010\"J\u0006\u0010#\u001a\u00020\u0005J\u0013\u0010$\u001a\u00020\u001b2\b\u0010%\u001a\u0004\u0018\u00010&HÖ\u0003J\t\u0010'\u001a\u00020\u0005HÖ\u0001J\t\u0010(\u001a\u00020\u0003HÖ\u0001J\u0016\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006."}, m90084d2 = {"Lcom/kubi/mine/lib/entity/AppUpgradeEntityV2;", "Landroid/os/Parcelable;", "popupId", "", "upgradeType", "", "frequencyLimit", SignTermItem.LINK, "Lcom/kubi/mine/lib/entity/Link;", "remark", "Lcom/kubi/mine/lib/entity/Remark;", "<init>", "(Ljava/lang/String;ILjava/lang/Integer;Lcom/kubi/mine/lib/entity/Link;Lcom/kubi/mine/lib/entity/Remark;)V", "getPopupId", "()Ljava/lang/String;", "getUpgradeType", "()I", "setUpgradeType", "(I)V", "getFrequencyLimit", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getLink", "()Lcom/kubi/mine/lib/entity/Link;", "getRemark", "()Lcom/kubi/mine/lib/entity/Remark;", "isNullOrEmptyData", "", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;ILjava/lang/Integer;Lcom/kubi/mine/lib/entity/Link;Lcom/kubi/mine/lib/entity/Remark;)Lcom/kubi/mine/lib/entity/AppUpgradeEntityV2;", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "MineLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class AppUpgradeEntityV2 implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<AppUpgradeEntityV2> CREATOR = new C18929a();

    @Nullable
    private final Integer frequencyLimit;

    @Nullable
    private final Link link;

    @NotNull
    private final String popupId;

    @Nullable
    private final Remark remark;
    private int upgradeType;

    /* JADX INFO: renamed from: com.kubi.mine.lib.entity.AppUpgradeEntityV2$a */
    /* JADX INFO: compiled from: AppUpgradeEntityV2.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C18929a implements Parcelable.Creator<AppUpgradeEntityV2> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final AppUpgradeEntityV2 createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new AppUpgradeEntityV2(parcel.readString(), parcel.readInt(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Link.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? Remark.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final AppUpgradeEntityV2[] newArray(int i11) {
            return new AppUpgradeEntityV2[i11];
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
        if (!(other instanceof AppUpgradeEntityV2)) {
            return false;
        }
        AppUpgradeEntityV2 appUpgradeEntityV2 = (AppUpgradeEntityV2) other;
        return Intrinsics.areEqual(this.popupId, appUpgradeEntityV2.popupId) && this.upgradeType == appUpgradeEntityV2.upgradeType && Intrinsics.areEqual(this.frequencyLimit, appUpgradeEntityV2.frequencyLimit) && Intrinsics.areEqual(this.link, appUpgradeEntityV2.link) && Intrinsics.areEqual(this.remark, appUpgradeEntityV2.remark);
    }

    public AppUpgradeEntityV2(@NotNull String popupId, int i11, @Nullable Integer num, @Nullable Link link, @Nullable Remark remark) {
        Intrinsics.checkNotNullParameter(popupId, "popupId");
        this.popupId = popupId;
        this.upgradeType = i11;
        this.frequencyLimit = num;
        this.link = link;
        this.remark = remark;
    }

    public static /* synthetic */ AppUpgradeEntityV2 copy$default(AppUpgradeEntityV2 appUpgradeEntityV2, String str, int i11, Integer num, Link link, Remark remark, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = appUpgradeEntityV2.popupId;
        }
        if ((i12 & 2) != 0) {
            i11 = appUpgradeEntityV2.upgradeType;
        }
        if ((i12 & 4) != 0) {
            num = appUpgradeEntityV2.frequencyLimit;
        }
        if ((i12 & 8) != 0) {
            link = appUpgradeEntityV2.link;
        }
        if ((i12 & 16) != 0) {
            remark = appUpgradeEntityV2.remark;
        }
        Remark remark2 = remark;
        Integer num2 = num;
        return appUpgradeEntityV2.copy(str, i11, num2, link, remark2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getPopupId() {
        return this.popupId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getUpgradeType() {
        return this.upgradeType;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Integer getFrequencyLimit() {
        return this.frequencyLimit;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Link getLink() {
        return this.link;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Remark getRemark() {
        return this.remark;
    }

    @NotNull
    public final AppUpgradeEntityV2 copy(@NotNull String popupId, int upgradeType, @Nullable Integer frequencyLimit, @Nullable Link link, @Nullable Remark remark) {
        Intrinsics.checkNotNullParameter(popupId, "popupId");
        return new AppUpgradeEntityV2(popupId, upgradeType, frequencyLimit, link, remark);
    }

    @Nullable
    public final Integer getFrequencyLimit() {
        return this.frequencyLimit;
    }

    @Nullable
    public final Link getLink() {
        return this.link;
    }

    @NotNull
    public final String getPopupId() {
        return this.popupId;
    }

    @Nullable
    public final Remark getRemark() {
        return this.remark;
    }

    public final int getUpgradeType() {
        return this.upgradeType;
    }

    public int hashCode() {
        int iHashCode = ((this.popupId.hashCode() * 31) + Integer.hashCode(this.upgradeType)) * 31;
        Integer num = this.frequencyLimit;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Link link = this.link;
        int iHashCode3 = (iHashCode2 + (link == null ? 0 : link.hashCode())) * 31;
        Remark remark = this.remark;
        return iHashCode3 + (remark != null ? remark.hashCode() : 0);
    }

    public final boolean isNullOrEmptyData() {
        return this.upgradeType <= 0 || this.link == null || this.remark == null;
    }

    public final void setUpgradeType(int i11) {
        this.upgradeType = i11;
    }

    @NotNull
    public String toString() {
        return "AppUpgradeEntityV2(popupId=" + this.popupId + ", upgradeType=" + this.upgradeType + ", frequencyLimit=" + this.frequencyLimit + ", link=" + this.link + ", remark=" + this.remark + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.popupId);
        dest.writeInt(this.upgradeType);
        Integer num = this.frequencyLimit;
        if (num == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num.intValue());
        }
        Link link = this.link;
        if (link == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            link.writeToParcel(dest, flags);
        }
        Remark remark = this.remark;
        if (remark == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            remark.writeToParcel(dest, flags);
        }
    }
}
