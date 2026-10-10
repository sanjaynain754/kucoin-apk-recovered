package com.kubi.user.site.config;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: UserCenterSiteConfig.kt */
/* JADX INFO: loaded from: classes23.dex */
@Keep
@Metadata(m90083d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BO\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\rHÆ\u0003JQ\u0010\"\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\rHÆ\u0001J\u0006\u0010#\u001a\u00020$J\u0013\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010(HÖ\u0003J\t\u0010)\u001a\u00020$HÖ\u0001J\t\u0010*\u001a\u00020+HÖ\u0001J\u0016\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u00020$R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b¨\u00061"}, m90084d2 = {"Lcom/kubi/user/site/config/UserCenterSiteConfig;", "Landroid/os/Parcelable;", "accountConfig", "Lcom/kubi/user/site/config/AccountConfig;", "registerConfig", "Lcom/kubi/user/site/config/RegisterConfig;", "loginConfig", "Lcom/kubi/user/site/config/LoginConfig;", "securityConfig", "Lcom/kubi/user/site/config/SecurityConfig;", "termConfig", "Lcom/kubi/user/site/config/TermConfig;", "myConfig", "Lcom/kubi/user/site/config/MyConfig;", "<init>", "(Lcom/kubi/user/site/config/AccountConfig;Lcom/kubi/user/site/config/RegisterConfig;Lcom/kubi/user/site/config/LoginConfig;Lcom/kubi/user/site/config/SecurityConfig;Lcom/kubi/user/site/config/TermConfig;Lcom/kubi/user/site/config/MyConfig;)V", "getAccountConfig", "()Lcom/kubi/user/site/config/AccountConfig;", "getRegisterConfig", "()Lcom/kubi/user/site/config/RegisterConfig;", "getLoginConfig", "()Lcom/kubi/user/site/config/LoginConfig;", "getSecurityConfig", "()Lcom/kubi/user/site/config/SecurityConfig;", "getTermConfig", "()Lcom/kubi/user/site/config/TermConfig;", "getMyConfig", "()Lcom/kubi/user/site/config/MyConfig;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "UserCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class UserCenterSiteConfig implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<UserCenterSiteConfig> CREATOR = new C26804a();

    @Nullable
    private final AccountConfig accountConfig;

    @Nullable
    private final LoginConfig loginConfig;

    @Nullable
    private final MyConfig myConfig;

    @Nullable
    private final RegisterConfig registerConfig;

    @Nullable
    private final SecurityConfig securityConfig;

    @Nullable
    private final TermConfig termConfig;

    /* JADX INFO: renamed from: com.kubi.user.site.config.UserCenterSiteConfig$a */
    /* JADX INFO: compiled from: UserCenterSiteConfig.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C26804a implements Parcelable.Creator<UserCenterSiteConfig> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final UserCenterSiteConfig[] newArray(int i11) {
            return new UserCenterSiteConfig[i11];
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final UserCenterSiteConfig createFromParcel(Parcel parcel) {
            AccountConfig accountConfigCreateFromParcel;
            RegisterConfig registerConfigCreateFromParcel;
            LoginConfig loginConfigCreateFromParcel;
            SecurityConfig securityConfigCreateFromParcel;
            TermConfig termConfigCreateFromParcel;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            MyConfig myConfigCreateFromParcel = null;
            if (parcel.readInt() == 0) {
                accountConfigCreateFromParcel = null;
            } else {
                accountConfigCreateFromParcel = AccountConfig.CREATOR.createFromParcel(parcel);
            }
            AccountConfig accountConfig = accountConfigCreateFromParcel;
            if (parcel.readInt() == 0) {
                registerConfigCreateFromParcel = null;
            } else {
                registerConfigCreateFromParcel = RegisterConfig.CREATOR.createFromParcel(parcel);
            }
            RegisterConfig registerConfig = registerConfigCreateFromParcel;
            if (parcel.readInt() == 0) {
                loginConfigCreateFromParcel = null;
            } else {
                loginConfigCreateFromParcel = LoginConfig.CREATOR.createFromParcel(parcel);
            }
            LoginConfig loginConfig = loginConfigCreateFromParcel;
            if (parcel.readInt() == 0) {
                securityConfigCreateFromParcel = null;
            } else {
                securityConfigCreateFromParcel = SecurityConfig.CREATOR.createFromParcel(parcel);
            }
            SecurityConfig securityConfig = securityConfigCreateFromParcel;
            if (parcel.readInt() == 0) {
                termConfigCreateFromParcel = null;
            } else {
                termConfigCreateFromParcel = TermConfig.CREATOR.createFromParcel(parcel);
            }
            TermConfig termConfig = termConfigCreateFromParcel;
            if (parcel.readInt() != 0) {
                myConfigCreateFromParcel = MyConfig.CREATOR.createFromParcel(parcel);
            }
            return new UserCenterSiteConfig(accountConfig, registerConfig, loginConfig, securityConfig, termConfig, myConfigCreateFromParcel);
        }
    }

    public UserCenterSiteConfig() {
        this(null, null, null, null, null, null, 63, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UserCenterSiteConfig)) {
            return false;
        }
        UserCenterSiteConfig userCenterSiteConfig = (UserCenterSiteConfig) other;
        return Intrinsics.areEqual(this.accountConfig, userCenterSiteConfig.accountConfig) && Intrinsics.areEqual(this.registerConfig, userCenterSiteConfig.registerConfig) && Intrinsics.areEqual(this.loginConfig, userCenterSiteConfig.loginConfig) && Intrinsics.areEqual(this.securityConfig, userCenterSiteConfig.securityConfig) && Intrinsics.areEqual(this.termConfig, userCenterSiteConfig.termConfig) && Intrinsics.areEqual(this.myConfig, userCenterSiteConfig.myConfig);
    }

    public UserCenterSiteConfig(@Nullable AccountConfig accountConfig, @Nullable RegisterConfig registerConfig, @Nullable LoginConfig loginConfig, @Nullable SecurityConfig securityConfig, @Nullable TermConfig termConfig, @Nullable MyConfig myConfig) {
        this.accountConfig = accountConfig;
        this.registerConfig = registerConfig;
        this.loginConfig = loginConfig;
        this.securityConfig = securityConfig;
        this.termConfig = termConfig;
        this.myConfig = myConfig;
    }

    public static /* synthetic */ UserCenterSiteConfig copy$default(UserCenterSiteConfig userCenterSiteConfig, AccountConfig accountConfig, RegisterConfig registerConfig, LoginConfig loginConfig, SecurityConfig securityConfig, TermConfig termConfig, MyConfig myConfig, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            accountConfig = userCenterSiteConfig.accountConfig;
        }
        if ((i11 & 2) != 0) {
            registerConfig = userCenterSiteConfig.registerConfig;
        }
        if ((i11 & 4) != 0) {
            loginConfig = userCenterSiteConfig.loginConfig;
        }
        if ((i11 & 8) != 0) {
            securityConfig = userCenterSiteConfig.securityConfig;
        }
        if ((i11 & 16) != 0) {
            termConfig = userCenterSiteConfig.termConfig;
        }
        if ((i11 & 32) != 0) {
            myConfig = userCenterSiteConfig.myConfig;
        }
        TermConfig termConfig2 = termConfig;
        MyConfig myConfig2 = myConfig;
        return userCenterSiteConfig.copy(accountConfig, registerConfig, loginConfig, securityConfig, termConfig2, myConfig2);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final AccountConfig getAccountConfig() {
        return this.accountConfig;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final RegisterConfig getRegisterConfig() {
        return this.registerConfig;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final LoginConfig getLoginConfig() {
        return this.loginConfig;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final SecurityConfig getSecurityConfig() {
        return this.securityConfig;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final TermConfig getTermConfig() {
        return this.termConfig;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final MyConfig getMyConfig() {
        return this.myConfig;
    }

    @NotNull
    public final UserCenterSiteConfig copy(@Nullable AccountConfig accountConfig, @Nullable RegisterConfig registerConfig, @Nullable LoginConfig loginConfig, @Nullable SecurityConfig securityConfig, @Nullable TermConfig termConfig, @Nullable MyConfig myConfig) {
        return new UserCenterSiteConfig(accountConfig, registerConfig, loginConfig, securityConfig, termConfig, myConfig);
    }

    @Nullable
    public final AccountConfig getAccountConfig() {
        return this.accountConfig;
    }

    @Nullable
    public final LoginConfig getLoginConfig() {
        return this.loginConfig;
    }

    @Nullable
    public final MyConfig getMyConfig() {
        return this.myConfig;
    }

    @Nullable
    public final RegisterConfig getRegisterConfig() {
        return this.registerConfig;
    }

    @Nullable
    public final SecurityConfig getSecurityConfig() {
        return this.securityConfig;
    }

    @Nullable
    public final TermConfig getTermConfig() {
        return this.termConfig;
    }

    public int hashCode() {
        AccountConfig accountConfig = this.accountConfig;
        int iHashCode = (accountConfig == null ? 0 : accountConfig.hashCode()) * 31;
        RegisterConfig registerConfig = this.registerConfig;
        int iHashCode2 = (iHashCode + (registerConfig == null ? 0 : registerConfig.hashCode())) * 31;
        LoginConfig loginConfig = this.loginConfig;
        int iHashCode3 = (iHashCode2 + (loginConfig == null ? 0 : loginConfig.hashCode())) * 31;
        SecurityConfig securityConfig = this.securityConfig;
        int iHashCode4 = (iHashCode3 + (securityConfig == null ? 0 : securityConfig.hashCode())) * 31;
        TermConfig termConfig = this.termConfig;
        int iHashCode5 = (iHashCode4 + (termConfig == null ? 0 : termConfig.hashCode())) * 31;
        MyConfig myConfig = this.myConfig;
        return iHashCode5 + (myConfig != null ? myConfig.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "UserCenterSiteConfig(accountConfig=" + this.accountConfig + ", registerConfig=" + this.registerConfig + ", loginConfig=" + this.loginConfig + ", securityConfig=" + this.securityConfig + ", termConfig=" + this.termConfig + ", myConfig=" + this.myConfig + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        AccountConfig accountConfig = this.accountConfig;
        if (accountConfig == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            accountConfig.writeToParcel(dest, flags);
        }
        RegisterConfig registerConfig = this.registerConfig;
        if (registerConfig == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            registerConfig.writeToParcel(dest, flags);
        }
        LoginConfig loginConfig = this.loginConfig;
        if (loginConfig == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            loginConfig.writeToParcel(dest, flags);
        }
        SecurityConfig securityConfig = this.securityConfig;
        if (securityConfig == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            securityConfig.writeToParcel(dest, flags);
        }
        TermConfig termConfig = this.termConfig;
        if (termConfig == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            termConfig.writeToParcel(dest, flags);
        }
        MyConfig myConfig = this.myConfig;
        if (myConfig == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            myConfig.writeToParcel(dest, flags);
        }
    }

    public /* synthetic */ UserCenterSiteConfig(AccountConfig accountConfig, RegisterConfig registerConfig, LoginConfig loginConfig, SecurityConfig securityConfig, TermConfig termConfig, MyConfig myConfig, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : accountConfig, (i11 & 2) != 0 ? null : registerConfig, (i11 & 4) != 0 ? null : loginConfig, (i11 & 8) != 0 ? null : securityConfig, (i11 & 16) != 0 ? null : termConfig, (i11 & 32) != 0 ? null : myConfig);
    }
}
