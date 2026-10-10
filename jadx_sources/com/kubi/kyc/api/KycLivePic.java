package com.kubi.kyc.api;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.tencent.bugly.proguard.C33577c3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: KycEntity.kt */
/* JADX INFO: loaded from: classes21.dex */
@Keep
@Metadata(m90083d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003JI\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\t\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\u0019\u001a\u00020\u001aJ\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eHÖ\u0003J\t\u0010\u001f\u001a\u00020\u001aHÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001J\u0016\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u001aR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u001e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\r¨\u0006&"}, m90084d2 = {"Lcom/kubi/kyc/api/KycLivePic;", "Landroid/os/Parcelable;", "app", "", C33577c3.f69334H, "imageList", "", "Lcom/kubi/kyc/api/LivePicInfo;", "ekycflowId", "version", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "getApp", "()Ljava/lang/String;", "getDeviceId", "getImageList", "()Ljava/util/List;", "getEkycflowId", "getVersion", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "KycApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class KycLivePic implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<KycLivePic> CREATOR = new C17092a();

    @Nullable
    private final String app;

    @SerializedName("device_id")
    @Nullable
    private final String deviceId;

    @Nullable
    private final String ekycflowId;

    @SerializedName("image_list")
    @Nullable
    private final List<LivePicInfo> imageList;

    @NotNull
    private final String version;

    /* JADX INFO: renamed from: com.kubi.kyc.api.KycLivePic$a */
    /* JADX INFO: compiled from: KycEntity.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C17092a implements Parcelable.Creator<KycLivePic> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final KycLivePic createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i11 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i11);
                for (int i12 = 0; i12 != i11; i12++) {
                    arrayList2.add(LivePicInfo.CREATOR.createFromParcel(parcel));
                }
                arrayList = arrayList2;
            }
            return new KycLivePic(string, string2, arrayList, parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final KycLivePic[] newArray(int i11) {
            return new KycLivePic[i11];
        }
    }

    public KycLivePic(@Nullable String str, @Nullable String str2, @Nullable List<LivePicInfo> list, @Nullable String str3, @NotNull String version) {
        Intrinsics.checkNotNullParameter(version, "version");
        this.app = str;
        this.deviceId = str2;
        this.imageList = list;
        this.ekycflowId = str3;
        this.version = version;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof KycLivePic)) {
            return false;
        }
        KycLivePic kycLivePic = (KycLivePic) other;
        return Intrinsics.areEqual(this.app, kycLivePic.app) && Intrinsics.areEqual(this.deviceId, kycLivePic.deviceId) && Intrinsics.areEqual(this.imageList, kycLivePic.imageList) && Intrinsics.areEqual(this.ekycflowId, kycLivePic.ekycflowId) && Intrinsics.areEqual(this.version, kycLivePic.version);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ KycLivePic copy$default(KycLivePic kycLivePic, String str, String str2, List list, String str3, String str4, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = kycLivePic.app;
        }
        if ((i11 & 2) != 0) {
            str2 = kycLivePic.deviceId;
        }
        if ((i11 & 4) != 0) {
            list = kycLivePic.imageList;
        }
        if ((i11 & 8) != 0) {
            str3 = kycLivePic.ekycflowId;
        }
        if ((i11 & 16) != 0) {
            str4 = kycLivePic.version;
        }
        String str5 = str4;
        List list2 = list;
        return kycLivePic.copy(str, str2, list2, str3, str5);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getApp() {
        return this.app;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDeviceId() {
        return this.deviceId;
    }

    @Nullable
    public final List<LivePicInfo> component3() {
        return this.imageList;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getEkycflowId() {
        return this.ekycflowId;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getVersion() {
        return this.version;
    }

    @NotNull
    public final KycLivePic copy(@Nullable String app, @Nullable String deviceId, @Nullable List<LivePicInfo> imageList, @Nullable String ekycflowId, @NotNull String version) {
        Intrinsics.checkNotNullParameter(version, "version");
        return new KycLivePic(app, deviceId, imageList, ekycflowId, version);
    }

    @Nullable
    public final String getApp() {
        return this.app;
    }

    @Nullable
    public final String getDeviceId() {
        return this.deviceId;
    }

    @Nullable
    public final String getEkycflowId() {
        return this.ekycflowId;
    }

    @Nullable
    public final List<LivePicInfo> getImageList() {
        return this.imageList;
    }

    @NotNull
    public final String getVersion() {
        return this.version;
    }

    public int hashCode() {
        String str = this.app;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.deviceId;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<LivePicInfo> list = this.imageList;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        String str3 = this.ekycflowId;
        return ((iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31) + this.version.hashCode();
    }

    @NotNull
    public String toString() {
        return "KycLivePic(app=" + this.app + ", deviceId=" + this.deviceId + ", imageList=" + this.imageList + ", ekycflowId=" + this.ekycflowId + ", version=" + this.version + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.app);
        dest.writeString(this.deviceId);
        List<LivePicInfo> list = this.imageList;
        if (list == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(list.size());
            Iterator<LivePicInfo> it = list.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(dest, flags);
            }
        }
        dest.writeString(this.ekycflowId);
        dest.writeString(this.version);
    }

    public /* synthetic */ KycLivePic(String str, String str2, List list, String str3, String str4, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? "android" : str, str2, list, str3, (i11 & 16) != 0 ? "1" : str4);
    }
}
