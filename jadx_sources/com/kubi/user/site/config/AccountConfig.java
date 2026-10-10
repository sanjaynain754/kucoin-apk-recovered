package com.kubi.user.site.config;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: UserCenterSiteConfig.kt */
/* JADX INFO: loaded from: classes23.dex */
@Keep
@Metadata(m90083d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 #2\u00020\u0001:\u0001#B1\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0006\u0010\u0011\u001a\u00020\u0007J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005HÆ\u0003J\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u000fJ8\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u0016J\u0006\u0010\u0017\u001a\u00020\u0018J\u0013\u0010\u0019\u001a\u00020\u00072\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bHÖ\u0003J\t\u0010\u001c\u001a\u00020\u0018HÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u0018R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000f¨\u0006$"}, m90084d2 = {"Lcom/kubi/user/site/config/AccountConfig;", "Landroid/os/Parcelable;", "siteType", "", "supportExtAccounts", "", "supportRCode", "", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/Boolean;)V", "getSiteType", "()Ljava/lang/String;", "getSupportExtAccounts", "()Ljava/util/List;", "getSupportRCode", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "isAccountConfigAvailable", "component1", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/Boolean;)Lcom/kubi/user/site/config/AccountConfig;", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "Companion", "UserCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class AccountConfig implements Parcelable {

    @NotNull
    public static final String TELEGRAM = "telegram";

    @Nullable
    private final String siteType;

    @Nullable
    private final List<String> supportExtAccounts;

    @Nullable
    private final Boolean supportRCode;

    @NotNull
    public static final Parcelable.Creator<AccountConfig> CREATOR = new C26795a();

    /* JADX INFO: renamed from: com.kubi.user.site.config.AccountConfig$a */
    /* JADX INFO: compiled from: UserCenterSiteConfig.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C26795a implements Parcelable.Creator<AccountConfig> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final AccountConfig[] newArray(int i11) {
            return new AccountConfig[i11];
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final AccountConfig createFromParcel(Parcel parcel) {
            boolean z11;
            Boolean boolValueOf;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                if (parcel.readInt() != 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                boolValueOf = Boolean.valueOf(z11);
            }
            return new AccountConfig(string, arrayListCreateStringArrayList, boolValueOf);
        }
    }

    public AccountConfig() {
        this(null, null, null, 7, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AccountConfig)) {
            return false;
        }
        AccountConfig accountConfig = (AccountConfig) other;
        return Intrinsics.areEqual(this.siteType, accountConfig.siteType) && Intrinsics.areEqual(this.supportExtAccounts, accountConfig.supportExtAccounts) && Intrinsics.areEqual(this.supportRCode, accountConfig.supportRCode);
    }

    public AccountConfig(@Nullable String str, @Nullable List<String> list, @Nullable Boolean bool) {
        this.siteType = str;
        this.supportExtAccounts = list;
        this.supportRCode = bool;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AccountConfig copy$default(AccountConfig accountConfig, String str, List list, Boolean bool, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = accountConfig.siteType;
        }
        if ((i11 & 2) != 0) {
            list = accountConfig.supportExtAccounts;
        }
        if ((i11 & 4) != 0) {
            bool = accountConfig.supportRCode;
        }
        return accountConfig.copy(str, list, bool);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getSiteType() {
        return this.siteType;
    }

    @Nullable
    public final List<String> component2() {
        return this.supportExtAccounts;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Boolean getSupportRCode() {
        return this.supportRCode;
    }

    @NotNull
    public final AccountConfig copy(@Nullable String siteType, @Nullable List<String> supportExtAccounts, @Nullable Boolean supportRCode) {
        return new AccountConfig(siteType, supportExtAccounts, supportRCode);
    }

    @Nullable
    public final String getSiteType() {
        return this.siteType;
    }

    @Nullable
    public final List<String> getSupportExtAccounts() {
        return this.supportExtAccounts;
    }

    @Nullable
    public final Boolean getSupportRCode() {
        return this.supportRCode;
    }

    public int hashCode() {
        String str = this.siteType;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<String> list = this.supportExtAccounts;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        Boolean bool = this.supportRCode;
        return iHashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    public final boolean isAccountConfigAvailable() {
        String str = this.siteType;
        return (str == null || str.length() == 0 || this.supportExtAccounts == null || this.supportRCode == null) ? false : true;
    }

    @NotNull
    public String toString() {
        return "AccountConfig(siteType=" + this.siteType + ", supportExtAccounts=" + this.supportExtAccounts + ", supportRCode=" + this.supportRCode + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.siteType);
        dest.writeStringList(this.supportExtAccounts);
        Boolean bool = this.supportRCode;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool.booleanValue() ? 1 : 0);
        }
    }

    public /* synthetic */ AccountConfig(String str, List list, Boolean bool, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : list, (i11 & 4) != 0 ? null : bool);
    }
}
