package com.kubi.kucoin.token;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.kucoin.token.k, reason: from Kotlin metadata and from toString */
/* JADX INFO: compiled from: ITokenLifecycleRefreshSPI.kt */
/* JADX INFO: loaded from: classes19.dex */
@Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0015\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0003¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0019\u001a\u00020\tHÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003JE\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001c\u001a\u00020\t2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0013R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000e¨\u0006!"}, m90084d2 = {"Lcom/kubi/kucoin/token/TokenLifecycleRefreshContext;", "", "accountId", "", "attributionAccessToken", "refreshToken", "refreshTokenExpireAt", "", "isCurrentAccount", "", "accountType", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JZLjava/lang/String;)V", "getAccountId", "()Ljava/lang/String;", "getAttributionAccessToken", "getRefreshToken", "getRefreshTokenExpireAt", "()J", "()Z", "getAccountType", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "", "toString", "LAppNet_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class TokenLifecycleRefreshContext {

    /* JADX INFO: renamed from: a, reason: from toString */
    @NotNull
    public final String accountId;

    /* JADX INFO: renamed from: b, reason: from toString */
    @NotNull
    public final String attributionAccessToken;

    /* JADX INFO: renamed from: c, reason: from toString */
    @NotNull
    public final String refreshToken;

    /* JADX INFO: renamed from: d, reason: from toString */
    public final long refreshTokenExpireAt;

    /* JADX INFO: renamed from: e, reason: from toString */
    public final boolean isCurrentAccount;

    /* JADX INFO: renamed from: f, reason: from toString */
    @NotNull
    public final String accountType;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TokenLifecycleRefreshContext)) {
            return false;
        }
        TokenLifecycleRefreshContext tokenLifecycleRefreshContext = (TokenLifecycleRefreshContext) other;
        return Intrinsics.areEqual(this.accountId, tokenLifecycleRefreshContext.accountId) && Intrinsics.areEqual(this.attributionAccessToken, tokenLifecycleRefreshContext.attributionAccessToken) && Intrinsics.areEqual(this.refreshToken, tokenLifecycleRefreshContext.refreshToken) && this.refreshTokenExpireAt == tokenLifecycleRefreshContext.refreshTokenExpireAt && this.isCurrentAccount == tokenLifecycleRefreshContext.isCurrentAccount && Intrinsics.areEqual(this.accountType, tokenLifecycleRefreshContext.accountType);
    }

    public TokenLifecycleRefreshContext(@NotNull String accountId, @NotNull String attributionAccessToken, @NotNull String refreshToken, long j11, boolean z11, @NotNull String accountType) {
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        Intrinsics.checkNotNullParameter(attributionAccessToken, "attributionAccessToken");
        Intrinsics.checkNotNullParameter(refreshToken, "refreshToken");
        Intrinsics.checkNotNullParameter(accountType, "accountType");
        this.accountId = accountId;
        this.attributionAccessToken = attributionAccessToken;
        this.refreshToken = refreshToken;
        this.refreshTokenExpireAt = j11;
        this.isCurrentAccount = z11;
        this.accountType = accountType;
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getAccountId() {
        return this.accountId;
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getAccountType() {
        return this.accountType;
    }

    @NotNull
    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getAttributionAccessToken() {
        return this.attributionAccessToken;
    }

    @NotNull
    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getRefreshToken() {
        return this.refreshToken;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final long getRefreshTokenExpireAt() {
        return this.refreshTokenExpireAt;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final boolean getIsCurrentAccount() {
        return this.isCurrentAccount;
    }

    public int hashCode() {
        return (((((((((this.accountId.hashCode() * 31) + this.attributionAccessToken.hashCode()) * 31) + this.refreshToken.hashCode()) * 31) + Long.hashCode(this.refreshTokenExpireAt)) * 31) + Boolean.hashCode(this.isCurrentAccount)) * 31) + this.accountType.hashCode();
    }

    @NotNull
    public String toString() {
        return "TokenLifecycleRefreshContext(accountId=" + this.accountId + ", attributionAccessToken=" + this.attributionAccessToken + ", refreshToken=" + this.refreshToken + ", refreshTokenExpireAt=" + this.refreshTokenExpireAt + ", isCurrentAccount=" + this.isCurrentAccount + ", accountType=" + this.accountType + ')';
    }
}
