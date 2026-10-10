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
@Metadata(m90083d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b%\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u007f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0006\u0010\u001b\u001a\u00020\u0003J\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0010J\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0010J\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0010J\u0010\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0010J\u0010\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0010J\u0010\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0010J\u0010\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0010J\u0010\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0010J\u0010\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0010J\u0010\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0010J\u0086\u0001\u0010&\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010'J\u0006\u0010(\u001a\u00020)J\u0013\u0010*\u001a\u00020\u00032\b\u0010+\u001a\u0004\u0018\u00010,HÖ\u0003J\t\u0010-\u001a\u00020)HÖ\u0001J\t\u0010.\u001a\u00020/HÖ\u0001J\u0016\u00100\u001a\u0002012\u0006\u00102\u001a\u0002032\u0006\u00104\u001a\u00020)R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u0012\u0010\u0010R\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u0013\u0010\u0010R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u0014\u0010\u0010R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u0015\u0010\u0010R\u0015\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u0016\u0010\u0010R\u0015\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u0017\u0010\u0010R\u0015\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u0018\u0010\u0010R\u0015\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u0019\u0010\u0010R\u0015\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u001a\u0010\u0010¨\u00065"}, m90084d2 = {"Lcom/kubi/user/site/config/SecurityConfig;", "Landroid/os/Parcelable;", "loginPwdOpt", "", "withdrawPwdOpt", "phoneBindOpt", "emailBindOpt", "extAccountBindOpt", "google2faOpt", "antiPhishingCodeOpt", "biometricsOpt", "passkeyOpt", "appFreezeAccountOpt", "<init>", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "getLoginPwdOpt", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getWithdrawPwdOpt", "getPhoneBindOpt", "getEmailBindOpt", "getExtAccountBindOpt", "getGoogle2faOpt", "getAntiPhishingCodeOpt", "getBiometricsOpt", "getPasskeyOpt", "getAppFreezeAccountOpt", "isSecurityConfigAvailable", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/kubi/user/site/config/SecurityConfig;", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "UserCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class SecurityConfig implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<SecurityConfig> CREATOR = new C26801a();

    @Nullable
    private final Boolean antiPhishingCodeOpt;

    @Nullable
    private final Boolean appFreezeAccountOpt;

    @Nullable
    private final Boolean biometricsOpt;

    @Nullable
    private final Boolean emailBindOpt;

    @Nullable
    private final Boolean extAccountBindOpt;

    @Nullable
    private final Boolean google2faOpt;

    @Nullable
    private final Boolean loginPwdOpt;

    @Nullable
    private final Boolean passkeyOpt;

    @Nullable
    private final Boolean phoneBindOpt;

    @Nullable
    private final Boolean withdrawPwdOpt;

    /* JADX INFO: renamed from: com.kubi.user.site.config.SecurityConfig$a */
    /* JADX INFO: compiled from: UserCenterSiteConfig.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C26801a implements Parcelable.Creator<SecurityConfig> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final SecurityConfig[] newArray(int i11) {
            return new SecurityConfig[i11];
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final SecurityConfig createFromParcel(Parcel parcel) {
            boolean z11;
            Boolean boolValueOf;
            boolean z12;
            Boolean boolValueOf2;
            boolean z13;
            Boolean boolValueOf3;
            boolean z14;
            Boolean boolValueOf4;
            boolean z15;
            Boolean boolValueOf5;
            boolean z16;
            Boolean boolValueOf6;
            boolean z17;
            Boolean boolValueOf7;
            boolean z18;
            Boolean boolValueOf8;
            boolean z19;
            Boolean boolValueOf9;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            boolean z21 = false;
            Boolean boolValueOf10 = null;
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
            if (parcel.readInt() == 0) {
                boolValueOf2 = null;
            } else {
                if (parcel.readInt() != 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                boolValueOf2 = Boolean.valueOf(z12);
            }
            if (parcel.readInt() == 0) {
                boolValueOf3 = null;
            } else {
                if (parcel.readInt() != 0) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                boolValueOf3 = Boolean.valueOf(z13);
            }
            if (parcel.readInt() == 0) {
                boolValueOf4 = null;
            } else {
                if (parcel.readInt() != 0) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                boolValueOf4 = Boolean.valueOf(z14);
            }
            if (parcel.readInt() == 0) {
                boolValueOf5 = null;
            } else {
                if (parcel.readInt() != 0) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                boolValueOf5 = Boolean.valueOf(z15);
            }
            if (parcel.readInt() == 0) {
                boolValueOf6 = null;
            } else {
                if (parcel.readInt() != 0) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                boolValueOf6 = Boolean.valueOf(z16);
            }
            if (parcel.readInt() == 0) {
                boolValueOf7 = null;
            } else {
                if (parcel.readInt() != 0) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                boolValueOf7 = Boolean.valueOf(z17);
            }
            if (parcel.readInt() == 0) {
                boolValueOf8 = null;
            } else {
                if (parcel.readInt() != 0) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                boolValueOf8 = Boolean.valueOf(z18);
            }
            if (parcel.readInt() == 0) {
                boolValueOf9 = null;
            } else {
                if (parcel.readInt() != 0) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                boolValueOf9 = Boolean.valueOf(z19);
            }
            if (parcel.readInt() != 0) {
                if (parcel.readInt() != 0) {
                    z21 = true;
                }
                boolValueOf10 = Boolean.valueOf(z21);
            }
            return new SecurityConfig(boolValueOf, boolValueOf2, boolValueOf3, boolValueOf4, boolValueOf5, boolValueOf6, boolValueOf7, boolValueOf8, boolValueOf9, boolValueOf10);
        }
    }

    public SecurityConfig() {
        this(null, null, null, null, null, null, null, null, null, null, 1023, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SecurityConfig)) {
            return false;
        }
        SecurityConfig securityConfig = (SecurityConfig) other;
        return Intrinsics.areEqual(this.loginPwdOpt, securityConfig.loginPwdOpt) && Intrinsics.areEqual(this.withdrawPwdOpt, securityConfig.withdrawPwdOpt) && Intrinsics.areEqual(this.phoneBindOpt, securityConfig.phoneBindOpt) && Intrinsics.areEqual(this.emailBindOpt, securityConfig.emailBindOpt) && Intrinsics.areEqual(this.extAccountBindOpt, securityConfig.extAccountBindOpt) && Intrinsics.areEqual(this.google2faOpt, securityConfig.google2faOpt) && Intrinsics.areEqual(this.antiPhishingCodeOpt, securityConfig.antiPhishingCodeOpt) && Intrinsics.areEqual(this.biometricsOpt, securityConfig.biometricsOpt) && Intrinsics.areEqual(this.passkeyOpt, securityConfig.passkeyOpt) && Intrinsics.areEqual(this.appFreezeAccountOpt, securityConfig.appFreezeAccountOpt);
    }

    public SecurityConfig(@Nullable Boolean bool, @Nullable Boolean bool2, @Nullable Boolean bool3, @Nullable Boolean bool4, @Nullable Boolean bool5, @Nullable Boolean bool6, @Nullable Boolean bool7, @Nullable Boolean bool8, @Nullable Boolean bool9, @Nullable Boolean bool10) {
        this.loginPwdOpt = bool;
        this.withdrawPwdOpt = bool2;
        this.phoneBindOpt = bool3;
        this.emailBindOpt = bool4;
        this.extAccountBindOpt = bool5;
        this.google2faOpt = bool6;
        this.antiPhishingCodeOpt = bool7;
        this.biometricsOpt = bool8;
        this.passkeyOpt = bool9;
        this.appFreezeAccountOpt = bool10;
    }

    public static /* synthetic */ SecurityConfig copy$default(SecurityConfig securityConfig, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, Boolean bool8, Boolean bool9, Boolean bool10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            bool = securityConfig.loginPwdOpt;
        }
        if ((i11 & 2) != 0) {
            bool2 = securityConfig.withdrawPwdOpt;
        }
        if ((i11 & 4) != 0) {
            bool3 = securityConfig.phoneBindOpt;
        }
        if ((i11 & 8) != 0) {
            bool4 = securityConfig.emailBindOpt;
        }
        if ((i11 & 16) != 0) {
            bool5 = securityConfig.extAccountBindOpt;
        }
        if ((i11 & 32) != 0) {
            bool6 = securityConfig.google2faOpt;
        }
        if ((i11 & 64) != 0) {
            bool7 = securityConfig.antiPhishingCodeOpt;
        }
        if ((i11 & 128) != 0) {
            bool8 = securityConfig.biometricsOpt;
        }
        if ((i11 & 256) != 0) {
            bool9 = securityConfig.passkeyOpt;
        }
        if ((i11 & 512) != 0) {
            bool10 = securityConfig.appFreezeAccountOpt;
        }
        Boolean bool11 = bool9;
        Boolean bool12 = bool10;
        Boolean bool13 = bool7;
        Boolean bool14 = bool8;
        Boolean bool15 = bool5;
        Boolean bool16 = bool6;
        return securityConfig.copy(bool, bool2, bool3, bool4, bool15, bool16, bool13, bool14, bool11, bool12);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Boolean getLoginPwdOpt() {
        return this.loginPwdOpt;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final Boolean getAppFreezeAccountOpt() {
        return this.appFreezeAccountOpt;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Boolean getWithdrawPwdOpt() {
        return this.withdrawPwdOpt;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Boolean getPhoneBindOpt() {
        return this.phoneBindOpt;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Boolean getEmailBindOpt() {
        return this.emailBindOpt;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Boolean getExtAccountBindOpt() {
        return this.extAccountBindOpt;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Boolean getGoogle2faOpt() {
        return this.google2faOpt;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Boolean getAntiPhishingCodeOpt() {
        return this.antiPhishingCodeOpt;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Boolean getBiometricsOpt() {
        return this.biometricsOpt;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final Boolean getPasskeyOpt() {
        return this.passkeyOpt;
    }

    @NotNull
    public final SecurityConfig copy(@Nullable Boolean loginPwdOpt, @Nullable Boolean withdrawPwdOpt, @Nullable Boolean phoneBindOpt, @Nullable Boolean emailBindOpt, @Nullable Boolean extAccountBindOpt, @Nullable Boolean google2faOpt, @Nullable Boolean antiPhishingCodeOpt, @Nullable Boolean biometricsOpt, @Nullable Boolean passkeyOpt, @Nullable Boolean appFreezeAccountOpt) {
        return new SecurityConfig(loginPwdOpt, withdrawPwdOpt, phoneBindOpt, emailBindOpt, extAccountBindOpt, google2faOpt, antiPhishingCodeOpt, biometricsOpt, passkeyOpt, appFreezeAccountOpt);
    }

    @Nullable
    public final Boolean getAntiPhishingCodeOpt() {
        return this.antiPhishingCodeOpt;
    }

    @Nullable
    public final Boolean getAppFreezeAccountOpt() {
        return this.appFreezeAccountOpt;
    }

    @Nullable
    public final Boolean getBiometricsOpt() {
        return this.biometricsOpt;
    }

    @Nullable
    public final Boolean getEmailBindOpt() {
        return this.emailBindOpt;
    }

    @Nullable
    public final Boolean getExtAccountBindOpt() {
        return this.extAccountBindOpt;
    }

    @Nullable
    public final Boolean getGoogle2faOpt() {
        return this.google2faOpt;
    }

    @Nullable
    public final Boolean getLoginPwdOpt() {
        return this.loginPwdOpt;
    }

    @Nullable
    public final Boolean getPasskeyOpt() {
        return this.passkeyOpt;
    }

    @Nullable
    public final Boolean getPhoneBindOpt() {
        return this.phoneBindOpt;
    }

    @Nullable
    public final Boolean getWithdrawPwdOpt() {
        return this.withdrawPwdOpt;
    }

    public int hashCode() {
        Boolean bool = this.loginPwdOpt;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.withdrawPwdOpt;
        int iHashCode2 = (iHashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.phoneBindOpt;
        int iHashCode3 = (iHashCode2 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.emailBindOpt;
        int iHashCode4 = (iHashCode3 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.extAccountBindOpt;
        int iHashCode5 = (iHashCode4 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        Boolean bool6 = this.google2faOpt;
        int iHashCode6 = (iHashCode5 + (bool6 == null ? 0 : bool6.hashCode())) * 31;
        Boolean bool7 = this.antiPhishingCodeOpt;
        int iHashCode7 = (iHashCode6 + (bool7 == null ? 0 : bool7.hashCode())) * 31;
        Boolean bool8 = this.biometricsOpt;
        int iHashCode8 = (iHashCode7 + (bool8 == null ? 0 : bool8.hashCode())) * 31;
        Boolean bool9 = this.passkeyOpt;
        int iHashCode9 = (iHashCode8 + (bool9 == null ? 0 : bool9.hashCode())) * 31;
        Boolean bool10 = this.appFreezeAccountOpt;
        return iHashCode9 + (bool10 != null ? bool10.hashCode() : 0);
    }

    public final boolean isSecurityConfigAvailable() {
        return (this.loginPwdOpt == null || this.withdrawPwdOpt == null || this.phoneBindOpt == null || this.emailBindOpt == null || this.extAccountBindOpt == null || this.google2faOpt == null || this.antiPhishingCodeOpt == null || this.biometricsOpt == null || this.passkeyOpt == null || this.appFreezeAccountOpt == null) ? false : true;
    }

    @NotNull
    public String toString() {
        return "SecurityConfig(loginPwdOpt=" + this.loginPwdOpt + ", withdrawPwdOpt=" + this.withdrawPwdOpt + ", phoneBindOpt=" + this.phoneBindOpt + ", emailBindOpt=" + this.emailBindOpt + ", extAccountBindOpt=" + this.extAccountBindOpt + ", google2faOpt=" + this.google2faOpt + ", antiPhishingCodeOpt=" + this.antiPhishingCodeOpt + ", biometricsOpt=" + this.biometricsOpt + ", passkeyOpt=" + this.passkeyOpt + ", appFreezeAccountOpt=" + this.appFreezeAccountOpt + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Boolean bool = this.loginPwdOpt;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool.booleanValue() ? 1 : 0);
        }
        Boolean bool2 = this.withdrawPwdOpt;
        if (bool2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool2.booleanValue() ? 1 : 0);
        }
        Boolean bool3 = this.phoneBindOpt;
        if (bool3 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool3.booleanValue() ? 1 : 0);
        }
        Boolean bool4 = this.emailBindOpt;
        if (bool4 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool4.booleanValue() ? 1 : 0);
        }
        Boolean bool5 = this.extAccountBindOpt;
        if (bool5 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool5.booleanValue() ? 1 : 0);
        }
        Boolean bool6 = this.google2faOpt;
        if (bool6 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool6.booleanValue() ? 1 : 0);
        }
        Boolean bool7 = this.antiPhishingCodeOpt;
        if (bool7 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool7.booleanValue() ? 1 : 0);
        }
        Boolean bool8 = this.biometricsOpt;
        if (bool8 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool8.booleanValue() ? 1 : 0);
        }
        Boolean bool9 = this.passkeyOpt;
        if (bool9 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool9.booleanValue() ? 1 : 0);
        }
        Boolean bool10 = this.appFreezeAccountOpt;
        if (bool10 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool10.booleanValue() ? 1 : 0);
        }
    }

    public /* synthetic */ SecurityConfig(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, Boolean bool8, Boolean bool9, Boolean bool10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : bool, (i11 & 2) != 0 ? null : bool2, (i11 & 4) != 0 ? null : bool3, (i11 & 8) != 0 ? null : bool4, (i11 & 16) != 0 ? null : bool5, (i11 & 32) != 0 ? null : bool6, (i11 & 64) != 0 ? null : bool7, (i11 & 128) != 0 ? null : bool8, (i11 & 256) != 0 ? null : bool9, (i11 & 512) != 0 ? null : bool10);
    }
}
