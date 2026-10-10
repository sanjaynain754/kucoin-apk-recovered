package com.kubi.user.site.config;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: UserCenterSiteConfig.kt */
/* JADX INFO: loaded from: classes23.dex */
@Keep
@Metadata(m90083d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u0019\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0006\u0010\t\u001a\u00020\nJ\u0011\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u001b\u0010\f\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\r\u001a\u00020\u000eJ\u0013\u0010\u000f\u001a\u00020\n2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u000eHÖ\u0001J\t\u0010\u0013\u001a\u00020\u0004HÖ\u0001J\u0016\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u000eR\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u001a"}, m90084d2 = {"Lcom/kubi/user/site/config/LoginConfig;", "Landroid/os/Parcelable;", "loginAccountTypes", "", "", "<init>", "(Ljava/util/List;)V", "getLoginAccountTypes", "()Ljava/util/List;", "isLoginConfigAvailable", "", "component1", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "Companion", "UserCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class LoginConfig implements Parcelable {

    @NotNull
    public static final String EXT_LOGIN = "extlogin";

    @NotNull
    public static final String PASSKEY = "passkey";

    @Nullable
    private final List<String> loginAccountTypes;

    @NotNull
    public static final Parcelable.Creator<LoginConfig> CREATOR = new C26797a();

    /* JADX INFO: renamed from: com.kubi.user.site.config.LoginConfig$a */
    /* JADX INFO: compiled from: UserCenterSiteConfig.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C26797a implements Parcelable.Creator<LoginConfig> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final LoginConfig[] newArray(int i11) {
            return new LoginConfig[i11];
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final LoginConfig createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new LoginConfig(parcel.createStringArrayList());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public LoginConfig() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof LoginConfig) && Intrinsics.areEqual(this.loginAccountTypes, ((LoginConfig) other).loginAccountTypes);
    }

    public LoginConfig(@Nullable List<String> list) {
        this.loginAccountTypes = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LoginConfig copy$default(LoginConfig loginConfig, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = loginConfig.loginAccountTypes;
        }
        return loginConfig.copy(list);
    }

    @Nullable
    public final List<String> component1() {
        return this.loginAccountTypes;
    }

    @NotNull
    public final LoginConfig copy(@Nullable List<String> loginAccountTypes) {
        return new LoginConfig(loginAccountTypes);
    }

    @Nullable
    public final List<String> getLoginAccountTypes() {
        return this.loginAccountTypes;
    }

    public int hashCode() {
        List<String> list = this.loginAccountTypes;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final boolean isLoginConfigAvailable() {
        return this.loginAccountTypes != null;
    }

    @NotNull
    public String toString() {
        return "LoginConfig(loginAccountTypes=" + this.loginAccountTypes + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeStringList(this.loginAccountTypes);
    }

    public /* synthetic */ LoginConfig(List list, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : list);
    }
}
