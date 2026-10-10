package com.kubi.assets.entity;

import androidx.annotation.Keep;
import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: WithdrawHintInfoEntity.kt */
/* JADX INFO: loaded from: classes6.dex */
@Keep
@Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000eJ\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0005HÆ\u0003JV\u0010\u001d\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u001eJ\u0013\u0010\u001f\u001a\u00020\u00032\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020\u0005HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0011¨\u0006$"}, m90084d2 = {"Lcom/kubi/assets/entity/WithdrawHintInfoEntity;", "", "hintVisible", "", "hintText", "", "webDetailLink", "appDetailLink", "returnLimitation", "Ljava/math/BigDecimal;", "returnLimitationCurrency", "<init>", "(Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;)V", "getHintVisible", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getHintText", "()Ljava/lang/String;", "getWebDetailLink", "getAppDetailLink", "getReturnLimitation", "()Ljava/math/BigDecimal;", "getReturnLimitationCurrency", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;)Lcom/kubi/assets/entity/WithdrawHintInfoEntity;", "equals", "other", "hashCode", "", "toString", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class WithdrawHintInfoEntity {

    @Nullable
    private final String appDetailLink;

    @Nullable
    private final String hintText;

    @Nullable
    private final Boolean hintVisible;

    @Nullable
    private final BigDecimal returnLimitation;

    @Nullable
    private final String returnLimitationCurrency;

    @Nullable
    private final String webDetailLink;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WithdrawHintInfoEntity)) {
            return false;
        }
        WithdrawHintInfoEntity withdrawHintInfoEntity = (WithdrawHintInfoEntity) other;
        return Intrinsics.areEqual(this.hintVisible, withdrawHintInfoEntity.hintVisible) && Intrinsics.areEqual(this.hintText, withdrawHintInfoEntity.hintText) && Intrinsics.areEqual(this.webDetailLink, withdrawHintInfoEntity.webDetailLink) && Intrinsics.areEqual(this.appDetailLink, withdrawHintInfoEntity.appDetailLink) && Intrinsics.areEqual(this.returnLimitation, withdrawHintInfoEntity.returnLimitation) && Intrinsics.areEqual(this.returnLimitationCurrency, withdrawHintInfoEntity.returnLimitationCurrency);
    }

    public static /* synthetic */ WithdrawHintInfoEntity copy$default(WithdrawHintInfoEntity withdrawHintInfoEntity, Boolean bool, String str, String str2, String str3, BigDecimal bigDecimal, String str4, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            bool = withdrawHintInfoEntity.hintVisible;
        }
        if ((i11 & 2) != 0) {
            str = withdrawHintInfoEntity.hintText;
        }
        if ((i11 & 4) != 0) {
            str2 = withdrawHintInfoEntity.webDetailLink;
        }
        if ((i11 & 8) != 0) {
            str3 = withdrawHintInfoEntity.appDetailLink;
        }
        if ((i11 & 16) != 0) {
            bigDecimal = withdrawHintInfoEntity.returnLimitation;
        }
        if ((i11 & 32) != 0) {
            str4 = withdrawHintInfoEntity.returnLimitationCurrency;
        }
        BigDecimal bigDecimal2 = bigDecimal;
        String str5 = str4;
        return withdrawHintInfoEntity.copy(bool, str, str2, str3, bigDecimal2, str5);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Boolean getHintVisible() {
        return this.hintVisible;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getHintText() {
        return this.hintText;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getWebDetailLink() {
        return this.webDetailLink;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getAppDetailLink() {
        return this.appDetailLink;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final BigDecimal getReturnLimitation() {
        return this.returnLimitation;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getReturnLimitationCurrency() {
        return this.returnLimitationCurrency;
    }

    @NotNull
    public final WithdrawHintInfoEntity copy(@Nullable Boolean hintVisible, @Nullable String hintText, @Nullable String webDetailLink, @Nullable String appDetailLink, @Nullable BigDecimal returnLimitation, @Nullable String returnLimitationCurrency) {
        return new WithdrawHintInfoEntity(hintVisible, hintText, webDetailLink, appDetailLink, returnLimitation, returnLimitationCurrency);
    }

    @Nullable
    public final String getAppDetailLink() {
        return this.appDetailLink;
    }

    @Nullable
    public final String getHintText() {
        return this.hintText;
    }

    @Nullable
    public final Boolean getHintVisible() {
        return this.hintVisible;
    }

    @Nullable
    public final BigDecimal getReturnLimitation() {
        return this.returnLimitation;
    }

    @Nullable
    public final String getReturnLimitationCurrency() {
        return this.returnLimitationCurrency;
    }

    @Nullable
    public final String getWebDetailLink() {
        return this.webDetailLink;
    }

    public int hashCode() {
        Boolean bool = this.hintVisible;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        String str = this.hintText;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.webDetailLink;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.appDetailLink;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        BigDecimal bigDecimal = this.returnLimitation;
        int iHashCode5 = (iHashCode4 + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        String str4 = this.returnLimitationCurrency;
        return iHashCode5 + (str4 != null ? str4.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "WithdrawHintInfoEntity(hintVisible=" + this.hintVisible + ", hintText=" + this.hintText + ", webDetailLink=" + this.webDetailLink + ", appDetailLink=" + this.appDetailLink + ", returnLimitation=" + this.returnLimitation + ", returnLimitationCurrency=" + this.returnLimitationCurrency + ')';
    }

    public WithdrawHintInfoEntity(@Nullable Boolean bool, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable BigDecimal bigDecimal, @Nullable String str4) {
        this.hintVisible = bool;
        this.hintText = str;
        this.webDetailLink = str2;
        this.appDetailLink = str3;
        this.returnLimitation = bigDecimal;
        this.returnLimitationCurrency = str4;
    }
}
