package com.kubi.kucoin.token;

import com.sensorsdata.analytics.android.sdk.data.adapter.DbParams;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.kucoin.token.l, reason: from Kotlin metadata and from toString */
/* JADX INFO: compiled from: ITokenLifecycleRefreshSPI.kt */
/* JADX INFO: loaded from: classes19.dex */
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0018\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BC\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u001a\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0012J\t\u0010\u001b\u001a\u00020\bHÆ\u0003JP\u0010\u001c\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001¢\u0006\u0002\u0010\u001dJ\u0013\u0010\u001e\u001a\u00020\b2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006#"}, m90084d2 = {"Lcom/kubi/kucoin/token/TokenLifecycleRefreshResult;", "", "accessToken", "", DbParams.KEY_CHANNEL_RESULT, "accountType", "reason", "refreshTokenExpired", "", "refreshRequested", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Z)V", "getAccessToken", "()Ljava/lang/String;", "getResult", "getAccountType", "getReason", "getRefreshTokenExpired", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getRefreshRequested", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Z)Lcom/kubi/kucoin/token/TokenLifecycleRefreshResult;", "equals", "other", "hashCode", "", "toString", "LAppNet_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class TokenLifecycleRefreshResult {

    /* JADX INFO: renamed from: a, reason: from toString */
    @Nullable
    public final String accessToken;

    /* JADX INFO: renamed from: b, reason: from toString */
    @NotNull
    public final String result;

    /* JADX INFO: renamed from: c, reason: from toString */
    @NotNull
    public final String accountType;

    /* JADX INFO: renamed from: d, reason: from toString */
    @Nullable
    public final String reason;

    /* JADX INFO: renamed from: e, reason: from toString */
    @Nullable
    public final Boolean refreshTokenExpired;

    /* JADX INFO: renamed from: f, reason: from toString */
    public final boolean refreshRequested;

    public TokenLifecycleRefreshResult(@Nullable String str, @NotNull String result, @NotNull String accountType, @Nullable String str2, @Nullable Boolean bool, boolean z11) {
        Intrinsics.checkNotNullParameter(result, "result");
        Intrinsics.checkNotNullParameter(accountType, "accountType");
        this.accessToken = str;
        this.result = result;
        this.accountType = accountType;
        this.reason = str2;
        this.refreshTokenExpired = bool;
        this.refreshRequested = z11;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TokenLifecycleRefreshResult)) {
            return false;
        }
        TokenLifecycleRefreshResult tokenLifecycleRefreshResult = (TokenLifecycleRefreshResult) other;
        return Intrinsics.areEqual(this.accessToken, tokenLifecycleRefreshResult.accessToken) && Intrinsics.areEqual(this.result, tokenLifecycleRefreshResult.result) && Intrinsics.areEqual(this.accountType, tokenLifecycleRefreshResult.accountType) && Intrinsics.areEqual(this.reason, tokenLifecycleRefreshResult.reason) && Intrinsics.areEqual(this.refreshTokenExpired, tokenLifecycleRefreshResult.refreshTokenExpired) && this.refreshRequested == tokenLifecycleRefreshResult.refreshRequested;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ TokenLifecycleRefreshResult m33016b(TokenLifecycleRefreshResult tokenLifecycleRefreshResult, String str, String str2, String str3, String str4, Boolean bool, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = tokenLifecycleRefreshResult.accessToken;
        }
        if ((i11 & 2) != 0) {
            str2 = tokenLifecycleRefreshResult.result;
        }
        if ((i11 & 4) != 0) {
            str3 = tokenLifecycleRefreshResult.accountType;
        }
        if ((i11 & 8) != 0) {
            str4 = tokenLifecycleRefreshResult.reason;
        }
        if ((i11 & 16) != 0) {
            bool = tokenLifecycleRefreshResult.refreshTokenExpired;
        }
        if ((i11 & 32) != 0) {
            z11 = tokenLifecycleRefreshResult.refreshRequested;
        }
        Boolean bool2 = bool;
        boolean z12 = z11;
        return tokenLifecycleRefreshResult.m33017a(str, str2, str3, str4, bool2, z12);
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final TokenLifecycleRefreshResult m33017a(@Nullable String str, @NotNull String result, @NotNull String accountType, @Nullable String str2, @Nullable Boolean bool, boolean z11) {
        Intrinsics.checkNotNullParameter(result, "result");
        Intrinsics.checkNotNullParameter(accountType, "accountType");
        return new TokenLifecycleRefreshResult(str, result, accountType, str2, bool, z11);
    }

    @Nullable
    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getAccessToken() {
        return this.accessToken;
    }

    @NotNull
    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getAccountType() {
        return this.accountType;
    }

    @Nullable
    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getReason() {
        return this.reason;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final boolean getRefreshRequested() {
        return this.refreshRequested;
    }

    @Nullable
    /* JADX INFO: renamed from: g, reason: from getter */
    public final Boolean getRefreshTokenExpired() {
        return this.refreshTokenExpired;
    }

    @NotNull
    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getResult() {
        return this.result;
    }

    public int hashCode() {
        String str = this.accessToken;
        int iHashCode = (((((str == null ? 0 : str.hashCode()) * 31) + this.result.hashCode()) * 31) + this.accountType.hashCode()) * 31;
        String str2 = this.reason;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.refreshTokenExpired;
        return ((iHashCode2 + (bool != null ? bool.hashCode() : 0)) * 31) + Boolean.hashCode(this.refreshRequested);
    }

    @NotNull
    public String toString() {
        return "TokenLifecycleRefreshResult(accessToken=" + this.accessToken + ", result=" + this.result + ", accountType=" + this.accountType + ", reason=" + this.reason + ", refreshTokenExpired=" + this.refreshTokenExpired + ", refreshRequested=" + this.refreshRequested + ')';
    }

    public /* synthetic */ TokenLifecycleRefreshResult(String str, String str2, String str3, String str4, Boolean bool, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i11 & 8) != 0 ? null : str4, (i11 & 16) != 0 ? null : bool, (i11 & 32) != 0 ? false : z11);
    }
}
