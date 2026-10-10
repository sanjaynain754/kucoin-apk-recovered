package com.kubi.otc.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: FiatBean.kt */
/* JADX INFO: loaded from: classes33.dex */
@Keep
@Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0010R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\b¨\u0006\u001d"}, m90084d2 = {"Lcom/kubi/otc/entity/FiatEmail;", "Landroid/os/Parcelable;", "bizType", "", "fiatCurrency", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getBizType", "()Ljava/lang/String;", "setBizType", "(Ljava/lang/String;)V", "getFiatCurrency", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "Companion", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class FiatEmail implements Parcelable {

    @NotNull
    public static final String CAPITUAL_TRANSFER_TYPE = "capitual_transfer_info";

    @Nullable
    private String bizType;

    @Nullable
    private final String fiatCurrency;

    @NotNull
    public static final Parcelable.Creator<FiatEmail> CREATOR = new Creator();

    /* JADX INFO: compiled from: FiatBean.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Creator implements Parcelable.Creator<FiatEmail> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FiatEmail createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new FiatEmail(parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FiatEmail[] newArray(int i11) {
            return new FiatEmail[i11];
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
        if (!(other instanceof FiatEmail)) {
            return false;
        }
        FiatEmail fiatEmail = (FiatEmail) other;
        return Intrinsics.areEqual(this.bizType, fiatEmail.bizType) && Intrinsics.areEqual(this.fiatCurrency, fiatEmail.fiatCurrency);
    }

    public static /* synthetic */ FiatEmail copy$default(FiatEmail fiatEmail, String str, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = fiatEmail.bizType;
        }
        if ((i11 & 2) != 0) {
            str2 = fiatEmail.fiatCurrency;
        }
        return fiatEmail.copy(str, str2);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getBizType() {
        return this.bizType;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getFiatCurrency() {
        return this.fiatCurrency;
    }

    @NotNull
    public final FiatEmail copy(@Nullable String bizType, @Nullable String fiatCurrency) {
        return new FiatEmail(bizType, fiatCurrency);
    }

    @Nullable
    public final String getBizType() {
        return this.bizType;
    }

    @Nullable
    public final String getFiatCurrency() {
        return this.fiatCurrency;
    }

    public int hashCode() {
        String str = this.bizType;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.fiatCurrency;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final void setBizType(@Nullable String str) {
        this.bizType = str;
    }

    @NotNull
    public String toString() {
        return "FiatEmail(bizType=" + this.bizType + ", fiatCurrency=" + this.fiatCurrency + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.bizType);
        dest.writeString(this.fiatCurrency);
    }

    public FiatEmail(@Nullable String str, @Nullable String str2) {
        this.bizType = str;
        this.fiatCurrency = str2;
    }
}
