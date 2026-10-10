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
@Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\u0012\u001a\u00020\u0013J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0013R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\t¨\u0006\u001f"}, m90084d2 = {"Lcom/kubi/otc/entity/FiatCapitualBank;", "Landroid/os/Parcelable;", "ispbCode", "", "shortName", "name", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getIspbCode", "()Ljava/lang/String;", "setIspbCode", "(Ljava/lang/String;)V", "getShortName", "getName", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class FiatCapitualBank implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<FiatCapitualBank> CREATOR = new Creator();

    @Nullable
    private String ispbCode;

    @Nullable
    private final String name;

    @Nullable
    private final String shortName;

    /* JADX INFO: compiled from: FiatBean.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Creator implements Parcelable.Creator<FiatCapitualBank> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FiatCapitualBank createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new FiatCapitualBank(parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FiatCapitualBank[] newArray(int i11) {
            return new FiatCapitualBank[i11];
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
        if (!(other instanceof FiatCapitualBank)) {
            return false;
        }
        FiatCapitualBank fiatCapitualBank = (FiatCapitualBank) other;
        return Intrinsics.areEqual(this.ispbCode, fiatCapitualBank.ispbCode) && Intrinsics.areEqual(this.shortName, fiatCapitualBank.shortName) && Intrinsics.areEqual(this.name, fiatCapitualBank.name);
    }

    public static /* synthetic */ FiatCapitualBank copy$default(FiatCapitualBank fiatCapitualBank, String str, String str2, String str3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = fiatCapitualBank.ispbCode;
        }
        if ((i11 & 2) != 0) {
            str2 = fiatCapitualBank.shortName;
        }
        if ((i11 & 4) != 0) {
            str3 = fiatCapitualBank.name;
        }
        return fiatCapitualBank.copy(str, str2, str3);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getIspbCode() {
        return this.ispbCode;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getShortName() {
        return this.shortName;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final FiatCapitualBank copy(@Nullable String ispbCode, @Nullable String shortName, @Nullable String name) {
        return new FiatCapitualBank(ispbCode, shortName, name);
    }

    @Nullable
    public final String getIspbCode() {
        return this.ispbCode;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    @Nullable
    public final String getShortName() {
        return this.shortName;
    }

    public int hashCode() {
        String str = this.ispbCode;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.shortName;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.name;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final void setIspbCode(@Nullable String str) {
        this.ispbCode = str;
    }

    @NotNull
    public String toString() {
        return "FiatCapitualBank(ispbCode=" + this.ispbCode + ", shortName=" + this.shortName + ", name=" + this.name + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.ispbCode);
        dest.writeString(this.shortName);
        dest.writeString(this.name);
    }

    public FiatCapitualBank(@Nullable String str, @Nullable String str2, @Nullable String str3) {
        this.ispbCode = str;
        this.shortName = str2;
        this.name = str3;
    }
}
