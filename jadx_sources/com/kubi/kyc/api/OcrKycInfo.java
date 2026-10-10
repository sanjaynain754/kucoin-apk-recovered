package com.kubi.kyc.api;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.kubi.kyc.KycKey;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: KycEntity.kt */
/* JADX INFO: loaded from: classes21.dex */
@Keep
@Metadata(m90083d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u000eJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J>\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0016J\u0006\u0010\u0017\u001a\u00020\u0006J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bHÖ\u0003J\t\u0010\u001c\u001a\u00020\u0006HÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u0006R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000b¨\u0006#"}, m90084d2 = {"Lcom/kubi/kyc/api/OcrKycInfo;", "Landroid/os/Parcelable;", KycKey.backendPhoto, "", KycKey.frontPhoto, "verifyType", "", "ekycflowId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)V", "getBackendPhoto", "()Ljava/lang/String;", "getFrontPhoto", "getVerifyType", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getEkycflowId", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)Lcom/kubi/kyc/api/OcrKycInfo;", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "KycApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class OcrKycInfo implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<OcrKycInfo> CREATOR = new C17098a();

    @Nullable
    private final String backendPhoto;

    @Nullable
    private final String ekycflowId;

    @Nullable
    private final String frontPhoto;

    @Nullable
    private final Integer verifyType;

    /* JADX INFO: renamed from: com.kubi.kyc.api.OcrKycInfo$a */
    /* JADX INFO: compiled from: KycEntity.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C17098a implements Parcelable.Creator<OcrKycInfo> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final OcrKycInfo createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new OcrKycInfo(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final OcrKycInfo[] newArray(int i11) {
            return new OcrKycInfo[i11];
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
        if (!(other instanceof OcrKycInfo)) {
            return false;
        }
        OcrKycInfo ocrKycInfo = (OcrKycInfo) other;
        return Intrinsics.areEqual(this.backendPhoto, ocrKycInfo.backendPhoto) && Intrinsics.areEqual(this.frontPhoto, ocrKycInfo.frontPhoto) && Intrinsics.areEqual(this.verifyType, ocrKycInfo.verifyType) && Intrinsics.areEqual(this.ekycflowId, ocrKycInfo.ekycflowId);
    }

    public static /* synthetic */ OcrKycInfo copy$default(OcrKycInfo ocrKycInfo, String str, String str2, Integer num, String str3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = ocrKycInfo.backendPhoto;
        }
        if ((i11 & 2) != 0) {
            str2 = ocrKycInfo.frontPhoto;
        }
        if ((i11 & 4) != 0) {
            num = ocrKycInfo.verifyType;
        }
        if ((i11 & 8) != 0) {
            str3 = ocrKycInfo.ekycflowId;
        }
        return ocrKycInfo.copy(str, str2, num, str3);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getBackendPhoto() {
        return this.backendPhoto;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getFrontPhoto() {
        return this.frontPhoto;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Integer getVerifyType() {
        return this.verifyType;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getEkycflowId() {
        return this.ekycflowId;
    }

    @NotNull
    public final OcrKycInfo copy(@Nullable String backendPhoto, @Nullable String frontPhoto, @Nullable Integer verifyType, @Nullable String ekycflowId) {
        return new OcrKycInfo(backendPhoto, frontPhoto, verifyType, ekycflowId);
    }

    @Nullable
    public final String getBackendPhoto() {
        return this.backendPhoto;
    }

    @Nullable
    public final String getEkycflowId() {
        return this.ekycflowId;
    }

    @Nullable
    public final String getFrontPhoto() {
        return this.frontPhoto;
    }

    @Nullable
    public final Integer getVerifyType() {
        return this.verifyType;
    }

    public int hashCode() {
        String str = this.backendPhoto;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.frontPhoto;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.verifyType;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str3 = this.ekycflowId;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "OcrKycInfo(backendPhoto=" + this.backendPhoto + ", frontPhoto=" + this.frontPhoto + ", verifyType=" + this.verifyType + ", ekycflowId=" + this.ekycflowId + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        int iIntValue;
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.backendPhoto);
        dest.writeString(this.frontPhoto);
        Integer num = this.verifyType;
        if (num == null) {
            iIntValue = 0;
        } else {
            dest.writeInt(1);
            iIntValue = num.intValue();
        }
        dest.writeInt(iIntValue);
        dest.writeString(this.ekycflowId);
    }

    public OcrKycInfo(@Nullable String str, @Nullable String str2, @Nullable Integer num, @Nullable String str3) {
        this.backendPhoto = str;
        this.frontPhoto = str2;
        this.verifyType = num;
        this.ekycflowId = str3;
    }
}
