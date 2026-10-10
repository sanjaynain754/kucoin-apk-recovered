package com.kubi.sdk.pkg.hybird;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.kubi.utils.extensions.C27041f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: OfflinePkgInfo.kt */
/* JADX INFO: loaded from: classes41.dex */
@Keep
@Metadata(m90083d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0002\b\u0010\b\u0081\b\u0018\u0000 .2\u00020\u0001:\u0001/B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB\u0011\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\b\u0010\fJ\u0015\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0012\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0017J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0017J\u0010\u0010\u001a\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ:\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0017J\u0010\u0010\u001f\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u0015J\u001a\u0010\"\u001a\u00020\u00062\b\u0010!\u001a\u0004\u0018\u00010 HÖ\u0003¢\u0006\u0004\b\"\u0010#R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\u0017R\"\u0010\u0004\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010$\u001a\u0004\b&\u0010\u0017\"\u0004\b'\u0010\u000fR$\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010$\u001a\u0004\b(\u0010\u0017\"\u0004\b)\u0010\u000fR\"\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010*\u001a\u0004\b+\u0010\u001b\"\u0004\b,\u0010-¨\u00060"}, m90084d2 = {"Lcom/kubi/sdk/pkg/hybird/OfflinePkgInfo;", "Landroid/os/Parcelable;", "", "name", "version", "oldVersion", "", "indexEnable", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "Landroid/os/Parcel;", "parcel", "(Landroid/os/Parcel;)V", "", "setNewVersion", "(Ljava/lang/String;)V", "", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Z", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Lcom/kubi/sdk/pkg/hybird/OfflinePkgInfo;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getName", "getVersion", "setVersion", "getOldVersion", "setOldVersion", "Z", "getIndexEnable", "setIndexEnable", "(Z)V", "CREATOR", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Package_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final /* data */ class OfflinePkgInfo implements Parcelable {

    /* JADX INFO: renamed from: CREATOR, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private boolean indexEnable;

    @NotNull
    private final String name;

    @Nullable
    private String oldVersion;

    @NotNull
    private String version;

    /* JADX INFO: renamed from: com.kubi.sdk.pkg.hybird.OfflinePkgInfo$a, reason: from kotlin metadata */
    /* JADX INFO: compiled from: OfflinePkgInfo.kt */
    @Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, m90084d2 = {"Lcom/kubi/sdk/pkg/hybird/OfflinePkgInfo$a;", "Landroid/os/Parcelable$Creator;", "Lcom/kubi/sdk/pkg/hybird/OfflinePkgInfo;", "<init>", "()V", "Landroid/os/Parcel;", "parcel", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Landroid/os/Parcel;)Lcom/kubi/sdk/pkg/hybird/OfflinePkgInfo;", "", "size", "", "b", "(I)[Lcom/kubi/sdk/pkg/hybird/OfflinePkgInfo;", "Package_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public static final class Companion implements Parcelable.Creator<OfflinePkgInfo> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public OfflinePkgInfo createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new OfflinePkgInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public OfflinePkgInfo[] newArray(int size) {
            return new OfflinePkgInfo[size];
        }
    }

    public OfflinePkgInfo(@NotNull String name, @NotNull String version, @Nullable String str, boolean z11) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(version, "version");
        this.name = name;
        this.version = version;
        this.oldVersion = str;
        this.indexEnable = z11;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OfflinePkgInfo)) {
            return false;
        }
        OfflinePkgInfo offlinePkgInfo = (OfflinePkgInfo) other;
        return Intrinsics.areEqual(this.name, offlinePkgInfo.name) && Intrinsics.areEqual(this.version, offlinePkgInfo.version) && Intrinsics.areEqual(this.oldVersion, offlinePkgInfo.oldVersion) && this.indexEnable == offlinePkgInfo.indexEnable;
    }

    public static /* synthetic */ OfflinePkgInfo copy$default(OfflinePkgInfo offlinePkgInfo, String str, String str2, String str3, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = offlinePkgInfo.name;
        }
        if ((i11 & 2) != 0) {
            str2 = offlinePkgInfo.version;
        }
        if ((i11 & 4) != 0) {
            str3 = offlinePkgInfo.oldVersion;
        }
        if ((i11 & 8) != 0) {
            z11 = offlinePkgInfo.indexEnable;
        }
        return offlinePkgInfo.copy(str, str2, str3, z11);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getVersion() {
        return this.version;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getOldVersion() {
        return this.oldVersion;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getIndexEnable() {
        return this.indexEnable;
    }

    @NotNull
    public final OfflinePkgInfo copy(@NotNull String name, @NotNull String version, @Nullable String oldVersion, boolean indexEnable) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(version, "version");
        return new OfflinePkgInfo(name, version, oldVersion, indexEnable);
    }

    public final boolean getIndexEnable() {
        return this.indexEnable;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @Nullable
    public final String getOldVersion() {
        return this.oldVersion;
    }

    @NotNull
    public final String getVersion() {
        return this.version;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [int] */
    /* JADX WARN: Type inference failed for: r1v6, types: [int] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v9 */
    public int hashCode() {
        int iHashCode = ((this.name.hashCode() * 31) + this.version.hashCode()) * 31;
        String str = this.oldVersion;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        boolean z11 = this.indexEnable;
        ?? r11 = z11;
        if (z11) {
            r11 = 1;
        }
        return iHashCode2 + r11;
    }

    public final void setIndexEnable(boolean z11) {
        this.indexEnable = z11;
    }

    public final void setNewVersion(@NotNull String version) {
        Intrinsics.checkNotNullParameter(version, "version");
        this.oldVersion = this.version;
        this.version = version;
        this.indexEnable = true;
    }

    public final void setOldVersion(@Nullable String str) {
        this.oldVersion = str;
    }

    public final void setVersion(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.version = str;
    }

    @NotNull
    public String toString() {
        return "OfflinePkgInfo(name=" + this.name + ", version=" + this.version + ", oldVersion=" + this.oldVersion + ", indexEnable=" + this.indexEnable + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeString(this.name);
        parcel.writeString(this.version);
        parcel.writeString(this.oldVersion);
    }

    public /* synthetic */ OfflinePkgInfo(String str, String str2, String str3, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i11 & 4) != 0 ? null : str3, (i11 & 8) != 0 ? false : z11);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public OfflinePkgInfo(@NotNull Parcel parcel) {
        this(C27041f.m66668h(parcel.readString()), C27041f.m66668h(parcel.readString()), parcel.readString(), false, 8, null);
        Intrinsics.checkNotNullParameter(parcel, "parcel");
    }
}
