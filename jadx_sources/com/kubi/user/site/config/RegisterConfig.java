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
@Metadata(m90083d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\t\u001a\u00020\u0003J\u0010\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0007J\u001a\u0010\u000b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\fJ\u0006\u0010\r\u001a\u00020\u000eJ\u0013\u0010\u000f\u001a\u00020\u00032\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u000eHÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\u0016\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u000eR\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u001a"}, m90084d2 = {"Lcom/kubi/user/site/config/RegisterConfig;", "Landroid/os/Parcelable;", "supportRegisterGuide", "", "<init>", "(Ljava/lang/Boolean;)V", "getSupportRegisterGuide", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "isRegisterConfigAvailable", "component1", "copy", "(Ljava/lang/Boolean;)Lcom/kubi/user/site/config/RegisterConfig;", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "UserCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class RegisterConfig implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<RegisterConfig> CREATOR = new C26800a();

    @Nullable
    private final Boolean supportRegisterGuide;

    /* JADX INFO: renamed from: com.kubi.user.site.config.RegisterConfig$a */
    /* JADX INFO: compiled from: UserCenterSiteConfig.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C26800a implements Parcelable.Creator<RegisterConfig> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final RegisterConfig[] newArray(int i11) {
            return new RegisterConfig[i11];
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final RegisterConfig createFromParcel(Parcel parcel) {
            boolean z11;
            Boolean boolValueOf;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
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
            return new RegisterConfig(boolValueOf);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public RegisterConfig() {
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
        return (other instanceof RegisterConfig) && Intrinsics.areEqual(this.supportRegisterGuide, ((RegisterConfig) other).supportRegisterGuide);
    }

    public RegisterConfig(@Nullable Boolean bool) {
        this.supportRegisterGuide = bool;
    }

    public static /* synthetic */ RegisterConfig copy$default(RegisterConfig registerConfig, Boolean bool, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            bool = registerConfig.supportRegisterGuide;
        }
        return registerConfig.copy(bool);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Boolean getSupportRegisterGuide() {
        return this.supportRegisterGuide;
    }

    @NotNull
    public final RegisterConfig copy(@Nullable Boolean supportRegisterGuide) {
        return new RegisterConfig(supportRegisterGuide);
    }

    @Nullable
    public final Boolean getSupportRegisterGuide() {
        return this.supportRegisterGuide;
    }

    public int hashCode() {
        Boolean bool = this.supportRegisterGuide;
        if (bool == null) {
            return 0;
        }
        return bool.hashCode();
    }

    public final boolean isRegisterConfigAvailable() {
        return this.supportRegisterGuide != null;
    }

    @NotNull
    public String toString() {
        return "RegisterConfig(supportRegisterGuide=" + this.supportRegisterGuide + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Boolean bool = this.supportRegisterGuide;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool.booleanValue() ? 1 : 0);
        }
    }

    public /* synthetic */ RegisterConfig(Boolean bool, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : bool);
    }
}
