package com.kubi.otc.entity;

import androidx.annotation.Keep;
import com.tencent.cloud.tuikit.engine.common.internal.TUIConstantDefine;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: OtcBean.kt */
/* JADX INFO: loaded from: classes33.dex */
@Keep
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0016\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\fJ\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\fJ\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0006HÆ\u0003JJ\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010\u0019J\u0013\u0010\u001a\u001a\u00020\u00032\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0006HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000e\u0010\fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010¨\u0006\u001f"}, m90084d2 = {"Lcom/kubi/otc/entity/PayTypeName;", "", "kycPass", "", "kybPass", TUIConstantDefine.USER_NAME, "", "companyName", "defaultName", "<init>", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getKycPass", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getKybPass", "getUserName", "()Ljava/lang/String;", "getCompanyName", "getDefaultName", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/kubi/otc/entity/PayTypeName;", "equals", "other", "hashCode", "", "toString", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class PayTypeName {

    @Nullable
    private final String companyName;

    @Nullable
    private final String defaultName;

    @Nullable
    private final Boolean kybPass;

    @Nullable
    private final Boolean kycPass;

    @Nullable
    private final String userName;

    public PayTypeName(@Nullable Boolean bool, @Nullable Boolean bool2, @Nullable String str, @Nullable String str2, @Nullable String str3) {
        this.kycPass = bool;
        this.kybPass = bool2;
        this.userName = str;
        this.companyName = str2;
        this.defaultName = str3;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PayTypeName)) {
            return false;
        }
        PayTypeName payTypeName = (PayTypeName) other;
        return Intrinsics.areEqual(this.kycPass, payTypeName.kycPass) && Intrinsics.areEqual(this.kybPass, payTypeName.kybPass) && Intrinsics.areEqual(this.userName, payTypeName.userName) && Intrinsics.areEqual(this.companyName, payTypeName.companyName) && Intrinsics.areEqual(this.defaultName, payTypeName.defaultName);
    }

    public static /* synthetic */ PayTypeName copy$default(PayTypeName payTypeName, Boolean bool, Boolean bool2, String str, String str2, String str3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            bool = payTypeName.kycPass;
        }
        if ((i11 & 2) != 0) {
            bool2 = payTypeName.kybPass;
        }
        if ((i11 & 4) != 0) {
            str = payTypeName.userName;
        }
        if ((i11 & 8) != 0) {
            str2 = payTypeName.companyName;
        }
        if ((i11 & 16) != 0) {
            str3 = payTypeName.defaultName;
        }
        String str4 = str3;
        String str5 = str;
        return payTypeName.copy(bool, bool2, str5, str2, str4);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Boolean getKycPass() {
        return this.kycPass;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Boolean getKybPass() {
        return this.kybPass;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getUserName() {
        return this.userName;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getCompanyName() {
        return this.companyName;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getDefaultName() {
        return this.defaultName;
    }

    @NotNull
    public final PayTypeName copy(@Nullable Boolean kycPass, @Nullable Boolean kybPass, @Nullable String userName, @Nullable String companyName, @Nullable String defaultName) {
        return new PayTypeName(kycPass, kybPass, userName, companyName, defaultName);
    }

    @Nullable
    public final String getCompanyName() {
        return this.companyName;
    }

    @Nullable
    public final String getDefaultName() {
        return this.defaultName;
    }

    @Nullable
    public final Boolean getKybPass() {
        return this.kybPass;
    }

    @Nullable
    public final Boolean getKycPass() {
        return this.kycPass;
    }

    @Nullable
    public final String getUserName() {
        return this.userName;
    }

    public int hashCode() {
        Boolean bool = this.kycPass;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.kybPass;
        int iHashCode2 = (iHashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str = this.userName;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.companyName;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.defaultName;
        return iHashCode4 + (str3 != null ? str3.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "PayTypeName(kycPass=" + this.kycPass + ", kybPass=" + this.kybPass + ", userName=" + this.userName + ", companyName=" + this.companyName + ", defaultName=" + this.defaultName + ')';
    }

    public /* synthetic */ PayTypeName(Boolean bool, Boolean bool2, String str, String str2, String str3, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : bool, (i11 & 2) != 0 ? null : bool2, (i11 & 4) != 0 ? null : str, (i11 & 8) != 0 ? null : str2, str3);
    }
}
