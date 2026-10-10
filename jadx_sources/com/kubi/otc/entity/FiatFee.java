package com.kubi.otc.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.kubi.utils.extensions.C27041f;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: FiatBean.kt */
/* JADX INFO: loaded from: classes33.dex */
@Keep
@Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \"2\u00020\u0001:\u0001\"B/\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J9\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\u0015\u001a\u00020\u0016J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u0016HÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0016R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\nR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\n¨\u0006#"}, m90084d2 = {"Lcom/kubi/otc/entity/FiatFee;", "Landroid/os/Parcelable;", "feeAmount", "", "minFee", "maxFee", "feeMsg", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getFeeAmount", "()Ljava/lang/String;", "setFeeAmount", "(Ljava/lang/String;)V", "getMinFee", "getMaxFee", "getFeeMsg", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "Companion", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class FiatFee implements Parcelable {

    @Nullable
    private String feeAmount;

    @Nullable
    private final String feeMsg;

    @Nullable
    private final String maxFee;

    @Nullable
    private final String minFee;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final Parcelable.Creator<FiatFee> CREATOR = new Creator();

    /* JADX INFO: compiled from: FiatBean.kt */
    @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JF\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\u00062\b\u0010\n\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0006¨\u0006\f"}, m90084d2 = {"Lcom/kubi/otc/entity/FiatFee$Companion;", "", "<init>", "()V", "getParams", "", "", "fiatCurrency", "fiatAmount", "paymentMethodCode", "tradeType", "cardId", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public static /* synthetic */ Map getParams$default(Companion companion, String str, String str2, String str3, String str4, String str5, int i11, Object obj) {
            if ((i11 & 16) != 0) {
                str5 = "";
            }
            return companion.getParams(str, str2, str3, str4, str5);
        }

        @NotNull
        public final Map<String, String> getParams(@Nullable String fiatCurrency, @Nullable String fiatAmount, @Nullable String paymentMethodCode, @Nullable String tradeType, @Nullable String cardId) {
            return MapsKt.mapOf(new Pair("fiatCurrency", C27041f.m66668h(fiatCurrency)), new Pair("fiatAmount", C27041f.m66668h(fiatAmount)), new Pair("paymentMethodCode", C27041f.m66668h(paymentMethodCode)), new Pair("tradeType", C27041f.m66668h(tradeType)), new Pair("cardId", C27041f.m66668h(cardId)));
        }
    }

    /* JADX INFO: compiled from: FiatBean.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Creator implements Parcelable.Creator<FiatFee> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FiatFee createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new FiatFee(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FiatFee[] newArray(int i11) {
            return new FiatFee[i11];
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
        if (!(other instanceof FiatFee)) {
            return false;
        }
        FiatFee fiatFee = (FiatFee) other;
        return Intrinsics.areEqual(this.feeAmount, fiatFee.feeAmount) && Intrinsics.areEqual(this.minFee, fiatFee.minFee) && Intrinsics.areEqual(this.maxFee, fiatFee.maxFee) && Intrinsics.areEqual(this.feeMsg, fiatFee.feeMsg);
    }

    public static /* synthetic */ FiatFee copy$default(FiatFee fiatFee, String str, String str2, String str3, String str4, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = fiatFee.feeAmount;
        }
        if ((i11 & 2) != 0) {
            str2 = fiatFee.minFee;
        }
        if ((i11 & 4) != 0) {
            str3 = fiatFee.maxFee;
        }
        if ((i11 & 8) != 0) {
            str4 = fiatFee.feeMsg;
        }
        return fiatFee.copy(str, str2, str3, str4);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getFeeAmount() {
        return this.feeAmount;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getMinFee() {
        return this.minFee;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getMaxFee() {
        return this.maxFee;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getFeeMsg() {
        return this.feeMsg;
    }

    @NotNull
    public final FiatFee copy(@Nullable String feeAmount, @Nullable String minFee, @Nullable String maxFee, @Nullable String feeMsg) {
        return new FiatFee(feeAmount, minFee, maxFee, feeMsg);
    }

    @Nullable
    public final String getFeeAmount() {
        return this.feeAmount;
    }

    @Nullable
    public final String getFeeMsg() {
        return this.feeMsg;
    }

    @Nullable
    public final String getMaxFee() {
        return this.maxFee;
    }

    @Nullable
    public final String getMinFee() {
        return this.minFee;
    }

    public int hashCode() {
        String str = this.feeAmount;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.minFee;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.maxFee;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.feeMsg;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public final void setFeeAmount(@Nullable String str) {
        this.feeAmount = str;
    }

    @NotNull
    public String toString() {
        return "FiatFee(feeAmount=" + this.feeAmount + ", minFee=" + this.minFee + ", maxFee=" + this.maxFee + ", feeMsg=" + this.feeMsg + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.feeAmount);
        dest.writeString(this.minFee);
        dest.writeString(this.maxFee);
        dest.writeString(this.feeMsg);
    }

    public FiatFee(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
        this.feeAmount = str;
        this.minFee = str2;
        this.maxFee = str3;
        this.feeMsg = str4;
    }
}
