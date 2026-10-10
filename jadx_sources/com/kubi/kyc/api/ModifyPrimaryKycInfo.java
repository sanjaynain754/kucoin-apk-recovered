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
@Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0016\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003JQ\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\u0019\u001a\u00020\u001aJ\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eHÖ\u0003J\t\u0010\u001f\u001a\u00020\u001aHÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001J\u0016\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u001aR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\f¨\u0006&"}, m90084d2 = {"Lcom/kubi/kyc/api/ModifyPrimaryKycInfo;", "Landroid/os/Parcelable;", KycKey.firstName, "", "identityNumber", "identityType", KycKey.lastName, "regionCode", "source", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getFirstName", "()Ljava/lang/String;", "getIdentityNumber", "getIdentityType", "getLastName", "getRegionCode", "getSource", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "KycApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class ModifyPrimaryKycInfo implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<ModifyPrimaryKycInfo> CREATOR = new C17097a();

    @Nullable
    private final String firstName;

    @Nullable
    private final String identityNumber;

    @Nullable
    private final String identityType;

    @Nullable
    private final String lastName;

    @Nullable
    private final String regionCode;

    @Nullable
    private final String source;

    /* JADX INFO: renamed from: com.kubi.kyc.api.ModifyPrimaryKycInfo$a */
    /* JADX INFO: compiled from: KycEntity.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C17097a implements Parcelable.Creator<ModifyPrimaryKycInfo> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ModifyPrimaryKycInfo createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ModifyPrimaryKycInfo(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final ModifyPrimaryKycInfo[] newArray(int i11) {
            return new ModifyPrimaryKycInfo[i11];
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
        if (!(other instanceof ModifyPrimaryKycInfo)) {
            return false;
        }
        ModifyPrimaryKycInfo modifyPrimaryKycInfo = (ModifyPrimaryKycInfo) other;
        return Intrinsics.areEqual(this.firstName, modifyPrimaryKycInfo.firstName) && Intrinsics.areEqual(this.identityNumber, modifyPrimaryKycInfo.identityNumber) && Intrinsics.areEqual(this.identityType, modifyPrimaryKycInfo.identityType) && Intrinsics.areEqual(this.lastName, modifyPrimaryKycInfo.lastName) && Intrinsics.areEqual(this.regionCode, modifyPrimaryKycInfo.regionCode) && Intrinsics.areEqual(this.source, modifyPrimaryKycInfo.source);
    }

    public static /* synthetic */ ModifyPrimaryKycInfo copy$default(ModifyPrimaryKycInfo modifyPrimaryKycInfo, String str, String str2, String str3, String str4, String str5, String str6, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = modifyPrimaryKycInfo.firstName;
        }
        if ((i11 & 2) != 0) {
            str2 = modifyPrimaryKycInfo.identityNumber;
        }
        if ((i11 & 4) != 0) {
            str3 = modifyPrimaryKycInfo.identityType;
        }
        if ((i11 & 8) != 0) {
            str4 = modifyPrimaryKycInfo.lastName;
        }
        if ((i11 & 16) != 0) {
            str5 = modifyPrimaryKycInfo.regionCode;
        }
        if ((i11 & 32) != 0) {
            str6 = modifyPrimaryKycInfo.source;
        }
        String str7 = str5;
        String str8 = str6;
        return modifyPrimaryKycInfo.copy(str, str2, str3, str4, str7, str8);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getFirstName() {
        return this.firstName;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getIdentityNumber() {
        return this.identityNumber;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getIdentityType() {
        return this.identityType;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getLastName() {
        return this.lastName;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getRegionCode() {
        return this.regionCode;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getSource() {
        return this.source;
    }

    @NotNull
    public final ModifyPrimaryKycInfo copy(@Nullable String firstName, @Nullable String identityNumber, @Nullable String identityType, @Nullable String lastName, @Nullable String regionCode, @Nullable String source) {
        return new ModifyPrimaryKycInfo(firstName, identityNumber, identityType, lastName, regionCode, source);
    }

    @Nullable
    public final String getFirstName() {
        return this.firstName;
    }

    @Nullable
    public final String getIdentityNumber() {
        return this.identityNumber;
    }

    @Nullable
    public final String getIdentityType() {
        return this.identityType;
    }

    @Nullable
    public final String getLastName() {
        return this.lastName;
    }

    @Nullable
    public final String getRegionCode() {
        return this.regionCode;
    }

    @Nullable
    public final String getSource() {
        return this.source;
    }

    public int hashCode() {
        String str = this.firstName;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.identityNumber;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.identityType;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.lastName;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.regionCode;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.source;
        return iHashCode5 + (str6 != null ? str6.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "ModifyPrimaryKycInfo(firstName=" + this.firstName + ", identityNumber=" + this.identityNumber + ", identityType=" + this.identityType + ", lastName=" + this.lastName + ", regionCode=" + this.regionCode + ", source=" + this.source + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.firstName);
        dest.writeString(this.identityNumber);
        dest.writeString(this.identityType);
        dest.writeString(this.lastName);
        dest.writeString(this.regionCode);
        dest.writeString(this.source);
    }

    public ModifyPrimaryKycInfo(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6) {
        this.firstName = str;
        this.identityNumber = str2;
        this.identityType = str3;
        this.lastName = str4;
        this.regionCode = str5;
        this.source = str6;
    }
}
