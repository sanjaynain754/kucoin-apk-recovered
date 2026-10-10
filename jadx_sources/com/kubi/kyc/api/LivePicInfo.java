package com.kubi.kyc.api;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: KycEntity.kt */
/* JADX INFO: loaded from: classes21.dex */
@Keep
@Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\u0010\u001a\u00020\u0011J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0011R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u001d"}, m90084d2 = {"Lcom/kubi/kyc/api/LivePicInfo;", "Landroid/os/Parcelable;", "image", "", "imageType", "key", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getImage", "()Ljava/lang/String;", "getImageType", "getKey", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "KycApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class LivePicInfo implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<LivePicInfo> CREATOR = new C17096a();

    @Nullable
    private final String image;

    @SerializedName("image_type")
    @Nullable
    private final String imageType;

    @SerializedName("s_key")
    @Nullable
    private final String key;

    /* JADX INFO: renamed from: com.kubi.kyc.api.LivePicInfo$a */
    /* JADX INFO: compiled from: KycEntity.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C17096a implements Parcelable.Creator<LivePicInfo> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final LivePicInfo createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new LivePicInfo(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final LivePicInfo[] newArray(int i11) {
            return new LivePicInfo[i11];
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
        if (!(other instanceof LivePicInfo)) {
            return false;
        }
        LivePicInfo livePicInfo = (LivePicInfo) other;
        return Intrinsics.areEqual(this.image, livePicInfo.image) && Intrinsics.areEqual(this.imageType, livePicInfo.imageType) && Intrinsics.areEqual(this.key, livePicInfo.key);
    }

    public static /* synthetic */ LivePicInfo copy$default(LivePicInfo livePicInfo, String str, String str2, String str3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = livePicInfo.image;
        }
        if ((i11 & 2) != 0) {
            str2 = livePicInfo.imageType;
        }
        if ((i11 & 4) != 0) {
            str3 = livePicInfo.key;
        }
        return livePicInfo.copy(str, str2, str3);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getImage() {
        return this.image;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getImageType() {
        return this.imageType;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getKey() {
        return this.key;
    }

    @NotNull
    public final LivePicInfo copy(@Nullable String image, @Nullable String imageType, @Nullable String key) {
        return new LivePicInfo(image, imageType, key);
    }

    @Nullable
    public final String getImage() {
        return this.image;
    }

    @Nullable
    public final String getImageType() {
        return this.imageType;
    }

    @Nullable
    public final String getKey() {
        return this.key;
    }

    public int hashCode() {
        String str = this.image;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.imageType;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.key;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "LivePicInfo(image=" + this.image + ", imageType=" + this.imageType + ", key=" + this.key + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.image);
        dest.writeString(this.imageType);
        dest.writeString(this.key);
    }

    public LivePicInfo(@Nullable String str, @Nullable String str2, @Nullable String str3) {
        this.image = str;
        this.imageType = str2;
        this.key = str3;
    }
}
