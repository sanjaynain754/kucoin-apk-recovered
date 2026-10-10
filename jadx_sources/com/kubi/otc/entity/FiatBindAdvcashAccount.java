package com.kubi.otc.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.google.firebase.analytics.FirebaseAnalytics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: FiatBean.kt */
/* JADX INFO: loaded from: classes33.dex */
@Keep
@Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J9\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\u0017\u001a\u00020\u0018J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÖ\u0003J\t\u0010\u001d\u001a\u00020\u0018HÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u0018R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\n\"\u0004\b\u000e\u0010\fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\nR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\n\"\u0004\b\u0011\u0010\f¨\u0006$"}, m90084d2 = {"Lcom/kubi/otc/entity/FiatBindAdvcashAccount;", "Landroid/os/Parcelable;", "channelId", "", FirebaseAnalytics.Param.CURRENCY, "payeeEmail", "discription", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getChannelId", "()Ljava/lang/String;", "setChannelId", "(Ljava/lang/String;)V", "getCurrency", "setCurrency", "getPayeeEmail", "getDiscription", "setDiscription", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class FiatBindAdvcashAccount implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<FiatBindAdvcashAccount> CREATOR = new Creator();

    @Nullable
    private String channelId;

    @Nullable
    private String currency;

    @Nullable
    private String discription;

    @Nullable
    private final String payeeEmail;

    /* JADX INFO: compiled from: FiatBean.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Creator implements Parcelable.Creator<FiatBindAdvcashAccount> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FiatBindAdvcashAccount createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new FiatBindAdvcashAccount(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FiatBindAdvcashAccount[] newArray(int i11) {
            return new FiatBindAdvcashAccount[i11];
        }
    }

    public FiatBindAdvcashAccount(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
        this.channelId = str;
        this.currency = str2;
        this.payeeEmail = str3;
        this.discription = str4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FiatBindAdvcashAccount)) {
            return false;
        }
        FiatBindAdvcashAccount fiatBindAdvcashAccount = (FiatBindAdvcashAccount) other;
        return Intrinsics.areEqual(this.channelId, fiatBindAdvcashAccount.channelId) && Intrinsics.areEqual(this.currency, fiatBindAdvcashAccount.currency) && Intrinsics.areEqual(this.payeeEmail, fiatBindAdvcashAccount.payeeEmail) && Intrinsics.areEqual(this.discription, fiatBindAdvcashAccount.discription);
    }

    public static /* synthetic */ FiatBindAdvcashAccount copy$default(FiatBindAdvcashAccount fiatBindAdvcashAccount, String str, String str2, String str3, String str4, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = fiatBindAdvcashAccount.channelId;
        }
        if ((i11 & 2) != 0) {
            str2 = fiatBindAdvcashAccount.currency;
        }
        if ((i11 & 4) != 0) {
            str3 = fiatBindAdvcashAccount.payeeEmail;
        }
        if ((i11 & 8) != 0) {
            str4 = fiatBindAdvcashAccount.discription;
        }
        return fiatBindAdvcashAccount.copy(str, str2, str3, str4);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getChannelId() {
        return this.channelId;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getPayeeEmail() {
        return this.payeeEmail;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getDiscription() {
        return this.discription;
    }

    @NotNull
    public final FiatBindAdvcashAccount copy(@Nullable String channelId, @Nullable String currency, @Nullable String payeeEmail, @Nullable String discription) {
        return new FiatBindAdvcashAccount(channelId, currency, payeeEmail, discription);
    }

    @Nullable
    public final String getChannelId() {
        return this.channelId;
    }

    @Nullable
    public final String getCurrency() {
        return this.currency;
    }

    @Nullable
    public final String getDiscription() {
        return this.discription;
    }

    @Nullable
    public final String getPayeeEmail() {
        return this.payeeEmail;
    }

    public int hashCode() {
        String str = this.channelId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.currency;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.payeeEmail;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.discription;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public final void setChannelId(@Nullable String str) {
        this.channelId = str;
    }

    public final void setCurrency(@Nullable String str) {
        this.currency = str;
    }

    public final void setDiscription(@Nullable String str) {
        this.discription = str;
    }

    @NotNull
    public String toString() {
        return "FiatBindAdvcashAccount(channelId=" + this.channelId + ", currency=" + this.currency + ", payeeEmail=" + this.payeeEmail + ", discription=" + this.discription + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.channelId);
        dest.writeString(this.currency);
        dest.writeString(this.payeeEmail);
        dest.writeString(this.discription);
    }

    public /* synthetic */ FiatBindAdvcashAccount(String str, String str2, String str3, String str4, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? "" : str, (i11 & 2) != 0 ? "" : str2, str3, str4);
    }
}
