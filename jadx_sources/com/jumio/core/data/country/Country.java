package com.jumio.core.data.country;

import android.os.Parcel;
import android.os.Parcelable;
import com.jumio.sdk.util.IsoCountryConverter;
import java.io.Serializable;
import java.text.CollationKey;
import java.text.Collator;
import java.util.Arrays;
import java.util.Locale;
import jumio.core.AbstractC40511C;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmField;
import p852kotlin.jvm.JvmOverloads;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.StringCompanionObject;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0007\u0018\u0000 '2\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u00022\u00020\u0003:\u0001'B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB\u001b\b\u0017\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\u0007\u0010\fB\u0011\b\u0016\u0012\u0006\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u0007\u0010\u000fJ\u0018\u0010\u0016\u001a\u00020\u00172\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\u0011\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0000H\u0096\u0002J\b\u0010\u001f\u001a\u00020\u001dH\u0016J\u0013\u0010 \u001a\u00020\u000b2\b\u0010\u001e\u001a\u0004\u0018\u00010!H\u0096\u0002J\b\u0010\"\u001a\u00020\u001dH\u0016J\u0018\u0010#\u001a\u00020\u00172\u0006\u0010$\u001a\u00020\u000e2\u0006\u0010%\u001a\u00020\u001dH\u0016J\b\u0010&\u001a\u00020\u0005H\u0016R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0011\"\u0004\b\u0015\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u00198BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006("}, m90084d2 = {"Lcom/jumio/core/data/country/Country;", "", "Landroid/os/Parcelable;", "Ljava/io/Serializable;", "isoCode", "", "name", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "iso3Code", "localize", "", "(Ljava/lang/String;Z)V", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "getIsoCode", "()Ljava/lang/String;", "setIsoCode", "(Ljava/lang/String;)V", "getName", "setName", "init", "", "collationKey", "Ljava/text/CollationKey;", "getCollationKey", "()Ljava/text/CollationKey;", "compareTo", "", "other", "hashCode", "equals", "", "describeContents", "writeToParcel", "dest", "flags", "toString", "Companion", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class Country implements Comparable<Country>, Parcelable, Serializable {

    /* JADX INFO: renamed from: a */
    public String f13765a;

    /* JADX INFO: renamed from: b */
    public String f13766b;

    @JvmField
    @NotNull
    public static final Parcelable.Creator<Country> CREATOR = new Parcelable.Creator<Country>() { // from class: com.jumio.core.data.country.Country$Companion$CREATOR$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Country createFromParcel(Parcel source) {
            Intrinsics.checkNotNullParameter(source, "source");
            return new Country(source);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Country[] newArray(int size) {
            return new Country[size];
        }
    };

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public Country(@NotNull String iso3Code) {
        this(iso3Code, false, 2, null);
        Intrinsics.checkNotNullParameter(iso3Code, "iso3Code");
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public Country(@NotNull String isoCode, @NotNull String name) {
        Intrinsics.checkNotNullParameter(isoCode, "isoCode");
        Intrinsics.checkNotNullParameter(name, "name");
        this.f13765a = isoCode;
        this.f13766b = name;
    }

    @Override // java.lang.Comparable
    public int compareTo(@NotNull Country other) {
        Intrinsics.checkNotNullParameter(other, "other");
        CollationKey collationKey = Collator.getInstance().getCollationKey(this.f13766b);
        other.getClass();
        CollationKey collationKey2 = Collator.getInstance().getCollationKey(other.f13766b);
        Intrinsics.checkNotNullExpressionValue(collationKey2, "getCollationKey(...)");
        return collationKey.compareTo(collationKey2);
    }

    public boolean equals(@Nullable Object other) {
        if (other instanceof Country) {
            Country country = (Country) other;
            if (Intrinsics.areEqual(country.f13766b, this.f13766b) && Intrinsics.areEqual(country.f13765a, this.f13765a)) {
                return true;
            }
        }
        return false;
    }

    @NotNull
    /* JADX INFO: renamed from: getIsoCode, reason: from getter */
    public final String getF13765a() {
        return this.f13765a;
    }

    @NotNull
    /* JADX INFO: renamed from: getName, reason: from getter */
    public final String getF13766b() {
        return this.f13766b;
    }

    public int hashCode() {
        return this.f13765a.hashCode() + AbstractC40511C.m89148a(this.f13766b, 31, 31);
    }

    public final void setIsoCode(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.f13765a = str;
    }

    public final void setName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.f13766b = str;
    }

    @NotNull
    public String toString() {
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str = String.format("%s (%s)", Arrays.copyOf(new Object[]{this.f13766b, this.f13765a}, 2));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f13765a);
        dest.writeString(this.f13766b);
    }

    public /* synthetic */ Country(String str, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i11 & 2) != 0 ? true : z11);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public Country(@NotNull String iso3Code, boolean z11) {
        String strConvertToAlpha2;
        this("", "");
        Intrinsics.checkNotNullParameter(iso3Code, "iso3Code");
        Locale localeBuild = new Locale.Builder().setRegion((iso3Code.length() != 3 || (strConvertToAlpha2 = IsoCountryConverter.convertToAlpha2(iso3Code)) == null) ? "" : strConvertToAlpha2).build();
        if (z11) {
            String displayCountry = localeBuild.getDisplayCountry();
            Intrinsics.checkNotNullExpressionValue(displayCountry, "getDisplayCountry(...)");
            this.f13765a = iso3Code;
            if (Intrinsics.areEqual(displayCountry, "")) {
                this.f13766b = iso3Code;
                return;
            } else {
                this.f13766b = displayCountry;
                return;
            }
        }
        String displayCountry2 = localeBuild.getDisplayCountry(Locale.ENGLISH);
        Intrinsics.checkNotNullExpressionValue(displayCountry2, "getDisplayCountry(...)");
        this.f13765a = iso3Code;
        if (Intrinsics.areEqual(displayCountry2, "")) {
            this.f13766b = iso3Code;
        } else {
            this.f13766b = displayCountry2;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Country(@NotNull Parcel parcel) {
        this("", "");
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        String string = parcel.readString();
        this.f13765a = string == null ? "" : string;
        String string2 = parcel.readString();
        this.f13766b = string2 != null ? string2 : "";
    }
}
