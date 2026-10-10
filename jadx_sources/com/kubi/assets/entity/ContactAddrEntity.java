package com.kubi.assets.entity;

import android.os.Parcel;
import android.os.Parcelable;
import cn.jiguang.privates.analysis.constants.JAnalysisConstants;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: WithdrawEntity.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0016\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\bHÆ\u0003J=\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0006\u0010\u001e\u001a\u00020\u001fJ\u0013\u0010 \u001a\u00020\b2\b\u0010!\u001a\u0004\u0018\u00010\"HÖ\u0003J\t\u0010#\u001a\u00020\u001fHÖ\u0001J\t\u0010$\u001a\u00020\u0003HÖ\u0001J\u0016\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020\u001fR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\f\"\u0004\b\u0010\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\f\"\u0004\b\u0012\u0010\u000eR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\f\"\u0004\b\u0014\u0010\u000eR\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006*"}, m90084d2 = {"Lcom/kubi/assets/entity/ContactAddrEntity;", "Landroid/os/Parcelable;", "remark", "", JAnalysisConstants.Account.KEY_ACCOUNT, "type", RemoteConfigConstants.RequestFieldKey.COUNTRY_CODE, "isClick", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "getRemark", "()Ljava/lang/String;", "setRemark", "(Ljava/lang/String;)V", "getAccount", "setAccount", "getType", "setType", "getCountryCode", "setCountryCode", "()Z", "setClick", "(Z)V", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class ContactAddrEntity implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<ContactAddrEntity> CREATOR = new Creator();

    @NotNull
    private String account;

    @Nullable
    private String countryCode;
    private boolean isClick;

    @NotNull
    private String remark;

    @NotNull
    private String type;

    /* JADX INFO: compiled from: WithdrawEntity.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Creator implements Parcelable.Creator<ContactAddrEntity> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ContactAddrEntity createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ContactAddrEntity(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ContactAddrEntity[] newArray(int i11) {
            return new ContactAddrEntity[i11];
        }
    }

    public ContactAddrEntity() {
        this(null, null, null, null, false, 31, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ContactAddrEntity)) {
            return false;
        }
        ContactAddrEntity contactAddrEntity = (ContactAddrEntity) other;
        return Intrinsics.areEqual(this.remark, contactAddrEntity.remark) && Intrinsics.areEqual(this.account, contactAddrEntity.account) && Intrinsics.areEqual(this.type, contactAddrEntity.type) && Intrinsics.areEqual(this.countryCode, contactAddrEntity.countryCode) && this.isClick == contactAddrEntity.isClick;
    }

    public ContactAddrEntity(@NotNull String remark, @NotNull String account, @NotNull String type, @Nullable String str, boolean z11) {
        Intrinsics.checkNotNullParameter(remark, "remark");
        Intrinsics.checkNotNullParameter(account, "account");
        Intrinsics.checkNotNullParameter(type, "type");
        this.remark = remark;
        this.account = account;
        this.type = type;
        this.countryCode = str;
        this.isClick = z11;
    }

    public static /* synthetic */ ContactAddrEntity copy$default(ContactAddrEntity contactAddrEntity, String str, String str2, String str3, String str4, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = contactAddrEntity.remark;
        }
        if ((i11 & 2) != 0) {
            str2 = contactAddrEntity.account;
        }
        if ((i11 & 4) != 0) {
            str3 = contactAddrEntity.type;
        }
        if ((i11 & 8) != 0) {
            str4 = contactAddrEntity.countryCode;
        }
        if ((i11 & 16) != 0) {
            z11 = contactAddrEntity.isClick;
        }
        boolean z12 = z11;
        String str5 = str3;
        return contactAddrEntity.copy(str, str2, str5, str4, z12);
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

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getIsClick() {
        return this.isClick;
    }

    @NotNull
    public final ContactAddrEntity copy(@NotNull String remark, @NotNull String account, @NotNull String type, @Nullable String countryCode, boolean isClick) {
        Intrinsics.checkNotNullParameter(remark, "remark");
        Intrinsics.checkNotNullParameter(account, "account");
        Intrinsics.checkNotNullParameter(type, "type");
        return new ContactAddrEntity(remark, account, type, countryCode, isClick);
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
        return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Boolean.hashCode(this.isClick);
    }

    public final boolean isClick() {
        return this.isClick;
    }

    public final void setAccount(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.account = str;
    }

    public final void setClick(boolean z11) {
        this.isClick = z11;
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
        return "ContactAddrEntity(remark=" + this.remark + ", account=" + this.account + ", type=" + this.type + ", countryCode=" + this.countryCode + ", isClick=" + this.isClick + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.remark);
        dest.writeString(this.account);
        dest.writeString(this.type);
        dest.writeString(this.countryCode);
        dest.writeInt(this.isClick ? 1 : 0);
    }

    public /* synthetic */ ContactAddrEntity(String str, String str2, String str3, String str4, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? "" : str, (i11 & 2) != 0 ? "" : str2, (i11 & 4) != 0 ? "PHONE" : str3, (i11 & 8) != 0 ? "+1" : str4, (i11 & 16) != 0 ? true : z11);
    }
}
