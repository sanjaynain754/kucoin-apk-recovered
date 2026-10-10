package com.kubi.user.site.config;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: UserCenterSiteConfig.kt */
/* JADX INFO: loaded from: classes23.dex */
@Keep
@Metadata(m90083d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0010R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001d"}, m90084d2 = {"Lcom/kubi/user/site/config/MyConfig;", "Landroid/os/Parcelable;", "directoryConfig", "Lcom/kubi/user/site/config/DirectoryConfig;", "overviewConfig", "Lcom/kubi/user/site/config/OverviewConfig;", "<init>", "(Lcom/kubi/user/site/config/DirectoryConfig;Lcom/kubi/user/site/config/OverviewConfig;)V", "getDirectoryConfig", "()Lcom/kubi/user/site/config/DirectoryConfig;", "getOverviewConfig", "()Lcom/kubi/user/site/config/OverviewConfig;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "UserCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class MyConfig implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<MyConfig> CREATOR = new C26798a();

    @Nullable
    private final DirectoryConfig directoryConfig;

    @Nullable
    private final OverviewConfig overviewConfig;

    /* JADX INFO: renamed from: com.kubi.user.site.config.MyConfig$a */
    /* JADX INFO: compiled from: UserCenterSiteConfig.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C26798a implements Parcelable.Creator<MyConfig> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final MyConfig[] newArray(int i11) {
            return new MyConfig[i11];
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MyConfig createFromParcel(Parcel parcel) {
            DirectoryConfig directoryConfigCreateFromParcel;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            OverviewConfig overviewConfigCreateFromParcel = null;
            if (parcel.readInt() == 0) {
                directoryConfigCreateFromParcel = null;
            } else {
                directoryConfigCreateFromParcel = DirectoryConfig.CREATOR.createFromParcel(parcel);
            }
            DirectoryConfig directoryConfig = directoryConfigCreateFromParcel;
            if (parcel.readInt() != 0) {
                overviewConfigCreateFromParcel = OverviewConfig.CREATOR.createFromParcel(parcel);
            }
            return new MyConfig(directoryConfig, overviewConfigCreateFromParcel);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MyConfig() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MyConfig)) {
            return false;
        }
        MyConfig myConfig = (MyConfig) other;
        return Intrinsics.areEqual(this.directoryConfig, myConfig.directoryConfig) && Intrinsics.areEqual(this.overviewConfig, myConfig.overviewConfig);
    }

    public MyConfig(@Nullable DirectoryConfig directoryConfig, @Nullable OverviewConfig overviewConfig) {
        this.directoryConfig = directoryConfig;
        this.overviewConfig = overviewConfig;
    }

    public static /* synthetic */ MyConfig copy$default(MyConfig myConfig, DirectoryConfig directoryConfig, OverviewConfig overviewConfig, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            directoryConfig = myConfig.directoryConfig;
        }
        if ((i11 & 2) != 0) {
            overviewConfig = myConfig.overviewConfig;
        }
        return myConfig.copy(directoryConfig, overviewConfig);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final DirectoryConfig getDirectoryConfig() {
        return this.directoryConfig;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final OverviewConfig getOverviewConfig() {
        return this.overviewConfig;
    }

    @NotNull
    public final MyConfig copy(@Nullable DirectoryConfig directoryConfig, @Nullable OverviewConfig overviewConfig) {
        return new MyConfig(directoryConfig, overviewConfig);
    }

    @Nullable
    public final DirectoryConfig getDirectoryConfig() {
        return this.directoryConfig;
    }

    @Nullable
    public final OverviewConfig getOverviewConfig() {
        return this.overviewConfig;
    }

    public int hashCode() {
        DirectoryConfig directoryConfig = this.directoryConfig;
        int iHashCode = (directoryConfig == null ? 0 : directoryConfig.hashCode()) * 31;
        OverviewConfig overviewConfig = this.overviewConfig;
        return iHashCode + (overviewConfig != null ? overviewConfig.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "MyConfig(directoryConfig=" + this.directoryConfig + ", overviewConfig=" + this.overviewConfig + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        DirectoryConfig directoryConfig = this.directoryConfig;
        if (directoryConfig == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            directoryConfig.writeToParcel(dest, flags);
        }
        OverviewConfig overviewConfig = this.overviewConfig;
        if (overviewConfig == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            overviewConfig.writeToParcel(dest, flags);
        }
    }

    public /* synthetic */ MyConfig(DirectoryConfig directoryConfig, OverviewConfig overviewConfig, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : directoryConfig, (i11 & 2) != 0 ? null : overviewConfig);
    }
}
