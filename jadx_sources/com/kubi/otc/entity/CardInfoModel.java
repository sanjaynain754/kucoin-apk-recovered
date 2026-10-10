package com.kubi.otc.entity;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.kubi.otc.R$string;
import com.kubi.utils.extensions.C27041f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: FastBean.kt */
/* JADX INFO: loaded from: classes33.dex */
@Keep
@Metadata(m90083d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\t\u0010\nJ\u000e\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0014J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003JQ\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\u001c\u001a\u00020\u001dJ\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!HÖ\u0003J\t\u0010\"\u001a\u00020\u001dHÖ\u0001J\t\u0010#\u001a\u00020\u0003HÖ\u0001J\u0016\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020\u001dR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\f¨\u0006)"}, m90084d2 = {"Lcom/kubi/otc/entity/CardInfoModel;", "Landroid/os/Parcelable;", "id", "", "issuingBank", "schemeUrl", "postfix4", "cardToken", "cardFiatCurrency", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getIssuingBank", "getSchemeUrl", "getPostfix4", "getCardToken", "getCardFiatCurrency", "getCardNumStr", "context", "Landroid/content/Context;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class CardInfoModel implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<CardInfoModel> CREATOR = new Creator();

    @SerializedName("cardCurrency")
    @Nullable
    private final String cardFiatCurrency;

    @Nullable
    private final String cardToken;

    @Nullable
    private final String id;

    @Nullable
    private final String issuingBank;

    @Nullable
    private final String postfix4;

    @Nullable
    private final String schemeUrl;

    /* JADX INFO: compiled from: FastBean.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Creator implements Parcelable.Creator<CardInfoModel> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CardInfoModel createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CardInfoModel(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CardInfoModel[] newArray(int i11) {
            return new CardInfoModel[i11];
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
        if (!(other instanceof CardInfoModel)) {
            return false;
        }
        CardInfoModel cardInfoModel = (CardInfoModel) other;
        return Intrinsics.areEqual(this.id, cardInfoModel.id) && Intrinsics.areEqual(this.issuingBank, cardInfoModel.issuingBank) && Intrinsics.areEqual(this.schemeUrl, cardInfoModel.schemeUrl) && Intrinsics.areEqual(this.postfix4, cardInfoModel.postfix4) && Intrinsics.areEqual(this.cardToken, cardInfoModel.cardToken) && Intrinsics.areEqual(this.cardFiatCurrency, cardInfoModel.cardFiatCurrency);
    }

    public static /* synthetic */ CardInfoModel copy$default(CardInfoModel cardInfoModel, String str, String str2, String str3, String str4, String str5, String str6, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = cardInfoModel.id;
        }
        if ((i11 & 2) != 0) {
            str2 = cardInfoModel.issuingBank;
        }
        if ((i11 & 4) != 0) {
            str3 = cardInfoModel.schemeUrl;
        }
        if ((i11 & 8) != 0) {
            str4 = cardInfoModel.postfix4;
        }
        if ((i11 & 16) != 0) {
            str5 = cardInfoModel.cardToken;
        }
        if ((i11 & 32) != 0) {
            str6 = cardInfoModel.cardFiatCurrency;
        }
        String str7 = str5;
        String str8 = str6;
        return cardInfoModel.copy(str, str2, str3, str4, str7, str8);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getIssuingBank() {
        return this.issuingBank;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getSchemeUrl() {
        return this.schemeUrl;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getPostfix4() {
        return this.postfix4;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getCardToken() {
        return this.cardToken;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getCardFiatCurrency() {
        return this.cardFiatCurrency;
    }

    @NotNull
    public final CardInfoModel copy(@Nullable String id2, @Nullable String issuingBank, @Nullable String schemeUrl, @Nullable String postfix4, @Nullable String cardToken, @Nullable String cardFiatCurrency) {
        return new CardInfoModel(id2, issuingBank, schemeUrl, postfix4, cardToken, cardFiatCurrency);
    }

    @Nullable
    public final String getCardFiatCurrency() {
        return this.cardFiatCurrency;
    }

    @NotNull
    public final String getCardNumStr(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        String string = context.getString(R$string.fiat_withdraw_manage_account_end, C27041f.m66669i(this.postfix4, "--"));
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return string;
    }

    @Nullable
    public final String getCardToken() {
        return this.cardToken;
    }

    @Nullable
    public final String getId() {
        return this.id;
    }

    @Nullable
    public final String getIssuingBank() {
        return this.issuingBank;
    }

    @Nullable
    public final String getPostfix4() {
        return this.postfix4;
    }

    @Nullable
    public final String getSchemeUrl() {
        return this.schemeUrl;
    }

    public int hashCode() {
        String str = this.id;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.issuingBank;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.schemeUrl;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.postfix4;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.cardToken;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.cardFiatCurrency;
        return iHashCode5 + (str6 != null ? str6.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "CardInfoModel(id=" + this.id + ", issuingBank=" + this.issuingBank + ", schemeUrl=" + this.schemeUrl + ", postfix4=" + this.postfix4 + ", cardToken=" + this.cardToken + ", cardFiatCurrency=" + this.cardFiatCurrency + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.id);
        dest.writeString(this.issuingBank);
        dest.writeString(this.schemeUrl);
        dest.writeString(this.postfix4);
        dest.writeString(this.cardToken);
        dest.writeString(this.cardFiatCurrency);
    }

    public CardInfoModel(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6) {
        this.id = str;
        this.issuingBank = str2;
        this.schemeUrl = str3;
        this.postfix4 = str4;
        this.cardToken = str5;
        this.cardFiatCurrency = str6;
    }
}
