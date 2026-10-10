package com.kubi.user.site.config;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: UserCenterSiteConfig.kt */
/* JADX INFO: loaded from: classes23.dex */
@Keep
@Metadata(m90083d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0011\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0004HÆ\u0003J9\u0010\u0011\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004HÆ\u0001J\u0006\u0010\u0012\u001a\u00020\u0013J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0004HÖ\u0001J\u0016\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0013R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0019\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u001f"}, m90084d2 = {"Lcom/kubi/user/site/config/DirectoryConfig;", "Landroid/os/Parcelable;", "pageDirectorys", "", "", "profilePhotoDirectorys", "rateStandardUrl", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/lang/String;)V", "getPageDirectorys", "()Ljava/util/List;", "getProfilePhotoDirectorys", "getRateStandardUrl", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "UserCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class DirectoryConfig implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<DirectoryConfig> CREATOR = new C26796a();

    @Nullable
    private final List<String> pageDirectorys;

    @Nullable
    private final List<String> profilePhotoDirectorys;

    @Nullable
    private final String rateStandardUrl;

    /* JADX INFO: renamed from: com.kubi.user.site.config.DirectoryConfig$a */
    /* JADX INFO: compiled from: UserCenterSiteConfig.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C26796a implements Parcelable.Creator<DirectoryConfig> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final DirectoryConfig[] newArray(int i11) {
            return new DirectoryConfig[i11];
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final DirectoryConfig createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new DirectoryConfig(parcel.createStringArrayList(), parcel.createStringArrayList(), parcel.readString());
        }
    }

    public DirectoryConfig() {
        this(null, null, null, 7, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DirectoryConfig)) {
            return false;
        }
        DirectoryConfig directoryConfig = (DirectoryConfig) other;
        return Intrinsics.areEqual(this.pageDirectorys, directoryConfig.pageDirectorys) && Intrinsics.areEqual(this.profilePhotoDirectorys, directoryConfig.profilePhotoDirectorys) && Intrinsics.areEqual(this.rateStandardUrl, directoryConfig.rateStandardUrl);
    }

    public DirectoryConfig(@Nullable List<String> list, @Nullable List<String> list2, @Nullable String str) {
        this.pageDirectorys = list;
        this.profilePhotoDirectorys = list2;
        this.rateStandardUrl = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DirectoryConfig copy$default(DirectoryConfig directoryConfig, List list, List list2, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = directoryConfig.pageDirectorys;
        }
        if ((i11 & 2) != 0) {
            list2 = directoryConfig.profilePhotoDirectorys;
        }
        if ((i11 & 4) != 0) {
            str = directoryConfig.rateStandardUrl;
        }
        return directoryConfig.copy(list, list2, str);
    }

    @Nullable
    public final List<String> component1() {
        return this.pageDirectorys;
    }

    @Nullable
    public final List<String> component2() {
        return this.profilePhotoDirectorys;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getRateStandardUrl() {
        return this.rateStandardUrl;
    }

    @NotNull
    public final DirectoryConfig copy(@Nullable List<String> pageDirectorys, @Nullable List<String> profilePhotoDirectorys, @Nullable String rateStandardUrl) {
        return new DirectoryConfig(pageDirectorys, profilePhotoDirectorys, rateStandardUrl);
    }

    @Nullable
    public final List<String> getPageDirectorys() {
        return this.pageDirectorys;
    }

    @Nullable
    public final List<String> getProfilePhotoDirectorys() {
        return this.profilePhotoDirectorys;
    }

    @Nullable
    public final String getRateStandardUrl() {
        return this.rateStandardUrl;
    }

    public int hashCode() {
        List<String> list = this.pageDirectorys;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<String> list2 = this.profilePhotoDirectorys;
        int iHashCode2 = (iHashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str = this.rateStandardUrl;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "DirectoryConfig(pageDirectorys=" + this.pageDirectorys + ", profilePhotoDirectorys=" + this.profilePhotoDirectorys + ", rateStandardUrl=" + this.rateStandardUrl + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeStringList(this.pageDirectorys);
        dest.writeStringList(this.profilePhotoDirectorys);
        dest.writeString(this.rateStandardUrl);
    }

    public /* synthetic */ DirectoryConfig(List list, List list2, String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : list, (i11 & 2) != 0 ? null : list2, (i11 & 4) != 0 ? null : str);
    }
}
