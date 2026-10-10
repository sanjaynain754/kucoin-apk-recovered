package com.kubi.futures.data.platform.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: OpenFuturesAgreement.kt */
/* JADX INFO: loaded from: classes13.dex */
@Keep
@Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\r\u001a\u00020\u000eJ\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u000eHÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u000eR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u001a"}, m90084d2 = {"Lcom/kubi/futures/data/platform/model/OpenFuturesAgreement;", "Landroid/os/Parcelable;", "agreementName", "", "agreementLink", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getAgreementName", "()Ljava/lang/String;", "getAgreementLink", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class OpenFuturesAgreement implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<OpenFuturesAgreement> CREATOR = new C13030a();

    @Nullable
    private final String agreementLink;

    @Nullable
    private final String agreementName;

    /* JADX INFO: renamed from: com.kubi.futures.data.platform.model.OpenFuturesAgreement$a */
    /* JADX INFO: compiled from: OpenFuturesAgreement.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C13030a implements Parcelable.Creator<OpenFuturesAgreement> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final OpenFuturesAgreement createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new OpenFuturesAgreement(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final OpenFuturesAgreement[] newArray(int i11) {
            return new OpenFuturesAgreement[i11];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public OpenFuturesAgreement() {
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
        if (!(other instanceof OpenFuturesAgreement)) {
            return false;
        }
        OpenFuturesAgreement openFuturesAgreement = (OpenFuturesAgreement) other;
        return Intrinsics.areEqual(this.agreementName, openFuturesAgreement.agreementName) && Intrinsics.areEqual(this.agreementLink, openFuturesAgreement.agreementLink);
    }

    public OpenFuturesAgreement(@Nullable String str, @Nullable String str2) {
        this.agreementName = str;
        this.agreementLink = str2;
    }

    public static /* synthetic */ OpenFuturesAgreement copy$default(OpenFuturesAgreement openFuturesAgreement, String str, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = openFuturesAgreement.agreementName;
        }
        if ((i11 & 2) != 0) {
            str2 = openFuturesAgreement.agreementLink;
        }
        return openFuturesAgreement.copy(str, str2);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAgreementName() {
        return this.agreementName;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getAgreementLink() {
        return this.agreementLink;
    }

    @NotNull
    public final OpenFuturesAgreement copy(@Nullable String agreementName, @Nullable String agreementLink) {
        return new OpenFuturesAgreement(agreementName, agreementLink);
    }

    @Nullable
    public final String getAgreementLink() {
        return this.agreementLink;
    }

    @Nullable
    public final String getAgreementName() {
        return this.agreementName;
    }

    public int hashCode() {
        String str = this.agreementName;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.agreementLink;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "OpenFuturesAgreement(agreementName=" + this.agreementName + ", agreementLink=" + this.agreementLink + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.agreementName);
        dest.writeString(this.agreementLink);
    }

    public /* synthetic */ OpenFuturesAgreement(String str, String str2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2);
    }
}
