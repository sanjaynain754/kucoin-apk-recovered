package com.kubi.assets.entity;

import android.os.Parcel;
import android.os.Parcelable;
import cn.jiguang.privates.analysis.constants.JAnalysisConstants;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: WithdrawEntity.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J3\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\u0018\u001a\u00020\u0019J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÖ\u0003J\t\u0010\u001e\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001J\u0016\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u0019R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\n\"\u0004\b\u000e\u0010\fR\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\n\"\u0004\b\u0010\u0010\fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\n\"\u0004\b\u0012\u0010\f¨\u0006%"}, m90084d2 = {"Lcom/kubi/assets/entity/ContactAddrAddChild;", "Landroid/os/Parcelable;", "remark", "", JAnalysisConstants.Account.KEY_ACCOUNT, "type", RemoteConfigConstants.RequestFieldKey.COUNTRY_CODE, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getRemark", "()Ljava/lang/String;", "setRemark", "(Ljava/lang/String;)V", "getAccount", "setAccount", "getType", "setType", "getCountryCode", "setCountryCode", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class ContactAddrAddChild implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<ContactAddrAddChild> CREATOR = new Creator();

    @NotNull
    private String account;

    @Nullable
    private String countryCode;

    @NotNull
    private String remark;

    @NotNull
    private String type;

    /* JADX INFO: compiled from: WithdrawEntity.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Creator implements Parcelable.Creator<ContactAddrAddChild> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ContactAddrAddChild createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ContactAddrAddChild(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ContactAddrAddChild[] newArray(int i11) {
            return new ContactAddrAddChild[i11];
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
        if (!(other instanceof ContactAddrAddChild)) {
            return false;
        }
        ContactAddrAddChild contactAddrAddChild = (ContactAddrAddChild) other;
        return Intrinsics.areEqual(this.remark, contactAddrAddChild.remark) && Intrinsics.areEqual(this.account, contactAddrAddChild.account) && Intrinsics.areEqual(this.type, contactAddrAddChild.type) && Intrinsics.areEqual(this.countryCode, contactAddrAddChild.countryCode);
    }

    public ContactAddrAddChild(@NotNull String remark, @NotNull String account, @NotNull String type, @Nullable String str) {
        Intrinsics.checkNotNullParameter(remark, "remark");
        Intrinsics.checkNotNullParameter(account, "account");
        Intrinsics.checkNotNullParameter(type, "type");
        this.remark = remark;
        this.account = account;
        this.type = type;
        this.countryCode = str;
    }

    public static /* synthetic */ ContactAddrAddChild copy$default(ContactAddrAddChild contactAddrAddChild, String str, String str2, String str3, String str4, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = contactAddrAddChild.remark;
        }
        if ((i11 & 2) != 0) {
            str2 = contactAddrAddChild.account;
        }
        if ((i11 & 4) != 0) {
            str3 = contactAddrAddChild.type;
        }
        if ((i11 & 8) != 0) {
            str4 = contactAddrAddChild.countryCode;
        }
        return contactAddrAddChild.copy(str, str2, str3, str4);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getRemark() {
        return this.remark;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getAccount() {
        return this.account;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getType() {
        return this.type;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getCountryCode() {
        return this.countryCode;
    }

    @NotNull
    public final ContactAddrAddChild copy(@NotNull String remark, @NotNull String account, @NotNull String type, @Nullable String countryCode) {
        Intrinsics.checkNotNullParameter(remark, "remark");
        Intrinsics.checkNotNullParameter(account, "account");
        Intrinsics.checkNotNullParameter(type, "type");
        return new ContactAddrAddChild(remark, account, type, countryCode);
    }

    @NotNull
    public final String getAccount() {
        return this.account;
    }

    @Nullable
    public final String getCountryCode() {
        return this.countryCode;
    }

    @NotNull
    public final String getRemark() {
        return this.remark;
    }

    @NotNull
    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        int iHashCode = ((((this.remark.hashCode() * 31) + this.account.hashCode()) * 31) + this.type.hashCode()) * 31;
        String str = this.countryCode;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final void setAccount(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.account = str;
    }

    public final void setCountryCode(@Nullable String str) {
        this.countryCode = str;
    }

    public final void setRemark(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.remark = str;
    }

    public final void setType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.type = str;
    }

    @NotNull
    public String toString() {
        return "ContactAddrAddChild(remark=" + this.remark + ", account=" + this.account + ", type=" + this.type + ", countryCode=" + this.countryCode + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.remark);
        dest.writeString(this.account);
        dest.writeString(this.type);
        dest.writeString(this.countryCode);
    }
}
