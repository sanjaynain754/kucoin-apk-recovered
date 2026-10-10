package com.kubi.mine.lib.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AppUpgradeEntity.kt */
/* JADX INFO: loaded from: classes29.dex */
@Keep
@Metadata(m90083d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0016\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\u0006\u0010\nJ\u0018\u0010\u000f\u001a\u00020\u00102\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u0012H\u0016J\u0006\u0010\u0014\u001a\u00020\u0015J\b\u0010\u0016\u001a\u00020\u0003H\u0016J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u00152\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÖ\u0003J\t\u0010\u001e\u001a\u00020\u0012HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\f¨\u0006 "}, m90084d2 = {"Lcom/kubi/mine/lib/entity/AppUpgradeEntity;", "Landroid/os/Parcelable;", "title", "", "latestAppVersion", "content", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "getTitle", "()Ljava/lang/String;", "getLatestAppVersion", "getContent", "writeToParcel", "", "flags", "", "describeContents", "isNullOrEmptyData", "", "toString", "component1", "component2", "component3", "copy", "equals", "other", "", "hashCode", "CREATOR", "MineLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class AppUpgradeEntity implements Parcelable {

    /* JADX INFO: renamed from: CREATOR, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private final String content;

    @Nullable
    private final String latestAppVersion;

    @Nullable
    private final String title;

    /* JADX INFO: renamed from: com.kubi.mine.lib.entity.AppUpgradeEntity$a, reason: from kotlin metadata */
    /* JADX INFO: compiled from: AppUpgradeEntity.kt */
    @Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u001d\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016¢\u0006\u0002\u0010\f¨\u0006\r"}, m90084d2 = {"Lcom/kubi/mine/lib/entity/AppUpgradeEntity$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/kubi/mine/lib/entity/AppUpgradeEntity;", "<init>", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lcom/kubi/mine/lib/entity/AppUpgradeEntity;", "MineLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion implements Parcelable.Creator<AppUpgradeEntity> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public AppUpgradeEntity createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new AppUpgradeEntity(parcel);
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public AppUpgradeEntity[] newArray(int i11) {
            return new AppUpgradeEntity[i11];
        }
    }

    public AppUpgradeEntity(@Nullable String str, @Nullable String str2, @Nullable String str3) {
        this.title = str;
        this.latestAppVersion = str2;
        this.content = str3;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AppUpgradeEntity)) {
            return false;
        }
        AppUpgradeEntity appUpgradeEntity = (AppUpgradeEntity) other;
        return Intrinsics.areEqual(this.title, appUpgradeEntity.title) && Intrinsics.areEqual(this.latestAppVersion, appUpgradeEntity.latestAppVersion) && Intrinsics.areEqual(this.content, appUpgradeEntity.content);
    }

    public static /* synthetic */ AppUpgradeEntity copy$default(AppUpgradeEntity appUpgradeEntity, String str, String str2, String str3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = appUpgradeEntity.title;
        }
        if ((i11 & 2) != 0) {
            str2 = appUpgradeEntity.latestAppVersion;
        }
        if ((i11 & 4) != 0) {
            str3 = appUpgradeEntity.content;
        }
        return appUpgradeEntity.copy(str, str2, str3);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getLatestAppVersion() {
        return this.latestAppVersion;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getContent() {
        return this.content;
    }

    @NotNull
    public final AppUpgradeEntity copy(@Nullable String title, @Nullable String latestAppVersion, @Nullable String content) {
        return new AppUpgradeEntity(title, latestAppVersion, content);
    }

    @Nullable
    public final String getContent() {
        return this.content;
    }

    @Nullable
    public final String getLatestAppVersion() {
        return this.latestAppVersion;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        String str = this.title;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.latestAppVersion;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.content;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final boolean isNullOrEmptyData() {
        String str = this.title;
        if (str != null && str.length() != 0) {
            return false;
        }
        String str2 = this.content;
        if (str2 != null && str2.length() != 0) {
            return false;
        }
        String str3 = this.latestAppVersion;
        return str3 == null || str3.length() == 0;
    }

    @NotNull
    public String toString() {
        return "AppUpgradeEntity(title=" + this.title + ", latestAppVersion=" + this.latestAppVersion + ", content=" + this.content + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeString(this.title);
        parcel.writeString(this.latestAppVersion);
        parcel.writeString(this.content);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AppUpgradeEntity(@NotNull Parcel parcel) {
        this(parcel.readString(), parcel.readString(), parcel.readString());
        Intrinsics.checkNotNullParameter(parcel, "parcel");
    }
}
