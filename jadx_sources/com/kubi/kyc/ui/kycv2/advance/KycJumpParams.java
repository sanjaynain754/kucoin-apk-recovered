package com.kubi.kyc.ui.kycv2.advance;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.Keep;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.jumio.core.constants.ConstantsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: KycJumpParams.kt */
/* JADX INFO: loaded from: classes21.dex */
@Keep
@Metadata(m90083d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b&\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0083\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\f\u001a\u00020\u0005\u0012\b\b\u0002\u0010\r\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0005¢\u0006\u0004\b\u000f\u0010\u0010J\u0006\u0010+\u001a\u00020,J\u0006\u0010-\u001a\u00020,J\u0006\u0010.\u001a\u00020,J\t\u0010/\u001a\u00020\u0003HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u00107\u001a\u00020\u0005HÆ\u0003J\t\u00108\u001a\u00020\u0005HÆ\u0003J\t\u00109\u001a\u00020\u0005HÆ\u0003J\u0085\u0001\u0010:\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u0005HÆ\u0001J\u0006\u0010;\u001a\u00020\u0003J\u0013\u0010<\u001a\u00020,2\b\u0010=\u001a\u0004\u0018\u00010>HÖ\u0003J\t\u0010?\u001a\u00020\u0003HÖ\u0001J\t\u0010@\u001a\u00020\u0005HÖ\u0001J\u0016\u0010A\u001a\u00020B2\u0006\u0010C\u001a\u00020D2\u0006\u0010E\u001a\u00020\u0003R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0016\"\u0004\b\u001a\u0010\u0018R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0016\"\u0004\b\u001c\u0010\u0018R\u001c\u0010\b\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0016\"\u0004\b\u001e\u0010\u0018R\u001c\u0010\t\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0016\"\u0004\b \u0010\u0018R\u001c\u0010\n\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0016\"\u0004\b\"\u0010\u0018R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0016\"\u0004\b$\u0010\u0018R\u001a\u0010\f\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0016\"\u0004\b&\u0010\u0018R\u001a\u0010\r\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010\u0016\"\u0004\b(\u0010\u0018R\u001a\u0010\u000e\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u0016\"\u0004\b*\u0010\u0018¨\u0006F"}, m90084d2 = {"Lcom/kubi/kyc/ui/kycv2/advance/KycJumpParams;", "Landroid/os/Parcelable;", "idUploadWay", "", "frontId", "", "frontPhotoPath", "frontToken", "backId", "backendThumbPhoto", "backToken", "transactionId", "direction", TtmlNode.TAG_REGION, "type", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getIdUploadWay", "()I", "setIdUploadWay", "(I)V", "getFrontId", "()Ljava/lang/String;", "setFrontId", "(Ljava/lang/String;)V", "getFrontPhotoPath", "setFrontPhotoPath", "getFrontToken", "setFrontToken", "getBackId", "setBackId", "getBackendThumbPhoto", "setBackendThumbPhoto", "getBackToken", "setBackToken", "getTransactionId", "setTransactionId", "getDirection", "setDirection", "getRegion", "setRegion", "getType", "setType", "isPassPort", "", "isIdCard", "isFront", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "KycLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class KycJumpParams implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<KycJumpParams> CREATOR = new C17192a();

    @Nullable
    private String backId;

    @Nullable
    private String backToken;

    @Nullable
    private String backendThumbPhoto;

    @NotNull
    private String direction;

    @Nullable
    private String frontId;

    @Nullable
    private String frontPhotoPath;

    @Nullable
    private String frontToken;
    private int idUploadWay;

    @NotNull
    private String region;

    @Nullable
    private String transactionId;

    @NotNull
    private String type;

    /* JADX INFO: renamed from: com.kubi.kyc.ui.kycv2.advance.KycJumpParams$a */
    /* JADX INFO: compiled from: KycJumpParams.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C17192a implements Parcelable.Creator<KycJumpParams> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final KycJumpParams createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new KycJumpParams(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final KycJumpParams[] newArray(int i11) {
            return new KycJumpParams[i11];
        }
    }

    public KycJumpParams() {
        this(0, null, null, null, null, null, null, null, null, null, null, 2047, null);
    }

    public static /* synthetic */ KycJumpParams copy$default(KycJumpParams kycJumpParams, int i11, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = kycJumpParams.idUploadWay;
        }
        if ((i12 & 2) != 0) {
            str = kycJumpParams.frontId;
        }
        if ((i12 & 4) != 0) {
            str2 = kycJumpParams.frontPhotoPath;
        }
        if ((i12 & 8) != 0) {
            str3 = kycJumpParams.frontToken;
        }
        if ((i12 & 16) != 0) {
            str4 = kycJumpParams.backId;
        }
        if ((i12 & 32) != 0) {
            str5 = kycJumpParams.backendThumbPhoto;
        }
        if ((i12 & 64) != 0) {
            str6 = kycJumpParams.backToken;
        }
        if ((i12 & 128) != 0) {
            str7 = kycJumpParams.transactionId;
        }
        if ((i12 & 256) != 0) {
            str8 = kycJumpParams.direction;
        }
        if ((i12 & 512) != 0) {
            str9 = kycJumpParams.region;
        }
        if ((i12 & 1024) != 0) {
            str10 = kycJumpParams.type;
        }
        String str11 = str9;
        String str12 = str10;
        String str13 = str7;
        String str14 = str8;
        String str15 = str5;
        String str16 = str6;
        String str17 = str4;
        String str18 = str2;
        return kycJumpParams.copy(i11, str, str18, str3, str17, str15, str16, str13, str14, str11, str12);
    }

    @NotNull
    public final KycJumpParams copy(int idUploadWay, @Nullable String frontId, @Nullable String frontPhotoPath, @Nullable String frontToken, @Nullable String backId, @Nullable String backendThumbPhoto, @Nullable String backToken, @Nullable String transactionId, @NotNull String direction, @NotNull String region, @NotNull String type) {
        Intrinsics.checkNotNullParameter(direction, "direction");
        Intrinsics.checkNotNullParameter(region, "region");
        Intrinsics.checkNotNullParameter(type, "type");
        return new KycJumpParams(idUploadWay, frontId, frontPhotoPath, frontToken, backId, backendThumbPhoto, backToken, transactionId, direction, region, type);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof KycJumpParams)) {
            return false;
        }
        KycJumpParams kycJumpParams = (KycJumpParams) other;
        return this.idUploadWay == kycJumpParams.idUploadWay && Intrinsics.areEqual(this.frontId, kycJumpParams.frontId) && Intrinsics.areEqual(this.frontPhotoPath, kycJumpParams.frontPhotoPath) && Intrinsics.areEqual(this.frontToken, kycJumpParams.frontToken) && Intrinsics.areEqual(this.backId, kycJumpParams.backId) && Intrinsics.areEqual(this.backendThumbPhoto, kycJumpParams.backendThumbPhoto) && Intrinsics.areEqual(this.backToken, kycJumpParams.backToken) && Intrinsics.areEqual(this.transactionId, kycJumpParams.transactionId) && Intrinsics.areEqual(this.direction, kycJumpParams.direction) && Intrinsics.areEqual(this.region, kycJumpParams.region) && Intrinsics.areEqual(this.type, kycJumpParams.type);
    }

    public KycJumpParams(int i11, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @NotNull String direction, @NotNull String region, @NotNull String type) {
        Intrinsics.checkNotNullParameter(direction, "direction");
        Intrinsics.checkNotNullParameter(region, "region");
        Intrinsics.checkNotNullParameter(type, "type");
        this.idUploadWay = i11;
        this.frontId = str;
        this.frontPhotoPath = str2;
        this.frontToken = str3;
        this.backId = str4;
        this.backendThumbPhoto = str5;
        this.backToken = str6;
        this.transactionId = str7;
        this.direction = direction;
        this.region = region;
        this.type = type;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getIdUploadWay() {
        return this.idUploadWay;
    }

    @NotNull
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getRegion() {
        return this.region;
    }

    @NotNull
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getType() {
        return this.type;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getFrontId() {
        return this.frontId;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getFrontPhotoPath() {
        return this.frontPhotoPath;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getFrontToken() {
        return this.frontToken;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getBackId() {
        return this.backId;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getBackendThumbPhoto() {
        return this.backendThumbPhoto;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getBackToken() {
        return this.backToken;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getTransactionId() {
        return this.transactionId;
    }

    @NotNull
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getDirection() {
        return this.direction;
    }

    @Nullable
    public final String getBackId() {
        return this.backId;
    }

    @Nullable
    public final String getBackToken() {
        return this.backToken;
    }

    @Nullable
    public final String getBackendThumbPhoto() {
        return this.backendThumbPhoto;
    }

    @NotNull
    public final String getDirection() {
        return this.direction;
    }

    @Nullable
    public final String getFrontId() {
        return this.frontId;
    }

    @Nullable
    public final String getFrontPhotoPath() {
        return this.frontPhotoPath;
    }

    @Nullable
    public final String getFrontToken() {
        return this.frontToken;
    }

    public final int getIdUploadWay() {
        return this.idUploadWay;
    }

    @NotNull
    public final String getRegion() {
        return this.region;
    }

    @Nullable
    public final String getTransactionId() {
        return this.transactionId;
    }

    @NotNull
    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.idUploadWay) * 31;
        String str = this.frontId;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.frontPhotoPath;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.frontToken;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.backId;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.backendThumbPhoto;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.backToken;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.transactionId;
        return ((((((iHashCode7 + (str7 != null ? str7.hashCode() : 0)) * 31) + this.direction.hashCode()) * 31) + this.region.hashCode()) * 31) + this.type.hashCode();
    }

    public final boolean isFront() {
        return TextUtils.equals(this.direction, ConstantsKt.FACE_CAPTURE_MODE_FRONT);
    }

    public final boolean isIdCard() {
        return TextUtils.equals(this.type, "idcard");
    }

    public final boolean isPassPort() {
        return TextUtils.equals(this.type, "passport");
    }

    public final void setBackId(@Nullable String str) {
        this.backId = str;
    }

    public final void setBackToken(@Nullable String str) {
        this.backToken = str;
    }

    public final void setBackendThumbPhoto(@Nullable String str) {
        this.backendThumbPhoto = str;
    }

    public final void setDirection(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.direction = str;
    }

    public final void setFrontId(@Nullable String str) {
        this.frontId = str;
    }

    public final void setFrontPhotoPath(@Nullable String str) {
        this.frontPhotoPath = str;
    }

    public final void setFrontToken(@Nullable String str) {
        this.frontToken = str;
    }

    public final void setIdUploadWay(int i11) {
        this.idUploadWay = i11;
    }

    public final void setRegion(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.region = str;
    }

    public final void setTransactionId(@Nullable String str) {
        this.transactionId = str;
    }

    public final void setType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.type = str;
    }

    @NotNull
    public String toString() {
        return "KycJumpParams(idUploadWay=" + this.idUploadWay + ", frontId=" + this.frontId + ", frontPhotoPath=" + this.frontPhotoPath + ", frontToken=" + this.frontToken + ", backId=" + this.backId + ", backendThumbPhoto=" + this.backendThumbPhoto + ", backToken=" + this.backToken + ", transactionId=" + this.transactionId + ", direction=" + this.direction + ", region=" + this.region + ", type=" + this.type + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.idUploadWay);
        dest.writeString(this.frontId);
        dest.writeString(this.frontPhotoPath);
        dest.writeString(this.frontToken);
        dest.writeString(this.backId);
        dest.writeString(this.backendThumbPhoto);
        dest.writeString(this.backToken);
        dest.writeString(this.transactionId);
        dest.writeString(this.direction);
        dest.writeString(this.region);
        dest.writeString(this.type);
    }

    public /* synthetic */ KycJumpParams(int i11, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? 1 : i11, (i12 & 2) != 0 ? null : str, (i12 & 4) != 0 ? null : str2, (i12 & 8) != 0 ? null : str3, (i12 & 16) != 0 ? null : str4, (i12 & 32) != 0 ? null : str5, (i12 & 64) != 0 ? null : str6, (i12 & 128) != 0 ? null : str7, (i12 & 256) != 0 ? ConstantsKt.FACE_CAPTURE_MODE_FRONT : str8, (i12 & 512) != 0 ? "" : str9, (i12 & 1024) != 0 ? "" : str10);
    }
}
