package com.kubi.otc.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.otc.R$string;
import com.kubi.utils.C27017c;
import java.math.BigDecimal;
import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: OtcBean.kt */
/* JADX INFO: loaded from: classes33.dex */
@Keep
@Metadata(m90083d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 :2\u00020\u0001:\u0001:Bs\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\f\u001a\u00020\u0007\u0012\u001e\u0010\r\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u000ej\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u0001`\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\u000e\u0010!\u001a\u00020\u00032\u0006\u0010\"\u001a\u00020\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0005HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010'\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u001aJ\u000b\u0010(\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010*\u001a\u00020\u0007HÆ\u0003J!\u0010+\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u000ej\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u0001`\u000fHÆ\u0003J\u008c\u0001\u0010,\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\f\u001a\u00020\u00072 \b\u0002\u0010\r\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u000ej\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u0001`\u000fHÆ\u0001¢\u0006\u0002\u0010-J\u0006\u0010.\u001a\u00020\u0005J\u0013\u0010/\u001a\u0002002\b\u00101\u001a\u0004\u0018\u000102HÖ\u0003J\t\u00103\u001a\u00020\u0005HÖ\u0001J\t\u00104\u001a\u00020\u0003HÖ\u0001J\u0016\u00105\u001a\u0002062\u0006\u00107\u001a\u0002082\u0006\u00109\u001a\u00020\u0005R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0013R\u0015\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\n\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0017R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0013R\u0011\u0010\f\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0017R)\u0010\r\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u000ej\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u0001`\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 ¨\u0006;"}, m90084d2 = {"Lcom/kubi/otc/entity/OtcSymbol;", "Landroid/os/Parcelable;", FirebaseAnalytics.Param.CURRENCY, "", "currencyPrecision", "", "floatPercent", "Ljava/math/BigDecimal;", "legal", "legalPrecision", "makerFeeRate", "name", "takerFeeRate", "supportPriceTypes", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "<init>", "(Ljava/lang/String;ILjava/math/BigDecimal;Ljava/lang/String;Ljava/lang/Integer;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/util/ArrayList;)V", "getCurrency", "()Ljava/lang/String;", "getCurrencyPrecision", "()I", "getFloatPercent", "()Ljava/math/BigDecimal;", "getLegal", "getLegalPrecision", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getMakerFeeRate", "getName", "getTakerFeeRate", "getSupportPriceTypes", "()Ljava/util/ArrayList;", "priceTypeStr", "type", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;ILjava/math/BigDecimal;Ljava/lang/String;Ljava/lang/Integer;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/util/ArrayList;)Lcom/kubi/otc/entity/OtcSymbol;", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "Companion", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class OtcSymbol implements Parcelable {

    @NotNull
    public static final String TYPE_FLOAT = "FLOAT";

    @NotNull
    public static final String TYPE_OTC = "OTC";

    @NotNull
    public static final String TYPE_REGULAR = "REGULAR";

    @Nullable
    private final String currency;
    private final int currencyPrecision;

    @Nullable
    private final BigDecimal floatPercent;

    @Nullable
    private final String legal;

    @Nullable
    private final Integer legalPrecision;

    @Nullable
    private final BigDecimal makerFeeRate;

    @Nullable
    private final String name;

    @Nullable
    private final ArrayList<String> supportPriceTypes;

    @NotNull
    private final BigDecimal takerFeeRate;

    @NotNull
    public static final Parcelable.Creator<OtcSymbol> CREATOR = new Creator();

    /* JADX INFO: compiled from: OtcBean.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Creator implements Parcelable.Creator<OtcSymbol> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OtcSymbol createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new OtcSymbol(parcel.readString(), parcel.readInt(), (BigDecimal) parcel.readSerializable(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), (BigDecimal) parcel.readSerializable(), parcel.readString(), (BigDecimal) parcel.readSerializable(), parcel.createStringArrayList());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OtcSymbol[] newArray(int i11) {
            return new OtcSymbol[i11];
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
        if (!(other instanceof OtcSymbol)) {
            return false;
        }
        OtcSymbol otcSymbol = (OtcSymbol) other;
        return Intrinsics.areEqual(this.currency, otcSymbol.currency) && this.currencyPrecision == otcSymbol.currencyPrecision && Intrinsics.areEqual(this.floatPercent, otcSymbol.floatPercent) && Intrinsics.areEqual(this.legal, otcSymbol.legal) && Intrinsics.areEqual(this.legalPrecision, otcSymbol.legalPrecision) && Intrinsics.areEqual(this.makerFeeRate, otcSymbol.makerFeeRate) && Intrinsics.areEqual(this.name, otcSymbol.name) && Intrinsics.areEqual(this.takerFeeRate, otcSymbol.takerFeeRate) && Intrinsics.areEqual(this.supportPriceTypes, otcSymbol.supportPriceTypes);
    }

    public OtcSymbol(@Nullable String str, int i11, @Nullable BigDecimal bigDecimal, @Nullable String str2, @Nullable Integer num, @Nullable BigDecimal bigDecimal2, @Nullable String str3, @NotNull BigDecimal takerFeeRate, @Nullable ArrayList<String> arrayList) {
        Intrinsics.checkNotNullParameter(takerFeeRate, "takerFeeRate");
        this.currency = str;
        this.currencyPrecision = i11;
        this.floatPercent = bigDecimal;
        this.legal = str2;
        this.legalPrecision = num;
        this.makerFeeRate = bigDecimal2;
        this.name = str3;
        this.takerFeeRate = takerFeeRate;
        this.supportPriceTypes = arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ OtcSymbol copy$default(OtcSymbol otcSymbol, String str, int i11, BigDecimal bigDecimal, String str2, Integer num, BigDecimal bigDecimal2, String str3, BigDecimal bigDecimal3, ArrayList arrayList, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = otcSymbol.currency;
        }
        if ((i12 & 2) != 0) {
            i11 = otcSymbol.currencyPrecision;
        }
        if ((i12 & 4) != 0) {
            bigDecimal = otcSymbol.floatPercent;
        }
        if ((i12 & 8) != 0) {
            str2 = otcSymbol.legal;
        }
        if ((i12 & 16) != 0) {
            num = otcSymbol.legalPrecision;
        }
        if ((i12 & 32) != 0) {
            bigDecimal2 = otcSymbol.makerFeeRate;
        }
        if ((i12 & 64) != 0) {
            str3 = otcSymbol.name;
        }
        if ((i12 & 128) != 0) {
            bigDecimal3 = otcSymbol.takerFeeRate;
        }
        if ((i12 & 256) != 0) {
            arrayList = otcSymbol.supportPriceTypes;
        }
        BigDecimal bigDecimal4 = bigDecimal3;
        ArrayList arrayList2 = arrayList;
        BigDecimal bigDecimal5 = bigDecimal2;
        String str4 = str3;
        Integer num2 = num;
        BigDecimal bigDecimal6 = bigDecimal;
        return otcSymbol.copy(str, i11, bigDecimal6, str2, num2, bigDecimal5, str4, bigDecimal4, arrayList2);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getCurrencyPrecision() {
        return this.currencyPrecision;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final BigDecimal getFloatPercent() {
        return this.floatPercent;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getLegal() {
        return this.legal;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Integer getLegalPrecision() {
        return this.legalPrecision;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final BigDecimal getMakerFeeRate() {
        return this.makerFeeRate;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @NotNull
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final BigDecimal getTakerFeeRate() {
        return this.takerFeeRate;
    }

    @Nullable
    public final ArrayList<String> component9() {
        return this.supportPriceTypes;
    }

    @NotNull
    public final OtcSymbol copy(@Nullable String currency, int currencyPrecision, @Nullable BigDecimal floatPercent, @Nullable String legal, @Nullable Integer legalPrecision, @Nullable BigDecimal makerFeeRate, @Nullable String name, @NotNull BigDecimal takerFeeRate, @Nullable ArrayList<String> supportPriceTypes) {
        Intrinsics.checkNotNullParameter(takerFeeRate, "takerFeeRate");
        return new OtcSymbol(currency, currencyPrecision, floatPercent, legal, legalPrecision, makerFeeRate, name, takerFeeRate, supportPriceTypes);
    }

    @Nullable
    public final String getCurrency() {
        return this.currency;
    }

    public final int getCurrencyPrecision() {
        return this.currencyPrecision;
    }

    @Nullable
    public final BigDecimal getFloatPercent() {
        return this.floatPercent;
    }

    @Nullable
    public final String getLegal() {
        return this.legal;
    }

    @Nullable
    public final Integer getLegalPrecision() {
        return this.legalPrecision;
    }

    @Nullable
    public final BigDecimal getMakerFeeRate() {
        return this.makerFeeRate;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    @Nullable
    public final ArrayList<String> getSupportPriceTypes() {
        return this.supportPriceTypes;
    }

    @NotNull
    public final BigDecimal getTakerFeeRate() {
        return this.takerFeeRate;
    }

    public int hashCode() {
        String str = this.currency;
        int iHashCode = (((str == null ? 0 : str.hashCode()) * 31) + Integer.hashCode(this.currencyPrecision)) * 31;
        BigDecimal bigDecimal = this.floatPercent;
        int iHashCode2 = (iHashCode + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        String str2 = this.legal;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.legalPrecision;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        BigDecimal bigDecimal2 = this.makerFeeRate;
        int iHashCode5 = (iHashCode4 + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31;
        String str3 = this.name;
        int iHashCode6 = (((iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.takerFeeRate.hashCode()) * 31;
        ArrayList<String> arrayList = this.supportPriceTypes;
        return iHashCode6 + (arrayList != null ? arrayList.hashCode() : 0);
    }

    @NotNull
    public final String priceTypeStr(@NotNull String type) {
        Intrinsics.checkNotNullParameter(type, "type");
        int iHashCode = type.hashCode();
        if (iHashCode == 78590) {
            return !type.equals(TYPE_OTC) ? "" : C27017c.f54310a.m66516f(R$string.price_third, new Object[0]);
        }
        if (iHashCode != 66988604) {
            return (iHashCode == 1804446588 && type.equals("REGULAR")) ? C27017c.f54310a.m66516f(R$string.price_fixed, new Object[0]) : "";
        }
        return !type.equals("FLOAT") ? "" : C27017c.f54310a.m66516f(R$string.price_float, new Object[0]);
    }

    @NotNull
    public String toString() {
        return "OtcSymbol(currency=" + this.currency + ", currencyPrecision=" + this.currencyPrecision + ", floatPercent=" + this.floatPercent + ", legal=" + this.legal + ", legalPrecision=" + this.legalPrecision + ", makerFeeRate=" + this.makerFeeRate + ", name=" + this.name + ", takerFeeRate=" + this.takerFeeRate + ", supportPriceTypes=" + this.supportPriceTypes + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        int iIntValue;
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.currency);
        dest.writeInt(this.currencyPrecision);
        dest.writeSerializable(this.floatPercent);
        dest.writeString(this.legal);
        Integer num = this.legalPrecision;
        if (num == null) {
            iIntValue = 0;
        } else {
            dest.writeInt(1);
            iIntValue = num.intValue();
        }
        dest.writeInt(iIntValue);
        dest.writeSerializable(this.makerFeeRate);
        dest.writeString(this.name);
        dest.writeSerializable(this.takerFeeRate);
        dest.writeStringList(this.supportPriceTypes);
    }
}
